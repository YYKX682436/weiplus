package di3;

/* loaded from: classes10.dex */
public class b0 implements t21.e2 {
    @Override // t21.e2
    public void Cb(java.lang.String str) {
        boolean z17;
        t21.v2 g17 = t21.o2.Ui().g(str);
        if (g17 == null) {
            return;
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, str, false);
        r45.vh4 vh4Var = g17.H;
        com.tencent.mm.modelcontrol.VideoTransPara cj6 = d11.s.fj().cj();
        if (vh4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "beforeVideoSend count %d filename %s filePath %s", java.lang.Integer.valueOf(vh4Var.f388236f), str, rj6);
            if (vh4Var.f388236f > 1) {
                t21.d3.G(str);
                return;
            }
        }
        boolean a17 = di3.y.a(rj6, cj6, vh4Var, new di3.z(this, rj6, g17));
        if (vh4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "filename: %s need ret: %s", str, java.lang.Boolean.valueOf(a17));
            vh4Var.f388239i = !a17;
            g17.H = vh4Var;
            g17.U = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
            t21.o2.Ui().C(g17);
        }
        if (a17) {
            boolean aj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(g17.d());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (vh4Var != null) {
                vh4Var.f388236f++;
                g17.H = vh4Var;
            }
            g17.U = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
            t21.o2.Ui().C(g17);
            long j17 = g17.f415016n;
            java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = ai3.a.f5104a;
            synchronized (ai3.a.class) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing: %s", java.lang.Long.valueOf(j17));
                    ai3.a.f5104a.add(java.lang.Long.valueOf(j17));
                    z17 = false;
                } catch (java.lang.Exception e17) {
                    z17 = false;
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMSightCaptureVideoRemuxStatus", "markMsgRemuxing error: %s", e17.getMessage());
                }
            }
            f65.y0.f260019a.f(str, cj6.A == 1 ? true : z17 ? 2 : 1, com.tencent.mm.pluginsdk.model.f3.f189302a.a() ? 2 : 1);
            int b17 = di3.y.b(rj6, cj6, vh4Var, new di3.a0(this, g17, rj6));
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 3038L;
            errorMsgInfoStruct.f56117i = aj6 ? 1L : 0L;
            errorMsgInfoStruct.f56118j = b17;
            errorMsgInfoStruct.f56119k = java.lang.System.currentTimeMillis() - currentTimeMillis;
            errorMsgInfoStruct.k();
            if (b17 < 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "mark720CapturePostCompressFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 45L, 1L, false);
                t21.d3.G(str);
            } else if (vh4Var != null) {
                vh4Var.f388239i = true;
                g17.H = vh4Var;
                g17.U = com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                t21.o2.Ui().C(g17);
            }
        }
    }
}
