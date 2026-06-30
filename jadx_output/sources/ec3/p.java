package ec3;

/* loaded from: classes.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f251074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251075e;

    public p(boolean z17, ec3.g1 g1Var) {
        this.f251074d = z17;
        this.f251075e = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView;
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView2;
        boolean z17 = this.f251074d;
        ec3.g1 g1Var = this.f251075e;
        if (!z17) {
            android.view.View findViewById = g1Var.findViewById(com.tencent.mm.R.id.ueg);
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        if (luckyMoneyNewPrepareUI != null && (mMScrollView2 = luckyMoneyNewPrepareUI.f146285x) != null) {
            mMScrollView2.scrollTo(0, 0);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI2 = activity2 instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity2 : null;
        if (luckyMoneyNewPrepareUI2 == null || (mMScrollView = luckyMoneyNewPrepareUI2.f146285x) == null) {
            return;
        }
        mMScrollView.postDelayed(new ec3.o(g1Var), 150L);
    }
}
