package l26;

/* loaded from: classes16.dex */
public final class z implements l26.i {

    /* renamed from: a, reason: collision with root package name */
    public static final l26.z f315282a = new l26.z();

    @Override // l26.i
    public java.lang.String a(o06.n0 n0Var) {
        return l26.h.a(this, n0Var);
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        java.util.List<o06.l2> W = functionDescriptor.W();
        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
        if (W.isEmpty()) {
            return true;
        }
        for (o06.l2 l2Var : W) {
            kotlin.jvm.internal.o.d(l2Var);
            if (!(!v16.f.a(l2Var) && ((r06.s1) l2Var).f368526p == null)) {
                return false;
            }
        }
        return true;
    }

    @Override // l26.i
    public java.lang.String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
