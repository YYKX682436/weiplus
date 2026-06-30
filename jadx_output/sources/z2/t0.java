package z2;

/* loaded from: classes13.dex */
public abstract class t0 {
    public static android.app.Notification a(android.app.Notification.Builder builder) {
        return builder.build();
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i17) {
        return builder.setPriority(i17);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, boolean z17) {
        return builder.setUsesChronometer(z17);
    }
}
