package uo2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429621d;

    public h(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
        this.f429621d = finderFollowTopicHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$copyrightRestrictionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429621d;
        r45.o03 finderBgmInfo = finderFollowTopicHeaderView.getFinderBgmInfo();
        java.lang.Integer num = null;
        if ((finderBgmInfo != null ? (r45.zi2) finderBgmInfo.getCustom(1) : null) != null) {
            db5.t7.makeText(finderFollowTopicHeaderView.getContext(), com.tencent.mm.R.string.f491286cn0, 0).show();
        } else {
            db5.t7.makeText(finderFollowTopicHeaderView.getContext(), com.tencent.mm.R.string.cmz, 0).show();
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        android.content.Context context = finderFollowTopicHeaderView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.storage.FinderItem originFeed = finderFollowTopicHeaderView.getOriginFeed();
        if (originFeed != null && (feedObject = originFeed.getFeedObject()) != null) {
            num = java.lang.Integer.valueOf(feedObject.getFollow_feed_count());
        }
        o3Var.zk(context, 2, 4, num);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$copyrightRestrictionListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
