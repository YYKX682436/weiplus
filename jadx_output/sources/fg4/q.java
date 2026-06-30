package fg4;

/* loaded from: classes8.dex */
public class q implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference f262489d;

    public q(com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference) {
        this.f262489d = servicePreference;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.AdapterView.OnItemClickListener onItemClickListener;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference = this.f262489d;
        if (servicePreference.M.a(i17)) {
            fg4.l lVar = servicePreference.M;
            lVar.f262480e = false;
            lVar.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (!servicePreference.M.f262480e && (onItemClickListener = servicePreference.P) != null) {
            onItemClickListener.onItemClick(adapterView, view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServicePreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
