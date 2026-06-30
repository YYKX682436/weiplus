package v73;

/* loaded from: classes9.dex */
public class x0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI f433752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI honeyPayModifyQuotaUI) {
        super(false);
        this.f433752d = honeyPayModifyQuotaUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI honeyPayModifyQuotaUI = this.f433752d;
        if (com.tencent.mm.plugin.honey_pay.ui.HoneyPayModifyQuotaUI.V6(honeyPayModifyQuotaUI)) {
            long j07 = com.tencent.mm.wallet_core.ui.r1.j0(honeyPayModifyQuotaUI.f142348f.getText(), "100");
            com.tencent.mars.xlog.Log.i(honeyPayModifyQuotaUI.f142260d, "modify credit line token sign");
            honeyPayModifyQuotaUI.showSafeProgress();
            r73.g gVar = new r73.g(honeyPayModifyQuotaUI.f142355p, j07, honeyPayModifyQuotaUI.f142356q);
            gVar.K(honeyPayModifyQuotaUI);
            honeyPayModifyQuotaUI.doSceneProgress(gVar, true);
            honeyPayModifyQuotaUI.hideTenpayKB();
        }
    }
}
