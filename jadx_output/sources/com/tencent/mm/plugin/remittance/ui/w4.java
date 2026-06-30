package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class w4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f158010d;

    public w4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f158010d = remittanceDetailUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f158010d;
        int i18 = remittanceDetailUI.f157368q2;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (i18 == com.tencent.mm.R.id.lv7) {
            str = remittanceDetailUI.f157381y.getText().toString().trim();
        } else {
            if (i18 == com.tencent.mm.R.id.lua) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(remittanceDetailUI.f157384z.getText().toString().trim() + " ");
                java.lang.String trim = remittanceDetailUI.B.getText().toString().trim();
                if (trim.endsWith(remittanceDetailUI.getString(com.tencent.mm.R.string.hz9))) {
                    sb6.append(trim.substring(0, trim.length() - 4));
                } else {
                    sb6.append(trim);
                }
                str = sb6.toString();
            } else {
                if (i18 == com.tencent.mm.R.id.lv6) {
                    str = remittanceDetailUI.V.getText().toString().trim();
                } else {
                    if (i18 == com.tencent.mm.R.id.lub) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(remittanceDetailUI.W.getText().toString().trim() + " ");
                        java.lang.String trim2 = remittanceDetailUI.Y.getText().toString().trim();
                        if (trim2.endsWith(remittanceDetailUI.getString(com.tencent.mm.R.string.hz9))) {
                            sb7.append(trim2.substring(0, trim2.length() - 4));
                        } else {
                            sb7.append(trim2);
                        }
                        str = sb7.toString();
                    } else {
                        str = "";
                    }
                }
            }
        }
        com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, str, null);
        db5.e1.T(remittanceDetailUI, remittanceDetailUI.getString(com.tencent.mm.R.string.f490361st));
    }
}
