package gk4;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f272635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk4.h0 f272636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.graphics.SurfaceTexture surfaceTexture, gk4.h0 h0Var) {
        super(0);
        this.f272635d = surfaceTexture;
        this.f272636e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk4.h0 h0Var = this.f272636e;
        android.graphics.SurfaceTexture surfaceTexture = this.f272635d;
        if (surfaceTexture != null) {
            h0Var.f272562g = rs0.g.n(rs0.i.f399296a, new android.view.Surface(surfaceTexture), null, 0, 0, null, 28, null);
        } else {
            h0Var.f272562g = rs0.g.o(rs0.i.f399296a, null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
