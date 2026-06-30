package pr0;

/* loaded from: classes14.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.n0 f357889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(pr0.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357889e = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.l0(this.f357889e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357888d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sr0.i iVar = this.f357889e.f357834e;
            if (iVar != null) {
                this.f357888d = 1;
                if (sr0.f.H((sr0.f) iVar, this) == aVar) {
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
