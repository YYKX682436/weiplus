package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.x f180801a;

    public y(com.tencent.mm.plugin.wallet_core.ui.x xVar) {
        this.f180801a = xVar;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        int i17 = iTransmitKvData.getInt("can_close");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "receive checkServiceCloseUseCase can_close is : %s", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.ui.x xVar = this.f180801a;
            xVar.getClass();
            com.tencent.mm.plugin.wallet_core.utils.z0.f181008a.c(xVar.f180776d, new com.tencent.mm.plugin.wallet_core.ui.x$$b(xVar));
        }
    }
}
