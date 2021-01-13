x = int(input())
y = int(input())
if not(x == 0 and y == 0):
  if(x >= -1000 and x <= 1000 and y >= -1000 and y <= 1000):
     if(x >= 1 and y >= 1):
        print("1")
     elif(x >= 1 and y < 1):
        print("4")
     elif(x < 1 and y < 1):
        print("3");
     else:
        print("2");