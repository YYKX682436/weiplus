package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class w1 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.y1 f180997a;

    public w1(com.tencent.mm.plugin.wallet_core.utils.y1 y1Var) {
        this.f180997a = y1Var;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mm.plugin.wallet_core.utils.y1 y1Var;
        if (iTransmitKvData == null || (y1Var = this.f180997a) == null || iTransmitKvData.getInt("pay.settings.refreshentrance") != 1) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("callbackEventType", 1);
        ((com.tencent.mm.plugin.mall.ui.v2) y1Var).a(bundle);
    }
}
