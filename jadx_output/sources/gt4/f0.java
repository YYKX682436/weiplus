package gt4;

/* loaded from: classes14.dex */
public final class f0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275431d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gt4.s0 s0Var) {
        super(false);
        this.f275431d = s0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", "onClickSelectMonth on headerLayout");
        gt4.s0.d(this.f275431d);
    }
}
