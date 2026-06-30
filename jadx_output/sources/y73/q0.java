package y73;

/* loaded from: classes11.dex */
public class q0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        if (gm0.j1.a()) {
            r45.j4 j4Var = p0Var.f70726a;
            if (j4Var.f377560g == 10002) {
                java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "msg content is null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "onReciveMsg :%s", g17);
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
                if (d17 == null || d17.size() <= 0) {
                    return;
                }
                java.lang.String str = (java.lang.String) d17.get(".sysmsg.$type");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equalsIgnoreCase("prconfignotify")) {
                    return;
                }
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".sysmsg.boots.ignorenetwork"), 0);
                java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.boots.xmlkey");
                if (str2 == null) {
                    str2 = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "ignore:%s md5 %s start checkout tinker update. try to do update.", java.lang.Integer.valueOf(D1), str2);
                fy5.a.d().c("uin", java.lang.String.valueOf(gm0.m.i() & io.flutter.embedding.android.KeyboardMap.kValueMask)).c("network", java.lang.String.valueOf((com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || D1 == 1) ? 3 : 2));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    fy5.a.d().c("xmlkey", str2);
                }
                fy5.a.d().a(true);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
