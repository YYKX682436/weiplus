package dk5;

/* loaded from: classes3.dex */
public final class w6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f234980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f234981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f234981e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk5.w6(this.f234981e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk5.w6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f234980d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk5.v6 v6Var = dk5.v6.f234965d;
            this.f234980d = 1;
            if (this.f234981e.a(v6Var, this) == aVar) {
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
