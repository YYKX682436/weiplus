package si1;

/* loaded from: classes7.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ik1.x f408239a = new ik1.x();

    public static void a(java.lang.String str, z2.f fVar) {
        if (android.text.TextUtils.isEmpty(str) || fVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.RequestPermissionRegistry", "addCallback fail, invalid arguments");
        } else {
            f408239a.e(str, fVar);
        }
    }

    public static void b(java.lang.String str, z2.f fVar) {
        if (android.text.TextUtils.isEmpty(str) || fVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.RequestPermissionRegistry", "removeCallback fail, invalid arguments");
        } else {
            f408239a.f(str, fVar);
        }
    }

    public static void c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("Luggage.RequestPermissionRegistry", "removeCallbacks fail, invalid arguments");
        } else {
            f408239a.g(str);
        }
    }

    public static void d(java.lang.String str, int i17, java.lang.String[] strArr, int[] iArr, boolean z17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("Luggage.RequestPermissionRegistry", "removeCallback fail, invalid id");
            return;
        }
        java.util.Set d17 = f408239a.d(str);
        if (d17 != null) {
            java.util.Iterator it = d17.iterator();
            while (it.hasNext()) {
                ((z2.f) it.next()).onRequestPermissionsResult(i17, strArr, iArr);
            }
            if (z17) {
                d17.clear();
            }
        }
    }
}
