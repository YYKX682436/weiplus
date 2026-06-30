package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f180482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l f180483b;

    public m(com.tencent.mm.plugin.wallet_core.ui.l lVar, android.view.View view) {
        this.f180483b = lVar;
        this.f180482a = view;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        int i17 = iTransmitKvData.getInt("can_close");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "receive checkServiceCloseUseCase can_close is : %s", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.ui.l lVar = this.f180483b;
            lVar.getClass();
            com.tencent.mm.plugin.wallet_core.utils.z0.f181008a.c(lVar.f180384d, new com.tencent.mm.plugin.wallet_core.ui.l$$b(lVar, this.f180482a));
        }
    }
}
