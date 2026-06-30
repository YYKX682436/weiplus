package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.remittance.model.h f156847b = new com.tencent.mm.plugin.remittance.model.h();

    /* renamed from: a, reason: collision with root package name */
    public final r45.qq4 f156848a = new r45.qq4();

    public void a(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, long j18) {
        r45.nq4 nq4Var = new r45.nq4();
        nq4Var.f381601h = str;
        nq4Var.f381600g = str2;
        nq4Var.f381598e = str3;
        nq4Var.f381599f = j18;
        nq4Var.f381597d = c01.w9.p() + (1000 * j17);
        this.f156848a.f384204d.add(nq4Var);
        b();
        new com.tencent.mm.plugin.remittance.model.g(j17, nq4Var).a();
    }

    public void b() {
        r45.qq4 qq4Var = this.f156848a;
        try {
            ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_MSGCHECKTASKINFO_STRING_SYNC, android.util.Base64.encodeToString(qq4Var.toByteArray(), 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgCheckTaskMgr", e17, "", new java.lang.Object[0]);
            qq4Var.f384204d.clear();
        }
    }
}
