package uo2;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429638d;

    public q(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView) {
        this.f429638d = finderFollowTopicHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseVideoListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429638d;
        com.tencent.mm.plugin.finder.video.FinderVideoViewForTopic videoView = finderFollowTopicHeaderView.getVideoView();
        if (videoView != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) finderFollowTopicHeaderView.findViewById(com.tencent.mm.R.id.ftl);
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(finderFollowTopicHeaderView.getContext(), com.tencent.mm.R.raw.finder_music_follow_topic_play_icon, i65.a.d(finderFollowTopicHeaderView.getContext(), com.tencent.mm.R.color.FG_0)));
            }
            videoView.pause();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) finderFollowTopicHeaderView.findViewById(com.tencent.mm.R.id.ftl);
            android.view.View.OnClickListener onClickListener = finderFollowTopicHeaderView.L;
            if (weImageView2 != null) {
                weImageView2.setOnClickListener(onClickListener);
            }
            finderFollowTopicHeaderView.setCurrentListener(onClickListener);
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            android.content.Context context = finderFollowTopicHeaderView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.storage.FinderItem originFeed = finderFollowTopicHeaderView.getOriginFeed();
            o3Var.zk(context, 2, 3, (originFeed == null || (feedObject = originFeed.getFeedObject()) == null) ? null : java.lang.Integer.valueOf(feedObject.getFollow_feed_count()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/music/FinderFollowTopicHeaderView$pauseVideoListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
