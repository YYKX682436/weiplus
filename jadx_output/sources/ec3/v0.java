package ec3;

/* loaded from: classes9.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251095d;

    public v0(ec3.g1 g1Var) {
        this.f251095d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = 18;
        objArr[1] = 0;
        ec3.g1 g1Var = this.f251095d;
        objArr[2] = g1Var.f251026w;
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        objArr[3] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.s7() : null;
        objArr[4] = "";
        objArr[5] = "";
        objArr[6] = g1Var.Z6();
        objArr[7] = java.lang.Integer.valueOf(g1Var.f251011e.size());
        objArr[8] = g1Var.f251027x;
        objArr[9] = 0;
        objArr[10] = g1Var.f251025v;
        objArr[11] = java.lang.Integer.valueOf(g1Var.C);
        g0Var.d(18890, objArr);
        db5.t7.m(g1Var.getActivity(), g1Var.getActivity().getResources().getString(com.tencent.mm.R.string.lha));
    }
}
