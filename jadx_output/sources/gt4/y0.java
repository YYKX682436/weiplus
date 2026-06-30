package gt4;

/* loaded from: classes14.dex */
public final class y0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.a1 f275576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(gt4.a1 a1Var) {
        super(false);
        this.f275576d = a1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        gt4.w0 w0Var = this.f275576d.f275395p;
        if (w0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", "onClickSelectMonth");
            gt4.s0.d(((gt4.p0) w0Var).f275495a);
        }
    }
}
