package nn0;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.x f338632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nn0.x xVar) {
        super(0);
        this.f338632d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        nn0.x xVar = this.f338632d;
        android.opengl.EGLContext eGLContext = ((nn0.p) xVar.f338584b).getEGLContext();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (eGLContext != null) {
            pm0.v.X(new nn0.v(xVar, eGLContext));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return f0Var2;
        }
        throw new java.lang.RuntimeException("EGL context con not be null");
    }
}
