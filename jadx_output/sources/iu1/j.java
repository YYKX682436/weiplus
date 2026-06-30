package iu1;

/* loaded from: classes9.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.m f294881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f294882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wt f294883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294884g;

    public j(iu1.m mVar, int i17, r45.wt wtVar, com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294881d = mVar;
        this.f294882e = i17;
        this.f294883f = wtVar;
        this.f294884g = cardHomePageNewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iu1.m mVar = this.f294881d;
        iu1.a aVar = mVar.f294919x;
        kotlin.jvm.internal.o.d(aVar);
        r45.wt wtVar = aVar.f294831a;
        int childCount = mVar.k().getChildCount();
        kotlin.jvm.internal.o.d(wtVar);
        if (childCount > wtVar.f389443w) {
            mVar.k().getChildCount();
            int childCount2 = mVar.k().getChildCount() - 1;
            int i17 = wtVar.f389443w;
            if (i17 <= childCount2) {
                while (true) {
                    mVar.k().removeViewAt(childCount2);
                    if (childCount2 == i17) {
                        break;
                    } else {
                        childCount2--;
                    }
                }
            }
        }
        int i18 = this.f294882e;
        mVar.D(false, i18);
        iu1.a aVar2 = mVar.f294919x;
        if (aVar2 != null) {
            aVar2.f294835e = false;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        r45.wt wtVar2 = this.f294883f;
        kotlin.jvm.internal.o.d(wtVar2);
        g0Var.d(16324, 1, wtVar2.f389427d, 0, 0, 5, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f294884g.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
