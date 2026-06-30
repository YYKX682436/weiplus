package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class rk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f132964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView) {
        super(0);
        this.f132964d = finderSnsHeaderView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f132964d;
        androidx.recyclerview.widget.f2 adapter = finderSnsHeaderView.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderSnsHeaderView.getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$viewCallback$1$onChanged$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$viewCallback$1$onChanged$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        finderSnsHeaderView.a();
        android.view.View clearBtn = finderSnsHeaderView.getClearBtn();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(clearBtn, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView", "refreshClearBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        clearBtn.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(clearBtn, "com/tencent/mm/plugin/finder/view/FinderSnsHeaderView", "refreshClearBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        finderSnsHeaderView.getClearBtn().post(new com.tencent.mm.plugin.finder.view.nk(finderSnsHeaderView));
        finderSnsHeaderView.getClearBtn().setOnClickListener(new com.tencent.mm.plugin.finder.view.qk(finderSnsHeaderView));
        return jz5.f0.f302826a;
    }
}
