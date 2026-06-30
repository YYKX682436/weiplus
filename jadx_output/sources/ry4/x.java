package ry4;

/* loaded from: classes.dex */
public final class x implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401686d;

    public x(ry4.c0 c0Var) {
        this.f401686d = c0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            ry4.c0 c0Var = this.f401686d;
            c0Var.f401596n = c0Var.f401593h;
            android.widget.ScrollView scrollView = c0Var.f401600r;
            if (scrollView != null) {
                scrollView.postDelayed(new ry4.w(c0Var), 150L);
            }
        }
    }
}
