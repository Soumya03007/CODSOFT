# CODSOFT Internship Project — Task 1  

## Number Guessing Game 🎯

## 📌 Overview
This is a simple **console-based number guessing game** implemented in Java. The program randomly generates a number within a given range (default: **1–100**) and the player has a limited number of attempts (default: **5**) to guess it correctly.

The game provides feedback after each guess — whether it’s **too high**, **too low**, or **correct**. Players can play multiple rounds, and their total number of rounds won will be displayed at the end.

---

## 🚀 Features
- Random number generation within a configurable range.
- Limited attempts per round (configurable).
- User input validation (prevents invalid entries).
- Feedback after each guess:
  - ✅ Correct guess
  - 🔼 Too high
  - 🔽 Too low
- Option to play multiple rounds.
- Tracks total **rounds won** by the player.

---

## 🛠️ How It Works
1. The program generates a random number.
2. The player enters guesses until they either:
   - Guess correctly ✅
   - Run out of attempts ❌
3. At the end of each round, the player can choose to play again.
4. Final score (rounds won) is displayed when the game ends.

---

## 📂 Project Structure

```
Task1/
│── NumberGuessGame.java # Main game source code
│── README.md # Documentation (this file)
```



## 🎮 Sample Gameplay

Welcome to the Number Guessing Game!

I have chosen a number between 1 and 100.
You have 5 attempts. Try to guess it!

Enter your guess: 50
Too low!
Attempts left: 4

Enter your guess: 75
Too high!
Attempts left: 3

Enter your guess: 62
Correct! You guessed the number in 3 attempt(s).

Do you want to play again? (y/n): n
Thanks for playing! You won 1 round(s). Goodbye!


## 📊 Scoring System

A round is won if the player guesses the number within the allowed attempts.

The final score is the total number of rounds won.


