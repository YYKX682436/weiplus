package d23;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f225887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f225888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f225890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d23.g f225891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.modelbase.o oVar, java.lang.String str, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, d23.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f225888e = oVar;
        this.f225889f = str;
        this.f225890g = lifecycleScope;
        this.f225891h = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new d23.d(this.f225888e, this.f225889f, this.f225890g, this.f225891h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((d23.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f225887d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            o01.c cVar = o01.d.f341891a;
            com.tencent.mm.modelbase.o commReqResp = this.f225888e;
            kotlin.jvm.internal.o.f(commReqResp, "$commReqResp");
            kotlinx.coroutines.flow.j a17 = cVar.a(commReqResp);
            d23.c cVar2 = new d23.c(this.f225889f, this.f225890g, this.f225891h);
            this.f225887d = 1;
            if (((kotlinx.coroutines.flow.r) a17).a(cVar2, this) == aVar) {
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
