package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175447d;

    public n0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175447d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.transvoice.ui.v0 v0Var = this.f175447d;
        v0Var.f175480g = currentTimeMillis;
        com.tencent.mm.plugin.transvoice.ui.e eVar = v0Var.f175478J;
        if (eVar != null) {
            eVar.f175422i = v0Var.f175495x;
        }
        if (eVar != null) {
            eVar.D();
        }
        com.tencent.mm.plugin.transvoice.ui.e eVar2 = v0Var.f175478J;
        if (eVar2 != null) {
            eVar2.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
