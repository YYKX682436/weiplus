package sv;

/* loaded from: classes5.dex */
public class i0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null) {
            com.tencent.mars.xlog.Log.e("BizSysCmdMsgListener", "AddMsg is null.");
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.e("BizSysCmdMsgListener", "msg content is null");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null || d17.size() <= 0) {
            com.tencent.mars.xlog.Log.e("BizSysCmdMsgListener", "receiveMessage, no sysmsg");
            return;
        }
        if (!"mmbizattrappsvr_BizAttrSync".equalsIgnoreCase((java.lang.String) d17.get(".sysmsg.$type"))) {
            com.tencent.mars.xlog.Log.e("BizSysCmdMsgListener", "receiveMessage, type not BizAttrSync.");
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.mmbizattrappsvr_BizAttrSync.openflag"), 0);
        com.tencent.mars.xlog.Log.i("BizSysCmdMsgListener", "BizAttrSync openFlag : %d.", java.lang.Integer.valueOf(P));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BIZ_ATTR_SYNC_OPEN_FLAG_INT, java.lang.Integer.valueOf(P));
        gm0.j1.u().c().i(true);
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
