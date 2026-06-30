package mh2;

/* loaded from: classes3.dex */
public final class r0 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326446d;

    public r0(mh2.f1 f1Var) {
        this.f326446d = f1Var;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        mh2.f1 f1Var = this.f326446d;
        f1Var.f326334i.setVisibility(0);
        com.tencent.mars.xlog.Log.i(f1Var.f326330e, "onAnimationStart");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        mh2.f1 f1Var = this.f326446d;
        f1Var.f326334i.setVisibility(4);
        f1Var.f326335j.setText("");
        f1Var.f326335j.setVisibility(8);
        com.tencent.mars.xlog.Log.i(f1Var.f326330e, "onAnimationEnd");
    }

    @Override // ym5.w1
    public void d(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
