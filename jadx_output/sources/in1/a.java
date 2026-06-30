package in1;

/* loaded from: classes11.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292771d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f292772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in1.e f292773f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(in1.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292773f = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        in1.a aVar = new in1.a(this.f292773f, continuation);
        aVar.f292772e = obj;
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((in1.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292771d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((kotlinx.coroutines.y0) this.f292772e).hashCode();
            in1.e eVar = this.f292773f;
            java.lang.String str = eVar.f292779e;
            kv.b0 b0Var = eVar.f292784m;
            java.lang.String str2 = eVar.f292782h;
            float f17 = eVar.f292780f;
            this.f292771d = 1;
            if (((hn1.s) b0Var).mj(str, str2, f17, this) == aVar) {
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
