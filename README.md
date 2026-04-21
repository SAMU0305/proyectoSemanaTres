# Java Application - Shipping Cost Calculation

## 📌 Project Description
This Java application allows users to register vehicle data and automatically calculate the shipping cost according to the business rules of a food distribution company.  
The prototype runs in the console, is a basic version developed in **Visual Studio Code**, and serves as a foundation for future improvements.

## 📝 Input and Output Data

**Input Data:**
- Brand
- Model
- Engine displacement
- Fuel type
- Passenger capacity

**Output Data:**
- The entered brand is: XXXX
- The entered model is: XXXX
- The entered engine displacement is: XXXX
- The fuel type is: XXXX
- It has a capacity of XXXX passengers.
- Shipping cost calculated according to business rules.

## ⚙️ Functional Requirements

- Register users using a Gmail account.
- Calculate the total purchase amount.
- Calculate the distance in kilometers to the delivery address.
- Calculate the shipping cost according to the business rules:
  - Purchases ≥ $50,000 and distance ≤ 20 km → free shipping.
  - Purchases between $25,000 and $49,999 → $150 per km.
  - Purchases < $25,000 → $300 per km.
- Request transport data: brand, model, engine displacement, fuel type, and passenger capacity.
- Display the information entered by the user on screen.
- Show the user the final shipping cost.

## 🔒 Non-Functional Requirements
- Clarity: understandable messages for the user.
- Usability: easy-to-use program without advanced technical knowledge.
- Reliability: handling invalid inputs to avoid runtime errors.
- Performance: immediate shipping cost calculation.
- Maintainability: structured code commented line by line.

## 👤 User Stories

- **User – Vehicle Data Entry**  
  💡 *As a user, I want to enter the vehicle data (brand, model, engine displacement, fuel type, and passenger capacity) so I can receive a summary of the information entered.*

- **User – Results Display**  
  💡 *As a user, I want the application to clearly display the entered data and the calculated shipping cost so I can verify that the information is correct and reliable.*

- **Administrator – Automatic Shipping Calculation**  
  💡 *As an administrator, I want the application to automatically calculate the shipping cost according to the business rules so accurate results are delivered without manual intervention.*

- **Administrator – Invalid Input Handling**  
  💡 *As an administrator, I want the application to validate the entered data (for example, preventing letters in numeric fields) so the shipping calculation does not fail.*

- **User – Ease of Use**  
  💡 *As a user, I want the program to be simple to use and not require advanced technical knowledge so I can enter my data and get results quickly.*

- **Administrator – Documentation and Maintenance**  
  💡 *As an administrator, I want the code to be documented line by line to make future improvements and fixes easier.*

## 📅 Initial Schedule (7 Days)

| Day | Activity |
|-----|-----------|
| 1 | Project planning: reading the statement, analyzing the case study, identifying input/output data, and business rules. |
| 2 | Program design: defining variables, code structure, shipping calculation logic, and data capture flow. |
| 3 | Base code development: implementing data capture (brand, model, engine displacement, fuel type, passenger capacity) and screen output. |
| 4 | Shipping calculation implementation: coding the logic according to purchase ranges and distance using `if/else` conditions. |
| 5 | Line-by-line documentation: adding explanatory comments directly in the code for each instruction. |
| 6 | Testing and error correction: running the program, reviewing results, testing different scenarios, and fixing possible failures. |
| 7 | Repository and documentation preparation: uploading the code to GitHub, adding the README.md with requirements, user stories, schedule, and execution evidence (screenshots). |

## 📸 Execution Evidence
Screenshots of the program running in **Visual Studio Code** are included, showing correct data capture and shipping cost calculation. They can be found in the repository in the `img` folder.

## 🔗 Repository Link
[GitHub Project Repository](https://github.com/SAMU0305/proyectoSemanaTres.git)

## ✍️ Author
- SAMU0305
