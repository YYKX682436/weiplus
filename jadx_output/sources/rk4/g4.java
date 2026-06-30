package rk4;

/* loaded from: classes14.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public static final rk4.g4 f396674a = new rk4.g4();

    /* renamed from: b, reason: collision with root package name */
    public static final jm4.u5 f396675b;

    static {
        i95.n0.c(e70.q.class);
        int i17 = jm4.w5.f300437d;
        jm4.u5 u5Var = (jm4.u5) urgen.ur_0025.UR_87ED.UR_1332();
        kotlin.jvm.internal.o.d(u5Var);
        f396675b = u5Var;
    }

    public static final android.graphics.Bitmap a(rk4.g4 g4Var, byte[] bArr, bw5.tq0 tq0Var) {
        g4Var.getClass();
        int length = bArr.length;
        int i17 = tq0Var.f33580d;
        int i18 = tq0Var.f33581e;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/ting/TingBlurImage", "byteArray2Bitmap", "([BLcom/tencent/wechat/aff/proto/TingRGBAImageInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/ting/TingBlurImage", "byteArray2Bitmap", "([BLcom/tencent/wechat/aff/proto/TingRGBAImageInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        createBitmap.copyPixelsFromBuffer(java.nio.ByteBuffer.wrap(bArr));
        createBitmap.getWidth();
        createBitmap.getHeight();
        android.graphics.Bitmap.Config config2 = createBitmap.getConfig();
        kotlin.jvm.internal.o.d(config2);
        config2.name();
        createBitmap.isPremultiplied();
        return createBitmap;
    }

    public static final int b(rk4.g4 g4Var, bw5.rq0 rq0Var) {
        g4Var.getClass();
        return ((((int) ((rq0Var.f32656g * 255.0f) + 0.5f)) & 255) << 24) | ((((int) ((rq0Var.f32653d * 255.0f) + 0.5f)) & 255) << 16) | ((((int) ((rq0Var.f32654e * 255.0f) + 0.5f)) & 255) << 8) | (((int) ((rq0Var.f32655f * 255.0f) + 0.5f)) & 255);
    }

    public final jz5.l c(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingBlurImage", "bitmap2ByteArray in bitmap is null");
            return null;
        }
        android.graphics.Bitmap.Config config = bitmap.getConfig();
        if (config != android.graphics.Bitmap.Config.ARGB_8888) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingBlurImage", "bitmap2ByteArray bitmap config invalid: %s", config);
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocateDirect);
        byte[] array = allocateDirect.array();
        int arrayOffset = allocateDirect.arrayOffset();
        if (arrayOffset > 0) {
            kotlin.jvm.internal.o.d(array);
            array = kz5.z.o0(array, e06.p.m(arrayOffset, array.length));
        }
        bw5.tq0 tq0Var = new bw5.tq0();
        tq0Var.f33580d = bitmap.getWidth();
        boolean[] zArr = tq0Var.f33583g;
        zArr[1] = true;
        tq0Var.f33581e = bitmap.getHeight();
        zArr[2] = true;
        tq0Var.f33582f = 4;
        zArr[3] = true;
        return new jz5.l(array, tq0Var);
    }
}
