package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameIndexWxagView f141821e;

    public w3(com.tencent.mm.plugin.game.ui.GameIndexWxagView gameIndexWxagView, int i17) {
        this.f141821e = gameIndexWxagView;
        this.f141820d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof m53.h6)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        m53.h6 h6Var = (m53.h6) view.getTag();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1079;
        com.tencent.mm.plugin.appbrand.service.h6 h6Var2 = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        com.tencent.mm.plugin.game.ui.GameIndexWxagView gameIndexWxagView = this.f141821e;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var2).aj(gameIndexWxagView.getContext(), h6Var.f323759g, h6Var.f323756d, h6Var.f323761i, 0, h6Var.f323760h, appBrandStatObject);
        com.tencent.mm.game.report.l.f(gameIndexWxagView.getContext(), 10, 1025, 999, 30, h6Var.f323756d, this.f141820d, null);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameIndexWxagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
