package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f178136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.e4 f178137e;

    public d4(com.tencent.mm.plugin.wallet.balance.ui.lqt.e4 e4Var, boolean z17) {
        this.f178137e = e4Var;
        this.f178136d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178137e.f178157a;
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.f177980y0;
        walletLqtPlanAddUI.getClass();
        float b17 = i65.a.b(walletLqtPlanAddUI, 56);
        float b18 = i65.a.b(walletLqtPlanAddUI, 86);
        boolean z17 = this.f178136d;
        if (!z17 || walletLqtPlanAddUI.V) {
            if (z17 || !walletLqtPlanAddUI.V) {
                return;
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(walletLqtPlanAddUI.f178001y, "translationY", -walletLqtPlanAddUI.B, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            ofFloat.addUpdateListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.t3(walletLqtPlanAddUI, b17, b18));
            ofFloat.start();
            walletLqtPlanAddUI.f177998w.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.u3(walletLqtPlanAddUI));
            walletLqtPlanAddUI.V = z17;
            return;
        }
        if (walletLqtPlanAddUI.B == 0) {
            walletLqtPlanAddUI.B = walletLqtPlanAddUI.f177984g.getBottom() + i65.a.b(walletLqtPlanAddUI, 6);
        }
        if (walletLqtPlanAddUI.B == 0) {
            walletLqtPlanAddUI.B = i65.a.b(walletLqtPlanAddUI, 132);
        }
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(walletLqtPlanAddUI.f178001y, "translationY", 0.0f, -walletLqtPlanAddUI.B);
        ofFloat2.setDuration(300L);
        ofFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat2.addUpdateListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.r3(walletLqtPlanAddUI, b17, b18));
        if (!walletLqtPlanAddUI.W) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "do not Scroll Lv ");
            return;
        }
        ofFloat2.start();
        walletLqtPlanAddUI.f177998w.post(new com.tencent.mm.plugin.wallet.balance.ui.lqt.s3(walletLqtPlanAddUI));
        walletLqtPlanAddUI.V = z17;
    }
}
