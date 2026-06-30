package zw1;

/* loaded from: classes9.dex */
public class l0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.t1 f476701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectHKMainUI f476702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.collect.ui.CollectHKMainUI collectHKMainUI, ww1.t1 t1Var) {
        super(false);
        this.f476702e = collectHKMainUI;
        this.f476701d = t1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f476702e.getContext(), this.f476701d.f450294r, false);
    }
}
