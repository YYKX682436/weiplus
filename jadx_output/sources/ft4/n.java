package ft4;

/* loaded from: classes14.dex */
public final class n extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft4.o f266655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f266656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ft4.o oVar, androidx.recyclerview.widget.k3 k3Var, int i17) {
        super(false);
        this.f266655d = oVar;
        this.f266656e = k3Var;
        this.f266657f = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ft4.o oVar = this.f266655d;
        int size = oVar.f266663d.size();
        androidx.recyclerview.widget.k3 k3Var = this.f266656e;
        if (size <= ((ft4.m) k3Var).getAdapterPosition()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLedgerDayCellAdapter", "onRealClick data.size:" + oVar.f266663d.size() + " is small than " + this.f266657f);
            return;
        }
        dt4.u uVar = (dt4.u) oVar.f266663d.get(((ft4.m) k3Var).getAdapterPosition());
        ft4.l lVar = oVar.f266665f;
        if (lVar != null) {
            lVar.a(uVar);
        }
    }
}
