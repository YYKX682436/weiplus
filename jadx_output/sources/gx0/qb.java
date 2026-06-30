package gx0;

/* loaded from: classes5.dex */
public final class qb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.q f276884f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(gx0.ac acVar, ex0.q qVar, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276883e = acVar;
        this.f276884f = qVar;
        this.f276885g = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.qb(this.f276883e, this.f276884f, this.f276885g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.qb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276882d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.ac acVar = this.f276883e;
            acVar.S7(this.f276884f);
            acVar.j8(this.f276885g, vu0.w.f440169g);
            gx0.bf c86 = acVar.c8();
            this.f276882d = 1;
            if (gx0.bf.d7(c86, null, null, false, this, 7, null) == aVar) {
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
