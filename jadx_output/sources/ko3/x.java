package ko3;

/* loaded from: classes13.dex */
public class x implements java.lang.Runnable {
    public x(ko3.z zVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            w04.l.INSTANCE.G7(540999711, com.tencent.mm.plugin.normsg.api.AudioModeStatus.a());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CSM", "report cai failed: " + th6);
        }
    }
}
