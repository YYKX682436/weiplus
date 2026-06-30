package qt2;

/* loaded from: classes2.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.e f366557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366558e;

    public d(qt2.e eVar, android.view.View view) {
        this.f366557d = eVar;
        this.f366558e = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qt2.e eVar = this.f366557d;
        eVar.getClass();
        android.view.View layout = this.f366558e;
        kotlin.jvm.internal.o.g(layout, "layout");
        if (!eVar.f366589f) {
            int height = layout.getHeight();
            eVar.f366564v = height;
            if (height == 0) {
                eVar.f366564v = layout.getMeasuredHeight();
            }
            com.tencent.mars.xlog.Log.i(eVar.f366560r, "bottomHeight=" + eVar.f366564v);
            int i17 = eVar.f366564v;
            if (i17 <= 0) {
                i17 = i65.a.b(eVar.getContext(), 170);
            }
            eVar.W6(i17, 260L);
            eVar.f366589f = true;
            layout.removeCallbacks(eVar.f366562t);
            eVar.f366562t = new qt2.c(eVar);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            layout.postDelayed(eVar.f366562t, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127651d3).getValue()).r()).longValue());
        }
        android.view.ViewTreeObserver viewTreeObserver = layout.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(eVar.f366563u);
        }
    }
}
