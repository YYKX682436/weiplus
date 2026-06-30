package gt4;

/* loaded from: classes5.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.d2 f275408d;

    public c2(gt4.d2 d2Var) {
        this.f275408d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.d2 d2Var = this.f275408d;
        android.view.ViewGroup.LayoutParams layoutParams = d2Var.f275416e.f275426a.f180737i.getLayoutParams();
        layoutParams.height = d2Var.f275416e.f275426a.f180736h.getHeight();
        layoutParams.width = d2Var.f275416e.f275426a.f180736h.getWidth();
        d2Var.f275416e.f275426a.f180737i.setLayoutParams(layoutParams);
        android.view.View findViewById = d2Var.f275416e.f275426a.findViewById(com.tencent.mm.R.id.kks);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = d2Var.f275416e.f275426a.findViewById(com.tencent.mm.R.id.kkt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
