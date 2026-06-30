package zw1;

/* loaded from: classes8.dex */
public class c4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f476595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f476596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f476597c;

    public c4(com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI, r45.o90 o90Var, int i17) {
        this.f476597c = walletCollectQrCodeUI;
        this.f476595a = o90Var;
        this.f476596b = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，cgiBack.errType：%s，cgiBack.errCode：%s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI = this.f476597c;
        if (walletCollectQrCodeUI.isFinishing() || walletCollectQrCodeUI.isDestroyed() || fVar.f70618d == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，isFinishing() || isDestroyed() || cgiBack.resp == null");
            return null;
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13944, 5);
            r45.jx jxVar = (r45.jx) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeUI", "cgiBack.resp.url:%s cgiBack.resp.true_name:%s", jxVar.f378179d, jxVar.f378180e);
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI2 = this.f476597c;
            r45.jx jxVar2 = (r45.jx) fVar.f70618d;
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.Y6(walletCollectQrCodeUI2, jxVar2.f378179d, jxVar2.f378180e, jxVar2.f378181f, jxVar2.f378182g, this.f476595a, this.f476596b, null, jxVar2.f378183h);
            walletCollectQrCodeUI.k7(1);
        } else {
            com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.X6(walletCollectQrCodeUI, fVar.f70617c);
        }
        return java.lang.Boolean.TRUE;
    }
}
