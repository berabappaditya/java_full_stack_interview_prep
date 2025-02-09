# java_full_stack_interview_prep



# Java 8 Features Deep Dive

A comprehensive guide to Java 8's revolutionary features with code examples.

## Table of Contents
1. [Lambda Expressions](#lambda-expressions)
2. [Stream API](#stream-api)
3. [Functional Interfaces](#functional-interfaces)
4. [Method References](#method-references)
5. [Default Methods in Interfaces](#default-methods)
6. [Optional Class](#optional-class)
7. [Date/Time API](#datetime-api)

---

## Lambda Expressions
Anonymous functions that enable functional programming

### Syntax
```java
(parameters) -> expression
(parameters) -> { statements; }

```
---
## Functional interface
### Exaplme
```java
// Before Java 8
    new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Old way");
        }
    }).start();
    
    // With Lambda
    new Thread(() -> System.out.println("New way")).start();
```
### comparator example
```java
    List<String> names = Arrays.asList("John", "Alice", "Bob");
    Collections.sort(names, (a, b) -> a.compareTo(b));
```
###Custom Functional Interface
```java
      @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }
    
    MathOperation add = (a, b) -> a + b;
    System.out.println(add.operate(5, 3)); // 8
```
---
# Stream API
  - Powerful pipeline processing for collections

 ### Key Operations
  - Operation Type	Methods
  - Intermediate	filter(), map(), sorted(), distinct(), limit()
  - Terminal	forEach(), collect(), reduce(), count(), anyMatch()
 ### Basic Pipeline
  ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    List<Integer> result = numbers.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .collect(Collectors.toList());
    // [4, 8, 12]
  ```
 ### Advance Operations
  ```java
      // Grouping
      Map<String, List<Employee>> byDept = employees.stream()
          .collect(Collectors.groupingBy(Employee::getDepartment));
      
      // Statistics
      IntSummaryStatistics stats = numbers.stream()
          .mapToInt(Integer::intValue)
          .summaryStatistics();
      System.out.println("Average: " + stats.getAverage());
 ```
---
# Functional Interface
  - Single abstract method interfaces
    ### Common Interfaces
      ```java
       // Predicate: boolean test(T t)
        Predicate<String> isLong = s -> s.length() > 5;
        
        // Function: R apply(T t)
        Function<Integer, String> intToString = Object::toString;
        
        // Consumer: void accept(T t)
        Consumer<String> printer = System.out::println;
        
        // Supplier: T get()
        Supplier<LocalDate> dateSupplier = LocalDate::now;
      ```
---
# Method References
  - Shorthand for lambda expressions
      ```java
        // Static method
        Function<String, Integer> parser = Integer::parseInt;
        
        // Instance method
        List<String> names = Arrays.asList("Alice", "Bob");
        names.forEach(System.out::println);
        
        // Constructor reference
        Supplier<List<String>> listSupplier = ArrayList::new;
      ```
---
# Default Methods
  - Interface evolution without breaking implementations
    ```java
            interface Vehicle {
                default void print() {
                    System.out.println("I'm a vehicle!");
                }
            }
            
            class Car implements Vehicle {
                // Inherits default implementation
            }
    ```
---
## Optional Class
- Null-safe container object

```java
Optional<String> optional = Optional.ofNullable(getName());
String result = optional
    .filter(s -> s.length() > 3)
    .orElse("default");
```
---
## Date/Time API
- Joda-Time inspired date handling

```java
LocalDate today = LocalDate.now();
LocalDate tomorrow = today.plusDays(1);

Duration duration = Duration.between(
    LocalTime.parse("09:00"),
    LocalTime.now()
);
```
---
## Core Java 
  - java stream
  - java Synchronization
  - what is java atomic class
  - java Multtithreading
  - what is serialization and in java and transient keyword


## java OOPs
  - Difference between absruct class and interface
  - why interface in needed when interface do the same
  - what is dynamic binding

## Spring boot java
  - what is serialization
  - types of dependency injection in spring
  -  - How does a HashMap work internally?

3. 
   - How many ways can we create a thread in Java?

4
   - What is the difference between @PathVariable and @RequestParam in Spring?

5. 
   - How can we make some path variables optional in a Spring application? For example, if you need 3 required and 2 optional.

6.
   - What is an IoC (Inversion of Control) container?

7.
   - How can you handle a URL with 10 parameters?

8.
   - What is the difference between @Controller and @RestController in Spring?

9.
   - Can we pass a request body in a GET mapping in Spring?

10.
    - If you want to create a signup page, how should things proceed when the user clicks the register button?

11.
    - For fetching and receiving data, should you use queries or repositories?

12.
    - How do you send a response back to the user after receiving a response from them?

13.
    - What are you setting as the status in various scenarios?

14.
    - What are Spring Boot Actuators?

15.
    - Does an entity know which table it belongs to in JPA?

16
    - Can a project have multiple schemas or multiple databases in one application?

17. 
    - How can you skip some fields while saving an entity in a databases


/// Docker tutorial
## Docker Basics

- docker --version: Check Docker version.
- docker info: Get detailed information about your Docker setup.
  
### Working with Docker Images
- docker images: List all images on your system.
- docker pull <image-name>: Download an image from Docker Hub (e.g., docker pull nginx).
- docker rmi <image-id>: Remove an image from your system.
  
### Managing Containers
- docker ps: List all running containers.
- docker ps -a: List all containers, including stopped ones.
- docker run <image-name>: Run a container from an image (e.g., docker run nginx).
- docker run -d <image-name>: Run a container in detached mode (background).
- docker run -it <image-name> /bin/bash: Run a container in interactive mode with a terminal.
- docker stop <container-id>: Stop a running container.
- docker start <container-id>: Start a stopped container.
- docker restart <container-id>: Restart a container.
- docker rm <container-id>: Remove a stopped container.
  
### Container and Image Management
- docker logs <container-id>: View the logs of a container.
- docker exec -it <container-id> /bin/bash: Access the shell of a running container.
- docker commit <container-id> <new-image-name>: Save changes to a new image.
  
### Network and Volumes
- docker network ls: List Docker networks.
- docker volume ls: List Docker volumes.
- docker network create <network-name>: Create a custom network.
- docker volume create <volume-name>: Create a custom volume.
  
### Docker Clean-up Commands
- docker system prune: Clean up unused containers, networks, images, and volumes.
- docker container prune: Remove all stopped containers.
- docker image prune: Remove unused images.
- docker volume prune: Remove unused volumes.
