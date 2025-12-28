# 🗺️ Gestión de Mapas - Aiquipa

Bienvenido al repositorio oficial del proyecto **Gestión de Mapas - Aiquipa**, una solución tecnológica robusta y elegante diseñada para la administración, publicación y visualización de recursos cartográficos. Este sistema permite gestionar eficientemente una galería de mapas, facilitando su integración y consumo a través de servicios web modernos.

![Logo del Proyecto](src/main/resources/static/img/mvc.png)

---

## 🚀 Descripción del Proyecto

El sistema **Gestión de Mapas** nace con el objetivo de centralizar y simplificar el flujo de trabajo relacionado con la información geoespacial. Permite a los administradores registrar, actualizar y eliminar mapas, definiendo metadatos clave como la URL del servicio (WMS/WFS), capas, y formatos de imagen soportados. Para el usuario final, ofrece una interfaz limpia para explorar la galería de mapas disponibles.

Desarrollado con estándares de calidad de software, el proyecto prioriza la escalabilidad, la mantenibilidad y una arquitectura limpia.

---

## 🏗️ Arquitectura del Sistema

El proyecto sigue una arquitectura **Monolítica Modular basada en Capas** (Layered Architecture), implementada sobre el ecosistema **Spring Boot**. Esta estructura garantiza la separación de responsabilidades, facilitando el mantenimiento y la evolución del código.

### Componentes Principales:

1.  **Capa de Presentación (Frontend / View)**:
    *   Implementada con **Thymeleaf**, un motor de plantillas Java moderno server-side.
    *   Se encarga de renderizar las vistas HTML (`mapQuery`, `mapForm`, `mapas`, `viewmap`) que interactúan con el usuario.
    *   Utiliza **Bootstrap** (implícito en las vistas) para un diseño responsivo y profesional.

2.  **Capa de Controladores (Controllers)**:
    *   Gestiona las peticiones HTTP (GET, POST).
    *   El **`GestionmapaController`** actúa como orquestador, recibiendo las solicitudes del cliente y delegando la lógica de negocio a los servicios.

3.  **Capa de Servicio (Services)**:
    *   Contiene la lógica de negocio de la aplicación.
    *   Abstrae la complejidad de las operaciones y validaciones antes de interactuar con la persistencia.

4.  **Capa de Persistencia (Repositories / DAO)**:
    *   Utiliza **Spring Data JPA** y **Hibernate**.
    *   Interactúa directamente con la base de datos **PostgreSQL**.
    *   Los repositorios extienden de `JpaRepository` para operaciones CRUD automáticas.

5.  **Base de Datos**:
    *   **PostgreSQL**: Motor de base de datos relacional robusto para almacenar la información de los mapas y usuarios.

---

## 🛠️ Tecnologías Utilizadas

*   **Lenguaje**: Java 17
*   **Framework Principal**: Spring Boot 2.7.18
*   **Motor de Plantillas**: Thymeleaf
*   **Base de Datos**: PostgreSQL
*   **ORM**: Hibernate / Spring Data JPA
*   **Gestor de Dependencias**: Maven

---

## 📂 Estructura del Código

A continuación se detalla la organización del código fuente (`src/main/java/pe/gob/sencico/gestion_mapa_aiquipa`):

*   **`controller/`**:
    *   `GestionmapaController.java`: El cerebro de la interacción web. Define rutas como `/galeria/show` (listar), `/galeria/add` (agregar), y `/galeria/view` (vista pública).
*   **`entity/`**:
    *   Define las clases POJO que mapean las tablas de la base de datos (e.g., `GestionmapaModel` anotado con `@Entity`).
*   **`repository/`**:
    *   Interfaces que extienden `JpaRepository`, permitiendo el acceso a datos sin necesidad de escribir SQL boilerplate.
*   **`service/`**:
    *   Interfaces e implementaciones (`ServiceImpl`) que definen los contratos de negocio.
*   **`model/`**:
    *   Clases auxiliares y DTOs, como `FormatImage` para manejar los tipos MIME soportados (PNG, JPEG, SVG).

### Vistas Clave (`src/main/resources/templates`)
*   **`mapQuery.html`**: Panel administrativo para ver el listado de mapas.
*   **`mapForm.html`**: Formulario para crear o editar la información de un mapa.
*   **`mapas.html`**: Galería pública tipo grid para visualizar los mapas disponibles.
*   **`viewmap.html`**: Vista de detalle de un mapa específico.

---

## 🔧 Instalación y Despliegue

### Requisitos Previos
*   Java JDK 17
*   Maven 3.6+
*   PostgreSQL instalado y corriendo

### Pasos
1.  **Clonar el repositorio**:
    ```bash
    git clone <URL_DEL_REPO>
    cd gestion-mapa-aiquipa
    ```

2.  **Configurar Base de Datos**:
    Edita el archivo `src/main/resources/application.properties` con tus credenciales:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base_de_datos
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    ```

3.  **Ejecutar la aplicación**:
    ```bash
    ./mvnw spring-boot:run
    ```

4.  **Acceder al navegador**:
    *   Panel Admin: `http://localhost:8080/galeria/show`
    *   Galería Pública: `http://localhost:8080/galeria/view`

---

© 2024 Felix Aiquipa Gonzales. Todos los derechos reservados.
