package i22;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f287982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i22.n0 f287983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i22.j0 f287984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kotlin.jvm.internal.h0 h0Var, i22.n0 n0Var, i22.j0 j0Var) {
        super(1);
        this.f287982d = h0Var;
        this.f287983e = n0Var;
        this.f287984f = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Object obj2 = this.f287982d.f310123d;
        i22.j0 j0Var = this.f287984f;
        i22.n0 n0Var = this.f287983e;
        java.util.List list = (java.util.List) obj2;
        if ((!list.isEmpty()) && j0Var.f287992o.f287967e.size() > intValue) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(list.subList(0, intValue));
            java.lang.String str = j0Var.f287988h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setId:");
            r45.kj0 kj0Var = ((i22.a1) n0Var).f287926b;
            sb6.append(kj0Var != null ? java.lang.Integer.valueOf(kj0Var.f378729g) : null);
            sb6.append(", spanCount changed, new spanCount:");
            sb6.append(intValue);
            sb6.append(", adapter try change data");
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            ((ku5.t0) ku5.t0.f312615d).B(new i22.h0(j0Var, arrayList));
        }
        ((i22.a1) this.f287983e).f287927c = intValue;
        return jz5.f0.f302826a;
    }
}
