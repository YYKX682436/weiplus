package cu2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f222398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f222402h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222403i;

    public g(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.finder.view.e3 e3Var, android.content.Context context) {
        this.f222398d = baseFinderFeed;
        this.f222399e = view;
        this.f222400f = view2;
        this.f222401g = view3;
        this.f222402h = e3Var;
        this.f222403i = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        hb2.b0 b0Var = hb2.b0.f280025e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f222398d;
        b0Var.o(baseFinderFeed.getFeedObject().getId(), baseFinderFeed.getFeedObject().getFeedObject(), baseFinderFeed.getFeedObject().getObjectNonceId(), r45.uh2.CloseComment, new cu2.f(this.f222403i));
        android.view.View view2 = this.f222399e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f222400f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f222401g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f222402h.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/storage/logic/FinderCommentLogic$anchorModifyFeedComment$bottomSheet$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
