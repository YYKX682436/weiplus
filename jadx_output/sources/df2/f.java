package df2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.g f230096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(df2.g gVar) {
        super(0);
        this.f230096d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.g gVar = this.f230096d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.util.y.o(gVar, kotlinx.coroutines.internal.b0.f310484a, null, new df2.e(gVar, null), 2, null);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.U1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        return jz5.f0.f302826a;
    }
}
