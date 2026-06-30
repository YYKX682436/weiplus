package ra3;

/* loaded from: classes3.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f393487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j f393488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f393488e = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ra3.a0(this.f393488e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ra3.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f393487d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ra3.z zVar = ra3.z.f393546d;
            this.f393487d = 1;
            if (this.f393488e.a(zVar, this) == aVar) {
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
