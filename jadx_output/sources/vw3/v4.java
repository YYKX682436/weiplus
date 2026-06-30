package vw3;

/* loaded from: classes.dex */
public final class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f441159d;

    public v4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f441159d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f441159d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String obj = ((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.jmf)).getText().toString();
            java.lang.String obj2 = ((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.jmh)).getText().toString();
            int parseInt = java.lang.Integer.parseInt(((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.jmi)).getText().toString());
            if (parseInt == 1) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt(obj, java.lang.Integer.parseInt(obj2));
            } else if (parseInt == 2) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putLong(obj, java.lang.Long.parseLong(obj2));
            } else if (parseInt == 3) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putString(obj, obj2);
            } else if (parseInt == 4) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean(obj, java.lang.Boolean.parseBoolean(obj2));
            } else if (parseInt == 5) {
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putFloat(obj, java.lang.Float.parseFloat(obj2));
            }
            db5.t7.makeText(repairerResetConfigUI.getContext(), repairerResetConfigUI.getString(com.tencent.mm.R.string.f490480w9), 0).show();
        } catch (java.lang.Exception unused) {
            db5.t7.makeText(repairerResetConfigUI.getContext(), repairerResetConfigUI.getString(com.tencent.mm.R.string.f490479w8), 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
