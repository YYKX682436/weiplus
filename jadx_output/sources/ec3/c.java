package ec3;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.l f250990d;

    public c(ec3.l lVar) {
        this.f250990d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = 12;
        objArr[1] = 0;
        ec3.l lVar = this.f250990d;
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        objArr[2] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.T1 : null;
        androidx.appcompat.app.AppCompatActivity activity2 = lVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        objArr[3] = luckyMoneyNewPrepareUI2 != null ? luckyMoneyNewPrepareUI2.s7() : null;
        objArr[4] = lVar.f251047e;
        objArr[5] = "";
        androidx.appcompat.app.AppCompatActivity activity3 = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        objArr[6] = ((ec3.g1) pf5.z.f353948a.a(activity3).a(ec3.g1.class)).Z6();
        objArr[7] = 0;
        objArr[8] = "";
        objArr[9] = 0;
        objArr[10] = "";
        objArr[11] = 0;
        g0Var.d(18890, objArr);
    }
}
