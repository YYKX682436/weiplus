package gx0;

/* loaded from: classes5.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.h1 f277251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(gx0.h1 h1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277251d = h1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.z0(this.f277251d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.z0 z0Var = (gx0.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.h1 h1Var = this.f277251d;
        ex0.a0 a0Var = h1Var.M7().f276642r;
        boolean z18 = false;
        if (a0Var != null && (list = a0Var.f257097g.f257180h) != null) {
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((ex0.b) it.next()).E() != null) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                z18 = true;
            }
        }
        h1Var.A = z18;
        return jz5.f0.f302826a;
    }
}
