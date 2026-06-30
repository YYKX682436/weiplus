package v26;

/* loaded from: classes14.dex */
public abstract class n extends v26.g {

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f433034g;

    public n(kotlinx.coroutines.flow.j jVar, oz5.l lVar, int i17, u26.u uVar) {
        super(lVar, i17, uVar);
        this.f433034g = jVar;
    }

    @Override // v26.g, kotlinx.coroutines.flow.j
    public java.lang.Object a(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (this.f433003e == -3) {
            oz5.l context = continuation.getContext();
            oz5.l plus = context.plus(this.f433002d);
            if (kotlin.jvm.internal.o.b(plus, context)) {
                a17 = j(kVar, continuation);
                if (a17 != pz5.a.f359186d) {
                    return f0Var;
                }
            } else {
                int i17 = oz5.f.Y0;
                oz5.e eVar = oz5.e.f350327d;
                if (kotlin.jvm.internal.o.b(plus.get(eVar), context.get(eVar))) {
                    oz5.l context2 = continuation.getContext();
                    if (!(kVar instanceof v26.q0 ? true : kVar instanceof v26.j0)) {
                        kVar = new v26.u0(kVar, context2);
                    }
                    a17 = v26.h.a(plus, kVar, kotlinx.coroutines.internal.r0.b(plus), new v26.m(this, null), continuation);
                    pz5.a aVar = pz5.a.f359186d;
                    if (a17 != aVar) {
                        a17 = f0Var;
                    }
                    if (a17 != aVar) {
                        return f0Var;
                    }
                }
            }
            return a17;
        }
        a17 = super.a(kVar, continuation);
        if (a17 != pz5.a.f359186d) {
            return f0Var;
        }
        return a17;
    }

    @Override // v26.g
    public java.lang.Object f(u26.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        java.lang.Object j17 = j(new v26.q0(r0Var), continuation);
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    public abstract java.lang.Object j(kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation);

    @Override // v26.g
    public java.lang.String toString() {
        return this.f433034g + " -> " + super.toString();
    }
}
