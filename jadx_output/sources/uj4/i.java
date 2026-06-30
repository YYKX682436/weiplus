package uj4;

/* loaded from: classes3.dex */
public final class i implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f428436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f428437e;

    public i(com.tencent.mm.view.MMPAGView mMPAGView, android.widget.RelativeLayout relativeLayout) {
        this.f428436d = mMPAGView;
        this.f428437e = relativeLayout;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f428436d;
        mMPAGView2.i(this);
        this.f428437e.removeView(mMPAGView2);
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.view.MMPAGView mMPAGView2 = this.f428436d;
        mMPAGView2.i(this);
        this.f428437e.removeView(mMPAGView2);
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
