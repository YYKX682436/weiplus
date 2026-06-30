package vq4;

/* loaded from: classes14.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439333d;

    public l0(vq4.m0 m0Var) {
        this.f439333d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vq4.m0 m0Var = this.f439333d;
        if (m0Var.f439338b != null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VoIP.VoIPAudioManager", "removeSensorCallBack", new java.lang.Object[0]);
            com.tencent.mm.sdk.platformtools.SensorController sensorController = m0Var.f439338b;
            if (sensorController != null) {
                sensorController.a();
            }
            m0Var.f439338b = null;
            m0Var.f439344h = false;
            m0Var.f439345i = 0L;
            m0Var.f439343g = -1L;
        }
        com.tencent.mm.sdk.platformtools.s7 s7Var = m0Var.f439339c;
        if (s7Var != null) {
            s7Var.b();
        }
        m0Var.f439347k = -1L;
        m0Var.f439340d = -1L;
    }
}
