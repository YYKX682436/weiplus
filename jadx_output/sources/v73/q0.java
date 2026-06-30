package v73;

/* loaded from: classes9.dex */
public class q0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI) {
        super(false);
        this.f433733d = honeyPayMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI = this.f433733d;
        com.tencent.mars.xlog.Log.i(honeyPayMainUI.f142260d, "click empty header add friend");
        if (honeyPayMainUI.f142342p.getVisibility() != 0) {
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.V6(honeyPayMainUI);
            return;
        }
        if (honeyPayMainUI.f142343q.isChecked()) {
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.V6(honeyPayMainUI);
            return;
        }
        int dimensionPixelOffset = honeyPayMainUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(honeyPayMainUI.f142342p, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        honeyPayMainUI.f142338i.announceForAccessibility(honeyPayMainUI.getString(com.tencent.mm.R.string.fws, honeyPayMainUI.f142345s));
    }
}
