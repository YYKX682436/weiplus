package z2;

/* loaded from: classes13.dex */
public abstract class h0 {
    public static android.app.Notification.BigTextStyle a(android.app.Notification.BigTextStyle bigTextStyle, java.lang.CharSequence charSequence) {
        return bigTextStyle.bigText(charSequence);
    }

    public static android.app.Notification.BigTextStyle b(android.app.Notification.Builder builder) {
        return new android.app.Notification.BigTextStyle(builder);
    }

    public static android.app.Notification.BigTextStyle c(android.app.Notification.BigTextStyle bigTextStyle, java.lang.CharSequence charSequence) {
        return bigTextStyle.setBigContentTitle(charSequence);
    }

    public static android.app.Notification.BigTextStyle d(android.app.Notification.BigTextStyle bigTextStyle, java.lang.CharSequence charSequence) {
        return bigTextStyle.setSummaryText(charSequence);
    }
}
