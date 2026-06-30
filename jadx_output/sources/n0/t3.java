package n0;

/* loaded from: classes14.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0.d f333705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.p1 f333706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(o0.d dVar, n0.p1 p1Var) {
        super(0);
        this.f333705d = dVar;
        this.f333706e = p1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f333705d.iterator();
        while (true) {
            o0.c cVar = (o0.c) it;
            if (!cVar.hasNext()) {
                return jz5.f0.f302826a;
            }
            ((n0.j1) this.f333706e).r(cVar.next());
        }
    }
}
