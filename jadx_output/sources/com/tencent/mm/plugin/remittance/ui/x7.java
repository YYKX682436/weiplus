package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class x7 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.m7 f158035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f158036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f158037c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f158038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f158039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158040f;

    public x7(com.tencent.mm.plugin.remittance.ui.m7 m7Var, com.tencent.mm.ui.widget.MMEditText mMEditText, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, com.tencent.mm.ui.widget.dialog.z2 z2Var, java.util.ArrayList arrayList) {
        this.f158035a = m7Var;
        this.f158036b = mMEditText;
        this.f158037c = h0Var;
        this.f158038d = remittanceRemarkInputHalfPage;
        this.f158039e = z2Var;
        this.f158040f = arrayList;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f158036b;
        int i17 = 0;
        this.f158035a.onResult(false, mMEditText.getText().toString(), (java.lang.String) this.f158037c.f310123d);
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f158038d;
        remittanceRemarkInputHalfPage.f157561d.hideVKB(mMEditText);
        this.f158039e.B();
        remittanceRemarkInputHalfPage.getClass();
        java.util.ArrayList arrayList = this.f158040f;
        if (!arrayList.isEmpty()) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceRemarkInputHalfPage", "action flow: %s", c17);
            kotlin.jvm.internal.o.d(c17);
            if (r26.i0.y(c17, "1,2,1", false) || r26.i0.y(c17, "2,1", false)) {
                i17 = 5;
            } else if (r26.i0.y(c17, "1,2", false)) {
                i17 = 3;
            } else if (r26.i0.y(c17, "1", false)) {
                i17 = 2;
            } else if (r26.i0.y(c17, "2", false)) {
                i17 = 4;
            }
        }
        if (i17 == 0 || remittanceRemarkInputHalfPage.f157564g != com.tencent.mm.plugin.remittance.ui.l7.f157807d) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22750, java.lang.Integer.valueOf(i17), remittanceRemarkInputHalfPage.f157563f);
    }
}
