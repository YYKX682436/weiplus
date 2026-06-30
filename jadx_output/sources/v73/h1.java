package v73;

/* loaded from: classes9.dex */
public class h1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI f433696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI) {
        super(false);
        this.f433696d = honeyPayReceiveCardUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI = this.f433696d;
        int visibility = honeyPayReceiveCardUI.f142376t.getVisibility();
        java.lang.String str = honeyPayReceiveCardUI.f142260d;
        if (visibility != 0) {
            com.tencent.mars.xlog.Log.i(str, "do get honey pay card");
            r73.e eVar = new r73.e(honeyPayReceiveCardUI.f142382z);
            eVar.K(honeyPayReceiveCardUI);
            honeyPayReceiveCardUI.doSceneProgress(eVar, true);
            return;
        }
        if (honeyPayReceiveCardUI.f142377u.isChecked()) {
            com.tencent.mars.xlog.Log.i(str, "do get honey pay card");
            r73.e eVar2 = new r73.e(honeyPayReceiveCardUI.f142382z);
            eVar2.K(honeyPayReceiveCardUI);
            honeyPayReceiveCardUI.doSceneProgress(eVar2, true);
            return;
        }
        int dimensionPixelOffset = honeyPayReceiveCardUI.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(honeyPayReceiveCardUI.f142376t, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        honeyPayReceiveCardUI.f142369m.announceForAccessibility(honeyPayReceiveCardUI.getString(com.tencent.mm.R.string.fws, honeyPayReceiveCardUI.A));
    }
}
