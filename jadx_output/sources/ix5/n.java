package ix5;

/* loaded from: classes16.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f295655d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f295656e;

    /* renamed from: f, reason: collision with root package name */
    public int f295657f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f295658g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295659h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f295660i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f295659h = str;
        this.f295660i = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ix5.n nVar = new ix5.n(this.f295659h, this.f295660i, continuation);
        nVar.f295658g = obj;
        return nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix5.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f295657f;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return kz5.q0.f314001d;
            }
            if (i17 == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (i17 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ix5.h hVar = ix5.h.f295631b;
        hVar.c().info("operateWVA running, cmd:" + this.f295659h);
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 30) {
            throw new com.tencent.wva.hostsdk.WVAException(hx5.e.f285718h, "SDK_INT: " + i18);
        }
        java.lang.String str = this.f295659h;
        int hashCode = str.hashCode();
        if (hashCode != -709344037) {
            if (hashCode != 3127582) {
                if (hashCode == 2090862380 && str.equals("bootFramework")) {
                    java.util.Map map = this.f295660i;
                    this.f295657f = 2;
                    obj = ix5.h.a(hVar, map, this);
                    return obj == aVar ? aVar : obj;
                }
            } else if (str.equals("exit")) {
                this.f295657f = 1;
                if (kotlinx.coroutines.l.g(ix5.h.f295639j, new ix5.k(null), this) == aVar) {
                    return aVar;
                }
                return kz5.q0.f314001d;
            }
        } else if (str.equals("isBooted")) {
            return kz5.b1.e(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, java.lang.Boolean.valueOf(hVar.e())));
        }
        com.tencent.shadow.dynamic.host.DynamicPluginManager dynamicPluginManager = ix5.h.f295637h;
        if (dynamicPluginManager == null) {
            hVar.c().info("operateWVA, framework not booted");
            throw new com.tencent.wva.hostsdk.WVAException(hx5.e.f285712b);
        }
        java.lang.String str2 = this.f295659h;
        java.util.Map map2 = this.f295660i;
        this.f295658g = dynamicPluginManager;
        this.f295655d = str2;
        this.f295656e = map2;
        this.f295657f = 3;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        try {
            android.content.Context context = ix5.h.f295633d;
            kotlin.jvm.internal.o.d(context);
            dynamicPluginManager.process(context, str2, kz5.c1.t(map2), new ix5.m(nVar));
        } catch (java.lang.Exception e17) {
            ix5.h.f295631b.c().error("process:" + str2 + " failed", (java.lang.Throwable) e17);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.wva.hostsdk.WVAException(hx5.e.f285711a, e17))));
        }
        obj = nVar.a();
        pz5.a aVar2 = pz5.a.f359186d;
        return obj == aVar ? aVar : obj;
    }
}
