package z2;

/* loaded from: classes13.dex */
public abstract class d {
    public static boolean a(android.app.Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    public static boolean b(android.app.Activity activity, java.lang.String str) {
        try {
            return ((java.lang.Boolean) android.content.pm.PackageManager.class.getMethod("shouldShowRequestPermissionRationale", java.lang.String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
