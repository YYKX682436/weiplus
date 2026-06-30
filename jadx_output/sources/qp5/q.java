package qp5;

/* loaded from: classes9.dex */
public class q implements com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener {
    public q(com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView editHintPasswdView) {
    }

    @Override // com.tenpay.android.wechat.TenpaySecureEditText.I993EnvListener
    public boolean is993Env() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_sm2_993_abtest, false);
        boolean z17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_993TEST_Int, 0) == 1;
        boolean a17 = z65.c.a();
        boolean z18 = com.tencent.mm.sdk.platformtools.s9.f192976d;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] isSvrOpen: %s, isLocalOpen: %s , hasDebugger: %s ，is993WXPayUsed：%s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17), java.lang.Boolean.valueOf(z18));
        if (a17 && z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] true：hasDebugger && is993WXPayUsed");
            return true;
        }
        if (a17 && z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] true：hasDebugger && isLocalOpen");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "[is993Env] use normal mode：%s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}
