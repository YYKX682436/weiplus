package sx5;

/* loaded from: classes13.dex */
public class z0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public sx5.y0 f413774d;

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        android.app.Activity z18;
        super.onWindowFocusChanged(z17);
        sx5.y0 y0Var = this.f413774d;
        if (y0Var != null) {
            sx5.m0 m0Var = (sx5.m0) y0Var;
            sx5.a1 a1Var = m0Var.f413748a;
            if (a1Var.G1 && z17 && (z18 = a1Var.z()) != null) {
                by5.c4.f("XWebNativeInterface", "window callback, onWindowFocusChanged hasFocus:" + z17 + ", mIsFullscreen:" + a1Var.N1 + ", focus element:" + z18.getCurrentFocus() + ", mCurrentOrientation:" + a1Var.V + ", activity.getRequestedOrientation:" + z18.getRequestedOrientation());
                if (a1Var.N1) {
                    if (!a1Var.f413672f.getView().hasFocus()) {
                        a1Var.w(new sx5.l0(m0Var));
                    }
                    int i17 = a1Var.V;
                    if (i17 != -3 && i17 != z18.getRequestedOrientation()) {
                        a1Var.x(a1Var.V);
                    }
                }
                a1Var.G1 = false;
            }
        }
    }

    public void setWindowFocusChangedListener(sx5.y0 y0Var) {
        this.f413774d = y0Var;
    }
}
