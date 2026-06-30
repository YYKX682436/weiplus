package vw3;

/* loaded from: classes.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMMKVSetUI f441049d;

    public o2(com.tencent.mm.plugin.repairer.ui.RepairerMMKVSetUI repairerMMKVSetUI) {
        this.f441049d = repairerMMKVSetUI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.text.Editable text;
        android.text.Editable text2;
        java.lang.String obj;
        android.text.Editable text3;
        android.text.Editable text4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerMMKVSetUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerMMKVSetUI repairerMMKVSetUI = this.f441049d;
        android.widget.EditText editText = (android.widget.EditText) repairerMMKVSetUI.findViewById(com.tencent.mm.R.id.jmk);
        java.lang.String str4 = "";
        if (editText == null || (text4 = editText.getText()) == null || (str = text4.toString()) == null) {
            str = "";
        }
        android.widget.EditText editText2 = (android.widget.EditText) repairerMMKVSetUI.findViewById(com.tencent.mm.R.id.jmj);
        if (editText2 == null || (text3 = editText2.getText()) == null || (str2 = text3.toString()) == null) {
            str2 = "";
        }
        android.widget.EditText editText3 = (android.widget.EditText) repairerMMKVSetUI.findViewById(com.tencent.mm.R.id.jmm);
        if (editText3 != null && (text2 = editText3.getText()) != null && (obj = text2.toString()) != null) {
            str4 = obj;
        }
        android.widget.EditText editText4 = (android.widget.EditText) repairerMMKVSetUI.findViewById(com.tencent.mm.R.id.jml);
        if (editText4 == null || (text = editText4.getText()) == null || (str3 = text.toString()) == null) {
            str3 = "String";
        }
        com.tencent.mars.xlog.Log.i(repairerMMKVSetUI.d, "name=" + str + " key=" + str2 + " value=" + str4 + ' ');
        android.widget.Toast.makeText(repairerMMKVSetUI.getContext(), "name=" + str + " key=" + str2 + " value=" + str4 + ' ', 0).show();
        switch (str3.hashCode()) {
            case -1808118735:
                if (str3.equals("String")) {
                    com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                    break;
                }
                com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                break;
            case 73679:
                if (str3.equals("Int")) {
                    com.tencent.mm.sdk.platformtools.o4.M(str).putInt(str2, java.lang.Integer.parseInt(str4));
                    break;
                }
                com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                break;
            case 2374300:
                if (str3.equals("Long")) {
                    com.tencent.mm.sdk.platformtools.o4.M(str).putLong(str2, java.lang.Long.parseLong(str4));
                    break;
                }
                com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                break;
            case 67973692:
                if (str3.equals("Float")) {
                    com.tencent.mm.sdk.platformtools.o4.M(str).putFloat(str2, java.lang.Float.parseFloat(str4));
                    break;
                }
                com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                break;
            case 1729365000:
                if (str3.equals("Boolean")) {
                    com.tencent.mm.sdk.platformtools.o4.M(str).putBoolean(str2, java.lang.Boolean.parseBoolean(str4));
                    break;
                }
                com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                break;
            default:
                com.tencent.mm.sdk.platformtools.o4.M(str).putString(str2, str4);
                break;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerMMKVSetUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
