package zl1;

/* loaded from: classes7.dex */
public class e0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f473585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl1.f0 f473586e;

    public e0(zl1.f0 f0Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f473586e = f0Var;
        this.f473585d = appBrandRuntime;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "PackageIconLoader";
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.f0 f0Var = this.f473586e;
        java.io.InputStream q17 = com.tencent.mm.plugin.appbrand.appcache.la.q(this.f473585d, f0Var.f473626a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(q17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/PackageIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
        yj0.a.e(obj, decodeStream, "com/tencent/mm/plugin/appbrand/widget/tabbar/PackageIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
        if (decodeStream == null) {
            f0Var.f473628c.a("Failed to load icon via package path", f0Var);
        } else {
            zl1.z zVar = f0Var.f473631f;
            if (zVar != null) {
                zVar.a(decodeStream, f0Var);
            }
        }
        if (q17 != null) {
            com.tencent.mm.sdk.platformtools.t8.v1(q17);
        }
    }
}
