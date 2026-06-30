package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B%\b\u0016\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\f¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderHorizontalLongVideoPlayerSeekBar;", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "", "getLayoutId", "_len", "Ljz5/f0;", "setVideoTotalTime", "playTime", "setPlayTimeText", "", "isPlay", "setIsPlay", "", "getVideoTotalTimeMs", "time", "setVideoTotalTimeMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderHorizontalLongVideoPlayerSeekBar extends com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar {
    public long V;
    public long W;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f130569l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f130570p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f130571x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.View f130572y0;

    public FinderHorizontalLongVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void a(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = this.f162479o;
        if (i17 > i18) {
            i17 = i18;
        }
        this.f162480p = i17;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e7q;
    }

    /* renamed from: getVideoTotalTimeMs, reason: from getter */
    public final long getV() {
        return this.V;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        this.f130570p0 = this.f162472e.findViewById(com.tencent.mm.R.id.kxm);
        this.f130571x0 = this.f162472e.findViewById(com.tencent.mm.R.id.kxi);
        this.f130572y0 = this.f162472e.findViewById(com.tencent.mm.R.id.kxk);
        this.f130569l1 = this.f162472e.findViewById(com.tencent.mm.R.id.kxj);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void m() {
        int barPointWidth;
        if (this.V == 0 || this.f162483s || this.f162475h == null || getBarLen() == 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f162475h.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        int barLen = getBarLen();
        long j17 = this.W;
        if (j17 <= 0) {
            barPointWidth = 0;
        } else {
            long j18 = this.V;
            barPointWidth = j17 >= j18 ? barLen - (((getBarPointWidth() - this.f162475h.getPaddingLeft()) - this.f162475h.getPaddingRight()) / 2) : (int) (((j17 * 1.0d) / j18) * barLen);
        }
        layoutParams2.leftMargin = barPointWidth;
        this.f162475h.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f162473f.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.width = (int) (((this.W * 1.0d) / this.V) * barLen);
        this.f162473f.setLayoutParams(layoutParams4);
        requestLayout();
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        if (this.f191446z == z17) {
            return;
        }
        this.f191446z = z17;
        cw2.e4 playStatusListener = getPlayStatusListener();
        if (playStatusListener != null) {
            playStatusListener.e(z17);
        }
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar
    public void setPlayTimeText(int i17) {
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d, com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        this.f162479o = i17;
        this.f162480p = 0;
    }

    public final void setVideoTotalTimeMs(long j17) {
        this.V = j17;
        this.W = 0L;
        m();
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar
    public void x(long j17) {
        cw2.e4 playStatusListener = getPlayStatusListener();
        if (playStatusListener != null) {
            playStatusListener.c(j17);
        }
        y(j17);
    }

    public final void y(long j17) {
        if (j17 < 0) {
            j17 = 0;
        }
        long j18 = this.V;
        if (j17 > j18) {
            j17 = j18;
        }
        if (this.W != j17) {
            this.W = j17;
            m();
        }
    }

    public FinderHorizontalLongVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
