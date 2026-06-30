package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.q0 f158299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.q0 f158300e;

    public p0(com.tencent.mm.plugin.report.service.q0 q0Var, r45.q0 q0Var2) {
        this.f158300e = q0Var;
        this.f158299d = q0Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.q0 q0Var = this.f158299d;
        com.tencent.mm.plugin.report.service.q0 q0Var2 = this.f158300e;
        try {
            q0Var2.f158304d.f158183p = java.lang.System.currentTimeMillis();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            c17.x(com.tencent.mm.storage.u3.USERINFO_CLOG_SAMPLING_REFRESH_TIME_LONG, java.lang.Long.valueOf(q0Var2.f158304d.f158183p));
            c17.i(false);
            com.tencent.mm.plugin.report.service.g0 g0Var = q0Var2.f158304d;
            int i17 = g0Var.f158181n;
            int i18 = q0Var.f383526d;
            if (i17 == i18 && g0Var.f158182o == q0Var.f383529g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "Version not changed, use previous settings (%d / %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(q0Var.f383529g));
            } else {
                com.tencent.mm.vfs.w6.R(com.tencent.mm.vfs.r6.j(com.tencent.mm.sdk.platformtools.x2.f193071a.getFileStreamPath("clog-settings")).u(), q0Var.toByteArray());
                com.tencent.mm.plugin.report.service.g0.s(q0Var2.f158304d);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.cLog", e17, "Failed to parse response.", new java.lang.Object[0]);
        }
    }
}
