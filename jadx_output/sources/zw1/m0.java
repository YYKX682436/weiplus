package zw1;

/* loaded from: classes9.dex */
public class m0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.t1 f476719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectHKMainUI f476720e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.collect.ui.CollectHKMainUI collectHKMainUI, ww1.t1 t1Var) {
        super(false);
        this.f476720e = collectHKMainUI;
        this.f476719d = t1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ww1.t1 t1Var = this.f476719d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450297u)) {
            return;
        }
        com.tencent.mm.wallet_core.ui.r1.V(this.f476720e.getContext(), t1Var.f450297u, true);
    }
}
