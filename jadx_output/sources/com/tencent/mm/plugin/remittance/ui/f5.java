package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class f5 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI f157711a;

    public f5(com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI) {
        this.f157711a = remittanceDetailUI;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        boolean bool = iTransmitKvData.getBool("back_from_webview_or_tinyapp");
        com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI remittanceDetailUI = this.f157711a;
        if (bool) {
            remittanceDetailUI.d7(0);
            return;
        }
        if (!iTransmitKvData.getBool("has_cmd_info")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "has_cmd_info is no");
            return;
        }
        byte[] binary = iTransmitKvData.getBinary("cmd_info");
        r45.a50 a50Var = new r45.a50();
        try {
            a50Var.parseFrom(binary);
            if (a50Var.f369726d == 6) {
                com.tencent.mm.autogen.events.RemittanceRefuseEvent remittanceRefuseEvent = new com.tencent.mm.autogen.events.RemittanceRefuseEvent();
                am.sq sqVar = remittanceRefuseEvent.f54677g;
                sqVar.f7926a = remittanceDetailUI.f157346f2.getString(ya.b.TRANSACTION_ID);
                sqVar.f7927b = remittanceDetailUI.f157346f2.getString("transfer_id");
                sqVar.f7928c = remittanceDetailUI.f157346f2.getInt("total_fee");
                sqVar.f7929d = remittanceDetailUI.f157346f2.getString("sender_name");
                remittanceDetailUI.f157353j2.callback(remittanceRefuseEvent);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailUI", "cmdInfo parse failed");
        }
    }
}
