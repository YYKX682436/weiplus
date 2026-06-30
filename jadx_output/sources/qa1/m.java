package qa1;

/* loaded from: classes14.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f361005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f361006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f361008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qa1.p f361009h;

    public m(qa1.p pVar, int i17, boolean z17, yz5.l lVar, com.tencent.magicbrush.MBRuntime mBRuntime) {
        this.f361009h = pVar;
        this.f361005d = i17;
        this.f361006e = z17;
        this.f361007f = lVar;
        this.f361008g = mBRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.SurfaceHolder surfaceHolder;
        int i17 = this.f361005d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "hy: request switch to render mode %d", java.lang.Integer.valueOf(i17));
        boolean z17 = this.f361006e;
        qa1.p pVar = this.f361009h;
        yz5.l lVar = this.f361007f;
        if (!z17 && pVar.f361011g.g(i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameGLSurfaceView", "hy: support status not changed!");
            lVar.invoke(java.lang.Boolean.TRUE);
            return;
        }
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f361008g;
        if (mBRuntime.d() || (surfaceHolder = pVar.f361012h) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameGLSurfaceView", "hy: runtime  destroyed!");
            lVar.invoke(java.lang.Boolean.FALSE);
        } else if (mBRuntime instanceof com.tencent.magicbrush.MagicBrush) {
            pVar.f361011g.p(surfaceHolder, new qa1.l(this), true);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameGLSurfaceView", "hy: runtime is not magic brush!");
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
