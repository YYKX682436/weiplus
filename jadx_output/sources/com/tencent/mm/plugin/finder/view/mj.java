package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public class mj implements ym5.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f132666d;

    public mj(com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout) {
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        this.f132666d = rlLayout;
    }

    public int a() {
        return 0;
    }

    public void b() {
    }

    public void onChanged() {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        b();
    }

    public void onItemRangeChanged(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemRangeChanged(i17 + a(), i18);
        }
        b();
    }

    public void onItemRangeInserted(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemRangeInserted(i17 + a(), i18);
        }
        b();
    }

    @Override // ym5.m1
    public void onItemRangeMoved(int i17, int i18, int i19) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemMoved(i17 + a(), i18 + a());
        }
        b();
    }

    @Override // ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemRangeRemoved(i17 + a(), i18);
        }
        b();
    }

    @Override // ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f132666d.e(true);
        b();
    }

    @Override // ym5.p1
    public void onPreFinishLoadMoreSmooth(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f132666d.e(true);
        b();
    }

    @Override // ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        int i17 = reason.f463523h;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f132666d;
        if (i17 <= 0) {
            finderRefreshLayout.k();
        } else {
            finderRefreshLayout.i(true);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderRefreshLayout$BaseViewActionCallback", "onPreFinishRefresh", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/view/FinderRefreshLayout$BaseViewActionCallback", "onPreFinishRefresh", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        b();
    }

    @Override // ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f132666d.getRecyclerView();
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemRangeChanged(i17 + a(), i18, obj);
        }
        b();
    }
}
