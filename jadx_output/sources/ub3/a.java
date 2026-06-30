package ub3;

/* loaded from: classes3.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView f426086d;

    public a(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView luckyAvatarParticleView) {
        this.f426086d = luckyAvatarParticleView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView luckyAvatarParticleView = this.f426086d;
        if (floatValue == 1.0f) {
            ((java.util.ArrayList) luckyAvatarParticleView.f145064d).clear();
            ((java.util.ArrayList) luckyAvatarParticleView.f145065e).clear();
            ((java.util.ArrayList) luckyAvatarParticleView.f145066f).clear();
        } else if (((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() == 0.0f) {
            com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView.a(luckyAvatarParticleView, 40);
        } else {
            for (int i17 = 0; i17 < ((java.util.ArrayList) luckyAvatarParticleView.f145064d).size(); i17++) {
                android.graphics.Rect rect = (android.graphics.Rect) ((java.util.ArrayList) luckyAvatarParticleView.f145064d).get(i17);
                int width = rect.width();
                int abs = java.lang.Math.abs(0 - rect.left);
                java.util.ArrayList arrayList = (java.util.ArrayList) luckyAvatarParticleView.f145065e;
                if (abs > ((java.lang.Integer) arrayList.get(i17)).intValue()) {
                    int i18 = rect.left;
                    if (i18 < 0) {
                        rect.left = i18 + ((java.lang.Integer) arrayList.get(i17)).intValue();
                    } else if (i18 > 0) {
                        rect.left = i18 - ((java.lang.Integer) arrayList.get(i17)).intValue();
                    }
                } else {
                    rect.left = 0;
                }
                rect.right = rect.left + width;
                int abs2 = java.lang.Math.abs(0 - rect.top);
                java.util.ArrayList arrayList2 = (java.util.ArrayList) luckyAvatarParticleView.f145066f;
                if (abs2 > ((java.lang.Integer) arrayList2.get(i17)).intValue()) {
                    int i19 = rect.top;
                    if (i19 < 0) {
                        rect.top = i19 + ((java.lang.Integer) arrayList2.get(i17)).intValue();
                    } else if (i19 > 0) {
                        rect.top = i19 - ((java.lang.Integer) arrayList2.get(i17)).intValue();
                    }
                } else {
                    rect.top = 0;
                }
                rect.bottom = rect.top + width;
            }
        }
        luckyAvatarParticleView.invalidate();
    }
}
