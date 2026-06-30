package z2;

/* loaded from: classes13.dex */
public abstract class c {
    public static void a(java.lang.Object obj) {
        ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(android.app.Activity activity, java.lang.String[] strArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(strArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "androidx/core/app/ActivityCompat$Api23Impl", "requestPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        activity.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(activity, "androidx/core/app/ActivityCompat$Api23Impl", "requestPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    public static boolean c(android.app.Activity activity, java.lang.String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
