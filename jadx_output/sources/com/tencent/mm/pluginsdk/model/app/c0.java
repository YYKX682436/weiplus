package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f188820d;

    public c0(com.tencent.mm.storage.f9 f9Var) {
        this.f188820d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f188820d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "autoDownloadFile2 %s %s", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.getMsgId()));
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 != null) {
            java.lang.String str = com.tencent.mm.pluginsdk.model.app.k0.f(lp0.b.t(), v17.n(), v17.f348690o) + "_lan_tmp";
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = str != null ? str : "";
                objArr[1] = java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(str));
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile tmpFile:%s, %s", objArr);
            } else {
                com.tencent.mm.pluginsdk.model.app.d J0 = ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(f9Var.getMsgId(), f9Var.Q0());
                if (J0 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile info is null");
                } else if (com.tencent.mm.vfs.w6.k(str) == J0.field_totalLen) {
                    boolean J2 = bt3.l0.J(f9Var, str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "startToDownloadFile use lan, status:%s", java.lang.Long.valueOf(J0.field_status));
                    if (J2) {
                        return;
                    }
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = str != null ? str : "";
                    objArr2[1] = java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str));
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile tmpFile:%s, length:%s", objArr2);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMessageExtension", "startToDownloadFile content is null");
        }
        android.util.Pair n17 = com.tencent.mm.pluginsdk.model.app.a0.n(f9Var, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "autoDownloadFile3 %s %s, tryInitAttach:%s meidaId:%s", java.lang.Long.valueOf(f9Var.I0()), java.lang.Long.valueOf(f9Var.getMsgId()), n17.first, n17.second);
        if (((java.lang.Boolean) n17.first).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMessageExtension", "startToDownloadFile");
            c01.d9.e().g(new bt3.l0(f9Var.getMsgId(), f9Var.Q0(), (java.lang.String) n17.second, null));
            com.tencent.mm.modelsimple.g1.M(f9Var);
        }
        d35.h.f226344a.c(f9Var);
    }
}
