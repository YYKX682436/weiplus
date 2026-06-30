package cw2;

/* loaded from: classes2.dex */
public final class n8 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar f223888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223889e;

    public n8(com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223888d = finderLongVideoPlayerSeekBar;
        this.f223889e = finderVideoLayout;
    }

    @Override // m34.e
    public void a(int i17) {
        int defaultSeekMode;
        com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f223888d;
        cw2.e4 e4Var = finderLongVideoPlayerSeekBar.playStatusListener;
        if (e4Var != null) {
            e4Var.a(i17);
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223889e;
        cw2.da videoView = finderVideoLayout.getVideoView();
        if (videoView != null) {
            defaultSeekMode = finderVideoLayout.getDefaultSeekMode();
            videoView.r(i17, true, defaultSeekMode);
        }
        cw2.v9.n(this.f223889e, 0, null, null, 7, null);
        finderLongVideoPlayerSeekBar.setIsPlay(true);
        yz5.a onSeekEnd = finderLongVideoPlayerSeekBar.getOnSeekEnd();
        if (onSeekEnd != null) {
            onSeekEnd.invoke();
        }
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bb2.y2.r(bulletLifecycle, i17, false, 2, null);
        }
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            if (!playInfo.f223751g) {
                playInfo = null;
            }
            if (playInfo != null) {
                ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
                com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
                if (videoPlayBehavior != null) {
                    long expectId = feedData.getExpectId();
                    java.lang.String dupFlag = feedData.getDupFlag();
                    r45.mb4 mb4Var = playInfo.f223747c.f330002e;
                    cw2.da videoView2 = finderVideoLayout.getVideoView();
                    ((ec2.h) videoPlayBehavior).d(expectId, dupFlag, mb4Var, videoView2 != null ? videoView2.getCurrentPlaySecond() : 0, i17, playInfo.f223747c);
                }
                long expectId2 = feedData.getExpectId();
                cw2.da videoView3 = finderVideoLayout.getVideoView();
                java.lang.String videoMediaId = videoView3 != null ? videoView3.getVideoMediaId() : null;
                cw2.da videoView4 = finderVideoLayout.getVideoView();
                finderVideoLayout.R(expectId2, videoMediaId, videoView4 != null ? videoView4.getCurrentPlaySecond() : 0, i17);
            }
        }
    }

    @Override // m34.e
    public void b() {
        this.f223889e.b0(false);
        com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f223888d;
        finderLongVideoPlayerSeekBar.setIsPlay(false);
        yz5.a onSeekStart = finderLongVideoPlayerSeekBar.getOnSeekStart();
        if (onSeekStart != null) {
            onSeekStart.invoke();
        }
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
