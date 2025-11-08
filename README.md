# FirstResponder-hackathon-2025

## Setup

1.  **Create a `.env` file:**
    ```bash
    cp .env.example .env
    ```
    Then, add your API key to the `.env` file:
    ```
    API_KEY=your_api_key
    ```

2.  **Load the environment variables:**
    ```bash
    source load_env.sh
    ```

3.  **Run the test:**
    ```bash
    javac test.java
    java test
    ```
