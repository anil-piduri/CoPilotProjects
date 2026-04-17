# DemoApp

A small Spring Boot demo application used for learning and testing.

This repository was added to Git and pushed to GitHub. An initial annotated tag
`v0.1.0` was created and pushed. A development branch `demo-app_v1` was also
created.

## Build
This project uses Maven (the wrapper is included). From the project root run:

```bash
./mvnw clean package
```

On Windows (cmd.exe):

```
mvnw.cmd clean package
```

## Run
Run the application with the wrapper:

```
./mvnw spring-boot:run
```

On Windows:

```
mvnw.cmd spring-boot:run
```

Or run the packaged jar in `target/` after `package` completes:

```
java -jar target/<artifact>-<version>.jar
```

## Tests

Run unit tests with:

```
./mvnw test
```

## Notes
- Default branch: `main`
- Development branch: `demo-app_v1`
- Tag: `v0.1.0` (Initial release)

If you want a GitHub Release created from the tag, use the Releases UI or provide a
GitHub token and I can create it for you.

---
Created by automation on 2026-04-16.
