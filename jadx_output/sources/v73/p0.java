package v73;

/* loaded from: classes9.dex */
public class p0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI) {
        super(false);
        this.f433724d = honeyPayMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI = this.f433724d;
        java.lang.String str = honeyPayMainUI.f142260d;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.V6(honeyPayMainUI);
    }
}
