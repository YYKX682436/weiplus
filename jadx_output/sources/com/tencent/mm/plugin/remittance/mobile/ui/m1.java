package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes5.dex */
public class m1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f156693a;

    public m1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f156693a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "DelayOption View click cancel!");
        this.f156693a.B();
    }
}
