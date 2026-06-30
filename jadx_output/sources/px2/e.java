package px2;

/* loaded from: classes2.dex */
public final class e implements cw2.e4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f358875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar f358876c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f358877d;

    public e(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f358874a = finderLandscapePreviewLayout;
        this.f358875b = finderThumbPlayerProxy;
        this.f358876c = finderHorizontalLongVideoPlayerSeekBar;
        this.f358877d = finderVideoLayout;
    }

    @Override // cw2.e4
    public void a(int i17) {
        bb2.y2 bulletLifecycle = this.f358877d.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bb2.y2.r(bulletLifecycle, i17, false, 2, null);
        }
    }

    @Override // cw2.e4
    public void b(float f17) {
    }

    @Override // cw2.e4
    public void c(long j17) {
        int i17 = (int) (j17 / 1000);
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358874a;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView = this.f358875b;
        finderLandscapePreviewLayout.o(videoView, i17, false);
        finderLandscapePreviewLayout.getClass();
        kotlin.jvm.internal.o.g(videoView, "videoView");
        int videoDuration = videoView.getVideoDuration();
        finderLandscapePreviewLayout.getLongVideoSeekBarLayout().getLastTimeTv().setText(zl2.q4.f473933a.l(h3.a.b(videoDuration - i17, 0, videoDuration)));
        if (videoView.isPlaying()) {
            this.f358876c.setIsPlay(true);
            android.content.Context context = finderLandscapePreviewLayout.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | 4);
            }
        }
        long videoDurationMs = videoView.getVideoDurationMs();
        android.widget.SeekBar seekBar = finderLandscapePreviewLayout.N;
        if (seekBar != null) {
            seekBar.setProgress((int) (seekBar.getMax() * java.lang.Math.min(1.0f, ((float) j17) / ((float) videoDurationMs))));
        }
    }

    @Override // cw2.e4
    public void d() {
    }

    @Override // cw2.e4
    public void e(boolean z17) {
        this.f358874a.setKeepScreenOn(z17);
        this.f358875b.setVideoViewFocused(z17);
    }

    @Override // cw2.e4
    public void onVideoEnded() {
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358874a;
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout.v(finderLandscapePreviewLayout, false, null, 2, null);
        finderLandscapePreviewLayout.getLongVideoSeekBarLayout().setVisibility(8);
    }
}
