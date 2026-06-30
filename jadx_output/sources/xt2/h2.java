package xt2;

/* loaded from: classes3.dex */
public final class h2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f456774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f456775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f456776f;

    public h2(xt2.e3 e3Var, cm2.m0 m0Var, yz5.a aVar) {
        this.f456774d = e3Var;
        this.f456775e = m0Var;
        this.f456776f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        xt2.e3 e3Var = this.f456774d;
        if (e3Var.f456715s.getWidth() > 0) {
            e3Var.f456715s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (e3Var.U == this.f456775e) {
                this.f456776f.invoke();
            }
        }
    }
}
