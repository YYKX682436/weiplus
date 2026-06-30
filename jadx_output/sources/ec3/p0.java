package ec3;

/* loaded from: classes.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f251077e;

    public p0(ec3.g1 g1Var, int i17) {
        this.f251076d = g1Var;
        this.f251077e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView;
        androidx.appcompat.app.AppCompatActivity activity = this.f251076d.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        if (luckyMoneyNewPrepareUI == null || (mMScrollView = luckyMoneyNewPrepareUI.f146285x) == null) {
            return;
        }
        mMScrollView.smoothScrollBy(0, this.f251077e);
    }
}
