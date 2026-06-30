package tx2;

/* loaded from: classes3.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.g1 f422536d;

    public b1(tx2.g1 g1Var) {
        this.f422536d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        tx2.g1 g1Var = this.f422536d;
        j45.l.k(g1Var.getContext(), "wallet", ".wecoin.ui.WeCoinRechargeView", intent, true);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = g1Var.f422568e;
        if (y1Var != null) {
            y1Var.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/PayLiveSecondCheckWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
