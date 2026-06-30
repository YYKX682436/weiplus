package h4;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278700d;

    /* renamed from: e, reason: collision with root package name */
    public int f278701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f278702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278702f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        h4.v vVar = new h4.v(this.f278702f, continuation);
        vVar.f278700d = obj;
        return vVar;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.v) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278701e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            h4.u uVar = new h4.u(this, (kotlinx.coroutines.flow.k) this.f278700d);
            this.f278701e = 1;
            if (this.f278702f.a(uVar, this) == aVar) {
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
