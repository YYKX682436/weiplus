package wo4;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wo4.y yVar) {
        super(2);
        this.f448288d = yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.nio.IntBuffer buffer = (java.nio.IntBuffer) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(buffer, "buffer");
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "on snapshot callback, buffer:" + buffer + ", frameCount:" + intValue);
        wo4.y yVar = this.f448288d;
        if (yVar.f448313t && intValue >= 1) {
            buffer.position(0);
            com.tencent.mm.plugin.vlog.model.l1 l1Var = yVar.f448295b;
            int i17 = l1Var.f175659d;
            int i18 = l1Var.f175660e;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/plugin/vlog/remux/VLogRemuxer$remuxVideo$1$3", "invoke", "(Ljava/nio/IntBuffer;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/vlog/remux/VLogRemuxer$remuxVideo$1$3", "invoke", "(Ljava/nio/IntBuffer;I)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            createBitmap.copyPixelsFromBuffer(buffer);
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            java.lang.String str = yVar.f448314u;
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 60, compressFormat, str, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "remuxForThumb finish, thumbPath:" + str + ", thumb:[" + createBitmap.getWidth() + ", " + createBitmap.getHeight() + ']');
            yVar.f448313t = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "release");
            yVar.b();
            yVar.f448311r.b();
            com.tencent.mm.sdk.platformtools.u3.h(new wo4.r(yVar));
        }
        return jz5.f0.f302826a;
    }
}
