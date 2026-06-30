package tl;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {
    public m0(tl.p0 p0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "start record timeout");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(357L, 51L, 1L, true);
        if (!tl.p0.f420067x) {
            if (o45.wf.f343033k) {
                g0Var.i("Record", "start record timeout", null);
            }
            g0Var.idkeyStat(357L, 52L, 1L, true);
        }
        tl.p0.f420067x = true;
    }
}
