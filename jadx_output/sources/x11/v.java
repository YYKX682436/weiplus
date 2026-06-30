package x11;

/* loaded from: classes12.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x11.t f451411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x11.w f451412e;

    public v(x11.t tVar, x11.w wVar) {
        this.f451411d = tVar;
        this.f451412e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "postToWorker callback onSceneEnd");
        x11.t tVar = this.f451411d;
        com.tencent.mm.modelbase.u0 u0Var = tVar.f451394h;
        x11.w wVar = this.f451412e;
        if (u0Var != null) {
            u0Var.onSceneEnd(wVar.f451414b, wVar.f451415c, wVar.f451416d, wVar.f451417e);
        }
        wVar.f451413a.c(wVar.f451414b, wVar.f451415c, tVar.f451397n, tVar.f451391e);
        p01.f.f350364a.b();
        t4.a.b("NewInitAll", 10086);
    }
}
