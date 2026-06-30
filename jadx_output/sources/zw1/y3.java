package zw1;

/* loaded from: classes5.dex */
public class y3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476859a;

    public y3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476859a = walletCollectQrCodeUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiVoiceOperateSwitchMch，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476859a;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || (fVar = fVar2.f70618d) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (fVar2.f70615a == 0 && fVar2.f70616b == 0) {
            if (((r45.h17) fVar).f375769d) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "cash.caf");
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_F2F_RING_TONE_MCH_STRING, "in.caf");
            }
            int i17 = com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Q;
            walletCollectQrCodeUI.H7(2);
        } else {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.X6(walletCollectQrCodeUI, fVar2.f70617c);
        }
        return java.lang.Boolean.TRUE;
    }
}
