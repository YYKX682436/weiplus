package ec3;

/* loaded from: classes.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251069d;

    public o(ec3.g1 g1Var) {
        this.f251069d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById = this.f251069d.findViewById(com.tencent.mm.R.id.ueg);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$doHidePlaceOrder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
