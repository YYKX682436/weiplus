package d83;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f226988d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f226989e;

    /* renamed from: f, reason: collision with root package name */
    public int f226990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f226991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lm5.d f226992h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.modelbase.i iVar, lm5.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f226991g = iVar;
        this.f226992h = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d83.l(this.f226991g, this.f226992h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d83.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f226990f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelbase.i iVar = this.f226991g;
            this.f226988d = iVar;
            lm5.d dVar = this.f226992h;
            this.f226989e = dVar;
            this.f226990f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            iVar.l().L(dVar, new d83.k(rVar));
            rVar.m(new d83.j(iVar));
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
