package u1;

/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final u1.w f423673a;

    /* renamed from: b, reason: collision with root package name */
    public n0.v2 f423674b;

    /* renamed from: c, reason: collision with root package name */
    public s1.t0 f423675c;

    public v(u1.w layoutNode) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        this.f423673a = layoutNode;
    }

    public final s1.t0 a() {
        n0.v2 v2Var = this.f423674b;
        if (v2Var == null) {
            s1.t0 t0Var = this.f423675c;
            if (t0Var == null) {
                throw new java.lang.IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            v2Var = n0.s4.c(t0Var, null, 2, null);
        }
        this.f423674b = v2Var;
        return (s1.t0) v2Var.getValue();
    }
}
