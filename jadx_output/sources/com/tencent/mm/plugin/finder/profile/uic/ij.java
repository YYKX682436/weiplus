package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ij extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f123818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dk f123820f;

    public ij(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, com.tencent.mm.plugin.finder.profile.uic.dk dkVar) {
        this.f123819e = f4Var;
        this.f123820f = dkVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$onAttachAllData$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            if (this.f123818d > 0) {
                com.tencent.mm.plugin.finder.profile.uic.dk dkVar = this.f123820f;
                long longExtra = dkVar.getIntent().getLongExtra("finder_from_feed_id", 0L);
                java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(longExtra, dkVar.getIntent().getStringExtra("finder_from_feed_dup_flag"), dkVar.getIntent().getIntExtra("finder_from_feed_comment_scene", 0));
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[5];
                lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(longExtra));
                lVarArr[1] = new jz5.l("source_feed_sessionbuffer", ek6);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                lVarArr[2] = new jz5.l("finder_tab_context_id", b52.b.c());
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                lVarArr[3] = new jz5.l("finder_context_id", b52.b.b());
                androidx.appcompat.app.AppCompatActivity context = dkVar.getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                lVarArr[4] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
                ((cy1.a) rVar).yj("page_slide_down", null, kz5.c1.k(lVarArr), 1, true);
            }
            this.f123818d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$onAttachAllData$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$onAttachAllData$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f123819e.T6(recyclerView, false, 10);
        this.f123818d += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$onAttachAllData$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
