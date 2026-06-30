package vw3;

/* loaded from: classes.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f441108d;

    public s4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f441108d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f441108d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String obj = ((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.imw)).getText().toString();
            java.lang.String obj2 = ((com.tencent.mm.ui.widget.MMEditText) repairerResetConfigUI.findViewById(com.tencent.mm.R.id.imz)).getText().toString();
            com.tencent.mm.storage.u3 valueOf = com.tencent.mm.storage.u3.valueOf(obj);
            java.lang.String[] strArr = (java.lang.String[]) new r26.t("_").g(obj, 0).toArray(new java.lang.String[0]);
            java.lang.String str = strArr[strArr.length - 1];
            if (kotlin.jvm.internal.o.b(str, "SYNC")) {
                str = strArr[strArr.length - 2];
            }
            switch (str.hashCode()) {
                case -1838656495:
                    if (str.equals("STRING")) {
                        gm0.j1.u().c().x(valueOf, obj2);
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 72655:
                    if (str.equals("INT")) {
                        gm0.j1.u().c().x(valueOf, java.lang.Integer.valueOf(java.lang.Integer.parseInt(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 2342524:
                    if (str.equals("LONG")) {
                        gm0.j1.u().c().x(valueOf, java.lang.Long.valueOf(java.lang.Long.parseLong(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 66988604:
                    if (str.equals("FLOAT")) {
                        gm0.j1.u().c().x(valueOf, java.lang.Float.valueOf(java.lang.Float.parseFloat(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 782694408:
                    if (str.equals("BOOLEAN")) {
                        gm0.j1.u().c().x(valueOf, java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 2022338513:
                    if (str.equals("DOUBLE")) {
                        gm0.j1.u().c().x(valueOf, java.lang.Double.valueOf(java.lang.Double.parseDouble(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                default:
                    throw new java.lang.RuntimeException();
            }
            pm0.v.K(null, vw3.r4.f441097d);
            db5.t7.makeText(repairerResetConfigUI.getContext(), repairerResetConfigUI.getString(com.tencent.mm.R.string.f490480w9), 0).show();
        } catch (java.lang.Exception unused) {
            db5.t7.makeText(repairerResetConfigUI.getContext(), repairerResetConfigUI.getString(com.tencent.mm.R.string.f490479w8), 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
