package v73;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI f433705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI honeyPayCardManagerUI) {
        super(false);
        this.f433705d = honeyPayCardManagerUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f433705d.finish();
    }
}
