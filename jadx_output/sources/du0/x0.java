package du0;

/* loaded from: classes5.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.b1 f243455d;

    public x0(du0.b1 b1Var) {
        this.f243455d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f243455d.f243331g;
        kotlin.jvm.internal.o.f(view, "access$getMusicTipView$p(...)");
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
