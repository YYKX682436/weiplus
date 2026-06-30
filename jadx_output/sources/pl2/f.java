package pl2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f356622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pl2.l f356623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356624f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.recyclerview.widget.RecyclerView recyclerView, pl2.l lVar, pl2.s sVar) {
        super(0);
        this.f356622d = recyclerView;
        this.f356623e = lVar;
        this.f356624f = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f356622d.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int t17 = linearLayoutManager.t();
            int x17 = linearLayoutManager.x();
            pl2.l lVar = this.f356623e;
            android.view.View view = lVar.f356636f;
            if (view != null) {
                int i17 = x17 != this.f356624f.f356656k.size() + (-1) ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$3$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$3$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = lVar.f356635e;
            if (view2 != null) {
                int i18 = t17 != 0 ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$3$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$3$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
