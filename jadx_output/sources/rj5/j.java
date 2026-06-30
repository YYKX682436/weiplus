package rj5;

/* loaded from: classes10.dex */
public final class j implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rj5.k f396389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f396390b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396391c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f396392d;

    public j(rj5.k kVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var, java.lang.Runnable runnable, long j17) {
        this.f396389a = kVar;
        this.f396390b = f0Var;
        this.f396391c = h0Var;
        this.f396392d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        rj5.k kVar = this.f396389a;
        int scrollY = kVar.f396393d.getScrollY();
        kotlin.jvm.internal.f0 f0Var = this.f396390b;
        if (scrollY == f0Var.f310116d) {
            return;
        }
        f0Var.f310116d = scrollY;
        float currentPosition = kVar.getCurrentPosition();
        java.util.Iterator it = kVar.f396378c.f209788d.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView) it.next()).b(currentPosition);
        }
        kotlin.jvm.internal.h0 h0Var = this.f396391c;
        java.lang.Object obj = h0Var.f310123d;
        rj5.a aVar = rj5.a.f396372e;
        if (obj != aVar) {
            h0Var.f310123d = aVar;
            kVar.c(aVar);
        }
        android.widget.ScrollView scrollView = kVar.f396393d;
        java.lang.Runnable runnable = this.f396392d;
        scrollView.removeCallbacks(runnable);
        scrollView.postDelayed(runnable, 80L);
    }
}
