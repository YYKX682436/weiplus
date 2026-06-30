package ri1;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel f396034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel) {
        super(0);
        this.f396034d = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ri1.b a17 = this.f396034d.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "delete " + a17);
        ri1.c cVar = (ri1.c) com.tencent.mm.plugin.appbrand.app.r9.fj(ri1.c.class);
        if (cVar != null) {
            cVar.delete(a17, new java.lang.String[0]);
        }
        return jz5.f0.f302826a;
    }
}
