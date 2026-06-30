package iu1;

/* loaded from: classes9.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.m f294887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f294888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294890g;

    public k(iu1.m mVar, int i17, r45.wt wtVar, com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294887d = mVar;
        this.f294888e = i17;
        this.f294889f = wtVar;
        this.f294890g = cardHomePageNewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iu1.m mVar = this.f294887d;
        iu1.a aVar = mVar.f294919x;
        kotlin.jvm.internal.o.d(aVar);
        r45.wt wtVar = aVar.f294831a;
        int childCount = mVar.k().getChildCount();
        kotlin.jvm.internal.o.d(wtVar);
        int i17 = wtVar.f389442v;
        int i18 = this.f294888e;
        if (childCount < i17) {
            mVar.j(wtVar.f389443w, -1, i18);
            if (wtVar.f389443w >= wtVar.f389442v) {
                mVar.o().setVisibility(8);
            } else {
                mVar.D(true, i18);
            }
        }
        iu1.a aVar2 = mVar.f294919x;
        if (aVar2 != null) {
            aVar2.f294835e = true;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        r45.wt wtVar2 = this.f294889f;
        kotlin.jvm.internal.o.d(wtVar2);
        g0Var.d(16324, 1, wtVar2.f389427d, 0, 0, 4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f294890g.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
