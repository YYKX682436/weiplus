package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j34.i f162277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVInfoUI f162278e;

    public h1(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI, j34.i iVar) {
        this.f162278e = tVInfoUI;
        this.f162277d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/TVInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        j34.i iVar = this.f162277d;
        g0Var.d(10987, 2, iVar.field_playstatid, "", "");
        com.tencent.mm.plugin.shake.ui.TVInfoUI.V6(this.f162278e, iVar.field_playurl);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/TVInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
