package com.kjprojects.finance.Repository
import com.kjprojects.finance.Domain.BudgetDomain
import com.kjprojects.finance.Domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
            ExpenseDomain("Restaurant", 573.12, "img1", "17 August 2024 19:15"),
            ExpenseDomain("McDonald's", 77.82, "img2", "16 August 2024 13:58"),
            ExpenseDomain("Cinema", 23.47, "img3", "16 August 2024 18:45"),
            ExpenseDomain("Restaurant", 573.12, "img1", "17 August 2024 19:15")
    )

    val budget = mutableListOf(
            BudgetDomain("Home Loan", 2350.00, 70.8),
            BudgetDomain("Subscriptions", 1280.00, 10.4),
            BudgetDomain("Car Loan", 3890.00, 30.2)
    )
}