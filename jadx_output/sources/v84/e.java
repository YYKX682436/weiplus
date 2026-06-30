package v84;

/* loaded from: classes4.dex */
public class e extends v84.a {
    @Override // v84.c
    public android.graphics.Rect d() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.FloatUpScene2");
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        do {
            v84.b bVar = this.f434091a;
            int a17 = (int) a84.p0.a(bVar.f434085b, bVar.f434086c);
            int i18 = bVar.f434089f;
            e(rect, (int) a84.p0.a(a17 / 2, bVar.f434088e - r8), (int) a84.p0.a(i18 / 2, i18 + (bVar.f434086c * 4)), a17);
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.f434095e;
                if (i19 >= arrayList.size()) {
                    z17 = false;
                    break;
                }
                if (android.graphics.Rect.intersects((android.graphics.Rect) arrayList.get(i19), rect)) {
                    z17 = true;
                    break;
                }
                i19++;
            }
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.FloatUpScene2");
                return rect;
            }
            i17++;
        } while (i17 <= 30);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.FloatUpScene2");
        return rect;
    }

    @Override // v84.a
    public void f(android.view.View view, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.FloatUpScene2");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 0.0f);
        int a17 = (int) a84.p0.a(0.0f, 2000.0f);
        ofFloat.setDuration(a17);
        int a18 = (int) a84.p0.a(this.f434092b, this.f434093c);
        v84.b bVar = this.f434091a;
        int i28 = bVar.f434087d - a17;
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "translationY", 0.0f, -((int) ((a18 * i28) / 1000.0f)));
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.setDuration(i28 + 100);
        int i29 = (i18 - bVar.f434089f) - (i27 / 2);
        int i37 = i29 > 0 ? (i29 * 1000) / a18 : 0;
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat3.setInterpolator(new android.view.animation.AccelerateInterpolator());
        if (i37 > 0) {
            ofFloat3.setStartDelay(i37);
        }
        ofFloat3.setDuration(400L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat4.setStartDelay(i28 - 300);
        ofFloat4.setDuration(300);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).with(ofFloat4).after(ofFloat);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.FloatUpScene2");
    }
}
