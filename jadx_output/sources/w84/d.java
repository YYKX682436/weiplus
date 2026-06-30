package w84;

/* loaded from: classes4.dex */
public class d extends w84.a {
    @Override // v84.c
    public android.graphics.Rect d() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        do {
            v84.b bVar = this.f434091a;
            int a17 = (int) a84.p0.a(bVar.f434085b, bVar.f434086c);
            int a18 = (int) a84.p0.a(a17 / 2, bVar.f434089f - r7);
            int i18 = bVar.f434086c;
            e(rect, (int) a84.p0.a(-i18, -i18), a18, a17);
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
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
                return rect;
            }
            i17++;
        } while (i17 <= 30);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSpritePosition", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
        return rect;
    }

    @Override // w84.a
    public void f(t84.c cVar, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
        int a17 = (int) a84.p0.a(this.f434092b, this.f434093c);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar, "alpha", 1.0f, 1.0f);
        v84.b bVar = this.f434091a;
        int a18 = (int) a84.p0.a(0.0f, bVar.f434087d);
        ofFloat.setDuration(a18);
        int i28 = bVar.f434087d - a18;
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar, "translationX", 0.0f, (int) ((a17 * i28) / 1000.0f));
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.setDuration(i28 + 100);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar, "alpha", 1.0f, 0.0f);
        ofFloat3.setStartDelay(i28 - 300);
        ofFloat3.setDuration(300);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startSpriteAnim", "com.tencent.mm.plugin.sns.ad.widget.longTouchAd.gl.LeftToRightGLScene");
    }
}
