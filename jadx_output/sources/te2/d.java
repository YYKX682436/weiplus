package te2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.l f417936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f417937f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417938g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(te2.l lVar, ce2.i iVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417936e = lVar;
        this.f417937f = iVar;
        this.f417938g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.d(this.f417936e, this.f417937f, this.f417938g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417935d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f417935d = 1;
            if (kotlinx.coroutines.k1.b(1250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ce2.i iVar = this.f417937f;
        java.lang.String str = iVar != null ? iVar.field_rewardProductId : null;
        te2.l lVar = this.f417936e;
        java.lang.String str2 = this.f417938g;
        te2.l.c(lVar, str, 1, str2);
        te2.l.f(lVar, iVar != null ? iVar.field_rewardProductId : null, str2, 1);
        return jz5.f0.f302826a;
    }
}
