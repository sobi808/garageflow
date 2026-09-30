# GarageFlow — Base44 Dev Environment

## Project
Spring Boot 3.5.6 backend (Java 21). Workshop management API.
Currently has only a health endpoint (`GET /api/health`) and POJO domain models (Customer, Vehicle) — no database, no JPA, no security yet.

## Running
```
docker compose -f docker-compose.base44.yml up -d --build
```
App listens on port 8080 inside the container, mapped to host port 3000.
Maven dependencies are cached in the `maven-cache` volume.

## Verification
```
curl http://localhost:3000/api/health   # → "GarageFlow is running"
```

## Notes
- No live-reload (spring-boot-devtools not in pom.xml). After code changes, restart the service:
  `docker compose -f docker-compose.base44.yml restart app` then `reload_preview`.
- No external services or credentials required.
