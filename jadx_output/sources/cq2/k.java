package cq2;

/* loaded from: classes2.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f221405d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f221406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f221407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ys5.e f221409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f221410i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ws5.h f221411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f221412n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f221413o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f221414p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, java.lang.String str, ys5.e eVar, kotlin.jvm.internal.f0 f0Var, ws5.h hVar, float f17, boolean z18, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221407f = z17;
        this.f221408g = str;
        this.f221409h = eVar;
        this.f221410i = f0Var;
        this.f221411m = hVar;
        this.f221412n = f17;
        this.f221413o = z18;
        this.f221414p = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        cq2.k kVar = new cq2.k(this.f221407f, this.f221408g, this.f221409h, this.f221410i, this.f221411m, this.f221412n, this.f221413o, this.f221414p, continuation);
        kVar.f221406e = obj;
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cq2.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        r45.wo1 wo1Var;
        r45.dk2 dk2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f221405d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f221406e;
            cq2.j jVar = new cq2.j(this.f221409h, this.f221407f, this.f221410i, this.f221411m, this.f221412n, this.f221413o, this.f221414p);
            oz5.l f11582e = y0Var2.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            aq2.m mVar = new aq2.m(jVar, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), null);
            this.f221406e = y0Var2;
            this.f221405d = 1;
            java.lang.Object h17 = ay1.l.h(mVar, this);
            if (h17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = h17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f221406e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = this.f221407f;
        if (z17) {
            boolean z18 = fVar != null && fVar.f70616b == 0;
            java.lang.String str = this.f221408g;
            if (z18) {
                if (fVar != null && fVar.f70615a == 0) {
                    r45.dk2 dk2Var2 = fVar != null ? (r45.dk2) fVar.f70618d : null;
                    if (!(dk2Var2 instanceof r45.dk2)) {
                        dk2Var2 = null;
                    }
                    if (dk2Var2 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update preload config, currentPreloadKey: ");
                        sb6.append(str);
                        sb6.append(' ');
                        r45.wo1 wo1Var2 = (r45.wo1) dk2Var2.getCustom(14);
                        sb6.append(wo1Var2 != null ? cq2.q.f221428a.g(wo1Var2) : null);
                        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", sb6.toString());
                        r45.wo1 wo1Var3 = (r45.wo1) dk2Var2.getCustom(14);
                        if (wo1Var3 != null && wo1Var3.getBoolean(0)) {
                            cq2.q qVar = cq2.q.f221428a;
                            cq2.q.f221429b.put(str, wo1Var3);
                        }
                    }
                    if (fVar != null && (dk2Var = (r45.dk2) fVar.f70618d) != null) {
                        pm0.v.X(new cq2.i(dk2Var));
                    }
                }
            }
            cq2.q qVar2 = cq2.q.f221428a;
            cq2.q.f221441n++;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("update preload config, currentPreloadKey: ");
            sb7.append(str);
            sb7.append(" error: ");
            sb7.append(fVar != null ? new java.lang.Integer(fVar.f70616b) : null);
            com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", sb7.toString());
            java.lang.Integer num = fVar != null ? new java.lang.Integer(fVar.f70616b) : null;
            if (num != null && num.intValue() == -5902) {
                cq2.q.f221431d.put(str, new java.lang.Long(java.lang.System.currentTimeMillis()));
                r45.dk2 dk2Var3 = (r45.dk2) fVar.f70618d;
                if (dk2Var3 != null && (wo1Var = (r45.wo1) dk2Var3.getCustom(14)) != null && wo1Var.getBoolean(0)) {
                    cq2.q.f221429b.put(str, wo1Var);
                }
                cq2.q.f221432e = android.os.SystemClock.elapsedRealtime();
            }
            if (fVar != null) {
                pm0.v.X(new cq2.i(dk2Var));
            }
        }
        cq2.q.f221436i = "";
        cq2.q.f221438k = null;
        if (z17 && !kotlinx.coroutines.z0.h(y0Var)) {
            cq2.q.f221428a.b("PreloadCancel");
        }
        return jz5.f0.f302826a;
    }
}
