package rx2;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f400977d;

    public k(rx2.p pVar) {
        this.f400977d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        rx2.p pVar = this.f400977d;
        android.view.View decorView = pVar.f400983d.getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) decorView).addView(pVar.f400986g, layoutParams);
        pVar.f400986g.setVisibility(8);
    }
}
