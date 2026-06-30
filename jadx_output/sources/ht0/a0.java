package ht0;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f284661d;

    public a0(ht0.c0 c0Var) {
        this.f284661d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f284661d.f284663a) {
            boolean z17 = ht0.c0.z(this.f284661d);
            com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl result: %s", java.lang.Boolean.valueOf(z17));
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureSuccess");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 39L, 1L);
                ht0.c0 c0Var = this.f284661d;
                ht0.c0.A(c0Var, ai3.d.p(c0Var.f284665c));
                try {
                    com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(this.f284661d.f284665c, true);
                    if (d17 != null) {
                        int i17 = d17.f162383b;
                        int i18 = d17.f162386e;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureResult, bitrate:" + i17 + ", fps:" + i18);
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.C(985L, 38L, (long) i17);
                        g0Var.C(985L, 41L, (long) i18);
                    }
                } catch (java.lang.Exception unused) {
                }
                if (this.f284661d.C != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "call stopCallback");
                    com.tencent.mm.sdk.platformtools.u3.h(this.f284661d.C);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 37L, 1L);
                this.f284661d.f284680r.c();
                if (this.f284661d.B != null) {
                    com.tencent.mm.sdk.platformtools.u3.h(new ht0.z(this));
                }
            }
            long j17 = rs0.p.f399311b;
            if (j17 > 0) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264WaitStop, waitTime:" + elapsedRealtime);
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.C(985L, 34L, elapsedRealtime);
                g0Var2.C(985L, 35L, 1L);
                rs0.p.f399311b = -1L;
            }
        }
    }
}
