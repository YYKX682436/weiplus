package us0;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ us0.c f430444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(us0.c cVar) {
        super(1);
        this.f430444d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap image = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(image, "image");
        us0.c cVar = this.f430444d;
        com.tencent.mars.xlog.Log.i(cVar.f430448b, "onImageAvailableListener, image:" + image + ", width:" + image.getWidth() + ", height:" + image.getHeight());
        yz5.l lVar = cVar.f430451e;
        if (lVar != null) {
        }
        if (kotlin.jvm.internal.o.b(vs0.c.f439832c, vs0.c.f439830a.b(1))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureSuccessUseImageBack");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 14L, 1L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureSuccessUseImageFront");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 15L, 1L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageSuccess");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 16L, 1L);
        vs0.l lVar2 = cVar.f430452f;
        if (lVar2 != null) {
            lVar2.b();
        }
        cVar.f430452f = null;
        return jz5.f0.f302826a;
    }
}
