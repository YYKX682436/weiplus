package gq4;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {
    public u(gq4.v vVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVoip", "makeCameraCache getCodecCountCache");
        uo.q qVar = uo.q.f429532a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "initCodecCount start");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.media.MediaCodecList.getCodecCount();
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "initCodecCount end, duration : " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginCamera", "initCodecCount error");
        }
        uo.q.f429532a.e();
    }
}
