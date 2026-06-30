package y21;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f459038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y21.e f459039e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y21.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f459039e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new y21.c(this.f459039e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y21.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f459038d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f459038d = 1;
            obj = this.f459039e.c(this);
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
