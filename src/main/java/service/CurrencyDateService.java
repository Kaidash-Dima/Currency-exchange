package service;

import entity.CurrencyDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CurrencyDateRepository;

@Service
public class CurrencyDateService {
    private final CurrencyDateRepository currenDateRepository;

    public CurrencyDateService(CurrencyDateRepository currenDateRepository) {
        this.currenDateRepository = currenDateRepository;
    }

    /** В рамках этой операции, приложение должно вызвать API ПриватБанка https://api.privatbank.ua/#p24/exchange,
     * получить текущий курс валют, например для американских долларов (USD) и евро (EUR) по отношению к гривне (UAH),
     * определить курс продажи(КПР) и курс покупки (КПО) киоска на текущий момент времени (дата и время)
     * и сохранить их в БД.**/
    public void openDay(){

    }

    /**По окончанию рабочего дня, продавец должен выполнить операцию «Закрытие рабочего дня».
     Вызов операции - через URL REST сервиса.
     После выполнения, сервис должен вернуть отчет о  проделанной работе за день, в который должно быть включено:
     - количество сделок обмена валюты,
     - суммы ПОКУПКИ и ПРОДАЖИ по каждому виду валюты за день.
     **/
    public String closeDay(){

        return null;
    }

    /**Так же нужен отчет по списку операций, когда пользователь задает самостоятельно
     выбранный интервал времени и тип валюты (например, от 01.02.2021 до 16.03.2021 г. по валюте USD).
     **/
    public void transactionSearch(){

    }
}
