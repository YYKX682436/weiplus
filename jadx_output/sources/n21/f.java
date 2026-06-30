package n21;

/* loaded from: classes12.dex */
public class f implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f334251d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.BlockingQueue f334252e = new java.util.concurrent.ArrayBlockingQueue(1024);

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        yl.h hVar = new yl.h();
        java.lang.String a17 = n21.c.a();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.SpeexEncoderWorker", "path " + a17);
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17);
            java.lang.String str = a18.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
            com.tencent.mm.vfs.z2 m17 = b3Var.m(a18, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = b3Var.m(a18, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            hVar.b(a17 + this.f334251d + ".temp");
            while (true) {
                java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = (java.util.concurrent.ArrayBlockingQueue) this.f334252e;
                if (arrayBlockingQueue.size() <= 0) {
                    break;
                }
                tl.h0 h0Var = (tl.h0) arrayBlockingQueue.poll();
                if (h0Var.f420048a != null && h0Var.f420049b > 0) {
                    hVar.a(h0Var, 0);
                }
            }
            hVar.d();
            try {
                com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(a17 + this.f334251d + ".temp");
                java.lang.String str2 = a19.f213279f;
                if (str2 != null) {
                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l18)) {
                        a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l18, a19.f213280g, a19.f213281h);
                    }
                }
                com.tencent.mm.vfs.z7 a27 = com.tencent.mm.vfs.z7.a(a17 + this.f334251d + ".spx");
                java.lang.String str3 = a27.f213279f;
                if (str3 != null) {
                    java.lang.String l19 = com.tencent.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l19)) {
                        a27 = new com.tencent.mm.vfs.z7(a27.f213277d, a27.f213278e, l19, a27.f213280g, a27.f213281h);
                    }
                }
                com.tencent.mm.vfs.b3 b3Var2 = com.tencent.mm.vfs.a3.f212781a;
                com.tencent.mm.vfs.z2 m19 = b3Var2.m(a19, null);
                com.tencent.mm.vfs.z2 m27 = b3Var2.m(a27, null);
                if (m19.a() && m27.a()) {
                    try {
                        m27.f213266a.t(m27.f213267b, m19.f213266a, m19.f213267b);
                    } catch (java.io.IOException unused) {
                    }
                }
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexEncoderWorker", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            n21.o.b().c();
            return true;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexEncoderWorker", "filename open failed, ", e18);
            return true;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        return false;
    }

    public boolean c(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeexEncoderWorker", "init ");
        ((java.util.concurrent.ArrayBlockingQueue) this.f334252e).clear();
        int i27 = n21.h.f334266g;
        this.f334251d = java.lang.String.format("%s%d_%d_%d_%d", i27 != 1 ? i27 != 2 ? "single_" : "app_" : "chatroom_", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return true;
    }
}
