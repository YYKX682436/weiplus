package d22;

/* loaded from: classes12.dex */
public final class d0 extends qk.k7 implements d22.v {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f225834p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.qj0 f225835q;

    /* renamed from: r, reason: collision with root package name */
    public final j12.i f225836r;

    public d0(java.lang.String productId, r45.qj0 qj0Var, j12.i iVar) {
        kotlin.jvm.internal.o.g(productId, "productId");
        this.f225834p = productId;
        this.f225835q = qj0Var;
        this.f225836r = iVar;
    }

    @Override // d22.v
    public boolean a() {
        return this.f364203l;
    }

    @Override // d22.v
    public d22.p b() {
        return new d22.e0();
    }

    @Override // d22.v
    public boolean isValid() {
        r45.qj0 a17;
        java.lang.String str = this.f225834p;
        if (str.length() == 0) {
            return false;
        }
        j12.i iVar = this.f225836r;
        if (iVar != null) {
            if (iVar != null && (a17 = iVar.a(true)) != null) {
                r1 = a17.f384032d;
            }
            return kotlin.jvm.internal.o.b(str, r1);
        }
        r45.qj0 qj0Var = this.f225835q;
        if (qj0Var != null) {
            return kotlin.jvm.internal.o.b(str, qj0Var != null ? qj0Var.f384032d : null);
        }
        return true;
    }
}
