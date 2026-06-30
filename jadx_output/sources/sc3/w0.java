package sc3;

/* loaded from: classes7.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f406549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406550g;

    public w0(sc3.k1 k1Var, int i17, int i18, int i19) {
        this.f406547d = k1Var;
        this.f406548e = i17;
        this.f406549f = i18;
        this.f406550g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.c cVar = (pc3.c) this.f406547d.f406489u.get(java.lang.Integer.valueOf(this.f406548e));
        if (cVar != null) {
            android.view.Surface surface = cVar.f353371e;
            if (surface == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MBRendererView", "updateSurfaceSize: surface is empty");
                return;
            }
            gh.t tVar = cVar.f353370d;
            if (tVar != null) {
                tVar.c(surface, this.f406549f, this.f406550g);
            }
        }
    }
}
