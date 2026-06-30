package qu2;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu2.r f366810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f366811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qu2.r rVar, java.util.Map map, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f366810d = rVar;
        this.f366811e = map;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qu2.q(this.f366810d, this.f366811e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qu2.q qVar = (qu2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        qu2.r rVar = this.f366810d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            int i17 = 0;
            for (java.lang.Object obj2 : rVar.f366814c) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jSONObject.put(java.lang.String.valueOf(i17), new java.lang.Float(((java.lang.Number) obj2).floatValue()));
                i17 = i18;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("t_version", 2);
            jSONObject2.put("t_bad_case", rVar.f366815d);
            jSONObject2.put("temperatures", jSONObject);
            rVar.b(jSONObject2, this.f366811e);
            ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(rVar.f366812a, jSONObject2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("TemperatureCollector", e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
