package ft4;

/* loaded from: classes14.dex */
public final class x0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f266726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft4.y0 f266727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.recyclerview.widget.k3 k3Var, ft4.y0 y0Var) {
        super(false);
        this.f266726d = k3Var;
        this.f266727e = y0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        androidx.recyclerview.widget.k3 k3Var = this.f266726d;
        int adapterPosition = ((ft4.v0) k3Var).getAdapterPosition() - 2;
        ft4.y0 y0Var = this.f266727e;
        if (adapterPosition >= y0Var.f266730e.size() || ((ft4.v0) k3Var).getAdapterPosition() - 2 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerPersonDetailAdapter", "adapterPosition:" + ((ft4.v0) k3Var).getAdapterPosition() + "-2 is >=  " + y0Var.f266730e.size() + " || < 0");
            return;
        }
        dt4.u itemData = (dt4.u) y0Var.f266730e.get(((ft4.v0) k3Var).getAdapterPosition() - 2);
        ft4.s0 s0Var = y0Var.f266741s;
        if (s0Var != null) {
            int adapterPosition2 = ((ft4.v0) k3Var).getAdapterPosition() - 2;
            kotlin.jvm.internal.o.g(itemData, "itemData");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLedgerPersonDetailUI", "ClickItem index:" + adapterPosition2 + " msgId:" + itemData.f243297f);
            dt4.h hVar = dt4.p.f243266f;
            com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerPersonDetailUI walletLedgerPersonDetailUI = ((ft4.f1) s0Var).f266612a;
            androidx.appcompat.app.AppCompatActivity context = walletLedgerPersonDetailUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            hVar.b(context, walletLedgerPersonDetailUI.f180448d, itemData);
        }
    }
}
