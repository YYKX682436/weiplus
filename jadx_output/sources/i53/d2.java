package i53;

/* loaded from: classes8.dex */
public class d2 extends com.tencent.mm.plugin.webview.luggage.w1 {

    /* renamed from: u, reason: collision with root package name */
    public i53.c2 f288544u;

    @Override // com.tencent.mm.plugin.webview.luggage.w1
    public void b() {
        super.b();
        i53.c2 c2Var = this.f288544u;
        if (c2Var != null) {
            i53.w2 w2Var = ((i53.p2) c2Var).f288689a;
            if (w2Var.f288776n == 0) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - w2Var.f288776n;
            w2Var.f288776n = 0L;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("loading_time", java.lang.Long.valueOf(currentTimeMillis));
            w2Var.b(501, 41, hashMap);
            w2Var.f288774i.f();
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.w1
    public void d(int i17) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f182643d.getLayoutParams();
        layoutParams.topMargin = i17 - this.f182643d.getHeight();
        this.f182643d.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.w1
    public void e() {
        i53.c2 c2Var = this.f288544u;
        if (c2Var != null) {
            i53.p2 p2Var = (i53.p2) c2Var;
            p2Var.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            i53.w2 w2Var = p2Var.f288689a;
            w2Var.f288776n = currentTimeMillis;
            w2Var.f288774i.e();
            w2Var.postDelayed(new i53.o2(p2Var), 400L);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.w1
    public void f(android.view.View view, android.view.View view2) {
        super.f(view, view2);
        setPullDownBackgroundColor(-1);
    }

    public void setOnPullDownListener(i53.c2 c2Var) {
        this.f288544u = c2Var;
    }
}
