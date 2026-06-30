package gk4;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f272637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.graphics.SurfaceTexture surfaceTexture, gk4.h0 h0Var) {
        super(0);
        this.f272637d = surfaceTexture;
        this.f272638e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk4.h0 h0Var = this.f272638e;
        android.graphics.SurfaceTexture surfaceTexture = this.f272637d;
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(h0Var.f272556a, e17, "updateTexImage error", new java.lang.Object[0]);
        }
        gk4.h0.b(h0Var, surfaceTexture.getTimestamp());
        return jz5.f0.f302826a;
    }
}
