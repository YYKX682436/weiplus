package eq2;

/* loaded from: classes2.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f255892d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jq2.a f255895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f255897i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f255898m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f255899n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, jq2.a aVar, java.lang.String str, int i18, int i19, int i27, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255894f = i17;
        this.f255895g = aVar;
        this.f255896h = str;
        this.f255897i = i18;
        this.f255898m = i19;
        this.f255899n = i27;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        eq2.d dVar = new eq2.d(this.f255894f, this.f255895g, this.f255896h, this.f255897i, this.f255898m, this.f255899n, continuation);
        dVar.f255893e = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eq2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255892d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f255893e;
            eq2.c cVar = new eq2.c(this.f255894f, this.f255895g, this.f255896h, this.f255897i, this.f255898m, this.f255899n);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            aq2.p pVar = new aq2.p(cVar, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null);
            this.f255892d = 1;
            if (ay1.l.h(pVar, this) == aVar) {
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
