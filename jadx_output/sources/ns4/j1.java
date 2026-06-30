package ns4;

/* loaded from: classes.dex */
public final class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f339554d;

    public j1(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f339554d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$showTaxCutConfirmHalfPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "click close");
        this.f339554d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$showTaxCutConfirmHalfPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
