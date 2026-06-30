package ri1;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel f396033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel) {
        super(0);
        this.f396033d = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ri1.c cVar = (ri1.c) com.tencent.mm.plugin.appbrand.app.r9.fj(ri1.c.class);
        if (cVar != null) {
            com.tencent.mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel = this.f396033d;
            ri1.b a17 = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel.a();
            boolean z17 = cVar.get(a17, new java.lang.String[0]);
            a17.field_cacheFilePath = webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel.f87238h;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            a17.field_accessTime = java.lang.System.currentTimeMillis();
            if (z17) {
                cVar.update(a17, new java.lang.String[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "update record[" + a17 + "] with path[" + webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel.f87238h + ']');
            } else {
                cVar.insert(a17);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WebRenderingCacheIPCOperations", "insert record[" + a17 + "] with path[" + webRenderingCacheIPCOperations$WebRenderingCacheRecordParcel.f87238h + ']');
            }
        }
        return jz5.f0.f302826a;
    }
}
