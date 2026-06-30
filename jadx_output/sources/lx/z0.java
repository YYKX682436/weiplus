package lx;

/* loaded from: classes11.dex */
public final class z0 implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.TextureRegistry.SurfaceProducer f322021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f322022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizTLPlayerInfo f322023f;

    public z0(io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer, java.lang.ref.WeakReference weakReference, com.tencent.pigeon.biz_base.BizTLPlayerInfo bizTLPlayerInfo) {
        this.f322021d = surfaceProducer;
        this.f322022e = weakReference;
        this.f322023f = bizTLPlayerInfo;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.o0(this.f322022e, this.f322023f, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.k0(this.f322022e, this.f322023f, str2, i17, i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.g0(this.f322022e, this.f322023f, str2, str3, i17, i18));
        this.f322021d.release();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.w0(this.f322022e, this.f322023f, str2, bool));
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.s0(this.f322022e, this.f322023f, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.u0(this.f322022e, this.f322023f, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.y0(this.f322022e, this.f322023f, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.m0(this.f322022e, this.f322023f, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.q0(this.f322022e, this.f322023f, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        ((ku5.t0) ku5.t0.f312615d).B(new lx.i0(this.f322022e, this.f322023f, str2, i17, i18, i19));
    }
}
