package spharos.nu.notification.domain.fcm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spharos.nu.notification.domain.fcm.entity.Notification;

@Repository
public interface FCMRepository extends JpaRepository<Notification, Long> {
}
