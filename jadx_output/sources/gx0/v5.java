package gx0;

/* loaded from: classes5.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277055d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277056e;

    /* renamed from: f, reason: collision with root package name */
    public int f277057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277059h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(gx0.w8 w8Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277058g = w8Var;
        this.f277059h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.v5(this.f277058g, this.f277059h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.v5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277057f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.w8 w8Var = this.f277058g;
            this.f277055d = w8Var;
            java.lang.String str = this.f277059h;
            this.f277056e = str;
            this.f277057f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            java.lang.String identifier = ((zu0.a) w8Var.f277123y.get(0)).f475661a.getIdentifier();
            kotlin.jvm.internal.o.f(identifier, "getIdentifier(...)");
            gx0.u5 u5Var = new gx0.u5(rVar);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                m521constructorimpl = kotlin.Result.m521constructorimpl(com.tencent.mm.plugin.sight.base.e.g(identifier));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            db2.c1 c1Var = null;
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            org.json.JSONObject jSONObject = (org.json.JSONObject) m521constructorimpl;
            if (jSONObject == null || !kotlin.jvm.internal.o.b(jSONObject.optString("description"), "miaojian")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MiaoJianUtils", "metadata is null");
                u5Var.invoke(null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MiaoJianUtils", "metadata:" + jSONObject);
                java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(identifier);
                try {
                    w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
                    kotlin.jvm.internal.o.d(Di);
                    ((qs2.q) eVar).getClass();
                    db2.c1 c1Var2 = new db2.c1(Di);
                    com.tencent.mm.modelbase.o oVar = c1Var2.f70646f;
                    com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
                    r45.p81 p81Var = fVar instanceof r45.p81 ? (r45.p81) fVar : null;
                    int i18 = oVar != null ? oVar.f70713d : 0;
                    c1Var2.l().L(new t65.g("Cgi_" + i18), new gx0.x(i18, p81Var, c1Var2, u5Var));
                    c1Var = c1Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MiaoJianUtils", "getMiaojianCgi failed", e17);
                }
            }
            rVar.m(new gx0.t5(c1Var, w8Var, str));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
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
