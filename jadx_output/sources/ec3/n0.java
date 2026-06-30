package ec3;

/* loaded from: classes9.dex */
public final class n0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f251064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251065f;

    public n0(java.lang.String str, boolean z17, ec3.g1 g1Var) {
        this.f251063d = str;
        this.f251064e = z17;
        this.f251065f = g1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doGetCgiTimer] inputText: " + this.f251063d + "，interruptRecommend : " + this.f251064e);
        if (!this.f251064e) {
            ec3.g1 g1Var = this.f251065f;
            java.lang.String str = this.f251063d;
            g1Var.getClass();
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] inputContent is null");
                ((ku5.t0) ku5.t0.f312615d).B(new ec3.t(g1Var));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[doRecommendCgi] start: " + str);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[12];
                objArr[0] = 13;
                objArr[1] = 0;
                objArr[2] = g1Var.f251026w;
                androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
                objArr[3] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.s7() : null;
                objArr[4] = "";
                objArr[5] = "";
                objArr[6] = str;
                objArr[7] = java.lang.Integer.valueOf(g1Var.f251011e.size());
                objArr[8] = g1Var.f251027x;
                objArr[9] = 0;
                objArr[10] = "";
                objArr[11] = 0;
                g0Var.d(18890, objArr);
                pq5.g l17 = new ec3.a(str, g1Var.f251026w, 0).l();
                androidx.appcompat.app.AppCompatActivity activity2 = g1Var.getActivity();
                l17.f(activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null);
                l17.K(new ec3.y(g1Var, str));
            }
        }
        return true;
    }
}
