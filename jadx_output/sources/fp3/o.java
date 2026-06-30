package fp3;

/* loaded from: classes9.dex */
public class o implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.order.ui.MallOrderRecordListUI f265324d;

    public o(com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI) {
        this.f265324d = mallOrderRecordListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        dp3.o oVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.order.ui.MallOrderRecordListUI mallOrderRecordListUI = this.f265324d;
        if (i17 < ((java.util.ArrayList) mallOrderRecordListUI.f152855g).size() && (oVar = (dp3.o) ((java.util.ArrayList) mallOrderRecordListUI.f152855g).get(i17)) != null) {
            android.os.Bundle input = mallOrderRecordListUI.getInput();
            input.putString("key_trans_id", oVar.f242224d);
            input.putInt("key_pay_type", oVar.f242232o);
            input.putString("bill_id", oVar.A);
            com.tencent.mm.wallet_core.a.d(mallOrderRecordListUI, input);
        }
        com.tencent.mm.wallet_core.ui.r1.q0(26, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
