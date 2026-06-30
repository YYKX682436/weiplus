package fa3;

/* loaded from: classes10.dex */
public class j implements bi3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f260760a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f260761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa3.b f260762c;

    public j(fa3.b bVar, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f260762c = bVar;
        this.f260760a = map;
        this.f260761b = gVar;
    }

    @Override // bi3.i
    public void a() {
        this.f260760a.put("error", "take photo error");
        this.f260762c.f260732r = 1;
    }

    @Override // bi3.i
    public void b(android.graphics.Bitmap bitmap, java.util.Map map) {
        android.graphics.Bitmap bitmap2 = bitmap;
        java.util.Map map2 = this.f260760a;
        fa3.b bVar = this.f260762c;
        if (bitmap2 != null) {
            if ("front".equals(bVar.f260718d) && !bVar.f260737w) {
                bVar.getClass();
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
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/lite/media/camera/LiteAppCameraManager", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/lite/media/camera/LiteAppCameraManager", "mirrorBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                bitmap.recycle();
                bitmap2 = createBitmap;
            }
            boolean c17 = bVar.c(bitmap2, bVar.f260726l);
            com.tencent.mm.plugin.lite.api.g gVar = this.f260761b;
            if (c17) {
                map2.put("tempImagePath", bVar.f260726l);
                gVar.d(map2);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppCameraManager", "tempImagePath:%s", bVar.f260726l);
            } else {
                map2.put("error", "camera save photo fail");
                gVar.d(map2);
            }
        } else {
            map2.put("error", "camera get photo bitmap is null");
        }
        bVar.f260733s = false;
        bVar.f260732r = 1;
    }
}
