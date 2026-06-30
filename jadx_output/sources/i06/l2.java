package i06;

/* loaded from: classes15.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.n2 f286690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.q2 f286691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(i06.n2 n2Var, i06.q2 q2Var) {
        super(0);
        this.f286690d = n2Var;
        this.f286691e = q2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        h16.c cVar;
        t06.g a17 = i06.n2.a(this.f286690d);
        if (a17 == null || (cVar = a17.f414537b) == null) {
            str = null;
        } else {
            str = cVar.f278229a == h16.b.f278226o ? cVar.f278234f : null;
        }
        if (str == null) {
            return null;
        }
        if (str.length() > 0) {
            return this.f286691e.f286728e.getClassLoader().loadClass(r26.i0.u(str, '/', '.', false, 4, null));
        }
        return null;
    }
}
