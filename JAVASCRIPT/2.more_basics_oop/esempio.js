let smartphone = {
    marca : "Mi",
    modello: "19",
    connessione: ["5g","4g","bluetoot" ],
    ram: "4gb",
    rom: "64gb",
    fotocamera: "50mpx",
    marca_end_modello:function(){
        return this.marca + " " + this.modello;
    }
}



smartphone.batteria = 5000
console.log(smartphone.batteria);
console.log(smartphone.marca_end_modello);
console.log(connessione);

console.log(Math.E); // eulero
console.log(Math.PI); // pigreco
console.log(Math.abs(5)); //valore assoluto passato come parametro ritorna 5
console.log(Math.abs("string"));


class corso {
    studeti = 0 
    oreCorso = 0
    docente = ""
    constructor(studeti,oreCorso,docente) {
        this.studeti = studeti
        this.oreCorso = oreCorso
        this.docente = docente
    }
    getstudenti(){
        return this.studeti
    }

    getoreCorso(){
        return this.oreCorso
    }   
    getdocente(){
        return this.docente
    }
}
let studeti = corso.getstudenti();
let oreCorso = corso.getoreCorso();
let docente = corso.getdocente();

let corso = new corso (10,248,"Fabio di Gloria")
console.log(corso);

class tecnologiacorso extends corso {
    tipologiaCorso = ""
    constructor (studenti, orecorso, docente, tipologiaCorso) {
        super(studenti, orecorso, docente)
        this.tecnologiacorso = tipologiaCorso
    }
    gettipologiaCorso(){
        return this.tipologiaCorso
    }
}


let tipologia = new tipologiaCorso (14,248,"Fabio  di  Gloria", "sviluppo web")
console.log(tipologia);
let.tipologiaCorso = tipologia.gettipologiaCorso();
console.log(tipologiaCorso)