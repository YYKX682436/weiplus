package qf2;

/* loaded from: classes.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.pf f362297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362299h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(qf2.c3 c3Var, dk2.pf pfVar, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362296e = c3Var;
        this.f362297f = pfVar;
        this.f362298g = i17;
        this.f362299h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.b2(this.f362296e, this.f362297f, this.f362298g, this.f362299h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362295d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.c3 c3Var = this.f362296e;
            dk2.pf pfVar = this.f362297f;
            int i18 = this.f362298g;
            yz5.l lVar = this.f362299h;
            this.f362295d = 1;
            if (qf2.c3.Z6(c3Var, pfVar, i18, true, lVar, this) == aVar) {
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
