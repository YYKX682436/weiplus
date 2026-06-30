package dk5;

/* loaded from: classes9.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f234664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f234665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234667g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kotlinx.coroutines.flow.j jVar, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f234665e = jVar;
        this.f234666f = str;
        this.f234667g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk5.i0(this.f234665e, this.f234666f, this.f234667g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f234664d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk5.h0 h0Var = new dk5.h0(this.f234666f, this.f234667g);
            this.f234664d = 1;
            if (this.f234665e.a(h0Var, this) == aVar) {
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
