package qt2;

/* loaded from: classes2.dex */
public final class e0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.f0 f366568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366569e;

    public e0(qt2.f0 f0Var, android.view.View view) {
        this.f366568d = f0Var;
        this.f366569e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qt2.f0 f0Var = this.f366568d;
        f0Var.getClass();
        android.view.View layout = this.f366569e;
        kotlin.jvm.internal.o.g(layout, "layout");
        if (!f0Var.f366589f) {
            int height = layout.getHeight();
            f0Var.f366576v = height;
            if (height == 0) {
                f0Var.f366576v = layout.getMeasuredHeight();
            }
            com.tencent.mars.xlog.Log.i(f0Var.f366572r, "bottomHeight=" + f0Var.f366576v);
            f0Var.e7(8);
            f0Var.W6((float) f0Var.c7(), 260L);
            f0Var.f366589f = true;
            com.tencent.mm.plugin.finder.report.y3.b(com.tencent.mm.plugin.finder.report.y3.f125472a, f0Var.getActivity(), 1, null, 4, null);
            layout.removeCallbacks(f0Var.f366574t);
            if (true ^ (f0Var instanceof qt2.h0)) {
                f0Var.f366574t = new qt2.d0(f0Var);
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                layout.postDelayed(f0Var.f366574t, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127651d3).getValue()).r()).longValue());
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = layout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(f0Var.f366575u);
        }
    }
}
