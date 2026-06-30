package zw1;

/* loaded from: classes5.dex */
public class c5 implements gm5.a {
    public c5(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeNotifyMch，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        return java.lang.Boolean.TRUE;
    }
}
