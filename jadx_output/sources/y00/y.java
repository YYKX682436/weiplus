package y00;

/* loaded from: classes8.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f458561d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f458562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f458563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f458564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f458565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458566i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f458567m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y00.t f458568n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f458569o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458570p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.Map map, boolean z17, long j17, java.lang.String str, android.widget.LinearLayout linearLayout, y00.t tVar, java.util.List list, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f458563f = map;
        this.f458564g = z17;
        this.f458565h = j17;
        this.f458566i = str;
        this.f458567m = linearLayout;
        this.f458568n = tVar;
        this.f458569o = list;
        this.f458570p = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        y00.y yVar = new y00.y(this.f458563f, this.f458564g, this.f458565h, this.f458566i, this.f458567m, this.f458568n, this.f458569o, this.f458570p, continuation);
        yVar.f458562e = obj;
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((y00.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        a10.a aVar;
        long j17;
        java.util.Map map;
        boolean z17;
        boolean z18;
        java.lang.Object j18;
        boolean z19;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f458561d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f458562e;
            java.util.Map s17 = kz5.c1.s(this.f458563f);
            if (this.f458564g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: skipDbQuery=true, msgSvrId=" + this.f458565h);
                map = s17;
                j17 = 0L;
            } else {
                try {
                    aVar = a10.e.f490a.a().z0(this.f458565h, this.f458566i);
                } catch (java.util.concurrent.CancellationException e17) {
                    throw e17;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardUIRefresher", th6, "query db fail, msgSvrId=" + this.f458565h, new java.lang.Object[0]);
                    aVar = null;
                }
                kotlinx.coroutines.z0.g(y0Var);
                java.lang.String str = aVar != null ? aVar.field_cachedXml : null;
                j17 = aVar != null ? aVar.field_updateTime : 0L;
                if (!(str == null || str.length() == 0)) {
                    android.util.LruCache lruCache = y00.z.f458571a;
                    map = y00.a0.a(str, this.f458565h, "MicroMsg.EcsKfProductCardUIRefresher");
                    if (map != null) {
                        kotlinx.coroutines.v2.f(y0Var.getF11582e());
                        ((ku5.t0) ku5.t0.f312615d).B(new y00.x(this.f458566i, this.f458565h, map, j17));
                        if (kotlin.jvm.internal.o.b(map, s17)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: db cache values same as initial, skip render, msgSvrId=" + this.f458565h);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: db cache hit, msgSvrId=" + this.f458565h);
                            ((ku5.t0) ku5.t0.f312615d).B(new y00.u(this.f458567m, this.f458565h, this.f458568n, map));
                        }
                    }
                }
                map = s17;
            }
            if (this.f458569o.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: empty productIds, skip cgi, msgSvrId=" + this.f458565h);
                return jz5.f0.f302826a;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            y00.g a17 = y00.h.a(this.f458566i, this.f458565h);
            long j19 = a17 != null ? a17.f458526b : 0L;
            long max = java.lang.Math.max(j19, j17);
            if (max > 0) {
                long j27 = currentTimeMillis - max;
                if (j27 < 180000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi throttled (success-ttl), age=" + j27 + "ms (mem=" + j19 + " db=" + j17 + ") < 180000ms, msgSvrId=" + this.f458565h);
                    return jz5.f0.f302826a;
                }
            }
            java.lang.Long l17 = (java.lang.Long) y00.z.f458571a.get(new java.lang.Long(this.f458565h));
            long longValue = l17 == null ? 0L : l17.longValue();
            if (longValue > 0) {
                long j28 = currentTimeMillis - longValue;
                if (j28 < 30000) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi throttled (fail-ttl), age=" + j28 + "ms < 30000ms, msgSvrId=" + this.f458565h);
                    return jz5.f0.f302826a;
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = y00.f.f458523a;
            y00.s sVar = new y00.s(this.f458566i, this.f458565h, this.f458569o, this.f458570p);
            this.f458562e = map;
            this.f458561d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            if (sVar.f458546b <= 0 || sVar.f458547c.isEmpty()) {
                z17 = false;
                z18 = true;
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardFetcher", "fetch invalid request: msgSvrId=" + sVar.f458546b + ", products=" + sVar.f458547c.size());
                rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = y00.f.f458523a;
                synchronized (concurrentHashMap2) {
                    java.util.List list = (java.util.List) concurrentHashMap2.get(new java.lang.Long(sVar.f458546b));
                    if (list != null) {
                        list.add(rVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardFetcher", "fetch dedup: msgSvrId=" + sVar.f458546b + ", queue size=" + list.size());
                        z17 = false;
                        z19 = false;
                    } else {
                        z17 = false;
                        concurrentHashMap2.put(new java.lang.Long(sVar.f458546b), kz5.c0.k(rVar));
                        z19 = true;
                    }
                }
                rVar.m(new y00.b(sVar, rVar));
                if (z19) {
                    bw5.le0 le0Var = new bw5.le0();
                    le0Var.f29765e = sVar.f458548d;
                    boolean[] zArr = le0Var.f29766f;
                    zArr[3] = true;
                    java.util.List list2 = sVar.f458547c;
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        long longValue2 = ((java.lang.Number) it.next()).longValue();
                        bw5.ke0 ke0Var = new bw5.ke0();
                        ke0Var.f29360d = longValue2;
                        ke0Var.f29361e[1] = true;
                        le0Var.f29764d.add(ke0Var);
                        zArr[2] = true;
                    }
                    z18 = true;
                    com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                    lVar.f70664a = le0Var;
                    lVar.f70665b = new bw5.me0();
                    lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_batchgetkfproductxml";
                    lVar.f70667d = 21793;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    int h17 = gm0.j1.b().h();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendCgi: msgSvrId=");
                    sb6.append(sVar.f458546b);
                    sb6.append(", products=");
                    sb6.append(list2.size());
                    sb6.append(", hasReportInfo=");
                    sb6.append(sVar.f458548d.length() > 0 ? true : z17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardFetcher", sb6.toString());
                    ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new y00.e(currentTimeMillis2, sVar, h17));
                } else {
                    z18 = true;
                }
            }
            j18 = rVar.j();
            pz5.a aVar3 = pz5.a.f359186d;
            if (j18 == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) this.f458562e;
            kotlin.ResultKt.throwOnFailure(obj);
            z17 = false;
            z18 = true;
            j18 = obj;
        }
        y00.a aVar4 = (y00.a) j18;
        if (aVar4 != null) {
            if (aVar4.f458491b.length() == 0) {
                z17 = z18;
            }
            if (!z17) {
                y00.z.f458571a.remove(new java.lang.Long(this.f458565h));
                android.util.LruCache lruCache2 = y00.z.f458571a;
                java.util.Map a18 = y00.a0.a(aVar4.f458491b, this.f458565h, "MicroMsg.EcsKfProductCardUIRefresher");
                if (a18 == null) {
                    return jz5.f0.f302826a;
                }
                if (kotlin.jvm.internal.o.b(a18, map)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi values same as last rendered, skip, msgSvrId=" + this.f458565h);
                    return jz5.f0.f302826a;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi fresh values applied, msgSvrId=" + this.f458565h);
                ((ku5.t0) ku5.t0.f312615d).B(new y00.u(this.f458567m, this.f458565h, this.f458568n, a18));
                return jz5.f0.f302826a;
            }
        }
        y00.z.f458571a.put(new java.lang.Long(this.f458565h), new java.lang.Long(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi no fresh data, marked fail-throttle, msgSvrId=" + this.f458565h);
        return jz5.f0.f302826a;
    }
}
