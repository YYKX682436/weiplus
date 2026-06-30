package com.tencent.mm.view;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f213588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f213589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f213590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f213591g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z17, int i17, rn5.a aVar) {
        super(0);
        this.f213588d = refreshLoadMoreLayout;
        this.f213589e = z17;
        this.f213590f = i17;
        this.f213591g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "[onRequestRefresh]");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f213588d;
        refreshLoadMoreLayout.setRefreshing(true);
        androidx.recyclerview.widget.f2 adapter = refreshLoadMoreLayout.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.getItemCount();
        }
        android.view.View refreshHeader = refreshLoadMoreLayout.getRefreshHeader();
        if (refreshHeader != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(refreshHeader, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestRefresh$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            refreshHeader.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(refreshHeader, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestRefresh$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        refreshLoadMoreLayout.f213432u = false;
        refreshLoadMoreLayout.f213433v = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRequestRefresh], stickTopLoadingLayout is null? ");
        sb6.append(refreshLoadMoreLayout.getStickTopLoadingLayout() == null);
        sb6.append(", hash:");
        ym5.q3 actionCallback = refreshLoadMoreLayout.getActionCallback();
        sb6.append(actionCallback != null ? java.lang.Integer.valueOf(actionCallback.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = refreshLoadMoreLayout.getStickTopLoadingLayout();
        boolean z17 = this.f213589e;
        if (stickTopLoadingLayout != null) {
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = stickTopLoadingLayout.progressBar;
            if (z17) {
                stickTopLoadingLayout.f213443f = true;
                mMProcessBar.setVisibility(4);
                mMProcessBar.e();
            } else {
                stickTopLoadingLayout.a(stickTopLoadingLayout.topLoadingOffsetLimit);
                stickTopLoadingLayout.f213443f = true;
                mMProcessBar.setAlpha(1.0f);
                mMProcessBar.setVisibility(0);
                mMProcessBar.d();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", "onRefreshing isHideLoading = " + z17);
            ym5.q3 q3Var = stickTopLoadingLayout.actionCallback;
            if (q3Var != null) {
                q3Var.d(0, null, z17);
            }
        }
        ym5.q3 actionCallback2 = refreshLoadMoreLayout.getActionCallback();
        rn5.a aVar = this.f213591g;
        int i17 = this.f213590f;
        if (actionCallback2 != null) {
            actionCallback2.d(i17, aVar, z17);
        }
        ym5.q3 reportCallback = refreshLoadMoreLayout.getReportCallback();
        if (reportCallback == null) {
            return null;
        }
        reportCallback.d(i17, aVar, z17);
        return jz5.f0.f302826a;
    }
}
