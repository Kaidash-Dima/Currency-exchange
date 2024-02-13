package service;

import entity.ApplicationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ApplicationFormRepository;

@Service
public class ApplicationFormService {
    private final ApplicationFormRepository applyFormRepository;

    public ApplicationFormService(ApplicationFormRepository applyFormRepository) {
        this.applyFormRepository = applyFormRepository;
    }

    /**Заявка
     Входными данными для заявки будет следующая информация, полученная от клиента:
     - валюта продажи;
     - валюта покупки;
     - сумма продажи;
     - ввод контактных данных покупателя, как минимум номер телефона;
     Затем сотрудник сохраняет заявку, она добавляется в БД со статусом «Новая».
     Вызов операции заявки - через URL REST сервиса.

     ----------------------------------------------------------------------------
     Сервис должен вернуть:
     -  сумму в валюте покупки с учетом курса валют, которая вычисляется как
     сумма продажи * курс валюты продажи к валюте покупке
     -  номер телефона клиента
     -  и ОТП пароль (который передается клиенту).
     **/
    public ApplicationForm createApplicationForm(){
        return null;
    }

    /**Подтверждение заявки:
     - клиент сообщает свой номер телефона и ОТП пароль, который он получил;
     - сотрудник вводит ОТП пароль и программа проверяет соответствует ли этот ОТП пароль тому, который отправил предыдущий сервис
       и если они одинаковые - операция обмена валюты считается успешной, заявка переводиться в статус «Выполнена»;
     - если ОТП пароль ошибочен – заявка переводиться в статус «Отменена».
     Вызов операции подтверждения заявки - через URL REST сервиса.
     Сервис должен вернуть ответ о правильности или ошибочности переданного ОТП пароля.
     **/

    public boolean applicationConfirmation(){
        return true;
    }

    /** По необходимости, заявку на обмен валюты можно удалить, если она находиться в статусе «Новая»
     * и вы знаете номер телефона клиента.
     **/
    public void removeApplicationForm(){

    }
}
