package vq4;

/* loaded from: classes14.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f439300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439301e;

    public h0(vq4.m0 m0Var, yz5.l lVar) {
        this.f439300d = m0Var;
        this.f439301e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.sdk.platformtools.SensorController sensorController = new com.tencent.mm.sdk.platformtools.SensorController(context);
        vq4.m0 m0Var = this.f439300d;
        m0Var.f439338b = sensorController;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIP.VoIPAudioManager", "initMgr setSensorCallBack context is " + context);
        vq4.f0 f0Var = new vq4.f0(m0Var);
        com.tencent.mm.sdk.platformtools.SensorController sensorController2 = m0Var.f439338b;
        if (sensorController2 != null) {
            sensorController2.b(f0Var);
        }
        if (m0Var.f439339c == null) {
            com.tencent.mm.sdk.platformtools.s7 s7Var = new com.tencent.mm.sdk.platformtools.s7(context);
            m0Var.f439340d = s7Var.a(new vq4.g0(m0Var)) ? 0L : -1L;
            m0Var.f439339c = s7Var;
        }
        m0Var.f439342f = this.f439301e;
    }
}
