package k63;

/* loaded from: classes14.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.p0 f304576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k63.p0 p0Var) {
        super(1);
        this.f304576d = p0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        k63.p0 p0Var = this.f304576d;
        if (surfaceTexture != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveMainRenderMgrService", "get surface");
            p0Var.a(new android.view.Surface(surfaceTexture));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameLiveMainRenderMgrService", "renderMgr get surfaceTexture is null");
            p0Var.a(null);
        }
        return f0Var2;
    }
}
