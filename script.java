function shakeMagicBall() {

const question = prompt('Ask the Magic 8 Ball a Question:')

if (question === null){
    document.getElementById('response-text').innerText = 'Please ask a question!'
    document.getElementById('response-text').classlist = 'text-danger'
    document.getElementById('response-image').src = 'ENTER IMAGE' //FIXXXXXX IT
}

if (!question.trim()) {
    alert('Please enter a valid question!')
    return
}