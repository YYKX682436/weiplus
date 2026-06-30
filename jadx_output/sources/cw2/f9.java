package cw2;

/* loaded from: classes2.dex */
public final class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar f223716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223719g;

    public f9(com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, int i17, int i18, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223716d = finderLongVideoPlayerSeekBar;
        this.f223717e = i17;
        this.f223718f = i18;
        this.f223719g = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f223717e;
        com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f223716d;
        finderLongVideoPlayerSeekBar.setVideoTotalTime(i17);
        finderLongVideoPlayerSeekBar.a(this.f223718f);
        cw2.da videoView = this.f223719g.getVideoView();
        finderLongVideoPlayerSeekBar.x(videoView != null ? videoView.getCurrentPlayMs() : 0L);
    }
}
