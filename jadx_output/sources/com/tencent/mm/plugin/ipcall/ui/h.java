package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142841d;

    public h(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142841d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String substring;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142841d;
        java.lang.String obj = oVar.f142951c.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            java.lang.String charSequence = oVar.f142950b.getText().toString();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                java.lang.String substring2 = charSequence.substring(0, charSequence.length() - 1);
                if (com.tencent.mm.sdk.platformtools.t8.K0(substring2) || substring2.equals("+")) {
                    oVar.f142950b.setText("+");
                    oVar.f142960l = "+";
                    oVar.f142966r = true;
                } else {
                    oVar.f142950b.setText(substring2);
                    oVar.f142960l = substring2;
                }
            }
        } else {
            int selectionStart = oVar.f142951c.getSelectionStart();
            if (!oVar.f142969u || selectionStart - 1 < 0) {
                substring = obj.substring(0, obj.length() - 1);
            } else {
                android.text.Editable text = oVar.f142951c.getText();
                text.delete(i17, selectionStart);
                substring = text.toString();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(substring)) {
                oVar.f142961m = "";
                oVar.e("", -1);
            } else {
                java.lang.String replace = oVar.f142950b.getText().toString().replace("+", "");
                if (oVar.f142969u) {
                    oVar.f142961m = oVar.a(replace, substring);
                    oVar.e(oVar.f142961m, (selectionStart - 1) + (oVar.f142961m.length() - substring.length()));
                } else {
                    oVar.f142961m = oVar.a(replace, substring);
                    oVar.e(oVar.f142961m, -1);
                }
                oVar.b();
            }
            oVar.f142962n = "";
            oVar.f142953e.setText("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
