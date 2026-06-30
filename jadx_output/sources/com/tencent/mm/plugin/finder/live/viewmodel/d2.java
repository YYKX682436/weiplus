package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.e2 f117022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f117024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f117025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var, int i17, int i18, int i19) {
        super(0);
        this.f117022d = e2Var;
        this.f117023e = i17;
        this.f117024f = i18;
        this.f117025g = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = this.f117022d;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = e2Var.f117059g;
        if (wxRefreshLayout != null) {
            wxRefreshLayout.e(this.f117023e == 0);
        }
        android.view.View view = e2Var.f117065p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.ArrayList arrayList2 = e2Var.f117070u;
        boolean isEmpty = arrayList2.isEmpty();
        bm2.f fVar = e2Var.f117071v;
        if (isEmpty) {
            android.widget.TextView textView = e2Var.f117064o;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View view2 = e2Var.f117061i;
            if (view2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.TextView textView2 = e2Var.f117064o;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.view.View view3 = e2Var.f117061i;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$onSceneEnd$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.lang.String query = e2Var.f117067r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList5.add(new cm2.k((r45.c73) it.next()));
            }
            fVar.getClass();
            kotlin.jvm.internal.o.g(query, "query");
            java.util.ArrayList arrayList6 = fVar.f21875d;
            arrayList6.clear();
            arrayList6.addAll(arrayList5);
            fVar.f21877f = query;
        }
        int i17 = this.f117024f;
        if (i17 == 0) {
            fVar.notifyDataSetChanged();
        } else {
            int i18 = this.f117025g;
            if (i17 < i18) {
                fVar.notifyItemRangeInserted(i17, i18 - i17);
            }
        }
        return jz5.f0.f302826a;
    }
}
