package fg4;

/* loaded from: classes8.dex */
public class b implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI f262467d;

    public b(com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI addAppUI) {
        this.f262467d = addAppUI;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI addAppUI = this.f262467d;
        com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI.V6(addAppUI, addAppUI.f172401e.M(i17).field_appId);
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
