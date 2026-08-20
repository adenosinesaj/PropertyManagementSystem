# Project Report: Property Management System

A JavaFX desktop application for managing residential and commercial real estate properties, built using Object-Oriented Programming (OOP) principles and the Model-View-Controller (MVC) design pattern.

## Login
<img width="1137" height="679" alt="Screenshot 2026-08-20 131145" src="https://github.com/user-attachments/assets/0a2a441a-1928-402a-9f64-d276c5d36f4f" />

## Sign-Up
<img width="1133" height="641" alt="Screenshot 2026-08-20 131155" src="https://github.com/user-attachments/assets/1f093516-4a35-46f3-b395-ba12fd40c7bb" />

## Apartment View
<img width="1143" height="682" alt="Screenshot 2026-08-20 131203" src="https://github.com/user-attachments/assets/e62850d7-c733-4c2a-9e79-2f6dd6f8d6e3" />

## Commercial Space View
<img width="1141" height="675" alt="Screenshot 2026-08-20 131211" src="https://github.com/user-attachments/assets/468036f4-62d5-4e50-8e24-eab24d514c11" />


## 🌟 Key Features
* **Role-Based Views:** Separate administrative interfaces for user management and property monitoring.
* **Property Panels:** Functional dashboards to browse and manage commercial spaces and apartments.
* **Authentication Flow:** User login and registration screen layouts.
* **MVC Architecture:** Decoupled FXML layouts powered by event-driven Java controllers.

## 🛠️ Tech Stack
* **Language:** Java 17+
* **GUI Framework:** JavaFX 21 & FXML
* **IDE:** Eclipse IDE
* **UI Design:** Gluon Scene Builder

## 👥 Team Contributions

This project was a collaborative effort. Below is the breakdown of each member's contributions:

* **Sydul Islam Zubair (22201174):** Acted as the main powerhouse of the team. He was responsible for the core concept and design, and single-handedly coded all the Java controller and class files.
* **Sajid Shahan Rahman (22201186):** Collaborated on creating a controller with Sydul's assistance and developed the FXML layout file for the apartment view.
* **Sanjida Rahman Toma (22201187):** Developed the Admin Panel FXML, specifically focusing on the interface for adding users.
* **Nazia Rahman Omee (22201188):** Developed the Admin Panel FXML, specifically focusing on the interface for adding apartments.
* **Jannat Ara Simi (22201178):** Developed the Admin Panel FXML, specifically focusing on the interface for adding Commercial Spaces.

---

## 🚧 Challenges and Resolutions

Throughout the development lifecycle, we encountered several challenges that required problem-solving and adaptation:

* **Knowledge Gaps and Time Constraints:** Initially, we lacked in-depth knowledge about JavaFX controllers and faced time management constraints.
* **Design and Logic Flaws:** We started with a misconception about the application's searching functionality. This required us to step back and completely redesign our code. However, this refurbishing process ultimately helped us understand the dynamic usage of our components.
* **Debugging Difficulties:** While basic tasks like switching stages were straightforward, implementing and debugging other controller logic proved difficult. We spent hours researching cryptic errors on the internet.
* **Resolution Strategy:** Whenever we hit a roadblock or encountered complex errors, we consistently leveraged online resources—particularly YouTube tutorials—to learn, troubleshoot, and resolve our issues.

---

## 💡 Lessons Learned

* **Team Spirit & Time Management:** The most valuable takeaway was the importance of team spirit and proper time allocation. Although our team worked relentlessly toward the end, we realized we should have started development much earlier to avoid the final rush.
* **Effective Tooling:** Using visual tools like Gluon Scene Builder significantly simplified the UI development process, making it much easier to generate complex layout code.
* **The Joy of Development:** Despite the steep learning curve and debugging headaches, we found that coding was highly rewarding and fun once we saw the tangible results of our work operating on the screen.

## 💻 How to Use the Application

Follow these steps to set up and run the Property Management System on your machine:

### Prerequisites
* **Java Development Kit (JDK 17 or higher)**
* **JavaFX SDK 21**
* **Eclipse IDE** (or IntelliJ IDEA) with JavaFX support

### Installation & Launch Steps
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/adenosinesaj/PropertyManagementSystem.git
   ```
2. **Import into Eclipse:**
   * Open Eclipse $\rightarrow$ Select **File** $\rightarrow$ **Import...** $\rightarrow$ **Existing Projects into Workspace**.
   * Browse to the cloned project directory and select it.
3. **Configure JavaFX Libraries:**
   * Right-click the project $\rightarrow$ **Build Path** $\rightarrow$ **Configure Build Path...**
   * Under the **Libraries** tab, ensure your local JavaFX 21 SDK library is added to the classpath/modulepath.
4. **Set Up VM Arguments:**
   * Go to **Run** $\rightarrow$ **Run Configurations...**
   * Select `Main` under **Java Application** and go to the **Arguments** tab.
   * Add the following to **VM Arguments** (adjusting the path to your local JavaFX SDK):
     ```text
     --module-path "C:\Program Files\Java\javafx-sdk-21\lib" --add-modules javafx.controls,javafx.fxml
     ```
5. **Run Application:**
   * Locate `src/application/Main.java`, right-click it, and choose **Run As** $\rightarrow$ **Java Application**.

---
