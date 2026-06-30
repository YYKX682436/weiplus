package cw2;

/* loaded from: classes2.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.da f223672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout f223673e;

    public e3(cw2.da daVar, com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout) {
        this.f223672d = daVar;
        this.f223673e = finderLiveCardMediaLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f223672d.getE()) {
            int i17 = com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout.f130578y;
            com.tencent.mm.plugin.finder.video.FinderLiveCardMediaLayout finderLiveCardMediaLayout = this.f223673e;
            finderLiveCardMediaLayout.getClass();
            ym5.a1.f(new cw2.g3(finderLiveCardMediaLayout, "reuse"));
        }
    }
}
