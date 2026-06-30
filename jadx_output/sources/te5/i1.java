package te5;

/* loaded from: classes5.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f418677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f418678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f418679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f418680h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f418681i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f418682m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f418683n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f418684o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f418685p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(te5.l1 l1Var, android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var, boolean z17, boolean z18, boolean z19, boolean z27, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418677e = l1Var;
        this.f418678f = context;
        this.f418679g = list;
        this.f418680h = z3Var;
        this.f418681i = z17;
        this.f418682m = z18;
        this.f418683n = z19;
        this.f418684o = z27;
        this.f418685p = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te5.i1(this.f418677e, this.f418678f, this.f418679g, this.f418680h, this.f418681i, this.f418682m, this.f418683n, this.f418684o, this.f418685p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418676d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            te5.l1 l1Var = this.f418677e;
            android.content.Context context = this.f418678f;
            java.util.List list = this.f418679g;
            com.tencent.mm.storage.z3 z3Var = this.f418680h;
            boolean z17 = this.f418681i;
            boolean z18 = this.f418682m;
            boolean z19 = this.f418683n;
            boolean z27 = this.f418684o;
            int i18 = this.f418685p;
            this.f418676d = 1;
            obj = l1Var.mj(context, list, z3Var, z17, z18, z19, z27, i18, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
