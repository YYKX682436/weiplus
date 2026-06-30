package xb3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI f452898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        super(false);
        this.f452898d = luckyMoneyHKReceiveUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        this.f452898d.finish();
    }
}
