package pr0;

/* loaded from: classes11.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f357843d;

    /* renamed from: e, reason: collision with root package name */
    public int f357844e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f357846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f357848i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pr0.n f357849m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.p pVar, java.lang.String str, long j17, pr0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357846g = pVar;
        this.f357847h = str;
        this.f357848i = j17;
        this.f357849m = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pr0.i iVar = new pr0.i(this.f357846g, this.f357847h, this.f357848i, this.f357849m, continuation);
        iVar.f357845f = obj;
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357844e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f357845f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f357843d = currentTimeMillis;
            this.f357844e = 1;
            obj = this.f357846g.invoke(y0Var, this);
            if (obj == aVar) {
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f357843d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.String str = pr0.n.f357896q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Async End[");
        java.lang.String str2 = this.f357847h;
        sb6.append(str2);
        sb6.append("] total cost:");
        long j18 = this.f357848i;
        sb6.append(currentTimeMillis2 - j18);
        sb6.append(" post cost:");
        sb6.append(j17 - j18);
        sb6.append(" exec cost:");
        sb6.append(currentTimeMillis2 - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
        this.f357849m.n(str2, currentTimeMillis2 - j18);
        return obj;
    }
}
