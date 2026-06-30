package df2;

/* loaded from: classes3.dex */
public final class ul extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.hm f231537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(df2.hm hmVar, java.lang.Class cls) {
        super(cls);
        this.f231537b = hmVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.tb2 result = (r45.tb2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.hm hmVar = this.f231537b;
        hmVar.getClass();
        com.tencent.mars.xlog.Log.i(hmVar.f230335m, "updateVisitorHeatTips " + result.getInteger(1) + ", lastStatus:" + hmVar.f230337o);
        if (result.getInteger(1) == 0) {
            pm0.v.X(new df2.bm(hmVar));
            return;
        }
        android.view.View b76 = hmVar.b7();
        if (b76 != null && b76.getVisibility() == 8) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.T1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        kotlinx.coroutines.r2 r2Var = hmVar.f230338p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        hmVar.f230338p = null;
        pm0.v.X(new df2.gm(hmVar, result));
    }
}
