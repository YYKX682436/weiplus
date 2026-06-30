package ju4;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        r45.q55 q55Var = ((com.tencent.mm.autogen.events.UpdateGestureProtectInfoEvent) iEvent).f54919g.f8495a;
        hu4.i.f285230a = -1L;
        fu4.a.f266884a = -1L;
        boolean j17 = hu4.j.j(q55Var);
        if (j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockInitTask", "tom update PatternLockInfo, sign_len:%d,valid:%b,status:%d,ver:%d", java.lang.Integer.valueOf(q55Var.f383696e.f371839d), java.lang.Boolean.valueOf(j17), java.lang.Integer.valueOf(q55Var.f383697f), java.lang.Integer.valueOf(q55Var.f383695d));
            com.tencent.mars.xlog.Log.i("MicroMsg.GestureGuardInfoManager", "saveSyncedPatternInfo version: %d, status: %d", java.lang.Integer.valueOf(q55Var.f383695d), java.lang.Integer.valueOf(q55Var.f383697f));
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            if (c17 != null) {
                try {
                    c17.w(339990, android.util.Base64.encodeToString(q55Var.toByteArray(), 2));
                    c17.i(true);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GestureGuardInfoManager", e17, "", new java.lang.Object[0]);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletLockInitTask", "UserInfoExt.PatternLockInfo is null or invalid.");
        }
        boolean g17 = hu4.j.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockInitTask", "after update gesture server info, isUserSetGesturePwd: %b", java.lang.Boolean.valueOf(g17));
        hu4.f.b(g17);
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().init();
        return false;
    }
}
