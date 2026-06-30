package tn0;

/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(tn0.w0 w0Var) {
        super(1);
        this.f420660d = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        tn0.w0 w0Var = this.f420660d;
        w0Var.f420771r.a(surfaceTexture, w0Var.L());
        return null;
    }
}
