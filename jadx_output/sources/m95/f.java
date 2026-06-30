package m95;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.reflect.Field f325090a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.reflect.Method f325091b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f325092c = false;

    public f() {
        try {
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 <= 28 && (i17 != 28 || android.os.Build.VERSION.PREVIEW_SDK_INT == 0)) {
                b();
                return;
            }
            n95.d.a("MicroMsg.SVGResourceLoader", "below 28", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            n95.d.c("MicroMsg.SVGResourceLoader", th6, "", new java.lang.Object[0]);
        }
    }

    public java.lang.String a(android.content.res.AssetManager assetManager, long j17) {
        if (!this.f325092c) {
            return null;
        }
        int i17 = (int) (j17 >> 32);
        int i18 = (int) (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask);
        try {
            return (java.lang.String) this.f325091b.invoke(((java.lang.Object[]) this.f325090a.get(assetManager))[i17 - 1], java.lang.Integer.valueOf(i18));
        } catch (java.lang.Throwable th6) {
            n95.d.c("MicroMsg.SVGResourceLoader", th6, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final void b() {
        java.lang.reflect.Field declaredField = android.content.res.AssetManager.class.getDeclaredField("mApkAssets");
        this.f325090a = declaredField;
        declaredField.setAccessible(true);
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.content.res.ApkAssets").getDeclaredMethod("getStringFromPool", java.lang.Integer.TYPE);
        this.f325091b = declaredMethod;
        declaredMethod.setAccessible(true);
        this.f325092c = true;
    }
}
