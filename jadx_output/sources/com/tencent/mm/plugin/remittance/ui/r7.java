package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class r7 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f157921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f157923f;

    public r7(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f157921d = z2Var;
        this.f157922e = remittanceRemarkInputHalfPage;
        this.f157923f = mMEditText;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157921d;
        if (!z2Var.h()) {
            return false;
        }
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f157922e;
        if (remittanceRemarkInputHalfPage.f157567m > 0) {
            remittanceRemarkInputHalfPage.f157561d.hideVKB(this.f157923f);
            return false;
        }
        z2Var.B();
        return false;
    }
}
