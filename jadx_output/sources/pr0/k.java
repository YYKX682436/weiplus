package pr0;

/* loaded from: classes11.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f357869d;

    /* renamed from: e, reason: collision with root package name */
    public int f357870e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f357872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f357874i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pr0.n f357875m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.p pVar, java.lang.String str, long j17, pr0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357872g = pVar;
        this.f357873h = str;
        this.f357874i = j17;
        this.f357875m = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pr0.k kVar = new pr0.k(this.f357872g, this.f357873h, this.f357874i, this.f357875m, continuation);
        kVar.f357871f = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357870e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f357871f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f357869d = currentTimeMillis;
            this.f357870e = 1;
            if (this.f357872g.invoke(y0Var, this) == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f357869d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.String str = pr0.n.f357896q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Launch End[");
        java.lang.String str2 = this.f357873h;
        sb6.append(str2);
        sb6.append("] total cost:");
        long j18 = this.f357874i;
        sb6.append(currentTimeMillis2 - j18);
        sb6.append(" post cost:");
        sb6.append(j17 - j18);
        sb6.append(" exec cost:");
        sb6.append(currentTimeMillis2 - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
        this.f357875m.n(str2, currentTimeMillis2 - j18);
        return jz5.f0.f302826a;
    }
}
