package com.example.neuroblast

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {

    companion object {
        val funFacts = arrayOf("The human brain weighs about three pounds",
            "The human brain can generate about 23 watts of power, enough to light a small bulb",
            "Neurons communicate with each other through electrochemical signals called action potentials",
            "The adult brain weighs approximately 3 pounds, yet it contains 60% fat",
            "The longest axon in the human body stretches from the spine to the toes, measuring about 3 feet",
            "The brain uses more energy than any other organ, consuming about 20% of the body's total energy",
            "Dreams primarily occur during REM sleep, but they can also happen in non-REM stages",
            "The left hemisphere of the brain is typically dominant for language in most right-handed people",
            "The brain has no pain receptors, which is why brain surgery can be performed while a patient is awake",
            "The 'homunculus' is a visual representation of the sensory and motor cortices of the brain",
            "Your brain processes information at speeds of up to 268 miles per hour",
            "The olfactory bulb, responsible for smell, is one of the few areas in the brain where neurogenesis occurs",
            "The blood-brain barrier protects the brain from harmful substances in the bloodstream",
            "Mirror neurons fire both when you perform an action and when you observe someone else performing it",
            "The human brain contains over 100 trillion synapses",
            "Each neuron can form connections with thousands of other neurons, creating complex networks",
            "The optic nerve transmits visual information to the brain at a speed of about 1.2 million signals per second",
            "The brain's structure and connectivity are shaped by both genetic and environmental factors",
            "The suprachiasmatic nucleus (SCN) regulates the body's circadian rhythms",
            "The inferior colliculus helps localize sounds in the environment",
            "Proprioception is the brain's ability to sense the position and movement of your body",
            "Your brain has specialized regions for processing faces called the fusiform face area (FFA)",
            "The brain can reorganize itself after injury, a phenomenon known as neuroplasticity",
            "The vestibular system in the inner ear helps maintain balance and spatial orientation",
            "The amygdala can activate a fight-or-flight response in under 12 milliseconds",
            "The corpus callosum contains over 200 million axons connecting the brain's hemispheres",
            "Oxytocin, sometimes called the 'love hormone,' is involved in social bonding",
            "The hypothalamus regulates hunger, thirst, and body temperature",
            "Your brain produces about 500 milliliters of cerebrospinal fluid daily",
            "The reticular formation is crucial for maintaining wakefulness and attention",
            "The parietal lobe integrates sensory information to construct a 3D map of your surroundings",
            "The brain generates theta waves during light sleep and deep relaxation",
            "Dopamine neurons in the ventral tegmental area (VTA) play a key role in reward processing",
            "The pineal gland produces melatonin, which helps regulate sleep-wake cycles",
            "Broca's area in the frontal lobe is critical for speech production",
            "The brain's default mode network (DMN) becomes active during daydreaming and self-reflection",
            "The basal ganglia are essential for controlling voluntary movements",
            "The insula processes emotions and bodily sensations like pain and hunger",
            "The periaqueductal gray (PAG) is involved in pain modulation and defensive behaviors",
            "The anterior cingulate cortex (ACC) plays a role in error detection and conflict resolution",
            "The ventromedial prefrontal cortex (vmPFC) is involved in decision-making and emotion regulation",
            "Glial cells outnumber neurons in the brain by about 10 to 1",
            "The arcuate fasciculus is a white matter tract that connects language areas in the brain",
            "The brain can generate new neurons even in adulthood, a process known as adult neurogenesis",
            "Stress can lead to an increase in cortisol levels, which may shrink the hippocampus over time",
            "The lateral geniculate nucleus (LGN) processes visual information from the retina",
            "The superior colliculus integrates visual, auditory, and tactile inputs for spatial orientation",
            "Electrical stimulation of the brain can elicit specific memories or sensations",
            "The substantia nigra is a critical component of the dopaminergic system",
            "The angular gyrus is involved in complex language processing and mathematical reasoning",
            "Synaptic pruning during adolescence improves efficiency by eliminating weaker connections",
            "The brain consists of about 75% water, making hydration critical for proper functioning",
            "There are over 1,000 miles of blood vessels in the human brain",
            "The human brain triples in size during the first year of life",
            "The cerebellum contains more neurons than the rest of the brain combined",
            "Each hemisphere of the brain controls the opposite side of the body",
            "The brain's plasticity allows it to rewire itself after injury or in response to learning",
            "The ventral stream in the brain is crucial for object recognition",
            "The dorsal stream is responsible for spatial awareness and movement perception",
            "The default mode network (DMN) becomes less active when engaging in focused tasks",
            "The substantia nigra gets its name from its dark pigmentation due to neuromelanin",
            "The superior temporal gyrus is involved in processing auditory information and language",
            "The thalamus acts as a relay station for nearly all sensory information except smell",
            "The anterior insula plays a critical role in the perception of internal bodily states",
            "Neurons in the hippocampus can regenerate, even in adult brains",
            "The brain can store an estimated 2.5 petabytes of information, equivalent to 1 million gigabytes",
            "The fastest recorded neural signal travels at about 268 miles per hour",
            "The primary visual cortex (V1) processes basic visual information like lines and edges",
            "The secondary visual cortex (V2) integrates more complex visual features",
            "The perirhinal cortex helps recognize and associate objects with memory",
            "The medial temporal lobe is essential for forming long-term memories",
            "The orbitofrontal cortex evaluates rewards and punishments in decision-making",
            "The habenula is involved in regulating responses to negative experiences",
            "Neurotransmitters can be excitatory, inhibitory, or modulatory",
            "Serotonin plays a role in mood regulation, appetite, and digestion",
            "Dopamine is central to the brain's reward system and motivation circuits",
            "The glymphatic system clears waste from the brain during sleep",
            "Excessive synaptic pruning during adolescence may contribute to schizophrenia",
            "Bilingual individuals have denser gray matter in language-related regions",
            "The posterior parietal cortex integrates sensory input for spatial awareness",
            "The ventrolateral prefrontal cortex is involved in regulating emotions",
            "Neurogenesis in the hippocampus is boosted by aerobic exercise",
            "The pre-supplementary motor area (pre-SMA) is involved in planning voluntary movements",
            "The caudate nucleus plays a role in habit formation and goal-directed behavior",
            "The limbic system is responsible for emotion, behavior, and long-term memory",
            "The pineal gland is shaped like a tiny pine cone and regulates circadian rhythms",
            "The ventral tegmental area (VTA) sends dopamine signals to the nucleus accumbens",
            "The nucleus accumbens is often referred to as the brain's pleasure center",
            "The posterior cingulate cortex (PCC) is active during self-referential thoughts",
            "The parahippocampal place area (PPA) is involved in recognizing environmental scenes",
            "The lateral prefrontal cortex is essential for working memory and complex reasoning",
            "The brain releases dopamine during pleasurable activities like eating or listening to music",
            "Exposure to enriched environments can enhance synaptic plasticity and cognitive function",
            "Meditation can increase gray matter density in the prefrontal cortex",
            "Sleep deprivation impairs the brain's ability to form new memories",
            "The inferior parietal lobule integrates sensory information for tool use and imitation",
            "The ventromedial hypothalamus is involved in regulating satiety and hunger",
            "The brainstem controls basic life functions such as heart rate and breathing",
            "Alcohol affects the cerebellum, impairing coordination and balance",
            "The anterior temporal lobe is associated with semantic memory and knowledge retrieval",
            "Deep brain stimulation (DBS) can alleviate symptoms of Parkinson's disease and depression",
            )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)

        var neuroFact = findViewById<TextView>(R.id.neuro_fact)
        var refreshButton = findViewById<Button>(R.id.refresh_fact)

        var randInt = (0..funFacts.size - 1).random()

        neuroFact.text = funFacts[randInt]

        refreshButton.setOnClickListener {

            randInt = (0..funFacts.size - 1).random()
            neuroFact.text = funFacts[randInt]
        }

    }
}