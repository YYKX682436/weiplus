package vw3;

/* loaded from: classes.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f441083d;

    public q4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f441083d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f441083d;
        java.lang.String obj = ((android.widget.EditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.imw)).getText().toString();
        android.widget.EditText editText = (android.widget.EditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.imz);
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.valueOf(obj), null);
            if (m17 != null) {
                editText.setText(m17.toString());
            }
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
