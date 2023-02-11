# Задача 26: Напишите программу, которая на вход принимает
# два числа A и B, и возводит число А в целую степень B с
# помощью рекурсии.
# A = 3; B = 5 -> 243 (3⁵)
# A  = 2; B = 3 -> 8

def involution(a, n):
    if n < 1:
        return 1
    n -= 1
    a *= involution(a, n)
    return a

a = int(input("Введите число: "))
n = int(input('Введите целую степень: '))

res = involution(a, n)
print(res)
