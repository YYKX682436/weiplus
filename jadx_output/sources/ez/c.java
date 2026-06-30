package ez;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f257702e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f257703f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f257704g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f257705h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f257706i;

    /* renamed from: m, reason: collision with root package name */
    public int f257707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f257708n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257709o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257710p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257711q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257713s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.pluginsdk.model.app.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257708n = dVar;
        this.f257709o = str;
        this.f257710p = str2;
        this.f257711q = str3;
        this.f257712r = str4;
        this.f257713s = str5;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ez.c(this.f257708n, this.f257709o, this.f257710p, this.f257711q, this.f257712r, this.f257713s, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257707m;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.pluginsdk.model.app.d dVar = this.f257708n;
            java.lang.String str = this.f257709o;
            java.lang.String str2 = this.f257710p;
            java.lang.String str3 = this.f257711q;
            java.lang.String str4 = this.f257712r;
            java.lang.String str5 = this.f257713s;
            this.f257701d = dVar;
            this.f257702e = str;
            this.f257703f = str2;
            this.f257704g = str3;
            this.f257705h = str4;
            this.f257706i = str5;
            this.f257707m = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            gm0.j1.d().g(new bt3.i0(dVar, str, str2, str3, str4, str5, false, new ez.b(rVar)));
            obj = rVar.j();
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
