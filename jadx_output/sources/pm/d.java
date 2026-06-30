package pm;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue f356751a;

    public synchronized void a() {
        if (this.f356751a == null) {
            this.f356751a = new com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue();
        }
        this.f356751a.size();
    }

    public void b() {
        com.tencent.mm.booter.notification.queue.NotificationQueue$ParcelNotificationQueue notificationQueue$ParcelNotificationQueue = this.f356751a;
        if (notificationQueue$ParcelNotificationQueue == null) {
            return;
        }
        notificationQueue$ParcelNotificationQueue.size();
        if (this.f356751a.isEmpty()) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j();
            o4Var.getClass();
            o4Var.putString("com.tencent.preference.notification.queue", "");
            if (this.f356751a == null) {
                a();
            }
            this.f356751a.size();
        }
    }
}
