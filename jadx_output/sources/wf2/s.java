package wf2;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445617e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wf2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445617e = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wf2.s(this.f445617e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f445616d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f445616d = 1;
            obj = this.f445617e.c7(this);
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
