package i63;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.m0 f289040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f289041e;

    public y(i63.b0 b0Var, i63.m0 m0Var) {
        this.f289041e = b0Var;
        this.f289040d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i63.b0 b0Var = this.f289041e;
        java.io.ObjectOutputStream objectOutputStream = b0Var.f288972e;
        if (objectOutputStream == null) {
            return;
        }
        try {
            objectOutputStream.writeUnshared(this.f289040d);
            b0Var.f288972e.reset();
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameLiveAppbrandAudioMgrService", e17, "io exception, try reconnect", new java.lang.Object[0]);
            b0Var.Bi();
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352184w, null, 0, null, 14, null), p60.q.class, new i63.x(this));
        }
    }
}
