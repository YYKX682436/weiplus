package uo2;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f429643e;

    public u(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f429642d = finderFollowTopicHeaderView;
        this.f429643e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429642d;
        if (q75.a.a(finderFollowTopicHeaderView.getContext()) != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_create_scene", 12);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context = finderFollowTopicHeaderView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i0Var.qj(context, intent);
        }
        this.f429643e.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$showBottomSheet$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
