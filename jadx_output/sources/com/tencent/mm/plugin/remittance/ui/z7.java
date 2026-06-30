package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class z7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI f158066d;

    public z7(com.tencent.mm.plugin.remittance.ui.RemittanceResendMsgUI remittanceResendMsgUI) {
        this.f158066d = remittanceResendMsgUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceResendMsgUI", "click AlertDialog");
        this.f158066d.finish();
    }
}
