package fg4;

/* loaded from: classes8.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AppPreference f262474d;

    public g(com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference) {
        this.f262474d = appPreference;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference = this.f262474d;
        if (appPreference.M.c(i17)) {
            fg4.e eVar = appPreference.M;
            eVar.f262471e = false;
            eVar.notifyDataSetChanged();
            yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (appPreference.M.f262471e) {
            android.widget.AdapterView.OnItemClickListener onItemClickListener = appPreference.P;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i17, j17);
            }
        } else {
            android.widget.AdapterView.OnItemClickListener onItemClickListener2 = appPreference.N;
            if (onItemClickListener2 != null) {
                onItemClickListener2.onItemClick(adapterView, view, i17, j17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AppPreference$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
