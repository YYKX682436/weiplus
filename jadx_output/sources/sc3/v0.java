package sc3;

/* loaded from: classes7.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406545e;

    public v0(sc3.k1 k1Var, int i17) {
        this.f406544d = k1Var;
        this.f406545e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.c cVar = (pc3.c) this.f406544d.f406489u.get(java.lang.Integer.valueOf(this.f406545e));
        if (cVar != null) {
            android.view.Surface surface = cVar.f353371e;
            if (surface == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MBRendererView", "destroyService: try to destroy an empty surface");
                return;
            }
            cVar.f353371e = null;
            gh.t tVar = cVar.f353370d;
            if (tVar != null) {
                tVar.a(surface, false);
            }
        }
    }
}
