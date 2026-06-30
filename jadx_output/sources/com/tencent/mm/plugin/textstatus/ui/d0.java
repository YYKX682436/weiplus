package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.e0 f173800d;

    public d0(com.tencent.mm.plugin.textstatus.ui.e0 e0Var) {
        this.f173800d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MMCardDialog$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.j2 j2Var = (com.tencent.mm.plugin.textstatus.ui.j2) this.f173800d;
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissBySpace: ");
        j2Var.dismiss();
        bi4.n0 f17 = j2Var.f();
        if (f17 != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) f17).S5(101L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MMCardDialog$initUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
