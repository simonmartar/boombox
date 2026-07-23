package exporter

import model.Section

import java.io.File

class MarkdownExporter {

    fun save(

        sections:List<Section>

    ){

        File(

            "tree.txt"

        ).printWriter().use {

            sections.forEach { s ->

                val indent =

                    "  ".repeat(

                        s.level-1

                    )

                it.println(

                    indent +

                    s.title

                )

            }

        }

    }

}
