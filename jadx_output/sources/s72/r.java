package s72;

/* loaded from: classes12.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f404138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404141g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f404142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s72.j0 j0Var, java.util.List list, java.lang.String str, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404139e = j0Var;
        this.f404140f = list;
        this.f404141g = str;
        this.f404142h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.r(this.f404139e, this.f404140f, this.f404141g, this.f404142h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f404138d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f404138d = 1;
            java.util.HashSet hashSet = s72.j0.f404069i;
            s72.j0 j0Var = this.f404139e;
            j0Var.getClass();
            if (((kotlinx.coroutines.g1) s72.x0.f404171a.a("handleBatchGetXml", new s72.q(this.f404140f, this.f404141g, j0Var, null))).k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f404142h.invoke();
        return jz5.f0.f302826a;
    }
}
