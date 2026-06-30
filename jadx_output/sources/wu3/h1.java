package wu3;

/* loaded from: classes.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f449763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449764e;

    public h1(android.view.View view, int i17) {
        this.f449763d = view;
        this.f449764e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f449763d;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.f449764e);
        view.requestLayout();
    }
}
