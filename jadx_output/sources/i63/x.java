package i63;

/* loaded from: classes7.dex */
public class x implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i63.y f289039d;

    public x(i63.y yVar) {
        this.f289039d = yVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        i63.b0 b0Var;
        android.net.LocalSocket accept;
        i63.y yVar = this.f289039d;
        try {
            i63.b0 b0Var2 = yVar.f289041e;
            b0Var = yVar.f289041e;
            b0Var2.f288972e.close();
            b0Var.f288975h.close();
            b0Var.f288975h = new android.net.LocalServerSocket(b0Var.f288988x);
            accept = b0Var.f288975h.accept();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "vira: retry got client");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameLiveAppbrandAudioMgrService", e17, "io exception again", new java.lang.Object[0]);
        }
        if (b0Var.f288973f == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameLiveAppbrandAudioMgrService", "handle is null!");
        } else {
            b0Var.f288972e = new java.io.ObjectOutputStream(accept.getOutputStream());
            yVar.f289041e.Di();
        }
    }
}
