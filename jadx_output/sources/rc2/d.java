package rc2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc2.f f393932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f393935g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f393936h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f393937i;

    public d(rc2.f fVar, android.view.View view, android.view.View view2, java.util.List list, kotlin.jvm.internal.c0 c0Var, java.util.List list2) {
        this.f393932d = fVar;
        this.f393933e = view;
        this.f393934f = view2;
        this.f393935g = list;
        this.f393936h = c0Var;
        this.f393937i = list2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc2.f fVar = this.f393932d;
        android.view.View view = this.f393933e;
        android.graphics.Rect T6 = fVar.T6(view);
        if (kotlin.jvm.internal.o.b(view, this.f393934f)) {
            T6.top += (int) fVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        }
        fVar.U6(T6, "enableAlphaViewList");
        java.util.List<android.graphics.Rect> list = this.f393935g;
        if (list != null) {
            for (android.graphics.Rect rect : list) {
                in5.s0 s0Var = fVar.f393941d;
                rc2.f.P6(fVar, s0Var != null ? s0Var.itemView : null, rect);
                if (T6.left < rect.right && T6.right > rect.left && T6.top < rect.bottom && T6.bottom > rect.top) {
                    kotlin.jvm.internal.c0 c0Var = this.f393936h;
                    if (!c0Var.f310112d && view.getVisibility() == 0) {
                        c0Var.f310112d = true;
                        fVar.W6(true);
                        java.util.List<android.view.KeyEvent.Callback> list2 = this.f393937i;
                        if (list2 != null) {
                            for (android.view.KeyEvent.Callback callback : list2) {
                                kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.alpha.IFeedEnableAlpha");
                                rc2.g gVar = (rc2.g) callback;
                                gVar.a(0.2f);
                                gVar.setAlphaClickable(false);
                            }
                        }
                    }
                }
            }
        }
    }
}
