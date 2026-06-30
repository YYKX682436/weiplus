package m31;

/* loaded from: classes9.dex */
public final class i0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323152d;

    public i0(m31.p1 p1Var) {
        this.f323152d = p1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m31.p1 p1Var = this.f323152d;
        if (p1Var.f323194u.getHeight() > 0) {
            p1Var.f323193t.getLayoutParams().height = p1Var.f323194u.getHeight();
        }
    }
}
