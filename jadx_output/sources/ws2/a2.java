package ws2;

/* loaded from: classes15.dex */
public final class a2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f449002d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f449003e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy f449004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.wa f449005g;

    public a2(com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, cw2.wa waVar) {
        this.f449004f = finderLiveThumbPlayerProxy;
        this.f449005g = waVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = this.f449004f;
        long currentPlayMs = finderLiveThumbPlayerProxy.getCurrentPlayMs();
        long videoDurationMs = finderLiveThumbPlayerProxy.getVideoDurationMs();
        if (this.f449003e != currentPlayMs) {
            cw2.fb lifecycle = finderLiveThumbPlayerProxy.getLifecycle();
            cw2.wa waVar = this.f449005g;
            if (lifecycle != null) {
                lifecycle.v(waVar.f224097d, currentPlayMs, videoDurationMs);
            }
            long j17 = this.f449002d;
            if (j17 == -1 || currentPlayMs - j17 > 1000 || currentPlayMs < j17) {
                cw2.fb lifecycle2 = finderLiveThumbPlayerProxy.getLifecycle();
                if (lifecycle2 != null) {
                    cw2.fb.w(lifecycle2, waVar.f224097d, ((int) currentPlayMs) / 1000, ((int) videoDurationMs) / 1000, null, 8, null);
                }
                java.lang.String fTPPTag = finderLiveThumbPlayerProxy.getFTPPTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(currentPlayMs);
                sb6.append('/');
                sb6.append(videoDurationMs);
                com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
                this.f449002d = currentPlayMs;
            }
            this.f449003e = currentPlayMs;
        }
        nk4.a aVar = finderLiveThumbPlayerProxy.F;
        if (aVar == null) {
            return true;
        }
        aVar.i(currentPlayMs, videoDurationMs);
        return true;
    }
}
