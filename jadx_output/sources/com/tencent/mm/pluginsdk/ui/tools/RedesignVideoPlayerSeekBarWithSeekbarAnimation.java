package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016R8\u0010\u0016\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation;", "", "newHeight", "Ljz5/f0;", "setSeekBarHeight", "getLayoutId", "", "speedRatio", "setSpeedRatio", "playTime", "setPlayTimeText", "_len", "setVideoTotalTime", "Lkotlin/Function2;", "", "x1", "Lyz5/p;", "getOnPlayTextUpdate", "()Lyz5/p;", "setOnPlayTextUpdate", "(Lyz5/p;)V", "onPlayTextUpdate", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class RedesignVideoPlayerSeekBarWithSeekbarAnimation extends com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation {
    public boolean A1;

    /* renamed from: x1, reason: collision with root package name and from kotlin metadata */
    public yz5.p onPlayTextUpdate;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f191434y1;

    /* renamed from: z1, reason: collision with root package name */
    public java.lang.String f191435z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedesignVideoPlayerSeekBarWithSeekbarAnimation(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.onPlayTextUpdate = com.tencent.mm.pluginsdk.ui.tools.c7.f191546d;
        this.f191434y1 = "";
        this.f191435z1 = "";
    }

    private final void setSeekBarHeight(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        android.widget.ImageView imageView = this.f162474g;
        android.view.ViewGroup.LayoutParams layoutParams4 = null;
        if (imageView != null) {
            if (imageView == null || (layoutParams3 = imageView.getLayoutParams()) == null) {
                layoutParams3 = null;
            } else {
                layoutParams3.height = i17;
            }
            imageView.setLayoutParams(layoutParams3);
        }
        android.widget.ImageView imageView2 = this.f162473f;
        if (imageView2 != null) {
            if (imageView2 == null || (layoutParams2 = imageView2.getLayoutParams()) == null) {
                layoutParams2 = null;
            } else {
                layoutParams2.height = i17;
            }
            imageView2.setLayoutParams(layoutParams2);
        }
        android.widget.ImageView imageView3 = this.E;
        if (imageView3 == null) {
            return;
        }
        if (imageView3 != null && (layoutParams = imageView3.getLayoutParams()) != null) {
            layoutParams.height = i17;
            layoutParams4 = layoutParams;
        }
        imageView3.setLayoutParams(layoutParams4);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation
    public void A() {
        this.A1 = false;
        setSeekBarHeight(a06.d.b(getContext().getResources().getDimension(com.tencent.mm.R.dimen.ais)));
        getSpeedRatioTextView().setVisibility(0);
        getSeekbarTimeArea().setVisibility(0);
        this.onPlayTextUpdate.invoke(null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.em9;
    }

    public final yz5.p getOnPlayTextUpdate() {
        return this.onPlayTextUpdate;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        getSpeedRatioTextView().setOnTouchListener(new com.tencent.mm.pluginsdk.ui.tools.b7(this, getSpeedRatioTextView().getTextSize()));
    }

    public final void setOnPlayTextUpdate(yz5.p pVar) {
        kotlin.jvm.internal.o.g(pVar, "<set-?>");
        this.onPlayTextUpdate = pVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar
    public void setPlayTimeText(int i17) {
        super.setPlayTimeText(i17);
        java.lang.String str = java.lang.String.valueOf(i17 / 60) + ':' + k(i17 % 60);
        if (this.A1) {
            this.onPlayTextUpdate.invoke(str, this.f191435z1);
        }
        this.f191434y1 = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation
    public void setSpeedRatio(float f17) {
        super.setSpeedRatio(f17);
        if (f17 > 1.0f) {
            getSpeedRatioTextView().setShadowLayer(8.0f, 0.0f, 0.0f, getContext().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        } else {
            getSpeedRatioTextView().setShadowLayer(1.0f, 3.0f, 3.0f, getContext().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d, com.tencent.mm.pluginsdk.ui.z0
    public void setVideoTotalTime(int i17) {
        super.setVideoTotalTime(i17);
        java.lang.String str = java.lang.String.valueOf(this.f162479o / 60) + ':' + k(this.f162479o % 60);
        if (this.A1) {
            this.onPlayTextUpdate.invoke(this.f191434y1, str);
        }
        this.f191435z1 = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation
    public void w() {
        this.A1 = true;
        setSeekBarHeight(a06.d.b(getContext().getResources().getDimension(com.tencent.mm.R.dimen.aih)));
        getSpeedRatioTextView().setVisibility(4);
        getSeekbarTimeArea().setVisibility(4);
        this.onPlayTextUpdate.invoke(this.f191434y1, this.f191435z1);
    }
}
