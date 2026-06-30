package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class m implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191768d;

    public m(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191768d = appChooserUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.pluginsdk.ui.otherway.x xVar;
        android.content.pm.ResolveInfo resolveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191768d;
        com.tencent.mm.pluginsdk.ui.tools.a0 a0Var = appChooserUI.f191333e;
        if (a0Var != null) {
            appChooserUI.A = a0Var.getItem(i17);
            appChooserUI.f191333e.notifyDataSetChanged();
            com.tencent.mm.pluginsdk.ui.tools.d0 d0Var = appChooserUI.P;
            if (d0Var != null && d0Var.f191551b.isShowing()) {
                com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = appChooserUI.A;
                if (xVar2 == null || !xVar2.f191032h || (xVar2.f191035n && (xVar2.f191033i || appChooserUI.H >= appChooserUI.I))) {
                    appChooserUI.P.a(true);
                } else {
                    appChooserUI.P.a(false);
                }
            }
            if ((appChooserUI.f191351y == 6 || appChooserUI.f191346t == 2) && (xVar = appChooserUI.A) != null && (resolveInfo = xVar.f191028d) != null) {
                appChooserUI.X6(-1, resolveInfo.activityInfo.packageName, false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, appChooserUI.A.f191028d.activityInfo.packageName);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
