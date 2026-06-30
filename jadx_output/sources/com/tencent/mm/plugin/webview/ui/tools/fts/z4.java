package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes5.dex */
public class z4 extends com.tencent.mm.plugin.webview.ui.tools.fts.v4 {
    public void a(com.tencent.mm.plugin.webview.ui.tools.fts.u4 u4Var, boolean z17) {
        if (u4Var == this.f184691q) {
            return;
        }
        int ordinal = u4Var.ordinal();
        android.view.View view = this.f184686l;
        float[][] fArr = this.f184689o;
        if (ordinal == 0) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            if (fArr[0][0] - this.f184677c >= 0.0f) {
                ofFloat.addUpdateListener(this.f184697w);
            } else {
                ofFloat.addUpdateListener(this.f184698x);
            }
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.addListener(new com.tencent.mm.plugin.webview.ui.tools.fts.w4(this));
            animatorSet.start();
            return;
        }
        if (ordinal != 1) {
            return;
        }
        if (z17) {
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            if (fArr[0][0] - this.f184677c >= 0.0f) {
                ofFloat3.addUpdateListener(this.f184695u);
            } else {
                ofFloat3.addUpdateListener(this.f184696v);
            }
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(ofFloat3, ofFloat4);
            animatorSet2.setInterpolator(new android.view.animation.DecelerateInterpolator());
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(new com.tencent.mm.plugin.webview.ui.tools.fts.y4(this));
            animatorSet2.start();
            return;
        }
        int i17 = this.f184678d;
        android.view.View view2 = this.f184679e;
        view2.setPadding(i17, 0, 0, 0);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        int i18 = this.f184675a;
        int i19 = i18 - i18;
        layoutParams.leftMargin = i19;
        layoutParams.rightMargin = i19;
        layoutParams.width = ((int) fArr[2][0]) + (i18 * 2);
        view2.setLayoutParams(layoutParams);
        view2.post(new com.tencent.mm.plugin.webview.ui.tools.fts.x4(this));
    }
}
