package zw1;

/* loaded from: classes15.dex */
public class n1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        super(false);
        this.f476735d = collectMainUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476735d;
        collectMainUI.f96395i.B();
        collectMainUI.f96395i = null;
    }
}
