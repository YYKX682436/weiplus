package yu0;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f465789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.d f465790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yu0.m f465791f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yu0.d dVar, yu0.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465790e = dVar;
        this.f465791f = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yu0.g(this.f465790e, this.f465791f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465789d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yu0.d dVar = this.f465790e;
            if (!dVar.f465785b.isEmpty()) {
                yu0.m mVar = this.f465791f;
                mVar.f465813d.put(dVar.f465784a, new java.util.concurrent.atomic.AtomicInteger(0));
                mVar.f465814e.put(dVar.f465784a, new java.lang.Integer(dVar.f465785b.size()));
                mVar.f465815f.put(dVar.f465784a, dVar);
                this.f465789d = 1;
                if (yu0.m.a(mVar, "start submit", this) == aVar) {
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
