# Zoo Animal Management System

This is a Java-based Zoo Animal Management System that allows you to interact with different animals in the zoo (Tiger, Dolphin, and Penguin). The system provides a menu to perform actions such as setting animal properties, displaying their characteristics, simulating their movements (walking/swimming), managing their food intake, and saving/loading animal data to/from files.

## Features

- **Animal Selection**: Choose between three animals: Tiger, Dolphin, and Penguin.
- **Animal Properties**: Set and display properties like age, height, weight, stripes, speed, etc.
- **Animal Movements**: Simulate walking for Tiger and Penguin, swimming for Dolphin and Penguin.
- **Eating**: Simulate feeding the animals.
- **Save to File**: Save the animal objects to files for later retrieval.
- **Load from File**: Load animal objects from files and display their current state.

## Technologies Used

- Java 8+
- Object Serialization (for saving/loading object state)
- Scanner (for user input)

## How to Use

1. Clone or download the project.
2. Open the `Main.java` file in any Java IDE or text editor.
3. Compile and run the program.

### Main Menu

The main menu allows you to choose an animal (Tiger, Dolphin, or Penguin), and then interact with its properties, movements, and feeding behaviors.

1. **Tiger**: Set the number of stripes, speed, and roar sound level.
2. **Dolphin**: Set the color and swimming speed.
3. **Penguin**: Set the walk speed and swim speed.

Additionally, you can save animal states to files or load previously saved animal states.

## File Handling

- **Saving Animal Data**: The program supports saving animal objects to files using Java's `ObjectOutputStream`. Each animal has its own file (e.g., `tiger.ser`, `penguin.ser`, `dolphin.ser`).
- **Loading Animal Data**: You can also load animal objects from these files and view the saved state of each animal.

## Animal Class Hierarchy

The following animal classes are part of the system:

- **Animal (Abstract Class)**: The base class for all animals. It includes properties like age, height, weight, and methods for walking, eating, etc.
  - **Tiger**: Extends Animal, with specific properties like the number of stripes, speed, and sound level.
  - **Dolphin**: Extends Animal, with specific properties like swimming speed and color.
  - **Penguin**: Extends Animal, with specific properties like walk speed, swim speed, and whether it's swimming.

## Example Usage

1. Run the program.
2. From the main menu, choose an animal (e.g., Tiger).
3. You will then see an option to set properties like the number of stripes, speed, and roar sound level.
4. After setting the properties, you can choose to view them, make the animal walk, or simulate feeding.
5. Once done, you can save the animal's state to a file or load a previously saved state from a file.

## Example Output

Here’s an example interaction:

```text
******* ZOO ANIMAL choice menu ******
1. Tiger
2. Dolphin
3. Penguin
4. Save animals to file
5. Display saved animals from file
Enter choice of animal (1-5): 1
The animal which is chosen is : Tiger
******* ANIMAL details menu for: Tiger ******
1. Set properties
2. Display properties
3. Display movement
4. Display eating
Enter choice (1-4): 1
Enter the number of Stripes: 10
Enter speed: 60
Enter decibel of roar: 120
Continue with this animal? (Enter 1 for yes/ 2 for no): 2
Continue main Zoo menu? (Enter 1 for yes/ 2 for no): 1
