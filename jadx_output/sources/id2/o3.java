package id2;

/* loaded from: classes.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f290711h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f290712i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f290713m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f290714n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f290715o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ km2.b f290716p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f290717q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(id2.u3 u3Var, java.lang.String str, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19, km2.b bVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290708e = u3Var;
        this.f290709f = str;
        this.f290710g = context;
        this.f290711h = j17;
        this.f290712i = j18;
        this.f290713m = z17;
        this.f290714n = z18;
        this.f290715o = z19;
        this.f290716p = bVar;
        this.f290717q = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.o3(this.f290708e, this.f290709f, this.f290710g, this.f290711h, this.f290712i, this.f290713m, this.f290714n, this.f290715o, this.f290716p, this.f290717q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290707d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            id2.n3 n3Var = new id2.n3(this.f290708e, this.f290709f, this.f290710g, this.f290711h, this.f290712i, this.f290713m, this.f290714n, this.f290715o, this.f290716p, this.f290717q, null);
            this.f290707d = 1;
            if (kotlinx.coroutines.l.g(p0Var, n3Var, this) == aVar) {
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
