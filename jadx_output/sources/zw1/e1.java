package zw1;

/* loaded from: classes15.dex */
public class e1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        super(false);
        this.f476616d = collectMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476616d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(collectMainUI.f96417z1)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.sdk.platformtools.x2.f193071a, collectMainUI.f96417z1, true);
    }
}
