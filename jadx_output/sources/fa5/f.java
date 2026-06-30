package fa5;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260798d;

    /* renamed from: e, reason: collision with root package name */
    public int f260799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f260800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fa5.j f260801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260802h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260803i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f260804m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.l lVar, fa5.j jVar, java.lang.String str, java.lang.String str2, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260800f = lVar;
        this.f260801g = jVar;
        this.f260802h = str;
        this.f260803i = str2;
        this.f260804m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fa5.f(this.f260800f, this.f260801g, this.f260802h, this.f260803i, this.f260804m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fa5.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f260799e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yz5.l lVar2 = this.f260800f;
            this.f260798d = lVar2;
            this.f260799e = 1;
            java.lang.Object Bi = this.f260801g.Bi(this.f260802h, this.f260803i, this.f260804m, this);
            if (Bi == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = Bi;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (yz5.l) this.f260798d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        lVar.invoke(obj);
        return jz5.f0.f302826a;
    }
}
