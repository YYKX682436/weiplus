package df2;

/* loaded from: classes3.dex */
public final class tl extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.hm f231455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(df2.hm hmVar, java.lang.Class cls) {
        super(cls);
        this.f231455b = hmVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.vb2 result = (r45.vb2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.hm hmVar = this.f231455b;
        hmVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAnchorHeatTips ");
        boolean z17 = false;
        sb6.append(result.getInteger(0));
        sb6.append(", lastStatus:");
        sb6.append(hmVar.f230337o);
        com.tencent.mars.xlog.Log.i(hmVar.f230335m, sb6.toString());
        if (result.getInteger(0) == 0) {
            pm0.v.X(new df2.vl(hmVar));
            return;
        }
        if (result.getInteger(0) == hmVar.f230337o) {
            return;
        }
        android.view.View b76 = hmVar.b7();
        if (b76 != null && b76.getVisibility() == 8) {
            z17 = true;
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.I1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        }
        kotlinx.coroutines.r2 r2Var = hmVar.f230338p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        hmVar.f230338p = null;
        pm0.v.X(new df2.am(hmVar, result));
    }
}
