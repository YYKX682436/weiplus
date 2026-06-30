package kd2;

/* loaded from: classes2.dex */
public final class y0 extends do2.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f306864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f306865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd2.p1 f306866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f306867g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f306868h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f306869i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(long j17, kd2.p1 p1Var, float f17, boolean z17, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView) {
        super(finderMegaVideoMiniView);
        this.f306865e = j17;
        this.f306866f = p1Var;
        this.f306867g = f17;
        this.f306868h = z17;
        this.f306869i = finderThumbPlayerProxy;
        this.f306864d = true;
    }

    @Override // do2.f, cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f306869i;
        if (finderThumbPlayerProxy.getAlpha() == 1.0f) {
            return;
        }
        finderThumbPlayerProxy.setAlpha(1.0f);
    }

    @Override // do2.f, cw2.fb
    public void h(r45.mb4 mb4Var) {
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "initVideoView onPlay: isFirstTimePlay = " + this.f306864d + ", targetTimeMs = " + this.f306865e);
        if (this.f306864d) {
            pm0.v.X(new kd2.x0(this.f306866f, this.f306865e, this.f306867g, this.f306868h, this.f306869i));
            this.f306864d = false;
        }
    }
}
