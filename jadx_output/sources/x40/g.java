package x40;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f451764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x40.h f451765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x40.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451765e = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x40.g(this.f451765e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x40.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451764d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            x40.h hVar = this.f451765e;
            pi0.l1 l1Var = hVar.f451766a;
            hVar.f451766a = null;
            if (l1Var != null) {
                this.f451764d = 1;
                if (l1Var.h("FinderAudioRouter", this) == aVar) {
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
