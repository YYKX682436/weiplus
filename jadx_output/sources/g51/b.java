package g51;

/* loaded from: classes11.dex */
public final class b implements g51.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f268888a;

    public b(android.view.ViewGroup viewGroup) {
        this.f268888a = viewGroup;
    }

    @Override // g51.a
    public void a(android.view.View confettiView) {
        kotlin.jvm.internal.o.g(confettiView, "confettiView");
        confettiView.invalidate();
    }

    @Override // g51.a
    public void b(com.tencent.mm.particles.ConfettiView confettiView) {
        kotlin.jvm.internal.o.g(confettiView, "confettiView");
        if (confettiView.f72364e) {
            return;
        }
        confettiView.f72364e = true;
        android.view.ViewParent parent = confettiView.getParent();
        if (parent != null) {
            parent.requestLayout();
        }
    }

    @Override // g51.a
    public void c(android.view.View confettiView) {
        kotlin.jvm.internal.o.g(confettiView, "confettiView");
        android.view.ViewParent parent = confettiView.getParent();
        android.view.ViewGroup viewGroup = this.f268888a;
        if (parent != null && !kotlin.jvm.internal.o.b(parent, viewGroup)) {
            android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(confettiView);
            }
        }
        if (viewGroup != null) {
            viewGroup.addView(confettiView);
        }
    }

    @Override // g51.a
    public int getHeight() {
        android.view.ViewGroup viewGroup = this.f268888a;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // g51.a
    public int getWidth() {
        android.view.ViewGroup viewGroup = this.f268888a;
        if (viewGroup != null) {
            return viewGroup.getWidth();
        }
        return 0;
    }
}
