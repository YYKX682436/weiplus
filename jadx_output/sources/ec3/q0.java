package ec3;

/* loaded from: classes.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f251081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f251082f;

    public q0(ec3.g1 g1Var, int i17, int i18) {
        this.f251080d = g1Var;
        this.f251081e = i17;
        this.f251082f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        ec3.g1 g1Var = this.f251080d;
        android.view.View findViewById = g1Var.findViewById(com.tencent.mm.R.id.ueg);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$onKeyboardHeightChanged$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyNewPrepareUIRecommendUIC$onKeyboardHeightChanged$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = g1Var.findViewById(com.tencent.mm.R.id.ueg);
        if (findViewById2 != null && (layoutParams = findViewById2.getLayoutParams()) != null) {
            layoutParams.height = this.f251081e;
        }
        android.view.View findViewById3 = g1Var.findViewById(com.tencent.mm.R.id.ueg);
        if (findViewById3 != null) {
            findViewById3.postDelayed(new ec3.p0(g1Var, this.f251082f), 50L);
        }
    }
}
