package is4;

/* loaded from: classes9.dex */
public abstract class a {
    public static boolean a(java.lang.String str, boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
        if (z17) {
            M.putInt(str, 5);
            return z17;
        }
        int i17 = M.getInt(str, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", "soter:  %s supportCount is %s", str, java.lang.Integer.valueOf(i17));
        if (i17 <= 0) {
            return z17;
        }
        M.putInt(str, i17 - 1);
        return true;
    }

    public static boolean b() {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletUtil", "no finger mgr!");
            return false;
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        at4.u1 p17 = Ai.p();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.h6.CTRL_INDEX, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", "support faceid: %s, %s, %s", java.lang.Boolean.valueOf(aVar.Rb()), java.lang.Boolean.valueOf(p17.h()), java.lang.Boolean.valueOf(Ai.w()));
        return aVar.Rb() && p17.h() && Ai.w();
    }

    public static boolean c() {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mgr==null?");
        sb6.append(aVar == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", sb6.toString());
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", " mgr.isSupportAndLoadSuccess()=" + aVar.Ic());
        }
        at4.x1 Ai = vr4.f1.wi().Ai();
        at4.u1 p17 = Ai.p();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("config==null?");
        sb7.append(p17 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", sb7.toString());
        if (p17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", "config.isSupportTouchPay()=" + p17.h());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtil", "userInfoManger.isReg()=" + Ai.w());
        return aVar != null && aVar.Ic() && p17 != null && p17.h() && Ai.w();
    }
}
