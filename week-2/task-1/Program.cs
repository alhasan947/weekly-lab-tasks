using System;

class Program
{
    static void Main(string[] args)
    {
        int number = int.Parse(Console.ReadLine());
        int hours = int.Parse(Console.ReadLine());
        double amountPerHour = double.Parse(Console.ReadLine());

        double salary = hours * amountPerHour;

        Console.WriteLine("NUMBER = " + number);
        Console.WriteLine("SALARY = U$ " + salary.ToString("F2"));
    }
}
