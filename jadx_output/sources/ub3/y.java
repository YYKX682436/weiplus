package ub3;

/* loaded from: classes9.dex */
public class y implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI f426148d;

    public y(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI) {
        this.f426148d = luckyMoneyF2FReceiveUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("LuckyMoneyF2FReceiveUI", "packet exit animator end");
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI luckyMoneyF2FReceiveUI = this.f426148d;
        android.content.Intent intent = luckyMoneyF2FReceiveUI.f145109x;
        if (intent != null) {
            luckyMoneyF2FReceiveUI.startActivity(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.class, intent);
        }
        luckyMoneyF2FReceiveUI.setResult(-1, null);
        luckyMoneyF2FReceiveUI.finish();
        if (luckyMoneyF2FReceiveUI.f145109x != null) {
            luckyMoneyF2FReceiveUI.overridePendingTransition(com.tencent.mm.R.anim.f477843d1, com.tencent.mm.R.anim.f477848d6);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
