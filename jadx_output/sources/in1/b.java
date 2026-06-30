package in1;

/* loaded from: classes11.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in1.e f292775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(in1.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292775e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new in1.b(this.f292775e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((in1.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292774d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            in1.e eVar = this.f292775e;
            kv.b0 b0Var = eVar.f292784m;
            java.lang.String str = eVar.f292779e;
            java.lang.String str2 = eVar.f292782h;
            float f17 = eVar.f292780f;
            this.f292774d = 1;
            if (kv.b0.n4(b0Var, str, str2, f17, null, this, 8, null) == aVar) {
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
