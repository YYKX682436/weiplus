package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100B%\b\u0016\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\u0006\u00101\u001a\u00020\u0003¢\u0006\u0004\b/\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoGreenSeekBar;", "Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "Lcw2/ca;", "", "getLayoutId", "Landroid/widget/ImageView;", "imgView", "Ljz5/f0;", "setPlayButton", "", "isPlay", "setIsPlay", "_len", "setVideoTotalTime", "playTime", "setPlayTimeText", "target", "setProgress", "getCurrentProgress", "getMaxProgress", "Lcw2/ba;", "callback", "setSeekBarCallback", "Landroid/widget/TextView;", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "Landroid/widget/TextView;", "getRelativeTotalTimeTv", "()Landroid/widget/TextView;", "setRelativeTotalTimeTv", "(Landroid/widget/TextView;)V", "relativeTotalTimeTv", "p0", "getRelativeCurrentTimeTv", "setRelativeCurrentTimeTv", "relativeCurrentTimeTv", "Lkotlin/Function0;", "x0", "Lyz5/a;", "getOnPauseClickListener", "()Lyz5/a;", "setOnPauseClickListener", "(Lyz5/a;)V", "onPauseClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderVideoGreenSeekBar extends com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar implements cw2.ca {
    public java.lang.String V;

    /* renamed from: W, reason: from kotlin metadata */
    public android.widget.TextView relativeTotalTimeTv;

    /* renamed from: l1, reason: collision with root package name */
    public final int f130698l1;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView relativeCurrentTimeTv;

    /* renamed from: p1, reason: collision with root package name */
    public int f130700p1;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public yz5.a onPauseClickListener;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f130702x1;

    /* renamed from: y0, reason: collision with root package name */
    public cw2.ba f130703y0;

    public FinderVideoGreenSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = "";
        this.onPauseClickListener = cw2.g8.f223732d;
        this.f130698l1 = 500;
    }

    @Override // cw2.ca
    public void b(float f17) {
        cw2.e4 playStatusListener = getPlayStatusListener();
        if (playStatusListener != null) {
            playStatusListener.b(f17);
        }
    }

    @Override // cw2.ca
    public void f(java.lang.String source, boolean z17) {
        kotlin.jvm.internal.o.g(source, "source");
        if (this.f130702x1) {
            return;
        }
        this.onPauseClickListener.invoke();
        setIsPlay(false);
        this.f130702x1 = true;
    }

    @Override // cw2.ca
    /* renamed from: getCurrentProgress, reason: from getter */
    public int getF130700p1() {
        return this.f130700p1;
    }

    @Override // cw2.ca
    public /* bridge */ /* synthetic */ int getDragStyle() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_w;
    }

    /* renamed from: getMaxProgress, reason: from getter */
    public int getF130698l1() {
        return this.f130698l1;
    }

    public final yz5.a getOnPauseClickListener() {
        return this.onPauseClickListener;
    }

    public final android.widget.TextView getRelativeCurrentTimeTv() {
        return this.relativeCurrentTimeTv;
    }

    public final android.widget.TextView getRelativeTotalTimeTv() {
        return this.relativeTotalTimeTv;
    }

    @Override // cw2.ca
    public void h(float f17, long j17, long j18) {
        x(j17);
        setProgress(a06.d.b(f17 * this.f130698l1));
    }

    @Override // cw2.ca
    /* renamed from: i */
    public boolean getIsSeekBarTrackingTouch() {
        return false;
    }

    @Override // cw2.ca
    public boolean l() {
        return false;
    }

    @Override // cw2.ca
    public void n(com.tencent.mm.plugin.finder.storage.FeedData feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // cw2.ca
    public void o(float f17, int i17, int i18) {
        setVideoTotalTime(i18);
        a(i17);
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, cw2.ca
    public void onVideoEnded() {
        super.onVideoEnded();
        setProgress(0);
    }

    @Override // cw2.ca
    public void p(int i17, int i18) {
    }

    @Override // cw2.ca
    /* renamed from: r, reason: from getter */
    public boolean getF130702x1() {
        return this.f130702x1;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        if (this.f191446z == z17) {
            return;
        }
        super.setIsPlay(z17);
        this.f162476i.setImageResource(z17 ? com.tencent.mm.R.drawable.f481659c45 : com.tencent.mm.R.drawable.f481660c46);
    }

    public final void setOnPauseClickListener(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.onPauseClickListener = aVar;
    }

    public final void setPlayButton(android.widget.ImageView imgView) {
        kotlin.jvm.internal.o.g(imgView, "imgView");
        this.f162476i = imgView;
        imgView.setImageResource(com.tencent.mm.R.drawable.f481659c45);
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar
    public void setPlayTimeText(int i17) {
        java.lang.String str = k(i17 / 60) + ':' + k(i17 % 60);
        android.widget.TextView textView = this.relativeCurrentTimeTv;
        if (textView != null) {
            textView.setText(str);
        }
        this.f162477m.setText(str + this.V);
    }

    @Override // cw2.ca
    public void setProgress(int i17) {
        this.f130700p1 = java.lang.Math.max(0, i17);
    }

    public final void setRelativeCurrentTimeTv(android.widget.TextView textView) {
        this.relativeCurrentTimeTv = textView;
    }

    public final void setRelativeTotalTimeTv(android.widget.TextView textView) {
        this.relativeTotalTimeTv = textView;
    }

    @Override // cw2.ca
    public void setSeekBarCallback(cw2.ba callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f130703y0 = callback;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d, com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        boolean z17 = this.f162479o != i17;
        super.setVideoTotalTime(i17);
        this.f162478n.setVisibility(8);
        android.widget.TextView textView = this.relativeTotalTimeTv;
        if (textView != null) {
            textView.setText(this.f162478n.getText());
        }
        if (z17) {
            this.V = "/" + k(this.f162479o / 60) + ':' + k(this.f162479o % 60);
        }
    }

    @Override // cw2.ca
    public void t(java.lang.String reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        if (this.f130702x1) {
            this.onPauseClickListener.invoke();
            setIsPlay(true);
            this.f130702x1 = false;
        }
    }

    public FinderVideoGreenSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.V = "";
        this.onPauseClickListener = cw2.g8.f223732d;
        this.f130698l1 = 500;
    }
}
