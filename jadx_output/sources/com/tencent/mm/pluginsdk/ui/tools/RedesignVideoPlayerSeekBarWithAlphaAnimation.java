package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAlphaAnimation;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithAnimation;", "", "getLayoutId", "", "isPlay", "Ljz5/f0;", "setIsPlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class RedesignVideoPlayerSeekBarWithAlphaAnimation extends com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation {

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f191426p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedesignVideoPlayerSeekBarWithAlphaAnimation(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void D(android.view.View view, android.view.View view2) {
        if (view == null || view2 == null) {
            return;
        }
        view.clearAnimation();
        view2.clearAnimation();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.7f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.7f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view2, "scaleX", 0.7f, 1.0f);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view2, "scaleY", 0.7f, 1.0f);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.setDuration(150L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet2.playTogether(ofFloat4, ofFloat5, ofFloat6);
        animatorSet.start();
        animatorSet2.start();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.em8;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void j() {
        super.j();
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.uqk);
        this.f191426p1 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_pause, -1));
        }
        android.widget.ImageView imageView2 = this.f191426p1;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new com.tencent.mm.pluginsdk.ui.tools.v6(this));
        }
        android.widget.ImageView imageView3 = this.f191426p1;
        if (imageView3 != null) {
            imageView3.setAlpha(0.0f);
        }
        android.widget.ImageView playBtn = getPlayBtn();
        if (playBtn != null) {
            playBtn.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_filled_play, -1));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar, m34.d
    public void setIsPlay(boolean z17) {
        boolean z18 = this.f191446z != z17;
        this.f191446z = z17;
        if (z17) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.f490511x5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.widget.ImageView playBtn = getPlayBtn();
            if (playBtn != null) {
                playBtn.setContentDescription(string);
            }
            android.widget.ImageView imageView = this.f191426p1;
            if (imageView != null) {
                imageView.setContentDescription(string);
            }
            if (z18) {
                android.widget.ImageView playBtn2 = getPlayBtn();
                if (playBtn2 != null) {
                    playBtn2.setAlpha(1.0f);
                }
                android.widget.ImageView playBtn3 = getPlayBtn();
                if (playBtn3 != null) {
                    playBtn3.setScaleX(1.0f);
                }
                android.widget.ImageView playBtn4 = getPlayBtn();
                if (playBtn4 != null) {
                    playBtn4.setScaleY(1.0f);
                }
                android.widget.ImageView imageView2 = this.f191426p1;
                if (imageView2 != null) {
                    imageView2.setAlpha(0.0f);
                }
                D(getPlayBtn(), this.f191426p1);
                return;
            }
            android.widget.ImageView playBtn5 = getPlayBtn();
            if (playBtn5 != null) {
                playBtn5.setAlpha(0.0f);
            }
            android.widget.ImageView imageView3 = this.f191426p1;
            if (imageView3 != null) {
                imageView3.setAlpha(1.0f);
            }
            android.widget.ImageView imageView4 = this.f191426p1;
            if (imageView4 != null) {
                imageView4.setScaleX(1.0f);
            }
            android.widget.ImageView imageView5 = this.f191426p1;
            if (imageView5 == null) {
                return;
            }
            imageView5.setScaleY(1.0f);
            return;
        }
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.f490519xf);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.widget.ImageView playBtn6 = getPlayBtn();
        if (playBtn6 != null) {
            playBtn6.setContentDescription(string2);
        }
        android.widget.ImageView imageView6 = this.f191426p1;
        if (imageView6 != null) {
            imageView6.setContentDescription(string2);
        }
        if (z18) {
            android.widget.ImageView playBtn7 = getPlayBtn();
            if (playBtn7 != null) {
                playBtn7.setAlpha(0.0f);
            }
            android.widget.ImageView imageView7 = this.f191426p1;
            if (imageView7 != null) {
                imageView7.setAlpha(1.0f);
            }
            android.widget.ImageView imageView8 = this.f191426p1;
            if (imageView8 != null) {
                imageView8.setScaleX(1.0f);
            }
            android.widget.ImageView imageView9 = this.f191426p1;
            if (imageView9 != null) {
                imageView9.setScaleY(1.0f);
            }
            D(this.f191426p1, getPlayBtn());
            return;
        }
        android.widget.ImageView playBtn8 = getPlayBtn();
        if (playBtn8 != null) {
            playBtn8.setAlpha(1.0f);
        }
        android.widget.ImageView playBtn9 = getPlayBtn();
        if (playBtn9 != null) {
            playBtn9.setScaleX(1.0f);
        }
        android.widget.ImageView playBtn10 = getPlayBtn();
        if (playBtn10 != null) {
            playBtn10.setScaleY(1.0f);
        }
        android.widget.ImageView imageView10 = this.f191426p1;
        if (imageView10 == null) {
            return;
        }
        imageView10.setAlpha(0.0f);
    }
}
