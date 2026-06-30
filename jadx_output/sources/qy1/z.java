package qy1;

/* loaded from: classes13.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ny1.j f367780f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qy1.b0 b0Var, ny1.j jVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367779e = b0Var;
        this.f367780f = jVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qy1.z(this.f367779e, this.f367780f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367778d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = this.f367779e.f367712k;
            this.f367778d = 1;
            if (((u26.o) obj2).t(this.f367780f, this) == aVar) {
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
