package com.example.neuroblast

import android.app.PendingIntent
import android.appwidget.AppWidgetProvider
import android.appwidget.AppWidgetManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.RemoteViews
import java.io.File

class DailyFactWidgetProvider : AppWidgetProvider() {

    override fun onEnabled(context: Context?) {
        super.onEnabled(context)

        Log.d("???", "onEnabled")
    }

    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        context?.let { ctx ->
            val remoteViews = RemoteViews(ctx.packageName, R.layout.daily_fact_widget)

            // Set up button click action
            val intent = Intent(ctx, DailyFactWidgetProvider::class.java).apply {
                action = "com.example.neuroblast.REFRESH_FACT"
            }
            val pendingIntent = PendingIntent.getBroadcast(
                ctx, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )
            remoteViews.setOnClickPendingIntent(R.id.refresh_fact, pendingIntent)

            // Update widget for each ID
            appWidgetIds?.forEach { widgetId ->
                appWidgetManager?.updateAppWidget(widgetId, remoteViews)
            }
        }
    }


    override fun onDeleted(context: Context?, appWidgetIds: IntArray?) {
        super.onDeleted(context, appWidgetIds)

        Log.d("???", "onDeleted $appWidgetIds")
    }

    override fun onDisabled(context: Context?) {
        super.onDisabled(context)

        // widget is empty
        Log.d("???", "onDisabled")
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        super.onReceive(context, intent)
        if (intent?.action == "com.example.neuroblast.REFRESH_FACT") {
            // Handle the button click (e.g., update widget text)

            var randInt = (0..MainActivity.funFacts.size - 1).random()

            var neuroFact = MainActivity.funFacts[randInt]

            context?.let { ctx ->
                val appWidgetManager = AppWidgetManager.getInstance(ctx)
                val remoteViews = RemoteViews(ctx.packageName, R.layout.daily_fact_widget)
                remoteViews.setTextViewText(R.id.widget_text, neuroFact)
                val appWidgetIds = appWidgetManager.getAppWidgetIds(
                    ComponentName(ctx, DailyFactWidgetProvider::class.java)
                )
                appWidgetManager.updateAppWidget(appWidgetIds, remoteViews)
            }
        }
    }

}
