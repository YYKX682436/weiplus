package h93;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f279702d;

    /* renamed from: e, reason: collision with root package name */
    public int f279703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h93.k f279704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h93.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279704f = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h93.h(this.f279704f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h93.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f279703e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h0Var = new kotlin.jvm.internal.h0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            h93.e eVar = new h93.e(h0Var, null);
            this.f279702d = h0Var;
            this.f279703e = 1;
            if (kotlinx.coroutines.l.g(p0Var, eVar, this) == aVar) {
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
            h0Var = (kotlin.jvm.internal.h0) this.f279702d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        h93.g gVar = new h93.g(this.f279704f, h0Var, null);
        this.f279702d = null;
        this.f279703e = 2;
        if (kotlinx.coroutines.l.g(g3Var, gVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
