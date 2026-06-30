package dr4;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.o f242650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dr4.o oVar) {
        super(0);
        this.f242650d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.o oVar = this.f242650d;
        oVar.f();
        com.tencent.mars.xlog.Log.i(oVar.f242678d, "do WindowSurfaceRenderer release");
        oVar.g(oVar.f242681g, 0);
        oVar.g(oVar.f242682h, 1);
        oVar.g(oVar.f242683i, 0);
        oVar.g(oVar.f242684j, 0);
        android.view.Surface surface = oVar.f242691q;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = oVar.f242690p;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        is0.c cVar = oVar.f242687m;
        if (cVar != null) {
            cVar.close();
        }
        dr4.r1 r1Var = oVar.f242686l;
        if (r1Var != null) {
            r1Var.n();
        }
        if (oVar.f242685k != null) {
            oVar.f242682h = null;
            oVar.f242681g = null;
        }
        return jz5.f0.f302826a;
    }
}
