
# Markdown Tree Analyzer

Markdown Tree Analyzer is a Kotlin console application that parses Markdown documents and builds a hierarchical representation of headings.

The project is useful for inspecting documentation structure, README files and technical notes.

## Features

- Parses Markdown headings
- Builds document hierarchy
- Calculates heading statistics
- Exports tree representation
- Lightweight architecture

## Example

```
README.md

Project

├── Installation
├── Configuration
│   ├── Database
│   └── Logging
├── Usage
│   ├── CLI
│   └── Examples
└── License

Sections: 8
Maximum depth: 3
```

Run

```bash
gradle run
```
