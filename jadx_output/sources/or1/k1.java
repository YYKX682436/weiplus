package or1;

/* loaded from: classes9.dex */
public class k1 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI f347523d;

    public k1(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI) {
        this.f347523d = enterpriseBizEntranceListUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "onItemClick position = %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = this.f347523d;
        or1.v1 v1Var = (or1.v1) enterpriseBizEntranceListUI.f94029d.f347572e.get(i17);
        if (v1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.EnterpriseBizEntranceListUI", "item is null.");
        } else {
            enterpriseBizEntranceListUI.f94034i.a(v1Var.f347589a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
