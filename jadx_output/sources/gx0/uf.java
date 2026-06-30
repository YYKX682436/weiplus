package gx0;

/* loaded from: classes5.dex */
public final class uf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f277041d;

    public uf(gx0.gg ggVar) {
        this.f277041d = ggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gx0.gg ggVar = this.f277041d;
        android.view.View view = ggVar.f276481q;
        kotlin.jvm.internal.o.f(view, "access$getSubtitleTipView$p(...)");
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ggVar.e7(gx0.jf.f276599h);
    }
}
