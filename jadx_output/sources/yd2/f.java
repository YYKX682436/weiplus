package yd2;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd2.b f461059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yd2.n f461060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yd2.a f461061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f461062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yd2.j f461063i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f461064m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yd2.b bVar, yd2.n nVar, yd2.a aVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, yd2.j jVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461059e = bVar;
        this.f461060f = nVar;
        this.f461061g = aVar;
        this.f461062h = concurrentHashMap;
        this.f461063i = jVar;
        this.f461064m = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yd2.f(this.f461059e, this.f461060f, this.f461061g, this.f461062h, this.f461063i, this.f461064m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [yd2.j] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yd2.j] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [yd2.j] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.Object c17;
        yd2.a aVar = this.f461061g;
        java.lang.String str = this.f461064m;
        ?? r47 = "{\"error\":\"tool cast failed: ";
        java.lang.String str2 = "handleToolCalls: params class not registered for ";
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f461058d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        ?? r122 = this.f461063i;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f461062h;
        yd2.n nVar = this.f461060f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String toolCallId = nVar.f461078a;
                yd2.b bVar = this.f461059e;
                long j17 = bVar.f461029a;
                long j18 = bVar.f461030b;
                java.lang.String sessionId = bVar.f461031c;
                f0Var = f0Var2;
                long j19 = bVar.f461032d;
                java.lang.String anchorUsername = bVar.f461034f;
                bVar.getClass();
                kotlin.jvm.internal.o.g(sessionId, "sessionId");
                kotlin.jvm.internal.o.g(toolCallId, "toolCallId");
                kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
                yd2.b bVar2 = new yd2.b(j17, j18, sessionId, j19, toolCallId, anchorUsername);
                try {
                    if (!aVar.c(bVar2)) {
                        java.lang.String str3 = nVar.f461078a;
                        concurrentHashMap.put(str3, this.f461063i.c(this.f461059e, str3, false, "{\"error\":\"tool unavailable\"}", 1002));
                        return f0Var;
                    }
                    r47 = r122;
                    try {
                        java.lang.Class cls = (java.lang.Class) r47.f461075c.get(str);
                        if (cls == null) {
                            yd2.j.a(r47);
                            str2 = "Finder.Live.AiAssistant.ToolManager";
                            try {
                                com.tencent.mars.xlog.Log.e(str2, "handleToolCalls: params class not registered for " + str);
                                java.lang.String str4 = nVar.f461078a;
                                yd2.j jVar = this.f461063i;
                                yd2.b bVar3 = this.f461059e;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"error\":\"params not registered: ");
                                sb6.append(str);
                                sb6.append("\"}");
                                concurrentHashMap.put(str4, jVar.c(bVar3, str4, false, sb6.toString(), 1003));
                                return f0Var;
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                r122 = "\"}";
                                yd2.j.a(r47);
                                com.tencent.mars.xlog.Log.e(str2, "handleToolCalls: error for " + nVar.f461078a + ": " + e.getMessage());
                                java.lang.String str5 = nVar.f461078a;
                                concurrentHashMap.put(str5, this.f461063i.c(this.f461059e, str5, false, "{\"error\":\"" + e.getMessage() + r122, 1006));
                                return f0Var;
                            }
                        }
                        yd2.l b17 = yd2.j.b(r47, cls, nVar.f461081d);
                        yd2.a aVar3 = aVar instanceof yd2.a ? aVar : null;
                        if (aVar3 == null) {
                            java.lang.String str6 = nVar.f461078a;
                            concurrentHashMap.put(str6, this.f461063i.c(this.f461059e, str6, false, "{\"error\":\"tool cast failed: " + str + "\"}", 1004));
                            return f0Var;
                        }
                        long a17 = aVar.a();
                        yd2.e eVar = new yd2.e(aVar3, b17, bVar2, this.f461063i, this.f461059e, this.f461060f, null);
                        this.f461058d = 1;
                        c17 = kotlinx.coroutines.a4.c(a17, eVar, this);
                        if (c17 == aVar2) {
                            return aVar2;
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        r122 = "\"}";
                        r47 = r47;
                        str2 = "Finder.Live.AiAssistant.ToolManager";
                        yd2.j.a(r47);
                        com.tencent.mars.xlog.Log.e(str2, "handleToolCalls: error for " + nVar.f461078a + ": " + e.getMessage());
                        java.lang.String str52 = nVar.f461078a;
                        concurrentHashMap.put(str52, this.f461063i.c(this.f461059e, str52, false, "{\"error\":\"" + e.getMessage() + r122, 1006));
                        return f0Var;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    r122 = "\"}";
                    r47 = r122;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    c17 = obj;
                    f0Var = f0Var2;
                } catch (java.lang.Exception e27) {
                    e = e27;
                    str2 = "Finder.Live.AiAssistant.ToolManager";
                    f0Var = f0Var2;
                    r47 = r122;
                    r122 = "\"}";
                    yd2.j.a(r47);
                    com.tencent.mars.xlog.Log.e(str2, "handleToolCalls: error for " + nVar.f461078a + ": " + e.getMessage());
                    java.lang.String str522 = nVar.f461078a;
                    concurrentHashMap.put(str522, this.f461063i.c(this.f461059e, str522, false, "{\"error\":\"" + e.getMessage() + r122, 1006));
                    return f0Var;
                }
            }
            r45.mf1 mf1Var = (r45.mf1) c17;
            java.lang.String str7 = nVar.f461078a;
            if (mf1Var == null) {
                mf1Var = this.f461063i.c(this.f461059e, str7, false, "{\"error\":\"timeout\"}", 1004);
            }
            concurrentHashMap.put(str7, mf1Var);
        } catch (java.lang.Exception e28) {
            e = e28;
        }
        return f0Var;
    }
}
