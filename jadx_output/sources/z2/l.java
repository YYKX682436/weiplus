package z2;

/* loaded from: classes10.dex */
public abstract class l {
    public static android.app.ActivityOptions a() {
        return android.app.ActivityOptions.makeBasic();
    }

    public static android.app.ActivityOptions b(android.view.View view, int i17, int i18, int i19, int i27) {
        return android.app.ActivityOptions.makeClipRevealAnimation(view, i17, i18, i19, i27);
    }

    public static void c(android.app.ActivityOptions activityOptions, android.app.PendingIntent pendingIntent) {
        activityOptions.requestUsageTimeReport(pendingIntent);
    }
}
