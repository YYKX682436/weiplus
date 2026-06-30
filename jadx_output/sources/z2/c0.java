package z2;

/* loaded from: classes13.dex */
public abstract class c0 {
    public static android.content.Intent a(android.app.Activity activity) {
        android.content.Intent a17 = z2.b0.a(activity);
        if (a17 != null) {
            return a17;
        }
        try {
            java.lang.String c17 = c(activity, activity.getComponentName());
            if (c17 == null) {
                return null;
            }
            android.content.ComponentName componentName = new android.content.ComponentName(activity, c17);
            try {
                return c(activity, componentName) == null ? android.content.Intent.makeMainActivity(componentName) : new android.content.Intent().setComponent(componentName);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }

    public static android.content.Intent b(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String c17 = c(context, componentName);
        if (c17 == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), c17);
        return c(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static java.lang.String c(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        android.os.Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
