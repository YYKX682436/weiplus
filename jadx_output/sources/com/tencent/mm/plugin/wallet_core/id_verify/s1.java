package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class s1 extends com.tencent.mm.ui.ac {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179490e;

    public s1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179490e = wcPayRealnameVerifyCodeUI;
    }

    @Override // com.tencent.mm.ui.ac
    public void a(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI = this.f179490e;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.U6(wcPayRealnameVerifyCodeUI);
        if (wcPayRealnameVerifyCodeUI.f179270g.isEnabled()) {
            np5.g netController = wcPayRealnameVerifyCodeUI.getNetController();
            if (!(netController instanceof com.tencent.mm.plugin.wallet_core.id_verify.u)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WcPayRealNameVerifyCodeUI", "wrong controller");
                return;
            }
            com.tencent.mm.plugin.wallet_core.id_verify.u uVar = (com.tencent.mm.plugin.wallet_core.id_verify.u) netController;
            java.lang.String text = wcPayRealnameVerifyCodeUI.f179267d.getText();
            java.lang.String str = wcPayRealnameVerifyCodeUI.f179275o;
            java.lang.String text2 = wcPayRealnameVerifyCodeUI.f179268e.getText();
            uVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "do check verify code");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) uVar.f338833a).showProgress();
            com.tencent.mm.plugin.wallet_core.id_verify.a aVar = uVar.f179499d;
            java.lang.String string = aVar.f213801c.getString("realname_verify_process_req_key", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f179322l)) {
                string = aVar.f179322l;
            }
            new ys4.c(string, text, str, text2).l().h(new com.tencent.mm.plugin.wallet_core.id_verify.s(uVar));
        }
    }
}
