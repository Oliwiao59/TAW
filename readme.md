# **TWP projekt**
1. Wprowadzenie przedmiotów do systemu:\
Metoda: POST\
Adres zasobu: http://localhost:8080/test/courses \
Nagłowki: Content-Type: application/json\
Reqest body:\
A) {"nazwa": "Metodologie obliczeniowe",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   }\
B) {"nazwa": "Testowanie oprogramowania",
   "ects": 1,
   "sala": 216,
   "egzamin": false
   }\
C) {"nazwa": "Technologie i aplikacje webowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   }\
D) {"nazwa": "Zarządzanie projektem informatycznym",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   }\
E) {"nazwa": "Zaawansowane technologie bazodanowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   }\
F) {"nazwa": "Technologie komputerowe i sieciowe",
   "ects": 2,
   "sala": 208,
   "egzamin": true
   }\
Body: -\
HTTP CODE: 200 OK\
2. Pobranie wszystkich przedmiotów:\
Metoda: GET\
Adres zasobu: http://localhost:8080/test/courses \ 
Nagłowki: Content-Type: application/json\
Request body: -\
Body:\
   [\
   {
   "id": 1,
   "nazwa": "Metodologie obliczeniowe",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 2,
   "nazwa": "Testowanie oprogramowania",
   "ects": 1,
   "sala": 216,
   "egzamin": false
   },\
   {
   "id": 3,
   "nazwa": "Technologie i aplikacje webowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   },\
   {
   "id": 4,
   "nazwa": "Zarządzanie projektem informatycznym",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 5,
   "nazwa": "Zaawansowane technologie bazodanowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   },\
   {
   "id": 6,
   "nazwa": "Technologie komputerowe i sieciowe",
   "ects": 2,
   "sala": 208,
   "egzamin": true
   }\
   ]\
HTTP CODE: 200 OK
3. Pobranie przedmiotów, które mają egzamin.\
Metoda: GET \
Adres zasobu: http://localhost:8080/test/courses?exam=true \
Nagłowki: Content-Type: application/json \
Request body: - \
Body:\
   [\
   {
   "id": 1,
   "nazwa": "Metodologie obliczeniowe",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 4,
   "nazwa": "Zarządzanie projektem informatycznym",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 6,
   "nazwa": "Technologie komputerowe i sieciowe",
   "ects": 2,
   "sala": 208,
   "egzamin": true
   }\
   ]\
HTTP CODE: 200 OK 
4. Pobranie przedmiotów, które odbywają się w sali 216.\
Metoda: GET \
Adres zasobu: http://localhost:8080/test/courses?room=216 \
Nagłowki: Content-Type: application/json \
Request body: - \
Body:\
   [\
   {
   "id": 1,
   "nazwa": "Metodologie obliczeniowe",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 2,
   "nazwa": "Testowanie oprogramowania",
   "ects": 1,
   "sala": 216,
   "egzamin": false
   },\
   {
   "id": 4,
   "nazwa": "Zarządzanie projektem informatycznym",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   }\
   ]\
   HTTP CODE: 200 OK
5. Pobranie przedmiotów, które nie mają egzaminu i odbywają się w sali 208. \
   Metoda: GET\
   Adres zasobu: http://localhost:8080/test/courses?exam=false&room=208 \
   Nagłowki: Content-Type: application/json\
   Request body: -\
   Body:\
   [\
   {
   "id": 3,
   "nazwa": "Technologie i aplikacje webowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   },\
   {
   "id": 5,
   "nazwa": "Zaawansowane technologie bazodanowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   }\
   ]
6. Pobranie przedmiotów o identifikatorze 3.\
   Metoda: GET\
   Adres zasobu: http://localhost:8080/test/courses/3 \
   Nagłowki: Content-Type: application/json \
   Request body: - \
   Body:\
   {
   "id": 3,
   "nazwa": "Technologie i aplikacje webowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   }\
HTTP CODE: 200 OK
7. Pobranie przedmiotu o identifikatorze 15. \
   Metoda: GET \
   Adres zasobu: http://localhost:8080/test/courses/15 \
   Nagłowki: Content-Type: application/json\
   Request body: -\
   Body: -\
   HTTP CODE: 404 Not Found
8. Usunięcie przedmiotu o identifikatorze 2\
   Metoda: DELETE\
   Adres zasobu: http://localhost:8080/test/courses/2 \
   Nagłowki: Content-Type: application/json\
   Request body: -\
   Body:\
   {
   "id": 2,
   "nazwa": "Testowanie oprogramowania",
   "ects": 1,
   "sala": 216,
   "egzamin": false
   }\
   HTTP CODE: 200 OK
9. Pobranie wszystkich przedmiotów.\
   Metoda: GET\
   Adres zasobu: http://localhost:8080/test/courses \
   Nagłowki: Content-Type: application/json\
   Request body: -\
   Body:\
   [\
   {
   "id": 1,
   "nazwa": "Metodologie obliczeniowe",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 3,
   "nazwa": "Technologie i aplikacje webowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   },\
   {
   "id": 4,
   "nazwa": "Zarządzanie projektem informatycznym",
   "ects": 2,
   "sala": 216,
   "egzamin": true
   },\
   {
   "id": 5,
   "nazwa": "Zaawansowane technologie bazodanowe",
   "ects": 3,
   "sala": 208,
   "egzamin": false
   },\
   {
   "id": 6,
   "nazwa": "Technologie komputerowe i sieciowe",
   "ects": 2,
   "sala": 208,
   "egzamin": true
   }\
   ]\
HTTP CODE: 200 OK 
10. Usunięcie wszystkich przedmiotów.\
    Metoda: DELETE\
    Adres zasobu: http://localhost:8080/test/courses \
    Nagłowki: Content-Type: application/json\
    Request body: -\
    Body: -\
    HTTP CODE: 200 OK 
11. Pobranie wszystkich przedmiotów.\
    Metoda: GET \
    Adres zasobu: http://localhost:8080/test/courses \
    Nagłowki: Content-Type: application/json \
    Request body: -\
    Body: -\
    HTTP CODE: 200 OK 
