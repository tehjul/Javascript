function changerCouleur() {
    let testage = document.getElementById('text').className;

    if (testage === 'rouge') document.getElementById('text').className = 'bleu';
    else document.getElementById('text').className = 'rouge';
}