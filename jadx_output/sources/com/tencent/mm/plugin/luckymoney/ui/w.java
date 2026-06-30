package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class w implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f147625d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147626e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI f147627f;

    public w(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI) {
        this.f147627f = luckyMoneyBusiDetailUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i19 == 0 || !this.f147625d) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
            return;
        }
        boolean z17 = true;
        if (i17 <= 0) {
            android.view.View childAt = absListView.getChildAt(i17);
            if ((childAt != null ? 0 - childAt.getTop() : 0) <= 100) {
                z17 = false;
            }
        }
        if (this.f147626e != z17) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f147627f;
            if (z17) {
                luckyMoneyBusiDetailUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481936c91);
                luckyMoneyBusiDetailUI.getClass();
            } else {
                luckyMoneyBusiDetailUI.getClass();
            }
            this.f147626e = z17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getCount() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        boolean z17 = true;
        if (i17 == 0) {
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI = this.f147627f;
                com.tencent.mm.plugin.luckymoney.model.r4 r4Var = luckyMoneyBusiDetailUI.f145972d;
                if (r4Var.f145578g.isEmpty() && r4Var.f145577f.isEmpty()) {
                    z17 = false;
                }
                if (!z17) {
                    luckyMoneyBusiDetailUI.A = false;
                }
                if (luckyMoneyBusiDetailUI.f146004z && !luckyMoneyBusiDetailUI.A) {
                    luckyMoneyBusiDetailUI.W6();
                }
            }
            this.f147625d = false;
        } else if (i17 == 1) {
            this.f147625d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
