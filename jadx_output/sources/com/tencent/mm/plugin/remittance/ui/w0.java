package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class w0 implements gt4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f158003a;

    public w0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f158003a = remittanceBaseUI;
    }

    public boolean a(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f158003a;
        remittanceBaseUI.L = z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            remittanceBaseUI.H = null;
        } else {
            remittanceBaseUI.H = str;
        }
        if (!remittanceBaseUI.L) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                remittanceBaseUI.I = null;
            } else {
                remittanceBaseUI.I = str2;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                remittanceBaseUI.f157132J = null;
            } else {
                remittanceBaseUI.f157132J = str3;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                remittanceBaseUI.K = null;
            } else {
                remittanceBaseUI.K = str4;
            }
        }
        int i17 = remittanceBaseUI.f157141n;
        if (i17 != 33 && i17 != 32) {
            if (!(remittanceBaseUI.f157142o == 0)) {
                remittanceBaseUI.E.setVisibility(8);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceBaseUI.I)) {
                remittanceBaseUI.E.setVisibility(8);
            } else {
                remittanceBaseUI.E.setVisibility(0);
                remittanceBaseUI.F.setText(remittanceBaseUI.I + "  " + remittanceBaseUI.f157132J);
                remittanceBaseUI.G.setText(remittanceBaseUI.K);
            }
        }
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI.V6(remittanceBaseUI);
        return true;
    }
}
