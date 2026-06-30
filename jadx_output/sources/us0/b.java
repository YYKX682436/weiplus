package us0;

/* loaded from: classes10.dex */
public final class b implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ us0.c f430445d;

    public b(us0.c cVar) {
        this.f430445d = cVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markImageAvailable");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1099L, 13L, 1L);
        us0.c cVar = this.f430445d;
        vs0.l lVar = cVar.f430452f;
        vs0.c cVar2 = vs0.c.f439830a;
        android.graphics.Point point = vs0.c.f439834e;
        kotlin.jvm.internal.o.d(point);
        boolean z17 = !kotlin.jvm.internal.o.b(vs0.c.f439832c, cVar2.b(1));
        android.media.Image acquireLatestImage = imageReader.acquireLatestImage();
        kotlin.jvm.internal.o.f(acquireLatestImage, "acquireLatestImage(...)");
        cVar.post(new vs0.a(lVar, point, z17, acquireLatestImage, new us0.a(cVar)));
    }
}
