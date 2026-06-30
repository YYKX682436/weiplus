package zw1;

/* loaded from: classes8.dex */
public class d4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476609c;

    public d4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.o90 o90Var, int i17) {
        this.f476609c = walletCollectQrCodeUI;
        this.f476607a = o90Var;
        this.f476608b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeMch，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476609c;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || fVar.f70618d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeMch，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 5);
            r45.hx hxVar = (r45.hx) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "cgiBack.resp.url:%s cgiBack.resp.true_name：%s", hxVar.f376522d, hxVar.f376523e);
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI2 = this.f476609c;
            r45.hx hxVar2 = (r45.hx) fVar.f70618d;
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Y6(walletCollectQrCodeUI2, hxVar2.f376522d, hxVar2.f376523e, hxVar2.f376524f, hxVar2.f376525g, this.f476607a, this.f476608b, hxVar2.f376526h, null);
            walletCollectQrCodeUI.k7(2);
        } else {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.X6(walletCollectQrCodeUI, fVar.f70617c);
        }
        return java.lang.Boolean.TRUE;
    }
}
