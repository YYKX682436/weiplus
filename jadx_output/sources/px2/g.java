package px2;

/* loaded from: classes2.dex */
public final class g implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f358882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar f358883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f358885g;

    public g(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar, com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f358882d = finderThumbPlayerProxy;
        this.f358883e = finderHorizontalLongVideoPlayerSeekBar;
        this.f358884f = finderLandscapePreviewLayout;
        this.f358885g = finderVideoLayout;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f358882d;
        int currentPlaySecond = finderThumbPlayerProxy.getCurrentPlaySecond();
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar = this.f358883e;
        cw2.e4 e4Var = finderHorizontalLongVideoPlayerSeekBar.playStatusListener;
        if (e4Var != null) {
            e4Var.a(i17);
        }
        finderThumbPlayerProxy.setVideoViewFocused(true);
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358884f;
        cw2.ca fullSeekBar = finderLandscapePreviewLayout.getFullSeekBar();
        if (fullSeekBar != null) {
            fullSeekBar.t("HorizontalSeek");
        }
        finderThumbPlayerProxy.r(i17, true, 3);
        finderThumbPlayerProxy.play();
        finderLandscapePreviewLayout.p(true, 1);
        yz5.a onSeekEnd = finderHorizontalLongVideoPlayerSeekBar.getOnSeekEnd();
        if (onSeekEnd != null) {
            onSeekEnd.invoke();
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f358885g;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            if (!playInfo.f223751g) {
                playInfo = null;
            }
            cw2.h8 h8Var = playInfo;
            if (h8Var != null) {
                com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout2 = this.f358884f;
                ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
                com.tencent.mm.plugin.finder.storage.FeedData feedData = h8Var.f223745a;
                if (videoPlayBehavior != null) {
                    long expectId = feedData.getExpectId();
                    java.lang.String dupFlag = feedData.getDupFlag();
                    mn2.g4 g4Var = h8Var.f223747c;
                    ((ec2.h) videoPlayBehavior).d(expectId, dupFlag, g4Var.f330002e, currentPlaySecond, i17, g4Var);
                }
                finderVideoLayout.R(feedData.getExpectId(), finderThumbPlayerProxy.getVideoMediaId(), currentPlaySecond, i17);
                com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout.e(finderLandscapePreviewLayout2, h8Var, currentPlaySecond, i17, finderThumbPlayerProxy.getVideoDurationMs(), false);
            }
        }
    }

    @Override // m34.e
    public void b() {
        cw2.h8 playInfo = this.f358885g.getPlayInfo();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f358882d;
        if (playInfo != null) {
            playInfo.f223755k = !finderThumbPlayerProxy.isPlaying();
        }
        finderThumbPlayerProxy.pause();
        this.f358884f.p(false, 2);
        yz5.a onSeekStart = this.f358883e.getOnSeekStart();
        if (onSeekStart != null) {
            onSeekStart.invoke();
        }
    }

    @Override // m34.e
    public void d(int i17) {
        this.f358884f.o(this.f358882d, i17, false);
    }
}
