package ym5;

/* loaded from: classes13.dex */
public final class z1 implements org.libpag.PAGView.PAGViewListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.w1 f463587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f463588b;

    public z1(ym5.w1 w1Var, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f463587a = w1Var;
        this.f463588b = mMPAGView;
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationCancel(org.libpag.PAGView pAGView) {
        this.f463587a.a(this.f463588b);
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationEnd(org.libpag.PAGView pAGView) {
        this.f463587a.c(this.f463588b);
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationRepeat(org.libpag.PAGView pAGView) {
        this.f463587a.e(this.f463588b);
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationStart(org.libpag.PAGView pAGView) {
        this.f463587a.b(this.f463588b);
    }

    @Override // org.libpag.PAGView.PAGViewListener
    public void onAnimationUpdate(org.libpag.PAGView pAGView) {
        this.f463587a.d(this.f463588b);
    }
}
