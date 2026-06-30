package com.tencent.mm.plugin.sns.ad.widget.advideo;

/* loaded from: classes2.dex */
public class AdLandingVideoPlayerSeekBar extends com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar {
    public AdLandingVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        return com.tencent.mm.R.layout.f487972cx;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        this.f191446z = z17;
        android.widget.ImageView imageView = this.f162476i;
        if (imageView == null) {
            com.tencent.mars.xlog.Log.e("AdLandingVideoPlayerSeekBar", "in adLandingVideoPlayerSeekBar setIsPlay, mPlayBtn is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        } else {
            if (z17) {
                imageView.setImageResource(com.tencent.mm.R.raw.media_player_btn_cur_status_on);
            } else {
                imageView.setImageResource(com.tencent.mm.R.raw.media_player_btn_cur_status_off);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        }
    }

    public AdLandingVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
