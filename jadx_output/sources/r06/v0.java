package r06;

/* loaded from: classes15.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.x0 f368544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(r06.x0 x0Var) {
        super(0);
        this.f368544d = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r06.x0 x0Var = this.f368544d;
        r06.t0 t0Var = x0Var.f368552m;
        if (t0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Dependencies of module ");
            java.lang.String str = x0Var.getName().f334169d;
            kotlin.jvm.internal.o.f(str, "toString(...)");
            sb6.append(str);
            sb6.append(" were not set before querying module content");
            throw new java.lang.AssertionError(sb6.toString());
        }
        x0Var.j0();
        java.util.List list = ((r06.u0) t0Var).f368537a;
        list.contains(x0Var);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((r06.x0) it.next()).getClass();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            o06.e1 e1Var = ((r06.x0) it6.next()).f368553n;
            kotlin.jvm.internal.o.d(e1Var);
            arrayList.add(e1Var);
        }
        return new r06.u(arrayList, "CompositeProvider@ModuleDescriptor for " + x0Var.getName());
    }
}
