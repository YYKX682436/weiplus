package rx4;

/* loaded from: classes8.dex */
public final class d2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f401133f;

    public d2(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f401131d = h2Var;
        this.f401132e = scrollView;
        this.f401133f = f17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        rx4.h2 h2Var = this.f401131d;
        android.widget.ScrollView scrollView = this.f401132e;
        rx4.h2.U6(h2Var, scrollView);
        rx4.h2.T6(h2Var, scrollView, this.f401133f);
    }
}
