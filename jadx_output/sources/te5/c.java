package te5;

/* loaded from: classes12.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f418615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f418616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l70.d dVar, java.lang.ref.WeakReference weakReference, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418615e = dVar;
        this.f418616f = weakReference;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te5.c(this.f418615e, this.f418616f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f418614d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            x70.g a17 = x70.g.f452415f.a();
            this.f418614d = 1;
            obj = a17.T6(this.f418615e, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((l70.e) obj).f316818a == l70.f.f316820d && (aVar = (yz5.a) this.f418616f.get()) != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
