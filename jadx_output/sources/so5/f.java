package so5;

/* loaded from: classes14.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so5.m f410823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uo5.q f410824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f410825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(so5.m mVar, uo5.q qVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410823e = mVar;
        this.f410824f = qVar;
        this.f410825g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so5.f(this.f410823e, this.f410824f, this.f410825g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410822d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f410822d = 1;
            if (so5.m.a(this.f410823e, this.f410824f, this.f410825g, this) == aVar) {
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
