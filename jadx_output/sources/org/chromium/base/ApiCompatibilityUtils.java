package org.chromium.base;

/* loaded from: classes13.dex */
public class ApiCompatibilityUtils {
    private static final java.lang.String TAG = "ApiCompatUtil";

    /* loaded from: classes13.dex */
    public static class ApisNMR1 {
        private ApisNMR1() {
        }

        public static boolean isDemoUser() {
            return ((android.os.UserManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("user")).isDemoUser();
        }
    }

    /* loaded from: classes13.dex */
    public static class ApisO {
        private ApisO() {
        }

        public static android.os.Bundle createLaunchDisplayIdActivityOptions(int i17) {
            android.app.ActivityOptions makeBasic = android.app.ActivityOptions.makeBasic();
            makeBasic.setLaunchDisplayId(i17);
            return makeBasic.toBundle();
        }

        public static void disableSmartSelectionTextClassifier(android.widget.TextView textView) {
            textView.setTextClassifier(android.view.textclassifier.TextClassifier.NO_OP);
        }

        public static void initNotificationSettingsIntent(android.content.Intent intent, java.lang.String str) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", str);
        }
    }

    /* loaded from: classes13.dex */
    public static class ApisP {
        private ApisP() {
        }

        public static android.graphics.Bitmap getBitmapByUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
            return android.graphics.ImageDecoder.decodeBitmap(android.graphics.ImageDecoder.createSource(contentResolver, uri));
        }

        public static java.lang.String getProcessName() {
            return android.app.Application.getProcessName();
        }
    }

    /* loaded from: classes11.dex */
    public static class ApisQ {
        private ApisQ() {
        }

        public static java.util.List<java.lang.Integer> getTargetableDisplayIds(android.app.Activity activity) {
            android.hardware.display.DisplayManager displayManager;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (activity == null || (displayManager = (android.hardware.display.DisplayManager) activity.getSystemService("display")) == null) {
                return arrayList;
            }
            android.view.Display[] displays = displayManager.getDisplays();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) activity.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            for (android.view.Display display : displays) {
                if (display.getState() == 2 && activityManager.isActivityStartAllowedOnDisplay(activity, display.getDisplayId(), new android.content.Intent(activity, activity.getClass()))) {
                    arrayList.add(java.lang.Integer.valueOf(display.getDisplayId()));
                }
            }
            return arrayList;
        }

        public static boolean isRunningInUserTestHarness() {
            return android.app.ActivityManager.isRunningInUserTestHarness();
        }
    }

    private ApiCompatibilityUtils() {
    }

    public static int checkPermission(android.content.Context context, java.lang.String str, int i17, int i18) {
        try {
            return context.checkPermission(str, i17, i18);
        } catch (java.lang.RuntimeException unused) {
            return -1;
        }
    }

    public static void clearHandwritingBoundsOffsetBottom(android.view.View view) {
        if (j3.b.c()) {
            try {
                float floatValue = ((java.lang.Float) android.view.View.class.getMethod("getHandwritingBoundsOffsetTop", new java.lang.Class[0]).invoke(view, new java.lang.Object[0])).floatValue();
                float floatValue2 = ((java.lang.Float) android.view.View.class.getMethod("getHandwritingBoundsOffsetLeft", new java.lang.Class[0]).invoke(view, new java.lang.Object[0])).floatValue();
                float floatValue3 = ((java.lang.Float) android.view.View.class.getMethod("getHandwritingBoundsOffsetRight", new java.lang.Class[0]).invoke(view, new java.lang.Object[0])).floatValue();
                java.lang.Class cls = java.lang.Float.TYPE;
                android.view.View.class.getMethod("setHandwritingBoundsOffsets", cls, cls, cls, cls).invoke(view, java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue3), 0);
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.NullPointerException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    public static android.os.Bundle createLaunchDisplayIdActivityOptions(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return org.chromium.base.ApiCompatibilityUtils.ApisO.createLaunchDisplayIdActivityOptions(i17);
        }
        return null;
    }

    public static void disableSmartSelectionTextClassifier(android.widget.TextView textView) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            org.chromium.base.ApiCompatibilityUtils.ApisO.disableSmartSelectionTextClassifier(textView);
        }
    }

    public static android.graphics.Bitmap getBitmapByUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? org.chromium.base.ApiCompatibilityUtils.ApisP.getBitmapByUri(contentResolver, uri) : android.provider.MediaStore.Images.Media.getBitmap(contentResolver, uri);
    }

    public static byte[] getBytesUtf8(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public static int getColor(android.content.res.Resources resources, int i17) {
        return resources.getColor(i17);
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.res.Resources resources, int i17) {
        return getDrawableForDensity(resources, i17, 0);
    }

    public static android.graphics.drawable.Drawable getDrawableForDensity(android.content.res.Resources resources, int i17, int i18) {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            return i18 == 0 ? resources.getDrawable(i17, null) : resources.getDrawableForDensity(i17, i18, null);
        } finally {
            android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static android.content.Intent getNotificationSettingsIntent() {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String packageName = org.chromium.base.ContextUtils.getApplicationContext().getPackageName();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            org.chromium.base.ApiCompatibilityUtils.ApisO.initNotificationSettingsIntent(intent, packageName);
        } else {
            intent.setAction("android.settings.ACTION_APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", packageName);
            intent.putExtra("app_uid", org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo().uid);
        }
        return intent;
    }

    public static java.lang.String getProcessName() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return org.chromium.base.ApiCompatibilityUtils.ApisP.getProcessName();
        }
        try {
            return (java.lang.String) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static java.util.List<java.lang.Integer> getTargetableDisplayIds(android.app.Activity activity) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? org.chromium.base.ApiCompatibilityUtils.ApisQ.getTargetableDisplayIds(activity) : new java.util.ArrayList();
    }

    public static boolean isDemoUser() {
        return android.os.Build.VERSION.SDK_INT >= 25 && org.chromium.base.ApiCompatibilityUtils.ApisNMR1.isDemoUser();
    }

    public static boolean isInMultiWindowMode(android.app.Activity activity) {
        return activity.isInMultiWindowMode();
    }

    public static boolean isRunningInUserTestHarness() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return org.chromium.base.ApiCompatibilityUtils.ApisQ.isRunningInUserTestHarness();
        }
        return false;
    }

    public static <T> T requireNonNull(T t17) {
        t17.getClass();
        return t17;
    }

    public static void setActivityOptionsBackgroundActivityStartMode(android.app.ActivityOptions activityOptions) {
        if (j3.b.c()) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(1);
        }
    }

    public static void setTextAppearance(android.widget.TextView textView, int i17) {
        textView.setTextAppearance(textView.getContext(), i17);
    }

    public static <T> T requireNonNull(T t17, java.lang.String str) {
        if (t17 != null) {
            return t17;
        }
        throw new java.lang.NullPointerException(str);
    }
}
