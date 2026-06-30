package ry4;

/* loaded from: classes.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401684d;

    public w(ry4.c0 c0Var) {
        this.f401684d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry4.c0 c0Var = this.f401684d;
        android.widget.ScrollView scrollView = c0Var.f401600r;
        if (scrollView != null) {
            scrollView.smoothScrollTo(0, ((java.lang.Number) ((jz5.n) c0Var.f401599q).getValue()).intValue());
        }
    }
}
