const table = document.querySelector('.corpo-tabela');

/**
 * Endpoint do webservice
 */
const API_TO_FETCH = 'http://localhost:8080/clientes';

getDadosCliente();

 function getDadosCliente() {
    
    table.innerHTML = '';

    fetch(API_TO_FETCH)
        .then(res => res.json())
        .then(data => {
            
            for (item in data) {

                let cliente = data[item];

                table.innerHTML += `

                <tr>
                    <th scope="row">` + cliente.idCliente + `</th>
                    <td>` + cliente.nomeCliente + `</td>
                    <td>` + cliente.nascCliente + `</td>
                    <td>` + cliente.emailCliente + `</td>
                    <td>` + cliente.cpfCnpjCliente + `</td>
                    <td>` + cliente.telefoneCliente + `</td>
                    <td>` + cliente.enderecoCliente + `</td>
                </tr>

                `;

            }

        })
        .catch((error) => {
            console.log(error);
        });
 }

 function setDadosCliente() {

    let novoCliente = getDadosModalAddCliente();

     fetch(API_TO_FETCH, {
         method: 'POST',
         body: JSON.stringify({
            nomeCliente: novoCliente.nomeCliente,
            nascCliente: novoCliente.nascCliente,
            emailCliente: novoCliente.emailCliente,
            cpfCnpjCliente: novoCliente.cpfCnpjCliente,
            telefoneCliente: novoCliente.telefoneCliente,
            enderecoCliente: novoCliente.enderecoCliente
         }),
         headers: {
             'Content-type': 'application/json; charset=UTF-8'
         }
     })
     .then(res => res.json())
     .then(data => {
        Swal.fire({
            icon: 'success',
            title: 'Cliente cadastrado com sucesso!',
            showConfirmButton: true,
            timer: 1500
          })
          
     })
     .catch(error => console.log(error));
 }

 /**
  * Obtém os dados da modal de adição de clients
  * e os retorna em formato de Objeto
  */
function getDadosModalAddCliente() {


    let nomeCliente = document.querySelector('#nomeCliente').value;
    let nascCliente = document.querySelector('#nascCliente').value;
    let emailCliente = document.querySelector('#emailCliente').value;
    let cpfCnpjCliente = document.querySelector('#cpfCnpjCliente').value;
    let telefoneCliente = document.querySelector('#telefoneCliente').value;
    let enderecoCliente = document.querySelector('#enderecoCliente').value;

    var novoCliente = {
        nomeCliente: nomeCliente,
        nascCliente: nascCliente,
        emailCliente: emailCliente,
        cpfCnpjCliente: cpfCnpjCliente,
        telefoneCliente: telefoneCliente,
        enderecoCliente: enderecoCliente
    };

    return novoCliente;

}

 // evento de clique no botão de cadastrar
 // da modal de adicionar cliente
 let btnCadastrarCliente = document.querySelector('#btnCadastrarCliente');

 btnCadastrarCliente.addEventListener('click', function (e) {
    e.preventDefault();
    setDadosCliente();
    
    closeModal();

    getDadosCliente();
 });

 function closeModal() {
    $('#addClienteModal').modal('toggle');
 }