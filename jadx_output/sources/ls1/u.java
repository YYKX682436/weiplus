package ls1;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321012d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ls1.e0 e0Var) {
        super(3);
        this.f321012d = e0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String titles = (java.lang.String) obj;
        java.lang.String data = (java.lang.String) obj2;
        java.util.List performance = (java.util.List) obj3;
        kotlin.jvm.internal.o.g(titles, "titles");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(performance, "performance");
        ls1.e0 e0Var = this.f321012d;
        e0Var.V.c(titles, data, e0Var.f181916a, performance);
        return jz5.f0.f302826a;
    }
}
