package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class g implements com.tencent.mm.plugin.ipcall.ui.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142830a;

    public g(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142830a = oVar;
    }

    @Override // com.tencent.mm.plugin.ipcall.ui.b
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142830a;
        oVar.f142961m = oVar.f142951c.getText().toString();
        if (oVar.f142966r) {
            oVar.f142960l += ((java.lang.Object) str);
            oVar.f142950b.setText(oVar.f142960l);
            if (t83.c.l(oVar.f142960l.replace("+", "")) || oVar.f142960l.replace("+", "").length() >= 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12061, 0, 0, 0, 0, 1, 0);
                oVar.f142966r = false;
                oVar.f142959k = t83.c.f(oVar.f142960l.replace("+", ""));
                oVar.f142961m = oVar.a(oVar.f142960l.replace("+", ""), oVar.f142961m);
                oVar.e(oVar.f142961m, -1);
                return;
            }
            return;
        }
        java.lang.String replace = oVar.f142950b.getText().toString().replace("+", "");
        if (oVar.f142969u) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(oVar.f142961m);
            stringBuffer.insert(oVar.f142951c.getSelectionStart(), str);
            oVar.f142961m = stringBuffer.toString();
        } else {
            oVar.f142961m += ((java.lang.Object) str);
        }
        if (oVar.f142961m.equals("00")) {
            oVar.f142950b.setText("+");
            oVar.f142966r = true;
            oVar.f142960l = "+";
            oVar.f142961m = "";
        }
        if (t83.c.l(oVar.f142960l.replace("+", "") + oVar.f142961m)) {
            oVar.f142950b.setText("+" + oVar.f142960l.replace("+", "") + oVar.f142961m);
            oVar.f142959k = t83.c.f(oVar.f142960l.replace("+", ""));
            oVar.f142966r = false;
            oVar.f142960l = oVar.f142960l.replace("+", "") + oVar.f142961m;
            oVar.f142961m = "";
        }
        java.lang.String str2 = oVar.f142961m;
        oVar.f142961m = oVar.a(replace, str2);
        if (!oVar.f142969u) {
            oVar.e(oVar.f142961m, -1);
        } else if (str2.length() < oVar.f142961m.length()) {
            oVar.e(oVar.f142961m, oVar.f142951c.getSelectionEnd() + 2);
        } else if (str2.length() == oVar.f142961m.length()) {
            oVar.e(oVar.f142961m, oVar.f142951c.getSelectionEnd() + 1);
        } else if (str2.length() > oVar.f142961m.length()) {
            oVar.e(oVar.f142961m, (oVar.f142951c.getSelectionEnd() + 1) - (str2.length() - oVar.f142961m.length()));
        }
        oVar.f142965q = java.lang.System.currentTimeMillis();
        if (oVar.f142961m.length() > 3) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.f142960l + oVar.f142961m)) {
                return;
            }
            oVar.b();
        }
    }

    @Override // com.tencent.mm.plugin.ipcall.ui.b
    public void b(java.lang.String str) {
        if (str.equals("0")) {
            com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142830a;
            oVar.f142950b.setText("+");
            oVar.f142966r = true;
            oVar.f142960l = "+";
        }
    }
}
