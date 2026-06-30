package dr4;

/* loaded from: classes14.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.c0 f242593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f242594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dr4.c0 c0Var, yz5.l lVar) {
        super(0);
        this.f242593d = c0Var;
        this.f242594e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f242594e;
        dr4.c0 c0Var = this.f242593d;
        try {
            c0Var.f242605h = false;
            is0.c cVar = c0Var.f242606i;
            if (cVar != null) {
                cVar.close();
            }
            android.graphics.SurfaceTexture surfaceTexture = c0Var.f242603f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            is0.c cVar2 = new is0.c(false, 14L);
            c0Var.f242606i = cVar2;
            dr4.q1 q1Var = c0Var.f242602e;
            if (q1Var != null) {
                q1Var.x(cVar2);
            }
            android.graphics.SurfaceTexture surfaceTexture2 = new android.graphics.SurfaceTexture(cVar2.f294395e);
            c0Var.f242603f = surfaceTexture2;
            surfaceTexture2.setOnFrameAvailableListener(new dr4.a0(c0Var));
            if (lVar != null) {
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PboSurfaceRender", "switch camera failed");
            c0Var.f242605h = true;
            if (lVar != null) {
            }
        }
        return jz5.f0.f302826a;
    }
}
