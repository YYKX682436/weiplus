package nl5;

/* loaded from: classes15.dex */
public final class n0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f338330d;

    public n0(nl5.s0 s0Var) {
        this.f338330d = s0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        nl5.s0 s0Var = this.f338330d;
        if (!s0Var.A || !s0Var.f338372w) {
            return true;
        }
        java.lang.Runnable h17 = s0Var.h();
        android.widget.TextView textView = s0Var.f338357h;
        textView.removeCallbacks(h17);
        textView.postDelayed(s0Var.h(), 100);
        return true;
    }
}
