package gl;

/* loaded from: classes13.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f272745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl.i f272746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f272747f;

    public g(int i17, gl.i iVar, yz5.a aVar) {
        this.f272745d = i17;
        this.f272746e = iVar;
        this.f272747f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(audioManager.getMode());
        int i17 = this.f272745d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioRouteManager", "set mode from %d to %d", valueOf, java.lang.Integer.valueOf(i17));
        audioManager.setMode(i17);
        this.f272746e.f272760n = i17;
        yz5.a aVar = this.f272747f;
        if (aVar != null) {
        }
    }
}
