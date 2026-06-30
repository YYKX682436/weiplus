package gk5;

/* loaded from: classes.dex */
public final class n1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.r1 f272689d;

    public n1(gk5.r1 r1Var) {
        this.f272689d = r1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gk5.r1 r1Var = this.f272689d;
        r1Var.T6().c().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewGroup.LayoutParams layoutParams = r1Var.T6().c().getLayoutParams();
        if (layoutParams != null) {
            int height = r1Var.T6().c().getHeight();
            jz5.g gVar = r1Var.f272717e;
            if (height > ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue()) {
                layoutParams.height = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
                r1Var.T6().c().setLayoutParams(layoutParams);
                r1Var.T6().c().postInvalidate();
            }
        }
    }
}
