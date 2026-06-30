package lm2;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f319438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.s f319439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f319440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f319441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319442h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319443i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f319444m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(lm2.s sVar, boolean z17, com.tencent.mm.protobuf.g gVar, java.util.List list, java.util.List list2, java.util.List list3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f319439e = sVar;
        this.f319440f = z17;
        this.f319441g = gVar;
        this.f319442h = list;
        this.f319443i = list2;
        this.f319444m = list3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lm2.r(this.f319439e, this.f319440f, this.f319441g, this.f319442h, this.f319443i, this.f319444m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lm2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f319438d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            lm2.q qVar = new lm2.q(this.f319439e, this.f319440f, this.f319441g, this.f319442h, this.f319443i, this.f319444m, null);
            this.f319438d = 1;
            if (kotlinx.coroutines.l.g(g3Var, qVar, this) == aVar) {
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
