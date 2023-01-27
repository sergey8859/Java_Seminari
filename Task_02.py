# Задача 2: Найдите сумму цифр трехзначного числа.
# 123 -> 6 (1 + 2 + 3)
# 100 -> 1 (1 + 0 + 0)
# Вариант решения задачи для неизвестного числа любой длины цифр.
number = int(input())
count = 0
while number != 0:
    count += number % 10
    number //= 10
print(f"Cуммa цифр числа: {count}")
# Вариант решения задачи для трехзначного числа (решаем справа => налево).
number = int(input())
n_3 = number % 10
n_2 = (number // 10) % 10
n_1 = (number // 100) % 10
print(f"Cуммa цифр трехзначного числа: {n_1 + n_2 + n_3}")
# Вариант решения задачи для трехзначного числа (решаем слева => направо).
number = int(input())
n_1 = number // 100
n_2 = (number // 10) % 10
n_3 = number % 10
print(f"Cуммa цифр трехзначного числа: {n_1 + n_2 + n_3}")
# Вариант решения задачи для неизвестного числа любой длины цифр.
number = int(input())
count = 0
for _ in range(number):
    count += number % 10
    number = number // 10
    if number == 0:
        break
print(f"Cуммa цифр числа: {count}")