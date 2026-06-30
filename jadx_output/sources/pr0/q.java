package pr0;

/* loaded from: classes14.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.r f357907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(pr0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357907e = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.q(this.f357907e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357906d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sr0.i iVar = this.f357907e.f357834e;
            if (iVar != null) {
                this.f357906d = 1;
                if (iVar.r(this) == aVar) {
                    return aVar;
                }
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
