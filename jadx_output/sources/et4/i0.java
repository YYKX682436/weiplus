package et4;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et4.j0 f256633d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(et4.j0 j0Var) {
        super(false);
        this.f256633d = j0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFetchFavorDialog", "click back");
        this.f256633d.cancel();
    }
}
