package uo2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f429619e;

    public g(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView, int i17) {
        this.f429618d = finderFollowTopicHeaderView;
        this.f429619e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView.R;
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429618d;
        finderFollowTopicHeaderView.getClass();
        if ((this.f429619e & 1) == 1) {
            finderFollowTopicHeaderView.Q.onClick(view);
        } else {
            finderFollowTopicHeaderView.D();
        }
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        android.content.Context context = finderFollowTopicHeaderView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        p2Var.D(context, false, 6);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$bindOriginFeed$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
