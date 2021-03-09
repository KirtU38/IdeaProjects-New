public class Main {}
// Proxy - это структурный паттерн.

// Proxy - является суррогатом другого Обьекта и Контролирует доступ к нему(это самое важное).

// Одна из причин для управления доступом к объекту — возможность отложить
// затраты на создание и инициализацию до момента, когда возникнет фактическая необходимость.

// Например документ, в котором есть очень тяжелые изображения, но открытие документа должно быть
// быстрым, здесь нам и поможет инициализация Обьекта изображения только "по требованию".
// Это "виртуальный proxy".

// Также можно использовать для доступа к удаленному Обьекту.
// Допустим у нас есть Обьект "производитель", который передает другому Обьекту "получателю"
// какую-то
// информацию локально, и эти 2 Обьекта уже отлично друг с другом работают.
// Однако теперь нам нужно передавать информацию не Локальному Обьекту, а Remote Обьекту.
// Мы не хотим менять реализацию работающего Класса "производителя", поэтому мы создаём
// Proxy-Класс(или Суррогат), Обьект этого Класса будет иметь точно такой же интерфейс, как и
// Реальный Обьект, и именно в методах этого Обьекта будет реализована переадрессацию в наш
// Remote-обьект "получатель".
// Мы добились нашей цели, то есть передача всё той же информации из одного Обьекта в другой, однако
// не меняя реализацию ни "производителя", ни "получателя".
// Это "Remote proxy"

// Виртуальный Proxy - контролирует доступ к Тяжелому Обьекту.

// Удаленный Proxy - контролирует доступ к Удаленному Обьекту.

// Защитный Proxy - контролирует доступ к Обьекту, на основе прав доступа к этому Обьекту.
