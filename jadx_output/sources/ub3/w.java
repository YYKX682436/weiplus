package ub3;

/* loaded from: classes5.dex */
public class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI f426146d;

    public w(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        this.f426146d = luckyMoneyF2FReceiveUI;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f426146d.f145095g.setTranslationY((-floatValue) * r0.f145106u.heightPixels);
    }
}
