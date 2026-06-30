package nk2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f337980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f337981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f337982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f337983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f337984i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337985m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f337986n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337987o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f337988p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f337989q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f337990r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.a aVar, long j17, long j18, long j19, float f17, java.lang.String str, org.json.JSONArray jSONArray, java.lang.String str2, int i17, int i18, int i19, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337980e = aVar;
        this.f337981f = j17;
        this.f337982g = j18;
        this.f337983h = j19;
        this.f337984i = f17;
        this.f337985m = str;
        this.f337986n = jSONArray;
        this.f337987o = str2;
        this.f337988p = i17;
        this.f337989q = i18;
        this.f337990r = i19;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nk2.h(this.f337980e, this.f337981f, this.f337982g, this.f337983h, this.f337984i, this.f337985m, this.f337986n, this.f337987o, this.f337988p, this.f337989q, this.f337990r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nk2.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337979d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            lu5.a aVar2 = lu5.a.f321457f;
            nk2.g gVar = new nk2.g(this.f337981f, this.f337982g, this.f337983h, this.f337984i, this.f337985m, this.f337986n, this.f337987o, this.f337988p, this.f337989q, this.f337990r, null);
            this.f337979d = 1;
            if (kotlinx.coroutines.l.g(aVar2, gVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yz5.a aVar3 = this.f337980e;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        return jz5.f0.f302826a;
    }
}
