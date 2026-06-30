package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class h0 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI f157730a;

    public h0(com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI remittanceAdapterUI) {
        this.f157730a = remittanceAdapterUI;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (iTransmitKvData.getBool("is_stop")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceAdapterUI", "WPHK common route usecase is stop, finish adapter ui");
            this.f157730a.finish();
        }
    }
}
