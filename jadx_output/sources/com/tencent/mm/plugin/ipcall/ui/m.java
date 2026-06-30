package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class m implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142928d;

    public m(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142928d = oVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String charSequence2 = charSequence.toString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String trim = charSequence2.replaceAll("[\\.\\-]", "").trim();
        boolean contains = trim.contains(" ");
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142928d;
        if (contains) {
            trim = trim.replace(" ", "");
            oVar.f142951c.setText(com.tencent.mm.sdk.platformtools.t8.r(trim));
        } else if ((!oVar.f142970v.equals(trim) || i19 > 0) && com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            oVar.f142970v = trim;
            oVar.f142951c.setText("");
        }
        if (t83.c.m(trim)) {
            java.lang.String a17 = t83.c.a(trim);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                oVar.f142950b.setText("+" + a17);
                oVar.f142951c.setText(t83.c.b(trim));
            }
        } else if (!trim.equals(oVar.f142970v)) {
            oVar.f142970v = trim;
            oVar.f142951c.setText(trim);
            android.widget.TextView textView = oVar.f142950b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(textView.getText().toString())) {
                textView.setText("+" + t83.c.h());
            }
        }
        com.tencent.mm.plugin.ipcall.ui.n nVar = oVar.f142949a;
        if (nVar != null) {
            java.lang.String obj = oVar.f142951c.getText().toString();
            com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI = (com.tencent.mm.plugin.ipcall.ui.IPCallDialUI) nVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "onModifyPhoneNumberByUser:phoneNumber:%s,mPhoneNumber:%s", obj, iPCallDialUI.f142599q);
            int i27 = iPCallDialUI.f142605w;
            if (i27 == 2 || i27 == -1 || iPCallDialUI.f142599q.equals(obj)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "modifyCountryCodeByUsder");
            iPCallDialUI.f142605w = 2;
            if (iPCallDialUI.f142604v == 1) {
                iPCallDialUI.f142604v = 2;
            } else {
                iPCallDialUI.f142604v = 4;
            }
        }
    }
}
