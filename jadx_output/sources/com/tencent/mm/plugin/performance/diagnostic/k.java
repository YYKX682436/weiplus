package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f152941a = com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f152942b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f152943c;

    static {
        tp3.a.INSTANCE.getClass();
        f152942b = ".cmd.diagnostic.$token";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f152943c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.performance.diagnostic.DiagnosticPush$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DiagnosticPush", "expt changed");
                java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_diagnostic_expt_push_cmd, "", true);
                if (android.text.TextUtils.isEmpty(Zi)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DiagnosticPush", "empty push command");
                    return false;
                }
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(Zi, "cmd", null);
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DiagnosticPush", "invalid push command: %s", Zi);
                    return false;
                }
                java.lang.String str = com.tencent.mm.plugin.performance.diagnostic.k.f152942b;
                java.lang.String str2 = (java.lang.String) d17.get(str);
                com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.diagnostic.k.f152941a;
                java.lang.String u17 = o4Var.u(str, "");
                if (android.text.TextUtils.isEmpty(str2) || u17.equalsIgnoreCase(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DiagnosticPush", "ignore command, seq = %s, lastSeq = %s", str2, u17);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DiagnosticPush", "valid push cmd: %s", Zi);
                o4Var.D(str, str2);
                tp3.a.INSTANCE.b(d17);
                return false;
            }
        };
    }
}
