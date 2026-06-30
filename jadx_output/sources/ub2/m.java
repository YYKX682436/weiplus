package ub2;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f426083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426083d = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ub2.m(this.f426083d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmap2 = this.f426083d;
        float height = 320.0f / (bitmap2.getWidth() >= bitmap2.getHeight() ? bitmap2.getHeight() : bitmap2.getWidth());
        if (height < 1.0f) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale(height, height);
            int width = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            zj0.a aVar2 = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar2.c(java.lang.Boolean.TRUE);
            aVar2.c(matrix);
            aVar2.c(java.lang.Integer.valueOf(height2));
            aVar2.c(java.lang.Integer.valueOf(width));
            aVar2.c(0);
            aVar2.c(0);
            aVar2.c(bitmap2);
            java.lang.Object obj2 = new java.lang.Object();
            yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            bitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
            yj0.a.e(obj2, bitmap, "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        } else {
            bitmap = bitmap2;
        }
        kotlin.jvm.internal.o.d(bitmap);
        if (bitmap.getConfig() != config) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            android.graphics.Bitmap bitmap3 = bitmap;
            yj0.a.d(bitmap3, arrayList.toArray(), "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(bitmap3, copy, "com/tencent/mm/plugin/finder/core/WatermarkDetCore", "convert", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.d(copy);
            bitmap = copy;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        com.tencent.mars.xlog.Log.i("Finder.WatermarkDetCore", "handle bitmap time: " + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + ", width:" + bitmap2.getWidth() + " height:" + bitmap2.getHeight() + " new width:" + bitmap.getWidth() + " new height:" + bitmap.getHeight());
        return new jz5.l(allocateDirect, new jz5.l(new java.lang.Integer(bitmap.getWidth()), new java.lang.Integer(bitmap.getHeight())));
    }
}
