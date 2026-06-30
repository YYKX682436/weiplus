package q16;

/* loaded from: classes15.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q16.a0 f359784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q16.a0 a0Var) {
        super(1);
        this.f359784d = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f26.l2 it = (f26.l2) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.b()) {
            return "*";
        }
        f26.o0 type = it.getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        java.lang.String v17 = this.f359784d.v(type);
        if (it.c() == f26.d3.f259143f) {
            return v17;
        }
        return it.c() + ' ' + v17;
    }
}
