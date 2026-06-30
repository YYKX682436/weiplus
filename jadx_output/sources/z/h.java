package z;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f468673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z.e f468674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f468675g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f468676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.Object obj, z.e eVar, n0.e5 e5Var, n0.e5 e5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468673e = obj;
        this.f468674f = eVar;
        this.f468675g = e5Var;
        this.f468676h = e5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z.h(this.f468673e, this.f468674f, this.f468675g, this.f468676h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468672d;
        z.e eVar = this.f468674f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!kotlin.jvm.internal.o.b(this.f468673e, ((n0.q4) eVar.f468634e).getValue())) {
                z.e eVar2 = this.f468674f;
                java.lang.Object obj2 = this.f468673e;
                z.p1 p1Var = z.j.f468703a;
                z.p pVar = (z.p) this.f468675g.getValue();
                this.f468672d = 1;
                if (z.e.c(eVar2, obj2, pVar, null, null, this, 12, null) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        z.p1 p1Var2 = z.j.f468703a;
        yz5.l lVar = (yz5.l) this.f468676h.getValue();
        if (lVar != null) {
            lVar.invoke(eVar.d());
        }
        return jz5.f0.f302826a;
    }
}
