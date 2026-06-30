package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191796d;

    public o(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191796d = appChooserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.content.pm.ResolveInfo resolveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191796d;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = appChooserUI.f191343q;
        gm0.j1.u().c().w(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI.U6(274528, appChooserUI.G, appChooserUI.f191346t), (xVar == appChooserUI.f191337i || (resolveInfo = xVar.f191028d) == null) ? "" : resolveInfo.activityInfo.packageName);
        com.tencent.mm.pluginsdk.ui.tools.f.h(appChooserUI.G, appChooserUI.f191346t);
        appChooserUI.f191344r = false;
        appChooserUI.f191338m.q();
        appChooserUI.f191334f.q();
        com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = appChooserUI.f191343q;
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).Ai(4, appChooserUI.f191352z, xVar2 == appChooserUI.f191337i ? appChooserUI.getString(com.tencent.mm.R.string.f490366sz) : xVar2.f191029e.toString(), appChooserUI.G);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
