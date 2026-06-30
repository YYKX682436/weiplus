package cw2;

/* loaded from: classes2.dex */
public final class s8 implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224008d;

    public s8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f224008d = finderVideoLayout;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224008d;
        com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "onHeadsetStateChange on:" + z17 + " isVideoPlaying:" + finderVideoLayout.J());
        if (z17 || !finderVideoLayout.J()) {
            return;
        }
        if (finderVideoLayout.getLongVideoSeekBar() != null) {
            finderVideoLayout.b0(false);
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar longVideoSeekBar = finderVideoLayout.getLongVideoSeekBar();
            kotlin.jvm.internal.o.d(longVideoSeekBar);
            longVideoSeekBar.setIsPlay(false);
            return;
        }
        finderVideoLayout.L(true, true);
        cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
        if (seekBarLayout != null) {
            cw2.ca.d(seekBarLayout, null, false, 3, null);
        }
    }
}
