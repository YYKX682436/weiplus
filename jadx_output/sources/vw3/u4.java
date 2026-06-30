package vw3;

/* loaded from: classes.dex */
public final class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f441144d;

    public u4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f441144d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f441144d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.d5c)).getText().toString());
            ((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.d5f)).setText(d17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                db5.t7.makeText(repairerResetConfigUI.getContext(), "Config is Empty", 0).show();
            }
        } catch (java.lang.Exception unused) {
            db5.t7.makeText(repairerResetConfigUI.getContext(), "Error", 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
