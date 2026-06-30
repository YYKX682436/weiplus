package vw3;

/* loaded from: classes.dex */
public final class t4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f441118d;

    public t4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f441118d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f441118d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().g(((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.d5c)).getText().toString(), ((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.d5f)).getText().toString());
            db5.t7.makeText(repairerResetConfigUI.getContext(), repairerResetConfigUI.getString(com.tencent.mm.R.string.f490480w9), 0).show();
        } catch (java.lang.Exception unused) {
            db5.t7.makeText(repairerResetConfigUI.getContext(), repairerResetConfigUI.getString(com.tencent.mm.R.string.f490479w8), 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
