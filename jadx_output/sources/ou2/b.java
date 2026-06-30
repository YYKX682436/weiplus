package ou2;

/* loaded from: classes8.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f348918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f348919e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f348920f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f348921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f348922h;

    /* renamed from: i, reason: collision with root package name */
    public int f348923i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ou2.d f348924m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ts5.m f348925n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ts5.p f348926o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f348927p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ou2.d dVar, ts5.m mVar, ts5.p pVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f348924m = dVar;
        this.f348925n = mVar;
        this.f348926o = pVar;
        this.f348927p = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ou2.b(this.f348924m, this.f348925n, this.f348926o, this.f348927p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ou2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ou2.d dVar;
        ts5.m mVar;
        boolean z17;
        kotlinx.coroutines.sync.d dVar2;
        ts5.p pVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f348923i;
        boolean z18 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dVar = this.f348924m;
            kotlinx.coroutines.sync.d dVar3 = dVar.f348934c;
            this.f348918d = dVar3;
            this.f348919e = dVar;
            mVar = this.f348925n;
            this.f348920f = mVar;
            ts5.p pVar2 = this.f348926o;
            this.f348921g = pVar2;
            boolean z19 = this.f348927p;
            this.f348922h = z19;
            this.f348923i = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar3;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            z17 = z19;
            dVar2 = kVar;
            pVar = pVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z17 = this.f348922h;
            pVar = (ts5.p) this.f348921g;
            mVar = (ts5.m) this.f348920f;
            dVar = (ou2.d) this.f348919e;
            dVar2 = (kotlinx.coroutines.sync.d) this.f348918d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            ou2.e eVar = dVar.f348932a;
            if (!z17) {
                z18 = false;
            }
            eVar.a(mVar, pVar, z18);
        } finally {
            try {
                ((kotlinx.coroutines.sync.k) dVar2).d(null);
                return jz5.f0.f302826a;
            } catch (java.lang.Throwable th6) {
            }
        }
        ((kotlinx.coroutines.sync.k) dVar2).d(null);
        return jz5.f0.f302826a;
    }
}
