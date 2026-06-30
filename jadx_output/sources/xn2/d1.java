package xn2;

/* loaded from: classes2.dex */
public final class d1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f455485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455486e;

    public d1(kotlin.jvm.internal.f0 f0Var, xn2.f1 f1Var) {
        this.f455485d = f0Var;
        this.f455486e = f1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            kotlin.jvm.internal.f0 f0Var = this.f455485d;
            if (f0Var.f310116d > 0) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l lVar = new jz5.l("page_name", "TopStoryFinderLongVideoListPage");
                iy1.c cVar = iy1.c.MainUI;
                jz5.l lVar2 = new jz5.l("page_id", 50030);
                xn2.f1 f1Var = this.f455486e;
                ((cy1.a) rVar).yj("page_slide_down", null, kz5.c1.k(lVar, lVar2, new jz5.l("finder_context_id", ((xn2.p0) f1Var.f455493e).f455544b), new jz5.l("comment_scene", 281), new jz5.l("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(f1Var.getActivity()))), 1, true);
            }
            f0Var.f310116d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f455485d.f310116d += i18;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$rv$2$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
