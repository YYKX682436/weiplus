package ly0;

/* loaded from: classes5.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f322183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f322184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322184e = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ly0.a(this.f322184e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly0.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f322183d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ly0.n nVar = (ly0.n) this.f322184e.get();
            if (nVar != null) {
                this.f322183d = 1;
                java.lang.Object g17 = kotlinx.coroutines.l.g(((kotlinx.coroutines.internal.h) nVar.f322220e).f310496d, new ly0.i(nVar, null), this);
                if (g17 != aVar) {
                    g17 = f0Var;
                }
                if (g17 == aVar) {
                    return aVar;
                }
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
