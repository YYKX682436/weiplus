package kw3;

/* loaded from: classes9.dex */
public class l implements java.lang.Runnable {
    public l(kw3.p pVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.qq4 qq4Var = com.tencent.mm.plugin.remittance.model.h.f156847b.f156848a;
        try {
            java.lang.String str = (java.lang.String) ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_MSGCHECKTASKINFO_STRING_SYNC, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                qq4Var.parseFrom(android.util.Base64.decode(str, 0));
            }
            java.util.Iterator it = qq4Var.f384204d.iterator();
            while (it.hasNext()) {
                r45.nq4 nq4Var = (r45.nq4) it.next();
                int p17 = (int) ((nq4Var.f381597d - c01.w9.p()) / 1000);
                if (p17 < 0) {
                    p17 = 0;
                }
                new com.tencent.mm.plugin.remittance.model.g(p17, nq4Var).a();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgCheckTaskMgr", e17, "", new java.lang.Object[0]);
            qq4Var.f384204d.clear();
        }
    }
}
