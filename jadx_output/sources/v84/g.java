package v84;

/* loaded from: classes4.dex */
public class g extends v84.a {
    @Override // v84.c
    public android.graphics.Rect d() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.RoateScene2");
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        do {
            v84.b bVar = this.f434091a;
            int a17 = (int) a84.p0.a(bVar.f434085b, bVar.f434086c);
            float f17 = a17 / 2;
            e(rect, (int) a84.p0.a(f17, bVar.f434088e - r7), (int) a84.p0.a(f17, bVar.f434089f - r7), a17);
            int i18 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f434095e;
                if (i18 >= arrayList.size()) {
                    z17 = false;
                    break;
                }
                if (android.graphics.Rect.intersects((android.graphics.Rect) arrayList.get(i18), rect)) {
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.RoateScene2");
                return rect;
            }
            i17++;
        } while (i17 <= 30);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.RoateScene2");
        return rect;
    }

    @Override // v84.a
    public void f(android.view.View view, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.RoateScene2");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.0f);
        int a17 = (int) a84.p0.a(0.0f, 2000.0f);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofFloat.setDuration(a17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "rotation", 0.0f, 360.0f);
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.setDuration(3000L);
        ofFloat2.start();
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        ofFloat3.setDuration(500L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        ofFloat4.setDuration(500L);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat5.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat5.setDuration(500L);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        ofFloat6.setDuration(500L);
        ofFloat6.setStartDelay(2600L);
        android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        ofFloat7.setStartDelay(2600L);
        ofFloat7.setDuration(500L);
        android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat8.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat8.setDuration(500L);
        int i28 = this.f434091a.f434087d;
        if ((i28 - 3000) - a17 > 0) {
            ofFloat8.setStartDelay(2500L);
        } else {
            int i29 = (i28 - a17) - 500;
            if (i29 < 0) {
                i29 = 0;
            }
            ofFloat8.setStartDelay(i29);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat2).with(ofFloat6).with(ofFloat7).with(ofFloat8).after(ofFloat);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.RoateScene2");
    }
}
