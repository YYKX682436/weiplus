package sn2;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Service f410118a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f410119b;

    public b(android.app.Service service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f410118a = service;
        this.f410119b = jz5.h.b(new sn2.a(this));
    }

    public final void a() {
        try {
            ((android.app.NotificationManager) ((jz5.n) this.f410119b).getValue()).cancel(2106641);
            this.f410118a.stopForeground(true);
            com.tencent.mars.xlog.Log.i("FinderLiveNotificationManager", "cancel - Notification cancelled");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("FinderLiveNotificationManager", "cancel - Failed: " + e17.getMessage());
        }
    }
}
