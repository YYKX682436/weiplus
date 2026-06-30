package rx4;

/* loaded from: classes8.dex */
public final class p1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f401249f;

    public p1(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f401247d = h2Var;
        this.f401248e = scrollView;
        this.f401249f = f17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        rx4.h2 h2Var = this.f401247d;
        android.widget.ScrollView scrollView = this.f401248e;
        rx4.h2.U6(h2Var, scrollView);
        rx4.h2.T6(h2Var, scrollView, this.f401249f);
    }
}
