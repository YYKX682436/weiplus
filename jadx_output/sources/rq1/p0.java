package rq1;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq1.m0 f398775d;

    public p0(rq1.m0 m0Var) {
        this.f398775d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rq1.m0 m0Var = this.f398775d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                if (m0Var.f398765f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "flight number is loading");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "start to load flight number");
                    m0Var.f398765f = true;
                    if (!com.tencent.mm.vfs.w6.j(rq1.m0.Di())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "flight number file not exist");
                        m0Var.f398765f = false;
                        return;
                    }
                    java.lang.String[] split = new java.lang.String(com.tencent.mm.vfs.w6.N(rq1.m0.Di(), 0, -1)).split("\n");
                    com.tencent.mm.pluginsdk.ui.span.m mVar = com.tencent.mm.pluginsdk.ui.span.m.f191266d;
                    mVar.f191269c = null;
                    mVar.f191267a = 0;
                    mVar.f191268b = 0;
                    for (int i17 = 0; i17 < split.length; i17++) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(split[i17])) {
                            mVar.a(split[i17]);
                        }
                    }
                    m0Var.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Box.PluginBox", "load flight number success NodeCount：%d CharacterCount：%d useTime: %d", java.lang.Integer.valueOf(mVar.f191268b), java.lang.Integer.valueOf(mVar.f191267a), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (java.lang.Exception e17) {
                sq1.a.a(0);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Box.PluginBox", e17, e17.getMessage(), new java.lang.Object[0]);
            }
            m0Var.f398765f = false;
        } catch (java.lang.Throwable th6) {
            m0Var.f398765f = false;
            throw th6;
        }
    }
}
