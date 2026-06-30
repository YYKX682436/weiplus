package tb1;

/* loaded from: classes7.dex */
public class n implements bi3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f416913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tb1.s f416914b;

    public n(tb1.s sVar, boolean z17) {
        this.f416914b = sVar;
        this.f416913a = z17;
    }

    @Override // bi3.i
    public void a() {
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.a(this.f416914b.f416934a, -1, null, null, "take picture error");
    }

    @Override // bi3.i
    public void b(android.graphics.Bitmap bitmap, java.util.Map map) {
        android.graphics.Bitmap bitmap2 = bitmap;
        tb1.s sVar = this.f416914b;
        if (bitmap2 == null) {
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.a(sVar.f416934a, -1, null, null, "bitmap is null");
            return;
        }
        if ("front".equals(sVar.f416934a.f80174m) && !this.f416913a) {
            sVar.getClass();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postScale(-1.0f, 1.0f);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(height));
            aVar.c(java.lang.Integer.valueOf(width));
            aVar.c(0);
            aVar.c(0);
            aVar.c(bitmap2);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/appbrand/jsapi/camera/AppBrandCameraView$NormalCameraMode", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/camera/AppBrandCameraView$NormalCameraMode", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            bitmap.recycle();
            bitmap2 = createBitmap;
        }
        if (!sVar.f(bitmap2, sVar.f416934a.I)) {
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.a(sVar.f416934a, -1, null, null, "save fail");
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = sVar.f416934a;
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.a(appBrandCameraView, 0, sVar.g(appBrandCameraView.f80169e, appBrandCameraView.I), map, "");
        }
    }
}
