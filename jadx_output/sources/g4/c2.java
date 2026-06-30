package g4;

/* loaded from: classes5.dex */
public final class c2 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268222d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268223e;

    /* renamed from: f, reason: collision with root package name */
    public int f268224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.a1 f268226h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268227i;

    /* renamed from: m, reason: collision with root package name */
    public int f268228m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(kotlin.coroutines.Continuation continuation, g4.y2 y2Var, g4.a1 a1Var) {
        super(3, continuation);
        this.f268225g = y2Var;
        this.f268226h = a1Var;
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        kotlinx.coroutines.flow.k create = (kotlinx.coroutines.flow.k) obj;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(create, "$this$create");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.c2 c2Var = new g4.c2(continuation, this.f268225g, this.f268226h);
        c2Var.f268222d = create;
        c2Var.f268223e = obj2;
        return c2Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.k kVar;
        int intValue;
        g4.z2 z2Var;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.j b2Var;
        g4.a1 a1Var = this.f268226h;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268224f;
        g4.y2 y2Var = this.f268225g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kVar = (kotlinx.coroutines.flow.k) this.f268222d;
                intValue = ((java.lang.Number) this.f268223e).intValue();
                z2Var = y2Var.f268634e;
                kotlinx.coroutines.sync.d dVar = z2Var.f268651a;
                this.f268222d = kVar;
                this.f268223e = z2Var;
                this.f268227i = dVar;
                this.f268228m = intValue;
                this.f268224f = 1;
                kotlinx.coroutines.sync.k kVar2 = (kotlinx.coroutines.sync.k) dVar;
                java.lang.Object b17 = kVar2.b(null, this);
                obj2 = kVar2;
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return jz5.f0.f302826a;
                }
                intValue = this.f268228m;
                java.lang.Object obj3 = (kotlinx.coroutines.sync.d) this.f268227i;
                z2Var = (g4.z2) this.f268223e;
                kVar = (kotlinx.coroutines.flow.k) this.f268222d;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj3;
            }
            g4.c3 c3Var = z2Var.f268652b;
            if (kotlin.jvm.internal.o.b(c3Var.f268239k.b(a1Var), g4.x0.f268604b)) {
                b2Var = new kotlinx.coroutines.flow.p(new g4.t0[0]);
            } else {
                if (!(c3Var.f268239k.b(a1Var) instanceof g4.v0)) {
                    c3Var.f(a1Var, g4.x0.f268605c);
                }
                ((kotlinx.coroutines.sync.k) obj2).d(null);
                b2Var = new g4.b2(kotlinx.coroutines.flow.l.j(y2Var.f268630a, intValue == 0 ? 0 : 1), intValue);
            }
            this.f268222d = null;
            this.f268223e = null;
            this.f268227i = null;
            this.f268224f = 2;
            if (b2Var.a(kVar, this) == aVar) {
                return aVar;
            }
            return jz5.f0.f302826a;
        } finally {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
        }
    }
}
