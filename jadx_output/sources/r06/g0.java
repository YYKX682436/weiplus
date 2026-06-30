package r06;

/* loaded from: classes16.dex */
public class g0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.v2 f368421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r06.j0 f368422e;

    public g0(r06.j0 j0Var, f26.v2 v2Var) {
        this.f368422e = j0Var;
        this.f368421d = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o26.q qVar = new o26.q();
        java.util.Iterator it = this.f368422e.i().iterator();
        while (it.hasNext()) {
            qVar.add(((o06.n0) it.next()).d(this.f368421d));
        }
        return qVar;
    }
}
