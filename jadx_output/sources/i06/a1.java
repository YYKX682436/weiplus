package i06;

/* loaded from: classes15.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f286599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f286600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(i06.k1 k1Var, i06.f1 f1Var) {
        super(0);
        this.f286599d = k1Var;
        this.f286600e = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String h17;
        i06.k1 k1Var = this.f286599d;
        if (k1Var.f286680e.isAnonymousClass()) {
            return null;
        }
        n16.b v17 = k1Var.v();
        if (v17.f334158c) {
            this.f286600e.getClass();
            java.lang.Class cls = k1Var.f286680e;
            java.lang.String simpleName = cls.getSimpleName();
            java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                h17 = r26.n0.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
            } else {
                java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    h17 = r26.n0.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
                } else {
                    h17 = r26.n0.n0(simpleName, '$', null, 2, null);
                }
            }
        } else {
            h17 = v17.j().h();
            kotlin.jvm.internal.o.f(h17, "asString(...)");
        }
        return h17;
    }
}
