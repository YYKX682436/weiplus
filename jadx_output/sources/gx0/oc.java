package gx0;

/* loaded from: classes5.dex */
public final class oc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.sc f276802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(gx0.sc scVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276802e = scVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.oc(this.f276802e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.oc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276801d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf bfVar = (gx0.bf) ((jz5.n) this.f276802e.f276955v).getValue();
            this.f276801d = 1;
            if (bfVar.s7(this) == aVar) {
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
