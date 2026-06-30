package tf2;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf2.k f418930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf2.a f418931f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tf2.k kVar, tf2.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418930e = kVar;
        this.f418931f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf2.j(this.f418930e, this.f418931f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418929d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f418930e.f418933n;
            if (obj2 != null) {
                if (!(!((u26.o) obj2).j())) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    this.f418929d = 1;
                    if (((u26.o) obj2).t(this.f418931f, this) == aVar) {
                        return aVar;
                    }
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
