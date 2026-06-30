package du2;

/* loaded from: classes8.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    public final android.app.PendingIntent a(android.content.Context context) {
        android.content.Intent launchIntentForPackage;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName())) == null) {
            return null;
        }
        return android.app.PendingIntent.getActivity(context, 0, launchIntentForPackage, fp.g0.a(0));
    }
}
