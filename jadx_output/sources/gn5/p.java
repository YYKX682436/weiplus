package gn5;

/* loaded from: classes14.dex */
public final class p extends gn5.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f273689d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.WindowManager f273690e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f273691f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.popview.AbstractPopView f273692g;

    public p(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f273689d = context;
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f273690e = (android.view.WindowManager) systemService;
    }

    @Override // gn5.b
    public boolean a(android.view.View anchor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!(obj instanceof ir.a1) || !anchor.isEnabled()) {
            return false;
        }
        this.f273691f = anchor;
        d(anchor, obj);
        return true;
    }

    @Override // gn5.b
    public void b(android.view.View anchor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (kotlin.jvm.internal.o.b(this.f273691f, anchor)) {
            return;
        }
        this.f273691f = anchor;
        d(anchor, obj);
    }

    @Override // gn5.b
    public void c() {
        this.f273691f = null;
        com.tencent.mm.view.popview.AbstractPopView abstractPopView = this.f273692g;
        if (abstractPopView != null) {
            this.f273690e.removeView(abstractPopView);
        }
        this.f273692g = null;
    }

    public final void d(android.view.View view, java.lang.Object obj) {
        if (!(obj instanceof ir.a1) || !view.isEnabled()) {
            com.tencent.mm.view.popview.AbstractPopView abstractPopView = this.f273692g;
            if (abstractPopView == null) {
                return;
            }
            abstractPopView.setVisibility(8);
            return;
        }
        com.tencent.mm.view.popview.AbstractPopView abstractPopView2 = this.f273692g;
        android.view.WindowManager windowManager = this.f273690e;
        if (abstractPopView2 == null) {
            ((com.tencent.mm.feature.emoji.cb) ((com.tencent.mm.feature.emoji.api.x6) i95.n0.c(com.tencent.mm.feature.emoji.api.x6.class))).getClass();
            com.tencent.mm.view.popview.AbstractPopView a17 = gn5.l.a(this.f273689d, obj);
            this.f273692g = a17;
            windowManager.addView(a17, a17.getF213696n());
        }
        com.tencent.mm.view.popview.AbstractPopView abstractPopView3 = this.f273692g;
        if (abstractPopView3 != null) {
            abstractPopView3.setVisibility(0);
        }
        com.tencent.mm.feature.emoji.api.x6 x6Var = (com.tencent.mm.feature.emoji.api.x6) i95.n0.c(com.tencent.mm.feature.emoji.api.x6.class);
        com.tencent.mm.view.popview.AbstractPopView abstractPopView4 = this.f273692g;
        ((com.tencent.mm.feature.emoji.cb) x6Var).getClass();
        gn5.l.b(abstractPopView4, obj);
        com.tencent.mm.view.popview.AbstractPopView abstractPopView5 = this.f273692g;
        if (abstractPopView5 != null) {
            abstractPopView5.d(view);
        }
        com.tencent.mm.view.popview.AbstractPopView abstractPopView6 = this.f273692g;
        windowManager.updateViewLayout(abstractPopView6, abstractPopView6 != null ? abstractPopView6.getF213696n() : null);
    }
}
