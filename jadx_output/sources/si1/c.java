package si1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f408232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408233e;

    public c(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str) {
        this.f408232d = appBrandRuntime;
        this.f408233e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.w2 currentPage;
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView;
        com.tencent.mm.plugin.appbrand.page.i3 x07 = this.f408232d.x0();
        if (x07 == null || (currentPage = x07.getCurrentPage()) == null || (currentPageView = currentPage.getCurrentPageView()) == null) {
            return;
        }
        ul1.e P1 = currentPageView.P1();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = P1.f428570a;
        if (v5Var.isRunning()) {
            ul1.g c17 = P1.c();
            al1.b r17 = P1.f428570a.r1();
            if (r17 != null) {
                P1.d(r17.getTop() + r17.getMeasuredHeight());
            }
            if (P1.f428572c == null) {
                ul1.d dVar = new ul1.d(v5Var.getF147807d());
                P1.f428572c = dVar;
                c17.addView(dVar, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            }
            ul1.d dVar2 = (ul1.d) P1.f428572c;
            dVar2.f428565d.setText(this.f408233e);
            com.tencent.mm.sdk.platformtools.n3 n3Var = dVar2.f428567f;
            java.lang.Runnable runnable = dVar2.f428566e;
            n3Var.removeCallbacks(runnable);
            n3Var.postDelayed(runnable, ul1.n.f428588m1);
            if (dVar2.getAlpha() == 1.0f || dVar2.f428568g != null) {
                return;
            }
            dVar2.setVisibility(0);
            dVar2.animate().cancel();
            android.view.ViewPropertyAnimator animate = dVar2.animate();
            dVar2.f428568g = animate;
            animate.alpha(1.0f).setListener(new ul1.b(dVar2)).start();
            dVar2.setVisibility(0);
        }
    }
}
