package ub3;

/* loaded from: classes14.dex */
public class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ub3.i f426105d;

    public h(ub3.i iVar) {
        this.f426105d = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        ub3.i iVar = this.f426105d;
        android.view.View view = iVar.f426111h.f145070g;
        view.setPadding(view.getPaddingLeft(), (int) floatValue, iVar.f426111h.f145070g.getPaddingRight(), iVar.f426111h.f145070g.getPaddingBottom());
        float f17 = floatValue / iVar.f426108e;
        if (f17 <= 1.0f) {
            com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = iVar.f426111h;
            luckyMoneyF2FQRCodeUI.f145080q.setAlpha((1.0f - f17) + luckyMoneyF2FQRCodeUI.U);
            com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI2 = iVar.f426111h;
            luckyMoneyF2FQRCodeUI2.f145081r.setAlpha(f17 * luckyMoneyF2FQRCodeUI2.U);
            return;
        }
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI3 = iVar.f426111h;
        luckyMoneyF2FQRCodeUI3.f145080q.setAlpha(luckyMoneyF2FQRCodeUI3.U);
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI4 = iVar.f426111h;
        luckyMoneyF2FQRCodeUI4.f145081r.setAlpha(luckyMoneyF2FQRCodeUI4.U);
    }
}
