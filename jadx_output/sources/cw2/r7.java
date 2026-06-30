package cw2;

/* loaded from: classes15.dex */
public final class r7 implements ek4.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kw2.f f223980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f223981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f223982d;

    public r7(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, kw2.f fVar, so2.i3 i3Var, cw2.s6 s6Var) {
        this.f223979a = finderThumbPlayerProxy;
        this.f223980b = fVar;
        this.f223981c = i3Var;
        this.f223982d = s6Var;
    }

    @Override // ek4.x
    public void b(int i17, dn.o oVar) {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223979a;
        java.lang.String fTPPTag = finderThumbPlayerProxy.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FTPP.startCdnDownload#onStart ");
        sb6.append(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(finderThumbPlayerProxy));
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" observer:");
        kw2.f fVar = this.f223980b;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        java.lang.String str = null;
        if (i17 == 0 && fVar != null) {
            kw2.g gVar = new kw2.g(true, this.f223981c, null, null);
            fVar.f313007a = gVar;
            yz5.l lVar = fVar.f313008b;
            if (lVar != null) {
                lVar.invoke(gVar);
            }
        }
        cw2.i9 lifecycle = finderThumbPlayerProxy.getLifecycle();
        if (lifecycle != null) {
            cw2.wa mediaSource = finderThumbPlayerProxy.getMediaSource();
            long feedId = (mediaSource == null || (feedData2 = mediaSource.f224099f) == null) ? 0L : feedData2.getFeedId();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            cw2.wa mediaSource2 = finderThumbPlayerProxy.getMediaSource();
            if (mediaSource2 != null && (feedData = mediaSource2.f224099f) != null) {
                str = feedData.getDupFlag();
            }
            lifecycle.B(new nk4.c(feedId, 3, uptimeMillis, str, null, 16, null));
        }
        pw2.b bVar = finderThumbPlayerProxy.f130675y0;
        if (bVar.f358694j == 0) {
            bVar.f358694j = android.os.SystemClock.uptimeMillis();
        }
        cw2.e0 bufferProgressConsumer = finderThumbPlayerProxy.getBufferProgressConsumer();
        if (bufferProgressConsumer != null) {
            bufferProgressConsumer.f223668j = true;
        }
        cu2.x xVar = cu2.x.f222449a;
        cw2.s6 s6Var = this.f223982d;
        so2.i3 c17 = cu2.x.c(xVar, s6Var.f223999d, false, false, false, 14, null);
        finderThumbPlayerProxy.f130672x0.G = c17.field_cacheSize;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.startCdnDownload#onStart hitPreloadSize:" + c17.field_cacheSize);
        s6Var.c(false);
        finderThumbPlayerProxy.o0(true);
    }
}
