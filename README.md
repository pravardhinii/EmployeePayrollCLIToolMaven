# Multi-Module Employee Payroll CLI Tool

A robust command-line utility built using a professional **Maven Multi-Module** architecture, separating core calculation engines from the execution runner.

## Key Features & Concepts Applied
- **Multi-Module Project Structure:** Clean separation of concerns using a root parent aggregator POM managing child modules (`core-logic` and `app-runner`).
- **Parent-Child POM Inheritance & Property Management:** Centralized property control for Java source/target compilation versions and shared dependency configurations.
- **Build Automation & Packaging:** 
  - Enforced Java compiler compliance via the **Maven Compiler Plugin**.
  - Packaged the complete application along with all dependencies into a single, self-contained **Runnable Fat JAR** using the **Maven Shade Plugin**.
- **Core Calculation Engine:** Robust salary and tax deduction logic with strict input validation and comprehensive unit testing via JUnit 5.
