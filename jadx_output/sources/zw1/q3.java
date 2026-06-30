package zw1;

/* loaded from: classes15.dex */
public class q3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476764a;

    public q3(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f476764a = walletCollectQrCodeUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.io.IOException e17;
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiGetQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar2.f70615a), java.lang.Integer.valueOf(fVar2.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476764a;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || (fVar = fVar2.f70618d) == null) {
            return null;
        }
        if (fVar2.f70615a == 0 && fVar2.f70616b == 0) {
            ww1.a3 a3Var = walletCollectQrCodeUI.f96437f;
            r45.fw fwVar = (r45.fw) fVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "[setMchConfig]");
            try {
                str = new java.lang.String(fwVar.toByteArray(), com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET);
            } catch (java.io.IOException e18) {
                e17 = e18;
                str = " ";
            }
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeLogic", "setConfig success");
            } catch (java.io.IOException e19) {
                e17 = e19;
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletCollectQrCodeLogic", "save config exp, " + e17.getLocalizedMessage());
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, str);
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                ww1.c3.a(a3Var, null, fwVar);
                walletCollectQrCodeUI.x7(0);
                return java.lang.Boolean.TRUE;
            }
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, str);
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
            ww1.c3.a(a3Var, null, fwVar);
            walletCollectQrCodeUI.x7(0);
        } else {
            ww1.y2.e(walletCollectQrCodeUI.f96439h, walletCollectQrCodeUI.f96437f, fVar2.f70617c, walletCollectQrCodeUI.getContext());
        }
        return java.lang.Boolean.TRUE;
    }
}
