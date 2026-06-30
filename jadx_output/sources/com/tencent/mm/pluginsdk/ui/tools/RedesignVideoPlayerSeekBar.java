package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes2.dex */
public class RedesignVideoPlayerSeekBar extends com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar {
    public android.widget.ImageView E;
    public long F;
    public long G;

    public RedesignVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 0L;
        this.G = 0L;
    }

    @Override // com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, com.tencent.mm.pluginsdk.ui.z0
    public void e(boolean z17) {
        setIsPlay(z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdk;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        this.E = (android.widget.ImageView) this.f162472e.findViewById(com.tencent.mm.R.id.kxk);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        this.f191446z = z17;
        if (z17) {
            this.f162476i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_pause, -1));
            this.f162476i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490511x5));
        } else {
            this.f162476i.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_play, -1));
            this.f162476i.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490519xf));
        }
    }

    public boolean v(int i17) {
        int videoTotalTime = getVideoTotalTime();
        if ((i17 == this.F && videoTotalTime == this.G) || java.lang.System.currentTimeMillis() - 0 < 300 || i17 < 0 || videoTotalTime < 0) {
            return false;
        }
        if (i17 > videoTotalTime) {
            i17 = videoTotalTime;
        }
        int barLen = getBarLen();
        if (barLen <= 0) {
            return true;
        }
        int i18 = videoTotalTime != 0 ? (int) (barLen * ((i17 * 1.0d) / videoTotalTime)) : 0;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.E.getLayoutParams();
        layoutParams.width = i18;
        this.E.setLayoutParams(layoutParams);
        this.F = i17;
        this.G = videoTotalTime;
        return true;
    }

    public RedesignVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.F = 0L;
        this.G = 0L;
    }
}
