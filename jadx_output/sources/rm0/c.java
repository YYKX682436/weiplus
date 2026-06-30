package rm0;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397401d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397402e;

    /* renamed from: f, reason: collision with root package name */
    public int f397403f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f397404g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lm5.d f397405h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.modelbase.i iVar, lm5.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397404g = iVar;
        this.f397405h = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rm0.c(this.f397404g, this.f397405h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397403f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelbase.i iVar = this.f397404g;
            this.f397401d = iVar;
            lm5.d dVar = this.f397405h;
            this.f397402e = dVar;
            this.f397403f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(new rm0.a(iVar.l().L(dVar, new rm0.b(rVar))));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
