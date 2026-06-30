package fp3;

/* loaded from: classes9.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI f265306d;

    public g(com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f265306d = mallOrderDetailInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f265306d;
        if (mallOrderDetailInfoUI.f152844x != null && mallOrderDetailInfoUI.f152845y != null) {
            if (view.getId() == com.tencent.mm.R.id.kkm) {
                mallOrderDetailInfoUI.f152844x.setSelected(true);
                mallOrderDetailInfoUI.f152845y.setSelected(false);
                mallOrderDetailInfoUI.f152843w = 100;
            } else {
                mallOrderDetailInfoUI.f152844x.setSelected(false);
                mallOrderDetailInfoUI.f152845y.setSelected(true);
                mallOrderDetailInfoUI.f152843w = -100;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
