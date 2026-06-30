package so5;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo5.q f410848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f410849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so5.m f410850g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(uo5.q qVar, int i17, so5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410848e = qVar;
        this.f410849f = i17;
        this.f410850g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so5.i(this.f410848e, this.f410849f, this.f410850g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((so5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410847d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.f3 b17 = kotlinx.coroutines.flow.l.b(((uo5.l) this.f410848e).f429727d);
            so5.h hVar = new so5.h(this.f410849f, this.f410850g);
            this.f410847d = 1;
            if (((kotlinx.coroutines.flow.l2) b17).a(hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
