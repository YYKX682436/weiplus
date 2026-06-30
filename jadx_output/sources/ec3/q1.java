package ec3;

/* loaded from: classes.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f251084e;

    public q1(android.view.View view, yz5.a aVar) {
        this.f251083d = view;
        this.f251084e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f251083d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil$doTranslateAnimation$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/recommend/LuckyMoneyRecommendUtil$doTranslateAnimation$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yz5.a aVar = this.f251084e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
