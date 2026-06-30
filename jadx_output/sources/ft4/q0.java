package ft4;

/* loaded from: classes14.dex */
public final class q0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f266676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.r0 f266677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.recyclerview.widget.k3 k3Var, ft4.r0 r0Var) {
        super(false);
        this.f266676d = k3Var;
        this.f266677e = r0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        androidx.recyclerview.widget.k3 k3Var = this.f266676d;
        int adapterPosition = ((ft4.o0) k3Var).getAdapterPosition() - 2;
        ft4.r0 r0Var = this.f266677e;
        if (adapterPosition >= r0Var.f266680e.size() || ((ft4.o0) k3Var).getAdapterPosition() - 2 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerPersonAdapter", "adapterPosition:" + ((ft4.o0) k3Var).getAdapterPosition() + "-2 is >=  " + r0Var.f266680e.size() + " || < 0");
            return;
        }
        dt4.u itemData = (dt4.u) r0Var.f266680e.get(((ft4.o0) k3Var).getAdapterPosition() - 2);
        ft4.l0 l0Var = r0Var.f266689q;
        if (l0Var != null) {
            int adapterPosition2 = ((ft4.o0) k3Var).getAdapterPosition() - 2;
            kotlin.jvm.internal.o.g(itemData, "itemData");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonUI", "ClickItem index:" + adapterPosition2 + " msgId:" + itemData.f243297f);
            dt4.h hVar = dt4.p.f243266f;
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonUI walletLedgerPersonUI = ((ft4.j1) l0Var).f266635a;
            androidx.appcompat.app.AppCompatActivity context = walletLedgerPersonUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            hVar.b(context, walletLedgerPersonUI.f180468d, itemData);
        }
    }
}
