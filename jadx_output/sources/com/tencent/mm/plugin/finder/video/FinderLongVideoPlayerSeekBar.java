package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\b\u0016\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104B%\b\u0016\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b3\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00067"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBar;", "", "getLayoutId", "", "isPlay", "Ljz5/f0;", "setIsPlay", "playTime", "setPlayTimeText", "_len", "setVideoTotalTime", "Lkotlin/Function1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setVideoLongPressStateChangeListener", "Lcw2/e4;", "H", "Lcw2/e4;", "getPlayStatusListener", "()Lcw2/e4;", "setPlayStatusListener", "(Lcw2/e4;)V", "playStatusListener", "Lkotlin/Function0;", "I", "Lyz5/a;", "getOnSeekStart", "()Lyz5/a;", "setOnSeekStart", "(Lyz5/a;)V", "onSeekStart", "J", "getOnSeekEnd", "setOnSeekEnd", "onSeekEnd", "K", "Lyz5/l;", "getOnCustomLoadingStatusChange", "()Lyz5/l;", "setOnCustomLoadingStatusChange", "(Lyz5/l;)V", "onCustomLoadingStatusChange", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "Ljz5/g;", "getTouchSlop", "()I", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderLongVideoPlayerSeekBar extends com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar {

    /* renamed from: H, reason: from kotlin metadata */
    public cw2.e4 playStatusListener;

    /* renamed from: I, reason: from kotlin metadata */
    public yz5.a onSeekStart;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public yz5.a onSeekEnd;

    /* renamed from: K, reason: from kotlin metadata */
    public yz5.l onCustomLoadingStatusChange;
    public yz5.l L;
    public android.view.GestureDetector M;
    public boolean N;
    public int P;
    public int Q;
    public boolean R;

    /* renamed from: S, reason: from kotlin metadata */
    public final jz5.g touchSlop;
    public int T;
    public int U;

    public FinderLongVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.touchSlop = jz5.h.b(new cw2.h4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTouchSlop() {
        return ((java.lang.Number) this.touchSlop.getValue()).intValue();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489098ba1;
    }

    public final yz5.l getOnCustomLoadingStatusChange() {
        return this.onCustomLoadingStatusChange;
    }

    public final yz5.a getOnSeekEnd() {
        return this.onSeekEnd;
    }

    public final yz5.a getOnSeekStart() {
        return this.onSeekStart;
    }

    public final cw2.e4 getPlayStatusListener() {
        return this.playStatusListener;
    }

    public void onVideoEnded() {
        setIsPlay(false);
        cw2.e4 e4Var = this.playStatusListener;
        if (e4Var != null) {
            e4Var.onVideoEnded();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        if (this.f191446z == z17) {
            return;
        }
        super.setIsPlay(z17);
        cw2.e4 e4Var = this.playStatusListener;
        if (e4Var != null) {
            e4Var.e(z17);
        }
    }

    public final void setOnCustomLoadingStatusChange(yz5.l lVar) {
        this.onCustomLoadingStatusChange = lVar;
    }

    public final void setOnSeekEnd(yz5.a aVar) {
        this.onSeekEnd = aVar;
    }

    public final void setOnSeekStart(yz5.a aVar) {
        this.onSeekStart = aVar;
    }

    public final void setPlayStatusListener(cw2.e4 e4Var) {
        this.playStatusListener = e4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar
    public void setPlayTimeText(int i17) {
        this.f162477m.setText(zl2.q4.f473933a.l(i17));
    }

    public final void setVideoLongPressStateChangeListener(yz5.l lVar) {
        if (this.M == null) {
            this.M = new android.view.GestureDetector(getContext(), new cw2.g4(this));
        }
        this.L = lVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d, com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        this.f162479o = i17;
        this.f162480p = 0;
        this.f162478n.setText(zl2.q4.f473933a.l(i17));
        m();
    }

    public void x(long j17) {
        cw2.e4 e4Var = this.playStatusListener;
        if (e4Var != null) {
            e4Var.c(j17);
        }
    }

    public FinderLongVideoPlayerSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.touchSlop = jz5.h.b(new cw2.h4(this));
    }
}
