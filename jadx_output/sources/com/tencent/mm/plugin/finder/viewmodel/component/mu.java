package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mu implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f135207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f135208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f135209f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f135210g;

    public mu(long j17, int i17, v65.n nVar, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f135207d = j17;
        this.f135208e = i17;
        this.f135209f = nVar;
        this.f135210g = finderVideoLayout;
    }

    @Override // cw2.ea
    public void onVideoPause() {
    }

    @Override // cw2.ea
    public void onVideoPlay() {
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
        long j19 = this.f135207d;
        long j27 = (j19 - j17) / 1000;
        int i17 = this.f135208e;
        if (j27 <= i17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "waitBeforeFinWatchInterval updateProgress suc, totalPlayMs=" + j19 + " currentMs=" + j17 + " beforeFinWatchInterval=" + i17 + '!');
            this.f135209f.a(java.lang.Boolean.TRUE);
            this.f135210g.T(this);
        }
    }
}
