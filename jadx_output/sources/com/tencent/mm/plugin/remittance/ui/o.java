package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class o implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f157851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI f157852b;

    public o(com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI personalPayRemittanceUI, java.lang.String str) {
        this.f157852b = personalPayRemittanceUI;
        this.f157851a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PersonalPayRemittanceUI", "click error dialog");
        com.tencent.mm.ui.s2 s2Var = com.tencent.mm.ui.s2.FAIL;
        int i17 = com.tencent.mm.plugin.remittance.ui.PersonalPayRemittanceUI.f157101t;
        this.f157852b.V6(s2Var, this.f157851a);
    }
}
