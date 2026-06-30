package qf2;

/* loaded from: classes.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362423g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(qf2.y1 y1Var, dk2.m mVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362421e = y1Var;
        this.f362422f = mVar;
        this.f362423g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.j1(this.f362421e, this.f362422f, this.f362423g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362420d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.y1 y1Var = this.f362421e;
            dk2.m mVar = this.f362422f;
            qf2.i1 i1Var = new qf2.i1(this.f362423g);
            this.f362420d = 1;
            if (qf2.y1.b7(y1Var, mVar, 3, true, i1Var, this) == aVar) {
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
