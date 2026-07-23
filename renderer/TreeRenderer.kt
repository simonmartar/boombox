package renderer

import model.Section

class TreeRenderer {

    fun render(

        sections:List<Section>

    ){

        println()

        println("README.md\n")

        for(section in sections){

            val indent =

                "  ".repeat(

                    section.level-1

                )

            println(

                indent +

                "├── " +

                section.title

            )

        }

    }

}
