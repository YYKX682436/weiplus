package nq5;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes12.dex */
public class e extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        oq5.i iVar = oq5.i.f347415c;
        iVar.getClass();
        if (com.tencent.mars.xlog.Log.getImpl().getClass() != com.tencent.mars.xlog.MMXlog.class) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StartupLogcatCatcher", "impl is not xlog!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.StartupLogcatCatcher", "Log.consoleLogOpen:" + com.tencent.mm.xlog.app.XLogSetup.isLogcatOpen);
            if (!com.tencent.mm.xlog.app.XLogSetup.isLogcatOpen.booleanValue()) {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat_startup_v2, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.StartupLogcatCatcher", "is need work :" + Ni);
                if (Ni != 0) {
                    ((ku5.t0) ku5.t0.f312615d).h(iVar.f347417b, "LogcatCatcher");
                }
            }
        }
        oq5.f fVar = oq5.f.f347406g;
        fVar.getClass();
        if (com.tencent.mars.xlog.Log.getImpl().getClass() != com.tencent.mars.xlog.MMXlog.class) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LogcatCatcher", "impl is not xlog!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LogcatCatcher", "Log.consoleLogOpen:" + com.tencent.mm.xlog.app.XLogSetup.isLogcatOpen);
        if (com.tencent.mm.xlog.app.XLogSetup.isLogcatOpen.booleanValue()) {
            return;
        }
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.LogcatCatcher", "work clicfg_logcat:%d", java.lang.Integer.valueOf(Ni2));
        if (Ni2 != 1 || o45.wf.f343034l) {
            return;
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_logcat_alpha, 0);
        if (!o45.wf.f343033k && Ni3 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LogcatCatcher", "id alpha false");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LogcatCatcher", "is need work :" + Ni2);
        if (Ni2 == 0) {
            return;
        }
        android.os.HandlerThread handlerThread = fVar.f347411e;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        fVar.f347412f = handler;
        handler.post(new oq5.e(fVar));
    }
}
