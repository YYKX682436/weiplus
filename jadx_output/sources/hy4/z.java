package hy4;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final hy4.z f286206a = new hy4.z();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f286207b = new java.util.HashMap();

    public final android.graphics.Bitmap a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.HashMap hashMap = f286207b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(str);
        if ((weakReference != null ? (android.graphics.Bitmap) weakReference.get() : null) != null) {
            java.lang.Object obj = weakReference.get();
            kotlin.jvm.internal.o.d(obj);
            if (!((android.graphics.Bitmap) obj).isRecycled()) {
                return (android.graphics.Bitmap) weakReference.get();
            }
        }
        android.graphics.Bitmap J2 = com.tencent.mm.vfs.w6.j(str) ? com.tencent.mm.sdk.platformtools.x.J(str, null) : null;
        if (J2 != null) {
            hashMap.put(str, new java.lang.ref.WeakReference(J2));
            return J2;
        }
        try {
            J2 = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            hashMap.put(str, new java.lang.ref.WeakReference(J2));
            return J2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewBitmapUtil", e17, "", new java.lang.Object[0]);
            return J2;
        }
    }
}
