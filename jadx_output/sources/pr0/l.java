package pr0;

/* loaded from: classes11.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357878d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357879e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357880f;

    /* renamed from: g, reason: collision with root package name */
    public long f357881g;

    /* renamed from: h, reason: collision with root package name */
    public int f357882h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357883i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357884m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pr0.n f357885n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f357886o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.p f357887p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, pr0.n nVar, long j17, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357884m = str;
        this.f357885n = nVar;
        this.f357886o = j17;
        this.f357887p = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pr0.l lVar = new pr0.l(this.f357884m, this.f357885n, this.f357886o, this.f357887p, continuation);
        lVar.f357883i = obj;
        return lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        long currentTimeMillis;
        yz5.p pVar;
        kotlinx.coroutines.sync.k kVar;
        java.lang.String str;
        kotlinx.coroutines.sync.d dVar;
        java.lang.Throwable th6;
        long j17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357882h;
        pr0.n nVar = this.f357885n;
        java.lang.String str2 = this.f357884m;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                y0Var = (kotlinx.coroutines.y0) this.f357883i;
                currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str3 = pr0.n.f357896q;
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", "SyncLaunch Come In Launch[" + str2 + ']');
                kotlinx.coroutines.sync.d dVar2 = nVar.f357900p;
                this.f357883i = y0Var;
                this.f357878d = dVar2;
                this.f357879e = str2;
                pVar = this.f357887p;
                this.f357880f = pVar;
                this.f357881g = currentTimeMillis;
                this.f357882h = 1;
                kVar = (kotlinx.coroutines.sync.k) dVar2;
                if (kVar.b(null, this) == aVar) {
                    return aVar;
                }
                str = str2;
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j17 = this.f357881g;
                    dVar = (kotlinx.coroutines.sync.d) this.f357883i;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        ((kotlinx.coroutines.sync.k) dVar).d(null);
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        java.lang.String str4 = pr0.n.f357896q;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SyncLaunch End[");
                        sb6.append(str2);
                        sb6.append("] total cost:");
                        long j18 = this.f357886o;
                        sb6.append(currentTimeMillis2 - j18);
                        sb6.append(" post cost:");
                        sb6.append(j17 - j18);
                        sb6.append(" exec cost:");
                        sb6.append(currentTimeMillis2 - j17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", sb6.toString());
                        nVar.n(str2, currentTimeMillis2 - j18);
                        return jz5.f0.f302826a;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        ((kotlinx.coroutines.sync.k) dVar).d(null);
                        throw th6;
                    }
                }
                currentTimeMillis = this.f357881g;
                pVar = (yz5.p) this.f357880f;
                str = (java.lang.String) this.f357879e;
                ?? r122 = (kotlinx.coroutines.sync.d) this.f357878d;
                y0Var = (kotlinx.coroutines.y0) this.f357883i;
                kotlin.ResultKt.throwOnFailure(obj);
                kVar = r122;
            }
            java.lang.String str5 = pr0.n.f357896q;
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", "SyncLaunch Come In Launch Lock[" + str + ']');
            this.f357883i = kVar;
            this.f357878d = null;
            this.f357879e = null;
            this.f357880f = null;
            this.f357881g = currentTimeMillis;
            this.f357882h = 2;
            if (pVar.invoke(y0Var, this) == aVar) {
                return aVar;
            }
            dVar = kVar;
            j17 = currentTimeMillis;
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            long currentTimeMillis22 = java.lang.System.currentTimeMillis();
            java.lang.String str42 = pr0.n.f357896q;
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("SyncLaunch End[");
            sb62.append(str2);
            sb62.append("] total cost:");
            long j182 = this.f357886o;
            sb62.append(currentTimeMillis22 - j182);
            sb62.append(" post cost:");
            sb62.append(j17 - j182);
            sb62.append(" exec cost:");
            sb62.append(currentTimeMillis22 - j17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.Coroutines", sb62.toString());
            nVar.n(str2, currentTimeMillis22 - j182);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th8) {
            dVar = kVar;
            th6 = th8;
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            throw th6;
        }
    }
}
