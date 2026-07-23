import analyzer.Statistics
import exporter.MarkdownExporter
import parser.MarkdownParser
import renderer.TreeRenderer
import repository.SampleRepository

fun main(){

    val markdown =

        SampleRepository()

            .load()

    val sections =

        MarkdownParser()

            .parse(

                markdown

            )

    TreeRenderer()

        .render(

            sections

        )

    Statistics()

        .print(

            sections

        )

    MarkdownExporter()

        .save(

            sections

        )

}
