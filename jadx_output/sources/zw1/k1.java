package zw1;

/* loaded from: classes15.dex */
public class k1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f476686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, java.util.List list) {
        super(false);
        this.f476687e = collectMainUI;
        this.f476686d = list;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476687e;
        collectMainUI.O1 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) collectMainUI.getContext(), 1, false);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = collectMainUI.O1;
        k0Var.f211872n = new zw1.i1(this);
        k0Var.f211881s = new zw1.j1(this);
        k0Var.v();
    }
}
