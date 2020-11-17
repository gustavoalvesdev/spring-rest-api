const table = document.querySelector('.table');

/**
 * Endpoint do webservice
 */
const API_TO_FETCH = 'https://localhost:8080/clientes';

fetch(API_TO_FETCH)
    .then(data => {
        console.log(data);
    });