package ns4;

/* loaded from: classes8.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339438d;

    public b1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339438d = weCoinEncashView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339438d;
        ms4.n nVar = weCoinEncashView.f179154i;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        r45.ma7 ma7Var = (r45.ma7) nVar.f331081u.getValue();
        if (ma7Var != null && (str = ma7Var.f380317f) != null) {
            com.tencent.mm.wallet_core.ui.r1.W(weCoinEncashView, str, false, 1001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
