package fg4;

/* loaded from: classes8.dex */
public class c implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI f262468d;

    public c(com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI addAppUI) {
        this.f262468d = addAppUI;
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
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI addAppUI = this.f262468d;
        com.tencent.mm.pluginsdk.model.app.m M = addAppUI.f172401e.M(i17);
        addAppUI.getClass();
        M.field_status = 0;
        M.field_modifyTime = java.lang.System.currentTimeMillis();
        com.tencent.mm.pluginsdk.model.app.u5.Di().update(M, new java.lang.String[0]);
        addAppUI.initView();
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
