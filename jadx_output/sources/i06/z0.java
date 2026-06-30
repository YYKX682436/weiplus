package i06;

/* loaded from: classes15.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f286806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i06.f1 f1Var) {
        super(0);
        this.f286806d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Collection<o06.g> T = this.f286806d.a().T();
        kotlin.jvm.internal.o.f(T, "getSealedSubclasses(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (o06.g gVar : T) {
            kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            java.lang.Class k17 = i06.o4.k(gVar);
            i06.k1 k1Var = k17 != null ? new i06.k1(k17) : null;
            if (k1Var != null) {
                arrayList.add(k1Var);
            }
        }
        return arrayList;
    }
}
