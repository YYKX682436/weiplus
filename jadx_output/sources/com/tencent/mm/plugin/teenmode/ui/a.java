package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f172920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f172921e;

    public a(ot0.q qVar, android.content.Context context) {
        this.f172920d = qVar;
        this.f172921e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot0.q qVar = this.f172920d;
        if (qVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = qVar.f348673j2;
        b1Var.f317032k = 1212;
        b1Var.f317018d = qVar.A2;
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(this.f172921e, b1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AppBrandAuthorizationFiller$onFill$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
