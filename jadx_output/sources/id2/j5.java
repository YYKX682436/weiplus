package id2;

/* loaded from: classes.dex */
public final class j5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.p5 f290640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(id2.p5 p5Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290640e = p5Var;
        this.f290641f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.j5(this.f290640e, this.f290641f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.j5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290639d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            id2.p5 p5Var = this.f290640e;
            r45.hu1 hu1Var = p5Var.f290748i;
            ek2.m3 m3Var = new ek2.m3(2, 0L, 0L, "", hu1Var != null ? hu1Var.getByteString(3) : null);
            id2.i5 i5Var = new id2.i5(this.f290641f, p5Var);
            this.f290639d = 1;
            if (xg2.g.c(m3Var, i5Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
