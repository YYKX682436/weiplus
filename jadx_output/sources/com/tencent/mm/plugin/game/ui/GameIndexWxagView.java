package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameIndexWxagView extends android.widget.LinearLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.LayoutInflater f140868d;

    /* renamed from: e, reason: collision with root package name */
    public int f140869e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f140870f;

    public GameIndexWxagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f140868d = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        this.f140870f = this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof com.tencent.mm.plugin.game.ui.x3)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.ui.x3 x3Var = (com.tencent.mm.plugin.game.ui.x3) view.getTag();
        if (x3Var.f141846b == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1079;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        android.content.Context context = getContext();
        m53.h6 h6Var2 = x3Var.f141846b;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(context, h6Var2.f323759g, h6Var2.f323756d, h6Var2.f323761i, 0, h6Var2.f323760h, appBrandStatObject);
        com.tencent.mm.game.report.l.f(getContext(), 10, 1025, x3Var.f141845a, 30, h6Var2.f323756d, this.f140869e, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameIndexWxagView", "initView finished");
    }
}
