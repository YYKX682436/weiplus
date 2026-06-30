package i63;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f289038d;

    public w(i63.b0 b0Var) {
        this.f289038d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.net.LocalSocket accept;
        android.os.Looper.prepare();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "create ipc handler");
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());
        i63.b0 b0Var = this.f289038d;
        b0Var.f288974g = n3Var;
        try {
            b0Var.f288975h = new android.net.LocalServerSocket(b0Var.f288988x);
            accept = b0Var.f288975h.accept();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "vira: got client");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameLiveAppbrandAudioMgrService", e17, "io exception", new java.lang.Object[0]);
        }
        if (b0Var.f288973f == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameLiveAppbrandAudioMgrService", "handle is null!");
            return;
        }
        b0Var.wi(false, false);
        b0Var.f288972e = new java.io.ObjectOutputStream(accept.getOutputStream());
        android.os.Looper.loop();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "ipcHandler thread quited");
    }
}
