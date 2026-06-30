package wq;

/* loaded from: classes9.dex */
public final class e implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f448476a;

    public e(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1);
            arrayList.add(1);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMBitmapDecoder", "<init>", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, bitmap, "com/tencent/mm/emoji/decode/MMBitmapDecoder", "<init>", "(Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(bitmap, "createBitmap(...)");
        }
        this.f448476a = bitmap;
        bitmap.setDensity(com.tencent.mapsdk.internal.km.f50100e);
    }

    @Override // wq.d
    public int a() {
        return Integer.MAX_VALUE;
    }

    @Override // wq.d
    public int b() {
        return this.f448476a.getHeight();
    }

    @Override // wq.d
    public void c() {
    }

    @Override // wq.d
    public int d() {
        return 1;
    }

    @Override // wq.d
    public void destroy() {
    }

    @Override // wq.d
    public int e() {
        return this.f448476a.getWidth();
    }

    @Override // wq.d
    public android.graphics.Bitmap getFrame() {
        return this.f448476a;
    }

    @Override // wq.d
    public void seekTo(long j17) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(byte[] bytes) {
        this(com.tencent.mm.sdk.platformtools.x.G(bytes));
        kotlin.jvm.internal.o.g(bytes, "bytes");
    }
}
