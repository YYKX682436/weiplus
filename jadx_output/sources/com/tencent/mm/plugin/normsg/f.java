package com.tencent.mm.plugin.normsg;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {
    public f(com.tencent.mm.plugin.normsg.u uVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir;
                byte[] l17 = com.tencent.mm.normsg.WCProbe$Info.l(gm0.j1.b().h());
                byte[] m17 = com.tencent.mm.normsg.WCProbe$Info.m(gm0.j1.b().h());
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                java.lang.String format = java.lang.String.format("<k25>%s</k25>", ko3.e0.a(l17, 0, l17.length));
                if (m17 != null) {
                    if (m17.length == 8) {
                        byte b17 = m17[0];
                        m17[0] = m17[3];
                        m17[3] = b17;
                        byte b18 = m17[1];
                        m17[1] = m17[2];
                        m17[2] = b18;
                        byte b19 = m17[4];
                        m17[4] = m17[7];
                        m17[7] = b19;
                        byte b27 = m17[5];
                        m17[5] = m17[6];
                        m17[6] = b27;
                        format = format + java.lang.String.format("<k28>%s</k28><k29>%s</k29>", ko3.e0.a(m17, 0, 4), ko3.e0.a(m17, 4, 8));
                    } else {
                        format = format + java.lang.String.format("<k27>%s</k27>", ko3.e0.a(m17, 0, m17.length));
                    }
                }
                try {
                    java.lang.String hostAddress = java.net.InetAddress.getByName(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9)).getHostAddress();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(format);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    objArr[0] = hostAddress;
                    sb6.append(java.lang.String.format("<k32>%s</k32>", objArr));
                    format = sb6.toString();
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSourceImpl", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NormsgSourceImpl", "checkSoftType2 [time: " + currentTimeMillis2 + ", value: " + format + "]");
                gm0.j1.u().c().w(79, format);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NormsgSourceImpl", e18, "Failed checkSoftType2.", new java.lang.Object[0]);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|checkSoftTypeExtra";
    }
}
