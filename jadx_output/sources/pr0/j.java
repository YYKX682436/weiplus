package pr0;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357855d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357856e;

    /* renamed from: f, reason: collision with root package name */
    public long f357857f;

    /* renamed from: g, reason: collision with root package name */
    public int f357858g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pr0.n f357860i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357861m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f357862n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f357863o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(pr0.n nVar, java.lang.String str, long j17, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357860i = nVar;
        this.f357861m = str;
        this.f357862n = j17;
        this.f357863o = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pr0.j jVar = new pr0.j(this.f357860i, this.f357861m, this.f357862n, this.f357863o, continuation);
        jVar.f357859h = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        long currentTimeMillis;
        yz5.p pVar;
        kotlinx.coroutines.sync.k kVar;
        kotlinx.coroutines.sync.d dVar;
        java.lang.Throwable th6;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357858g;
        pr0.n nVar = this.f357860i;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                y0Var = (kotlinx.coroutines.y0) this.f357859h;
                currentTimeMillis = java.lang.System.currentTimeMillis();
                kotlinx.coroutines.sync.d dVar2 = nVar.f357900p;
                this.f357859h = y0Var;
                this.f357855d = dVar2;
                pVar = this.f357863o;
                this.f357856e = pVar;
                this.f357857f = currentTimeMillis;
                this.f357858g = 1;
                kVar = (kotlinx.coroutines.sync.k) dVar2;
                if (kVar.b(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j17 = this.f357857f;
                    dVar = (kotlinx.coroutines.sync.d) this.f357859h;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ((kotlinx.coroutines.sync.k) dVar).d(null);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        java.lang.String str = pr0.n.f357896q;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cameraAsyncWithSync End[");
                        java.lang.String str2 = this.f357861m;
                        sb6.append(str2);
                        sb6.append("] total cost:");
                        long j18 = this.f357862n;
                        sb6.append(currentTimeMillis2 - j18);
                        sb6.append(" post cost:");
                        sb6.append(j17 - j18);
                        sb6.append(" exec cost:");
                        sb6.append(currentTimeMillis2 - j17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
                        nVar.n(str2, currentTimeMillis2 - j18);
                        return obj;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        ((kotlinx.coroutines.sync.k) dVar).d(null);
                        throw th6;
                    }
                }
                currentTimeMillis = this.f357857f;
                pVar = (yz5.p) this.f357856e;
                ?? r47 = (kotlinx.coroutines.sync.d) this.f357855d;
                y0Var = (kotlinx.coroutines.y0) this.f357859h;
                kotlin.ResultKt.throwOnFailure(obj);
                kVar = r47;
            }
            this.f357859h = kVar;
            this.f357855d = null;
            this.f357856e = null;
            this.f357857f = currentTimeMillis;
            this.f357858g = 2;
            java.lang.Object invoke = pVar.invoke(y0Var, this);
            if (invoke == aVar) {
                return aVar;
            }
            dVar = kVar;
            obj = invoke;
            j17 = currentTimeMillis;
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            long currentTimeMillis22 = java.lang.System.currentTimeMillis();
            java.lang.String str3 = pr0.n.f357896q;
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("cameraAsyncWithSync End[");
            java.lang.String str22 = this.f357861m;
            sb62.append(str22);
            sb62.append("] total cost:");
            long j182 = this.f357862n;
            sb62.append(currentTimeMillis22 - j182);
            sb62.append(" post cost:");
            sb62.append(j17 - j182);
            sb62.append(" exec cost:");
            sb62.append(currentTimeMillis22 - j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", sb62.toString());
            nVar.n(str22, currentTimeMillis22 - j182);
            return obj;
        } catch (java.lang.Throwable th8) {
            dVar = kVar;
            th6 = th8;
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            throw th6;
        }
    }
}
