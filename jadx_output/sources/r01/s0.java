package r01;

/* loaded from: classes7.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f368235d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f368236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f368237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r01.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f368237f = l1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r01.s0 s0Var = new r01.s0(this.f368237f, continuation);
        s0Var.f368236e = obj;
        return s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((r01.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.f1 b17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f368235d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f368236e;
            r01.l1 l1Var = this.f368237f;
            kotlinx.coroutines.f1 b18 = kotlinx.coroutines.l.b(y0Var, null, null, new r01.p0(l1Var, null), 3, null);
            b17 = kotlinx.coroutines.l.b(y0Var, null, null, new r01.r0(l1Var, null), 3, null);
            this.f368236e = b17;
            this.f368235d = 1;
            obj = ((kotlinx.coroutines.g1) b18).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f368236e;
                kotlin.ResultKt.throwOnFailure(obj);
                return new jz5.l(obj2, obj);
            }
            b17 = (kotlinx.coroutines.f1) this.f368236e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f368236e = obj;
        this.f368235d = 2;
        java.lang.Object k17 = b17.k(this);
        if (k17 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = k17;
        return new jz5.l(obj2, obj);
    }
}
