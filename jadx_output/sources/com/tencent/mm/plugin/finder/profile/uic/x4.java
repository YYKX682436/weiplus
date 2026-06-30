package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class x4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f124342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f124343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124344f;

    public x4(androidx.fragment.app.Fragment fragment, com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        this.f124343e = fragment;
        this.f124344f = finderProfileFeedUIC;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            if (this.f124342d > 0) {
                com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124344f;
                long longExtra = finderProfileFeedUIC.getIntent().getLongExtra("finder_from_feed_id", 0L);
                java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, finderProfileFeedUIC.getIntent().getStringExtra("finder_from_feed_dup_flag"), finderProfileFeedUIC.getIntent().getIntExtra("finder_from_feed_comment_scene", 0));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[5];
                lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(longExtra));
                lVarArr[1] = new jz5.l("source_feed_sessionbuffer", ek6);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                lVarArr[3] = new jz5.l("finder_context_id", b52.b.b());
                androidx.appcompat.app.AppCompatActivity context = finderProfileFeedUIC.getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                lVarArr[4] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
                ((cy1.a) rVar).yj("page_slide_down", null, kz5.c1.k(lVarArr), 1, true);
            }
            this.f124342d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recycleView, int i17, int i18) {
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView;
        com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView2;
        int fromFeedType;
        long fromFeedId;
        int fromCommentScene;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recycleView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recycleView, "recycleView");
        com.tencent.mars.xlog.Log.i("Finder.ProfileFeedUIC", "profileScroll fromScroll");
        androidx.fragment.app.Fragment fragment = this.f124343e;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124344f;
        recyclerView = finderProfileFeedUIC.getRecyclerView();
        kotlin.jvm.internal.o.f(recyclerView, "access$getRecyclerView(...)");
        ((com.tencent.mm.plugin.finder.profile.uic.f4) a17).T6(recyclerView, false, 11);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        recyclerView2 = finderProfileFeedUIC.getRecyclerView();
        ml2.x1 x1Var = ml2.x1.f328202f;
        ml2.q1 q1Var = ml2.q1.f327812e;
        ml2.y yVar = ml2.y.f328239d;
        fromFeedType = finderProfileFeedUIC.getFromFeedType();
        fromFeedId = finderProfileFeedUIC.getFromFeedId();
        fromCommentScene = finderProfileFeedUIC.getFromCommentScene();
        ((ml2.j0) zbVar).oj(recyclerView2, x1Var, "temp_5", yVar, fromFeedType, fromFeedId, fromCommentScene);
        this.f124342d += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileFeedUIC$mHellOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
