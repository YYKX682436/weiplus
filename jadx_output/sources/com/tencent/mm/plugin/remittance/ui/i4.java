package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.g1 f157762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157763e;

    public i4(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI, com.tencent.mm.plugin.remittance.model.g1 g1Var) {
        this.f157763e = remittanceDetailUI;
        this.f157762d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.model.g1 g1Var = this.f157762d;
        java.lang.String str = g1Var.f156842v.f157013c;
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157763e;
        int W6 = com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI.W6(remittanceDetailUI, str, remittanceDetailUI.f157378x.getWidth());
        int length = g1Var.f156842v.f157013c.length();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (W6 == length) {
            remittanceDetailUI.A.setText(g1Var.f156842v.f157013c);
            remittanceDetailUI.B.setText(g1Var.f156842v.f157013c);
        } else {
            java.lang.String string = remittanceDetailUI.getString(com.tencent.mm.R.string.hz_);
            java.lang.String str2 = g1Var.f156842v.f157013c.substring(0, W6) + "... ";
            android.text.SpannableString spannableString = new android.text.SpannableString(str2 + string);
            hp3.b bVar = new hp3.b(remittanceDetailUI);
            bVar.f282937d = new com.tencent.mm.plugin.remittance.ui.g4(this);
            spannableString.setSpan(bVar, str2.length(), str2.length() + string.length(), 33);
            remittanceDetailUI.A.setOnTouchListener(new com.tencent.mm.plugin.remittance.ui.c());
            remittanceDetailUI.A.setText(spannableString);
            java.lang.String string2 = remittanceDetailUI.getString(com.tencent.mm.R.string.hz9);
            java.lang.String str3 = g1Var.f156842v.f157013c + "  ";
            android.text.SpannableString spannableString2 = new android.text.SpannableString(str3 + string2);
            hp3.b bVar2 = new hp3.b(remittanceDetailUI);
            bVar2.f282937d = new com.tencent.mm.plugin.remittance.ui.h4(this);
            spannableString2.setSpan(bVar2, str3.length(), str3.length() + string2.length(), 33);
            remittanceDetailUI.B.setOnTouchListener(new com.tencent.mm.plugin.remittance.ui.c());
            remittanceDetailUI.B.setText(spannableString2);
        }
        remittanceDetailUI.A.setVisibility(0);
        remittanceDetailUI.B.setVisibility(8);
        remittanceDetailUI.f157377w.setOnLongClickListener(remittanceDetailUI.f157374t2);
        remittanceDetailUI.f157377w.setOnTouchListener(remittanceDetailUI.f157372s2);
    }
}
