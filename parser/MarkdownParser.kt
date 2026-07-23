package parser

import model.Section

class MarkdownParser {

    fun parse(text:String):List<Section>{

        return text.lines()

            .filter {

                it.startsWith("#")

            }

            .map {

                val level =

                    it.takeWhile {

                        c -> c == '#'

                    }.length

                Section(

                    level,

                    it.drop(level).trim()

                )

            }

    }

}
