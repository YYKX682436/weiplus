package z2;

/* loaded from: classes13.dex */
public abstract class a1 {
    public static android.app.Notification.Builder a(android.content.Context context, java.lang.String str) {
        return new android.app.Notification.Builder(context, str);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i17) {
        return builder.setBadgeIconType(i17);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, boolean z17) {
        return builder.setColorized(z17);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, int i17) {
        return builder.setGroupAlertBehavior(i17);
    }

    public static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static android.app.Notification.Builder f(android.app.Notification.Builder builder, java.lang.String str) {
        return builder.setShortcutId(str);
    }

    public static android.app.Notification.Builder g(android.app.Notification.Builder builder, long j17) {
        return builder.setTimeoutAfter(j17);
    }
}
