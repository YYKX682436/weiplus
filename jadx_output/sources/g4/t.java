package g4;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268559d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268560e;

    /* renamed from: f, reason: collision with root package name */
    public int f268561f;

    public t(kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
    }

    @Override // yz5.q
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        g4.d1 prev = (g4.d1) obj;
        g4.d1 next = (g4.d1) obj2;
        kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) obj3;
        kotlin.jvm.internal.o.g(prev, "prev");
        kotlin.jvm.internal.o.g(next, "next");
        kotlin.jvm.internal.o.g(continuation, "continuation");
        g4.t tVar = new g4.t(continuation);
        tVar.f268559d = prev;
        tVar.f268560e = next;
        return tVar.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268561f;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g4.d1 d1Var = (g4.d1) this.f268559d;
            kotlin.ResultKt.throwOnFailure(obj);
            return d1Var;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        g4.d1 d1Var2 = (g4.d1) this.f268559d;
        g4.d1 d1Var3 = (g4.d1) this.f268560e;
        this.f268559d = d1Var3;
        this.f268561f = 1;
        java.lang.Object b17 = ((h4.r) d1Var2.f268251a.f268412c.f278712a.getValue()).f278686a.b(this);
        java.lang.Object obj2 = jz5.f0.f302826a;
        if (b17 != aVar) {
            b17 = obj2;
        }
        if (b17 != aVar) {
            b17 = obj2;
        }
        if (b17 != aVar) {
            b17 = obj2;
        }
        if (b17 == aVar) {
            obj2 = b17;
        }
        return obj2 == aVar ? aVar : d1Var3;
    }
}
