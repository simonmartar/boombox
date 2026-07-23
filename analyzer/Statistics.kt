package analyzer

import model.Section

class Statistics {

    fun print(

        sections:List<Section>

    ){

        println()

        println(

            "Sections: ${sections.size}"

        )

        println(

            "Maximum depth: ${sections.maxOf { it.level }}"

        )

    }

}
