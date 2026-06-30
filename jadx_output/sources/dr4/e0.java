package dr4;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f242624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f242625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ is0.c f242626f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.graphics.SurfaceTexture surfaceTexture, dr4.n0 n0Var, is0.c cVar) {
        super(0);
        this.f242624d = surfaceTexture;
        this.f242625e = n0Var;
        this.f242626f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            this.f242624d.updateTexImage();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteWindowSurfaceRenderer", "error happened in update tex image");
        }
        dr4.n0 n0Var = this.f242625e;
        dr4.r1 r1Var = n0Var.f242686l;
        if (r1Var != null) {
            r1Var.E(1);
        }
        dr4.r1 r1Var2 = n0Var.f242686l;
        if (r1Var2 != null) {
            r1Var2.s(90);
        }
        dr4.r1 r1Var3 = n0Var.f242686l;
        if (r1Var3 != null) {
            r1Var3.j(false);
        }
        n0Var.i(this.f242626f);
        return jz5.f0.f302826a;
    }
}
