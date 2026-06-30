package rt3;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399527e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt3.d(this.f399527e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt3.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f399526d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rt3.j jVar = rt3.j.f399540a;
            this.f399526d = 1;
            obj = jVar.d(this.f399527e, this);
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
