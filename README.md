Вопрос: Есть ли разница между `$("h1 div")`; и `$("h1").$("div")`?
Может ли произойти такое что, поиск найдёт разные элементы?
Если может - приведите пример, когда.

Ответ:
`$("h1 div")` находит элемент h1, в котором есть div.
`$("h1").$("div")` - находит сначала первый h1 на странице, а уже в нем ищет div.

Пример:

`<h1> <main> </main> </h1>`

`<h1> <div> </div>  </h1>`

В приведенной выше структуре `$("h1 div")` найдет нужный элемент 
(div во втором по счету h1), а `$("h1").$("div")` - нет, так как 
в первом h1 на странице нет элемента div.