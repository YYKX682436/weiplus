package ym5;

/* loaded from: classes13.dex */
public final class a2 implements com.tencent.mm.rfx.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f463192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f463193b;

    public a2(ym5.w1 w1Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f463192a = w1Var;
        this.f463193b = mMPAGView;
    }

    @Override // com.tencent.mm.rfx.i
    public void a(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f463192a.e(this.f463193b);
    }

    @Override // com.tencent.mm.rfx.i
    public void b(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f463192a.d(this.f463193b);
    }

    @Override // com.tencent.mm.rfx.i
    public void c(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f463192a.a(this.f463193b);
    }

    @Override // com.tencent.mm.rfx.i
    public void d(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f463192a.c(this.f463193b);
    }

    @Override // com.tencent.mm.rfx.i
    public void e(com.tencent.mm.rfx.RfxPagView rfxPagView, com.tencent.mm.rfx.RfxPagFrameInfo rfxPagFrameInfo) {
    }

    @Override // com.tencent.mm.rfx.i
    public void f(com.tencent.mm.rfx.RfxPagView rfxPagView) {
        this.f463192a.b(this.f463193b);
    }
}
