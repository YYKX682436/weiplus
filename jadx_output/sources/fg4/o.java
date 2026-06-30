package fg4;

/* loaded from: classes8.dex */
public class o implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI f262484d;

    public o(com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI serviceAppUI) {
        this.f262484d = serviceAppUI;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI serviceAppUI = this.f262484d;
        com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference = serviceAppUI.f172409f;
        if (servicePreference == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceAppUI", "biz onItemClick bizServicePref null");
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.m mVar = (i17 < 0 || i17 >= servicePreference.M.getCount()) ? null : (com.tencent.mm.pluginsdk.model.app.m) servicePreference.M.getItem(i17);
        if (mVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ServiceAppUI", "biz onItemClick app is null");
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ServiceAppUI", "onItemClick, jumpType[%d], package[%s], appid[%s]", java.lang.Integer.valueOf(mVar.f238391x1), mVar.field_packageName, mVar.field_appId);
            com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI.V6(serviceAppUI, mVar);
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }
}
