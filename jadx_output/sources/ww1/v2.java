package ww1;

/* loaded from: classes15.dex */
public class v2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.b0 f450316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f450317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww1.x2 f450318c;

    public v2(ww1.x2 x2Var, ww1.b0 b0Var, int i17) {
        this.f450318c = x2Var;
        this.f450316a = b0Var;
        this.f450317b = i17;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        ww1.x2 x2Var = this.f450318c;
        x2Var.f450346e.f450122a0.setVisibility(8);
        ww1.b0 b0Var = this.f450316a;
        java.lang.String str = b0Var.f450196e;
        int i17 = 0;
        while (true) {
            if (i17 >= ((java.util.LinkedList) x2Var.f450345d.f450113w).size()) {
                break;
            }
            if (((ww1.b0) ((java.util.LinkedList) x2Var.f450345d.f450113w).get(i17)).f450196e.equals(b0Var.f450196e)) {
                ((ww1.b0) ((java.util.LinkedList) x2Var.f450345d.f450113w).get(i17)).f450117s = true;
                java.lang.String str2 = b0Var.f450196e;
                break;
            }
            i17++;
        }
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = x2Var.f450348g;
        int i18 = this.f450317b;
        walletCollectQrCodeUI.y7(i18);
        x2Var.f450342a = false;
        x2Var.a(i18);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
