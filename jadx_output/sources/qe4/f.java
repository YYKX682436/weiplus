package qe4;

/* loaded from: classes9.dex */
public class f implements en1.l {
    @Override // en1.l
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("SoterHandleAuthResponse", "autoAuth: %s", java.lang.Boolean.valueOf(z17));
        ((ku5.t0) ku5.t0.f312615d).g(new qe4.e(this));
        if (!z17 && fu5.d.b().d() && ((java.lang.String) fu5.d.b().a().get(1)).equals("WechatAuthKeyPay&null")) {
            com.tencent.mars.xlog.Log.i("SoterHandleAuthResponse", "init error, reinit");
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f266913b = false;
            }
            ne4.h hVar = (ne4.h) i95.n0.c(ne4.h.class);
            hVar.getClass();
            re4.g0.f();
            new com.tencent.mm.sdk.platformtools.b4(new ne4.g(hVar), true).c(100L, 1000L);
        }
    }

    @Override // en1.l
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
