package v26;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f432990d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f432992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v26.g f432993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.coroutines.flow.k kVar, v26.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432992f = kVar;
        this.f432993g = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        v26.e eVar = new v26.e(this.f432992f, this.f432993g, continuation);
        eVar.f432991e = obj;
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f432990d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u26.t0 i18 = this.f432993g.i((kotlinx.coroutines.y0) this.f432991e);
            this.f432990d = 1;
            java.lang.Object a17 = kotlinx.coroutines.flow.t.a(this.f432992f, i18, true, this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
