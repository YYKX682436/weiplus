package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ll extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.ml f147152d;

    public ll(com.tencent.mm.plugin.luckymoney.ui.ml mlVar) {
        this.f147152d = mlVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.plugin.luckymoney.ui.ml mlVar = this.f147152d;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = mlVar.f147196d;
            if (!luckyMoneyPickEnvelopeUI.f146528p1 && (i18 = luckyMoneyPickEnvelopeUI.f146534v) >= 0 && i18 < ((java.util.ArrayList) luckyMoneyPickEnvelopeUI.f146532t).size()) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = mlVar.f147196d;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19272, 1, mlVar.f147196d.K, ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) luckyMoneyPickEnvelopeUI2.f146532t).get(luckyMoneyPickEnvelopeUI2.f146534v)).f147793b.f389500f);
                mlVar.f147196d.f146528p1 = true;
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = mlVar.f147196d;
            int i19 = luckyMoneyPickEnvelopeUI3.f146534v;
            if (i19 >= 0 && i19 < ((java.util.ArrayList) luckyMoneyPickEnvelopeUI3.f146532t).size()) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI4 = mlVar.f147196d;
                r45.wv3 wv3Var = ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) luckyMoneyPickEnvelopeUI4.f146532t).get(luckyMoneyPickEnvelopeUI4.f146534v)).f147793b;
                if (wv3Var.f389506o == 3) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22104, wv3Var.f389500f, 2);
                }
            }
            mlVar.f147196d.q7();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.luckymoney.ui.ml mlVar = this.f147152d;
        int y17 = mlVar.f147196d.f146523m.y();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = mlVar.f147196d;
        if (!luckyMoneyPickEnvelopeUI.f146538y && luckyMoneyPickEnvelopeUI.f146540z == 1 && y17 == luckyMoneyPickEnvelopeUI.f146524n.getItemCount() - 1) {
            mlVar.f147196d.Z6(false);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI2 = mlVar.f147196d;
        int u07 = mlVar.f147196d.f146521i.u0(luckyMoneyPickEnvelopeUI2.D.n(luckyMoneyPickEnvelopeUI2.f146523m));
        mlVar.f147196d.getClass();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI3 = mlVar.f147196d;
        if (u07 != luckyMoneyPickEnvelopeUI3.f146534v && u07 >= 0 && u07 < ((java.util.ArrayList) luckyMoneyPickEnvelopeUI3.f146532t).size()) {
            com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) mlVar.f147196d.f146532t).get(u07);
            r45.wv3 wv3Var = zmVar.f147793b;
            if (wv3Var != null && (wv3Var.f389503i == 1 || wv3Var.f389507p == 1)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "expired: %s", java.lang.Integer.valueOf(u07));
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI4 = mlVar.f147196d;
                int i19 = luckyMoneyPickEnvelopeUI4.f146534v;
                if (i19 >= 0 && i19 < ((java.util.ArrayList) luckyMoneyPickEnvelopeUI4.f146532t).size()) {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI5 = mlVar.f147196d;
                    ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) luckyMoneyPickEnvelopeUI5.f146532t).get(luckyMoneyPickEnvelopeUI5.f146534v)).f147792a = false;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI6 = mlVar.f147196d;
                    luckyMoneyPickEnvelopeUI6.m7(luckyMoneyPickEnvelopeUI6.f146534v, false);
                    mlVar.f147196d.f146534v = -1;
                }
                yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            if (zmVar.f147794c) {
                mlVar.f147196d.f146534v = -2;
            } else if (zmVar.f147792a) {
                zmVar.f147792a = false;
                mlVar.f147196d.f146534v = -1;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do select pos: %s", java.lang.Integer.valueOf(u07));
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI7 = mlVar.f147196d;
                int i27 = luckyMoneyPickEnvelopeUI7.f146534v;
                if (i27 >= 0 && i27 < ((java.util.ArrayList) luckyMoneyPickEnvelopeUI7.f146532t).size()) {
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI8 = mlVar.f147196d;
                    ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) luckyMoneyPickEnvelopeUI8.f146532t).get(luckyMoneyPickEnvelopeUI8.f146534v)).f147792a = false;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI9 = mlVar.f147196d;
                    luckyMoneyPickEnvelopeUI9.m7(luckyMoneyPickEnvelopeUI9.f146534v, false);
                }
                zmVar.f147792a = true;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI10 = mlVar.f147196d;
                luckyMoneyPickEnvelopeUI10.f146534v = u07;
                luckyMoneyPickEnvelopeUI10.m7(u07, true);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "post run finalSelect : %s lastSelect:%s", java.lang.Integer.valueOf(u07), java.lang.Integer.valueOf(y17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$10$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
