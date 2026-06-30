package nq;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView f338921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f338922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338923f;

    public y(com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView, int i17, int i18) {
        this.f338921d = gradientColorBackgroundView;
        this.f338922e = i17;
        this.f338923f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView gradientColorBackgroundView = this.f338921d;
        gradientColorBackgroundView.f64893e = this.f338922e;
        gradientColorBackgroundView.f64894f = this.f338923f;
        gradientColorBackgroundView.f64896h = true;
    }
}
