package iu1;

/* loaded from: classes9.dex */
public final class s implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294952a;

    public s(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294952a = cardHomePageNewUI;
    }

    @Override // vl1.n
    public final void a(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view, int i17, long j17) {
        iu1.c cVar = this.f294952a.f95184m;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mHomePageAdapter");
            throw null;
        }
        iu1.a x17 = cVar.x(i17);
        if (x17 != null) {
            com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294952a;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "click type: %s", java.lang.Integer.valueOf(x17.f294832b));
            int i18 = x17.f294832b;
            if (i18 == 2) {
                cardHomePageNewUI.B = true;
                cardHomePageNewUI.C = 1;
                r45.wt wtVar = x17.f294831a;
                cardHomePageNewUI.f95182J = wtVar;
                kotlin.jvm.internal.o.d(wtVar);
                int i19 = wtVar.f389432i;
                if (i19 == 1) {
                    r45.wt wtVar2 = x17.f294831a;
                    kotlin.jvm.internal.o.d(wtVar2);
                    lu1.d.j(cardHomePageNewUI, wtVar2.f389433m, 0);
                } else if (i19 == 2) {
                    r45.wt wtVar3 = x17.f294831a;
                    kotlin.jvm.internal.o.d(wtVar3);
                    r45.iu iuVar = wtVar3.f389434n;
                    lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                r45.wt wtVar4 = x17.f294831a;
                kotlin.jvm.internal.o.d(wtVar4);
                g0Var.d(16324, 2, wtVar4.f389427d, 0, 0, 1, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(cardHomePageNewUI.E));
                return;
            }
            if (i18 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "click ticket item");
                android.content.Intent intent = new android.content.Intent(cardHomePageNewUI, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(cardHomePageNewUI, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                cardHomePageNewUI.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(cardHomePageNewUI, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 5);
                return;
            }
            if (i18 == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 13);
                return;
            }
            if (i18 != 6) {
                return;
            }
            r45.bu buVar = x17.f294836f;
            kotlin.jvm.internal.o.d(buVar);
            int i27 = buVar.f371058g;
            if (i27 == 1) {
                r45.bu buVar2 = x17.f294836f;
                kotlin.jvm.internal.o.d(buVar2);
                lu1.d.j(cardHomePageNewUI, buVar2.f371059h, 0);
                cardHomePageNewUI.G = true;
            } else if (i27 == 2) {
                r45.bu buVar3 = x17.f294836f;
                kotlin.jvm.internal.o.d(buVar3);
                r45.iu iuVar2 = buVar3.f371060i;
                lu1.d.f(iuVar2.f377328d, iuVar2.f377329e, iuVar2.f377330f);
                cardHomePageNewUI.G = true;
            } else if (i27 == 3) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click native url: ");
                r45.bu buVar4 = x17.f294836f;
                kotlin.jvm.internal.o.d(buVar4);
                sb6.append(buVar4.f371061m);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", sb6.toString());
                r45.bu buVar5 = x17.f294836f;
                kotlin.jvm.internal.o.d(buVar5);
                if (kotlin.jvm.internal.o.b("weixin://mktcard/cert", buVar5.f371061m)) {
                    android.content.Intent intent2 = new android.content.Intent(cardHomePageNewUI, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.class);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(cardHomePageNewUI, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    cardHomePageNewUI.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(cardHomePageNewUI, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$3", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    cardHomePageNewUI.G = true;
                }
            }
            r45.bu buVar6 = x17.f294836f;
            kotlin.jvm.internal.o.d(buVar6);
            buVar6.f371063o = 0;
            r45.bu buVar7 = x17.f294836f;
            kotlin.jvm.internal.o.d(buVar7);
            buVar7.f371062n = 0;
            iu1.c cVar2 = cardHomePageNewUI.f95184m;
            if (cVar2 != null) {
                cVar2.notifyItemChanged(i17);
            } else {
                kotlin.jvm.internal.o.o("mHomePageAdapter");
                throw null;
            }
        }
    }
}
