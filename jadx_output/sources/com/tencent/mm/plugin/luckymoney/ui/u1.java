package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class u1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f147479d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147481f;

    public u1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147481f = luckyMoneyDetailUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (recyclerView.getAdapter().getItemCount() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (i17 != 0) {
            this.f147479d = true;
        } else {
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
            int y17 = linearLayoutManager.y();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147481f;
            if (y17 == luckyMoneyDetailUI.T1.size() || linearLayoutManager.y() == recyclerView.getAdapter().getItemCount() - 1) {
                com.tencent.mm.plugin.luckymoney.model.r4 r4Var = luckyMoneyDetailUI.f145972d;
                if (!((r4Var.f145578g.isEmpty() && r4Var.f145577f.isEmpty()) ? false : true)) {
                    luckyMoneyDetailUI.J1 = false;
                }
                if (luckyMoneyDetailUI.I1 && !luckyMoneyDetailUI.J1) {
                    luckyMoneyDetailUI.J1 = true;
                    luckyMoneyDetailUI.P = db5.e1.P(luckyMoneyDetailUI.getContext(), null, 3, luckyMoneyDetailUI.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.luckymoney.ui.y1(luckyMoneyDetailUI));
                    if (luckyMoneyDetailUI.f146075l2 == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "do get hk recordlist");
                        wb3.a aVar = new wb3.a(luckyMoneyDetailUI.O1, luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, 1, luckyMoneyDetailUI.getIntent().getIntExtra("key_hk_scene", 0));
                        luckyMoneyDetailUI.f146066h3 = aVar;
                        aVar.l().h(new com.tencent.mm.plugin.luckymoney.ui.z1(luckyMoneyDetailUI)).f(luckyMoneyDetailUI);
                    } else {
                        if (luckyMoneyDetailUI.M > 0) {
                            java.util.LinkedList linkedList = (java.util.LinkedList) luckyMoneyDetailUI.R1;
                            if (linkedList.size() > 0 && linkedList.get(linkedList.size() - 1) != null) {
                                luckyMoneyDetailUI.doSceneProgress(com.tencent.mm.plugin.luckymoney.model.m5.t(luckyMoneyDetailUI.f146078m2) ? new com.tencent.mm.plugin.luckymoney.model.w5(luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, luckyMoneyDetailUI.O1, com.tencent.mm.sdk.platformtools.t8.V(((com.tencent.mm.plugin.luckymoney.model.h5) linkedList.get(linkedList.size() - 1)).f145315g, 0L), "v1.0", luckyMoneyDetailUI.V1) : luckyMoneyDetailUI.f146069i3 == 3 ? new yb3.d(luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, luckyMoneyDetailUI.O1, com.tencent.mm.sdk.platformtools.t8.V(((com.tencent.mm.plugin.luckymoney.model.h5) linkedList.get(linkedList.size() - 1)).f145315g, 0L), "v1.0", luckyMoneyDetailUI.V1, luckyMoneyDetailUI.f146071j3, luckyMoneyDetailUI.f146073k3, luckyMoneyDetailUI.f146091q2) : new com.tencent.mm.plugin.luckymoney.model.v5(luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, luckyMoneyDetailUI.O1, com.tencent.mm.sdk.platformtools.t8.V(((com.tencent.mm.plugin.luckymoney.model.h5) linkedList.get(linkedList.size() - 1)).f145315g, 0L), "v1.0", luckyMoneyDetailUI.V1), false);
                            }
                        }
                        luckyMoneyDetailUI.V1 = "";
                        luckyMoneyDetailUI.doSceneProgress(com.tencent.mm.plugin.luckymoney.model.m5.t(luckyMoneyDetailUI.f146078m2) ? new com.tencent.mm.plugin.luckymoney.model.w5(luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, luckyMoneyDetailUI.O1, "v1.0", luckyMoneyDetailUI.V1) : luckyMoneyDetailUI.f146069i3 == 3 ? new yb3.d(luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, luckyMoneyDetailUI.O1, "v1.0", luckyMoneyDetailUI.V1, luckyMoneyDetailUI.f146071j3, luckyMoneyDetailUI.f146073k3, luckyMoneyDetailUI.f146091q2) : new com.tencent.mm.plugin.luckymoney.model.v5(luckyMoneyDetailUI.N1, 11, luckyMoneyDetailUI.M, luckyMoneyDetailUI.O1, "v1.0", luckyMoneyDetailUI.V1, ""), false);
                    }
                }
            }
            this.f147479d = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        if (recyclerView.getAdapter().getItemCount() == 0 || !this.f147479d) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
        boolean z17 = true;
        if (linearLayoutManager.w() <= 0) {
            android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.w());
            if ((findViewByPosition != null ? 0 - findViewByPosition.getTop() : 0) <= 100) {
                z17 = false;
            }
        }
        if (this.f147480e != z17) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147481f;
            if (z17) {
                luckyMoneyDetailUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481936c91);
                luckyMoneyDetailUI.getClass();
            } else {
                luckyMoneyDetailUI.getClass();
            }
            this.f147480e = z17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyDetailUI$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
