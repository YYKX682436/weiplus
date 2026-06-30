package m31;

/* loaded from: classes9.dex */
public final class k1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323161d;

    public k1(m31.p1 p1Var) {
        this.f323161d = p1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        m31.p1 p1Var = this.f323161d;
        p1Var.f323183g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (p1Var.I == m31.p0.f323175d) {
            p1Var.c(p1Var.E);
        }
    }
}
