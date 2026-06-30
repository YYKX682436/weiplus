package ju2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton f301810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f301811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f301812f;

    public d(com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f301810d = finderThanksButton;
        this.f301811e = h0Var;
        this.f301812f = baseFinderFeed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton finderThanksButton = this.f301810d;
        if (finderThanksButton != null) {
            com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) this.f301811e.f310123d;
            jz5.f0 f0Var = null;
            if (finderCommentInfo != null) {
                java.lang.String username = finderCommentInfo.getUsername();
                if (username == null) {
                    com.tencent.mars.xlog.Log.e("Finder.FeedFullConvert", "commentInfoToThank.username is null");
                } else {
                    finderThanksButton.setVisibility(0);
                    android.content.Context context = finderThanksButton.getContext();
                    java.lang.Integer valueOf = context != null ? java.lang.Integer.valueOf(context.getColor(com.tencent.mm.R.color.f479533an1)) : null;
                    android.content.Context context2 = finderThanksButton.getContext();
                    java.lang.Integer valueOf2 = context2 != null ? java.lang.Integer.valueOf(context2.getColor(com.tencent.mm.R.color.adh)) : null;
                    android.content.Context context3 = finderThanksButton.getContext();
                    java.lang.Integer valueOf3 = context3 != null ? java.lang.Integer.valueOf(context3.getColor(com.tencent.mm.R.color.abx)) : null;
                    android.content.Context context4 = finderThanksButton.getContext();
                    java.lang.String string = context4 != null ? context4.getString(com.tencent.mm.R.string.nx9) : null;
                    android.content.Context context5 = finderThanksButton.getContext();
                    ju2.q qVar = new ju2.q(0, 0L, valueOf, valueOf2, valueOf3, null, 500, string, context5 != null ? java.lang.Integer.valueOf(context5.getColor(com.tencent.mm.R.color.adh)) : null, java.lang.Integer.valueOf(com.tencent.mm.R.raw.thankful_flower_heavy), 35, null);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f301812f;
                    com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton.G(finderThanksButton, baseFinderFeed.getItemId(), username, finderCommentInfo.getThank_flag() == 1, 6, qVar, finderCommentInfo, null, 0, null, null, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, null);
                    hc2.v0.e(finderThanksButton, "thank_friend_recommend_feed_bubble", 0, 0, false, false, null, new ju2.c(baseFinderFeed), 62, null);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                finderThanksButton.setVisibility(8);
            }
        }
    }
}
