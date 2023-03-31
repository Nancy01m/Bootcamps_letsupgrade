lst = []
n = int(input("Enter number of elements : "))
for i in range(0, n):
    ele = int(input())
    lst.append(ele)  
print(lst)
def sumOfSquares(lst) :
    res = 0
    for i in lst:
        res += i*i
    return res
res=sumOfSquares(lst)
print(f'Sum : {res}')

