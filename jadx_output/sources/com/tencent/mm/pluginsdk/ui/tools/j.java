package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f191720d;

    public j(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f191720d = appChooserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f191720d;
        appChooserUI.f191338m.q();
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).Ai(5, appChooserUI.f191352z, "", appChooserUI.G);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
