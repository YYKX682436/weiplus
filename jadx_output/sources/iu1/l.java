package iu1;

/* loaded from: classes9.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu1.m f294896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f294897g;

    public l(r45.wt wtVar, com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI, iu1.m mVar, int i17) {
        this.f294894d = wtVar;
        this.f294895e = cardHomePageNewUI;
        this.f294896f = mVar;
        this.f294897g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wt wtVar = this.f294894d;
        r45.iu iuVar = wtVar.f389439s;
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294895e;
        if (iuVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(iuVar != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", objArr);
            cardHomePageNewUI.B = true;
            cardHomePageNewUI.C = 0;
            cardHomePageNewUI.f95182J = wtVar;
            r45.iu iuVar2 = wtVar.f389439s;
            lu1.d.f(iuVar2.f377328d, iuVar2.f377329e, iuVar2.f377330f);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        iu1.a aVar = this.f294896f.f294919x;
        kotlin.jvm.internal.o.d(aVar);
        r45.wt wtVar2 = aVar.f294831a;
        kotlin.jvm.internal.o.d(wtVar2);
        g0Var.d(16324, 1, wtVar2.f389427d, 0, 0, 6, java.lang.Integer.valueOf(this.f294897g), java.lang.Integer.valueOf(cardHomePageNewUI.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
