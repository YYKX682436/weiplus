package go0;

/* loaded from: classes14.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f273806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(go0.q1 q1Var) {
        super(0);
        this.f273806d = q1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.q1 q1Var = this.f273806d;
        com.tencent.mars.xlog.Log.i(q1Var.f273822f, "unsetOutputSurface");
        q1Var.f273826m = null;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        q1Var.f273829p = true;
        return jz5.f0.f302826a;
    }
}
