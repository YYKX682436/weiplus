package rm0;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397415e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f397416f;

    /* renamed from: g, reason: collision with root package name */
    public int f397417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f397418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ lm5.d f397419i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f397420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.modelbase.i iVar, lm5.d dVar, com.tencent.mm.protobuf.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397418h = iVar;
        this.f397419i = dVar;
        this.f397420m = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rm0.g(this.f397418h, this.f397419i, this.f397420m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397417g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelbase.i iVar = this.f397418h;
            this.f397414d = iVar;
            lm5.d dVar = this.f397419i;
            this.f397415e = dVar;
            com.tencent.mm.protobuf.f fVar = this.f397420m;
            this.f397416f = fVar;
            this.f397417g = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            com.tencent.mm.modelbase.o oVar = iVar.f70646f;
            iVar.l().L(dVar, new rm0.e(oVar != null ? oVar.f70713d : 0, fVar, iVar, rVar));
            rVar.m(new rm0.f(iVar));
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
