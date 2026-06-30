package gt4;

/* loaded from: classes14.dex */
public final class m0 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f275469a;

    public m0(gt4.s0 s0Var) {
        this.f275469a = s0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public final void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletComplexDatePicker", "innerResultListener: " + i17 + ' ' + i18 + ' ' + i19);
            gt4.s0 s0Var = this.f275469a;
            s0Var.N = (i17 * 100) + i18;
            s0Var.n();
        }
    }
}
