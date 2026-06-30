package gx0;

/* loaded from: classes5.dex */
public final class lb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f276678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(gx0.ac acVar, com.tencent.maas.base.MJID mjid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276677e = acVar;
        this.f276678f = mjid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.lb(this.f276677e, this.f276678f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.lb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276676d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ex0.q n76 = this.f276677e.d8().n7(this.f276678f);
            if (n76 == null) {
                return null;
            }
            this.f276676d = 1;
            if (n76.G(this) == aVar) {
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
