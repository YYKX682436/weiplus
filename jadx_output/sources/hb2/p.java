package hb2;

/* loaded from: classes2.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f280078d;

    public p(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f280078d = refreshLoadMoreLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f280078d;
        android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
        if (f213435x != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/cgi/oplog/FinderModPersonalizedSetting$openPersonalizedSettingLoadMore$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/cgi/oplog/FinderModPersonalizedSetting$openPersonalizedSettingLoadMore$1$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        refreshLoadMoreLayout.setTranslationY(0.0f - (refreshLoadMoreLayout.getRefreshHeader() != null ? r1.getMeasuredHeight() : 0));
        refreshLoadMoreLayout.x();
        refreshLoadMoreLayout.J(false);
    }
}
