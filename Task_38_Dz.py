# Задача 38: Дополнить телефонный справочник возможностью изменения и удаления данных. Пользователь также может
# ввести имя или фамилию, и Вы должны реализовать функционал для изменения и удаления данных.
def input_data():
    with open("data.txt", "a") as f:
        for i in range(int(input("введите кол-во новых записей в справочник - "))):
            f.write(input("введите ФИО и номер телефона: ").upper())
            f.write("\n")

def read_data():
    with open("data.txt", "r") as f:
        print(f.read())

def find_data():
    with open("data.txt", "r") as f:
        find_feature = input("введите одну из характеристик для поиска - ").upper()
        flag = False
        for i in f.readlines():
            list_feature = i.split()
            if find_feature in list_feature:
                print(i, end="")
                flag = True
        if not flag:
            print("такой записи не найдено")

def reload_data():
    search_data = input("введите Имя или Фамилию для редактирования данных : ").upper()
    change_data = input("введите новые данные : ").upper()
    with open("data1.txt", "r+") as f:
        for i in f.readlines():
            list_feature = i.split()
            if search_data in list_feature:
                new_str = i.replace(search_data, change_data)
                print(new_str)
                f.write(new_str)

while 1:
    get_choice = (int(input(
        """введите 1 - для добавления записи,
         2 - для вывода всего справочника, 
         3 - для поиска, 
         4 - для изменения данных
         5 - для удаления данных         
         6 - для завершения работы : """)))
    match get_choice:
        case 1:
            input_data()
        case 2:
            read_data()
        case 3:
            find_data()
        case 4:
            reload_data()