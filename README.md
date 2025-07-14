# File Counter Project (Java)
A simple console application that reads a text file, counts lines and words, and writes the results to another file.

Codveda Internship Project – Level 2 Task 2



```
FileCounterProject/
├─ src/
│   └─ FileWordLineCounter.java
├─ data/
│   ├─ input.txt        ← your sample text here
│   └─ output.txt       ← will be created by the program
├─ .vscode/
│   ├─ tasks.json       ← VS Code build task (javac)
│   └─ launch.json      ← VS Code debug/run configuration
└─ README.md           ← project overview & instructions
```



## 🔧 Features / Objectives

- I can read a text file and count:
  - Total lines
  - Total words
- I can write the computed counts into an output file
- The application handles file-related exceptions gracefully (FileNotFoundException, IOException)

---

## 🖼️ Screenshots

![Form Screenshot](https://github.com/Prajapatikapil41/FileCounterProject/blob/main/Images/Screenshot%20(161).png)
![Form Screenshot](https://github.com/Prajapatikapil41/FileCounterProject/blob/main/Images/Screenshot%20(162).png)
![Form Screenshot](https://github.com/Prajapatikapil41/FileCounterProject/blob/main/Images/Screenshot%20(163).png)

---

## 🥅 System Design

> Console-based, single-process architecture

- **Input**: Reads from `data/input.txt`
- **Processing**: Parses lines, splits words
- **Output**: Writes results to `data/output.txt`

```text
[Console] → [Java App: FileWordLineCounter] → [data/output.txt]
````

---

## 🗂️ Project Structure

```text
FileCounterProject/
├── src/
│   └── FileWordLineCounter.java    # Main application
├── data/
│   ├── input.txt                   # Sample input text
│   └── output.txt                  # Generated output
├── bin/                            # Compiled classes (ignored in Git)
├── .vscode/
│   ├── tasks.json                  # Build task (javac)
│   └── launch.json                 # Run/debug config
└── README.md                       # This file
```

---

## 🧰 Technology Stack

| Layer        | Components                       |
| ------------ | -------------------------------- |
| **Language** | Java 17+                         |
| **Build**    | JDK + VS Code Tasks              |
| **IDE**      | VS Code with Java Extension Pack |

---

## ▶️ Steps to Run Application

1. **Clone** this repository.
2. **Open** in VS Code; ensure JDK 11+ and Java Extension Pack installed.
3. **Place** your input text in `data/input.txt`.
4. **Build**: Press `Ctrl+Shift+B` (runs `javac` via `tasks.json`).
5. **Run**: Press `F5` (uses `launch.json`).
6. **View** results in `data/output.txt`.

---

## 🔍 Usage Example

**Input** (`data/input.txt`):

```
Hello world
This is a test file.
```

**Output** (`data/output.txt`):

```
Input file:  data/input.txt
Total lines: 2
Total words: 6
```

---

## 💡 Future Enhancements

* Add character and paragraph counts
* Support command-line arguments for custom file paths
* Process multiple files in a directory recursively
* Output results in JSON or CSV formats

---

## 👨‍💻 Author

| Name                | GitHub                                                  | LinkedIn                                                                  | E‑Mail                                                              |
| ------------------- | ------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------- |
| **Kapil Prajapati** | [Prajapatikapil41](https://github.com/Prajapatikapil41) | [kapil‑prajapati](https://www.linkedin.com/in/kapil-prajapati-7ba4b51b7/) | [kapilprajapati0403@gmail.com](mailto:kapilprajapati0403@gmail.com) |


