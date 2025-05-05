def multiplyTable(n):
    for i in range(1, 11):
        print(f"{n} x {i} = {n * i}")


def multiplyTableLambda(n):
    list(map(lambda i: print(f"{n} x {i} = {n * i}"), range(1, 11)))


def multiplyTableRecursive(n, i):
    if i > 10:
        return
    print(f"{n} x {i} = {n * i}")
    multiplyTableRecursive(n, i + 1)

if __name__ == "__main__":
    n = int(input("Enter a number: "))
    multiplyTable(n)
    print("Recursive:")
    multiplyTableRecursive(n, 1)
    print("Lambda:")
    multiplyTableLambda(n)