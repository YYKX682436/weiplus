package rx4;

/* loaded from: classes8.dex */
public final class o1 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401244b;

    public o1(rx4.h2 h2Var, android.widget.ScrollView scrollView) {
        this.f401243a = h2Var;
        this.f401244b = scrollView;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        rx4.h2.U6(this.f401243a, this.f401244b);
        rx4.h2 h2Var = this.f401243a;
        if (h2Var.f401181w) {
            h2Var.f401181w = false;
            rx4.h2.r7(h2Var, vu4.a.L, "", "", false, null, 16, null);
        }
    }
}
