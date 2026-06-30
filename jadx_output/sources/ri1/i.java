package ri1;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel f396032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel) {
        super(0);
        this.f396032d = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ri1.c cVar = (ri1.c) com.tencent.mm.plugin.appbrand.app.r9.fj(ri1.c.class);
        if (cVar != null) {
            ri1.b a17 = this.f396032d.a();
            if (cVar.get(a17, new java.lang.String[0])) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                a17.field_accessTime = java.lang.System.currentTimeMillis();
                cVar.update(a17, new java.lang.String[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "access " + a17);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "access failed " + a17);
            }
        }
        return jz5.f0.f302826a;
    }
}
