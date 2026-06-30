package je2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299259d;

    /* renamed from: e, reason: collision with root package name */
    public int f299260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jm4 f299261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ je2.t f299262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.jm4 jm4Var, je2.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299261f = jm4Var;
        this.f299262g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new je2.s(this.f299261f, this.f299262g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        je2.t tVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f299260e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.kv1 kv1Var = this.f299261f.f377933f;
            if (kv1Var != null) {
                dk2.u7 u7Var = dk2.u7.f234181a;
                je2.t tVar2 = this.f299262g;
                this.f299259d = tVar2;
                this.f299260e = 1;
                if (u7Var.k(kv1Var, this) == aVar) {
                    return aVar;
                }
                tVar = tVar2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tVar = (je2.t) this.f299259d;
        kotlin.ResultKt.throwOnFailure(obj);
        tVar.Q6();
        return jz5.f0.f302826a;
    }
}
