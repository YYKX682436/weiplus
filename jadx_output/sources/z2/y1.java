package z2;

/* loaded from: classes13.dex */
public abstract class y1 {
    public static void a(android.app.Service service, int i17, android.app.Notification notification, int i18) {
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 34) {
            z2.x1.a(service, i17, notification, i18);
        } else if (i19 >= 29) {
            z2.w1.a(service, i17, notification, i18);
        } else {
            service.startForeground(i17, notification);
        }
    }
}
