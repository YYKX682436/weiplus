package i63;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.b0 f289037d;

    public v(i63.b0 b0Var) {
        this.f289037d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Looper.prepare();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "create handler");
        this.f289037d.f288973f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());
        android.os.Looper.loop();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "handler thread quited");
    }
}
