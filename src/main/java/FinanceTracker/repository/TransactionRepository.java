package FinanceTracker.repository;

import FinanceTracker.TransactionType;
import FinanceTracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
