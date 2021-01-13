x = gets.to_i
y = gets.to_i
if(x >= 1 && y >= 1)
  print("1")
elsif(x >= 1 && y < 1) 
  print("4")
elsif(x < 1 && y < 1)
  print("3")
elsif(x < 1 && y >= 1)
  print("2")
end