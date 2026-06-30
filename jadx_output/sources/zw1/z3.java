package zw1;

/* loaded from: classes5.dex */
public class z3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476867a;

    public z3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476867a = walletCollectQrCodeUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiVoiceOperateSwitchMch，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476867a;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || fVar.f70618d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.X6(walletCollectQrCodeUI, fVar.f70617c);
        }
        return java.lang.Boolean.TRUE;
    }
}
