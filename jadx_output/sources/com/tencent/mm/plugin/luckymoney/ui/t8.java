package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class t8 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f147447d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f147448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147449f;

    public t8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147449f = luckyMoneyNewDetailUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if ((r0 != null && r0.y() == r7 - 1) != false) goto L34;
     */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r35, int r36) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.ui.t8.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        boolean z17 = true;
        if ((adapter != null && adapter.getItemCount() == 0) || !this.f147447d) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if ((linearLayoutManager != null ? linearLayoutManager.w() : 0) <= 0) {
            android.view.View findViewByPosition = linearLayoutManager != null ? linearLayoutManager.findViewByPosition(linearLayoutManager.w()) : null;
            if ((findViewByPosition != null ? 0 - findViewByPosition.getTop() : 0) <= 100) {
                z17 = false;
            }
        }
        if (this.f147448e != z17) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147449f;
            if (z17) {
                luckyMoneyNewDetailUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481936c91);
                luckyMoneyNewDetailUI.getClass();
            } else {
                luckyMoneyNewDetailUI.getClass();
            }
            this.f147448e = z17;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewDetailUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
