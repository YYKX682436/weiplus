package cw2;

/* loaded from: classes15.dex */
public final class v7 implements ek4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f224069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kw2.f f224070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f224071c;

    public v7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, kw2.f fVar, cw2.s6 s6Var) {
        this.f224069a = finderThumbPlayerProxy;
        this.f224070b = fVar;
        this.f224071c = s6Var;
    }

    @Override // ek4.z
    public void a(int i17, dn.o oVar, dn.h hVar) {
        cw2.eb downloadCallback;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224069a;
        cw2.wa mediaSource = finderThumbPlayerProxy.getMediaSource();
        if (mediaSource != null && (downloadCallback = finderThumbPlayerProxy.getDownloadCallback()) != null) {
            downloadCallback.z(mediaSource.f224098e, oVar, hVar);
        }
        kw2.f fVar = this.f224070b;
        cw2.s6 s6Var = this.f224071c;
        if (i17 == 0) {
            if (fVar != null) {
                kw2.g gVar = new kw2.g(false, null, s6Var.f224002g, hVar);
                fVar.f313007a = gVar;
                yz5.l lVar = fVar.f313008b;
                if (lVar != null) {
                    lVar.invoke(gVar);
                }
            }
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            java.lang.String mediaId = s6Var.f223999d;
            Uj.getClass();
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            if (hVar == null) {
                com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "downloaderComeStopState mediaId:" + mediaId + " return for result is null  size:" + Uj.f313117c.size() + " list:");
            } else {
                pm0.v.O("FinderNetworkFlowReport_Thread", new kw2.i(Uj, mediaId, hVar));
            }
        }
        s6Var.c(false);
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.stopCdnDownload#onStop(), real cancel download task " + com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy) + ' ' + i17 + " observer:" + fVar);
    }
}
