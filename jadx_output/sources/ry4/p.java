package ry4;

/* loaded from: classes.dex */
public final class p implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401670d;

    public p(ry4.c0 c0Var) {
        this.f401670d = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View childAt;
        ry4.c0 c0Var = this.f401670d;
        android.widget.ScrollView scrollView = c0Var.f401600r;
        if (scrollView == null || scrollView.getChildCount() == 0 || (childAt = scrollView.getChildAt(0)) == null) {
            return;
        }
        int height = childAt.getHeight();
        int i17 = c0Var.f401602t;
        int i18 = height - i17;
        if (i17 != 0 && height != 0 && i18 != 0) {
            scrollView.post(new ry4.o(scrollView, i18));
        }
        c0Var.f401602t = height;
    }
}
