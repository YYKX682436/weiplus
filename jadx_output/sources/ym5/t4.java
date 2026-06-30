package ym5;

/* loaded from: classes10.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f463538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(int i17, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        super(0);
        this.f463538d = i17;
        this.f463539e = refreshLoadMoreLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onRequestLoadMore] loadMoreType:");
        int i17 = this.f463538d;
        sb6.append(i17);
        sb6.append(" isShowLoadMoreLoading:");
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463539e;
        sb6.append(refreshLoadMoreLayout.isShowLoadMoreLoading);
        com.tencent.mars.xlog.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        androidx.recyclerview.widget.f2 adapter = refreshLoadMoreLayout.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.getItemCount();
        }
        if (refreshLoadMoreLayout.isShowLoadMoreLoading) {
            android.view.View view = refreshLoadMoreLayout.f213435x;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view2 = refreshLoadMoreLayout.f213435x;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/view/RefreshLoadMoreLayout$onRequestLoadMore$func$1", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        refreshLoadMoreLayout.f213432u = false;
        refreshLoadMoreLayout.f213433v = false;
        ym5.q3 actionCallback = refreshLoadMoreLayout.getActionCallback();
        if (actionCallback == null) {
            return null;
        }
        actionCallback.b(i17);
        return jz5.f0.f302826a;
    }
}
