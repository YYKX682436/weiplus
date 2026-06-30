package en5;

/* loaded from: classes14.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.k f255527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f255529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(c1.k kVar, yz5.l lVar, n0.e5 e5Var) {
        super(1);
        this.f255527d = kVar;
        this.f255528e = lVar;
        this.f255529f = e5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        j0.h2 $receiver = (j0.h2) obj;
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        c1.j.a(this.f255527d, false, 1, null);
        java.lang.Object value = this.f255529f.getValue();
        kotlin.jvm.internal.o.f(value, "<get-value>(...)");
        this.f255528e.invoke(value);
        return jz5.f0.f302826a;
    }
}
