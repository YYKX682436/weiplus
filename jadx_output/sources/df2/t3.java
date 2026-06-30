package df2;

/* loaded from: classes3.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f231406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f231407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f231408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(df2.u3 u3Var, yz5.a aVar, int i17) {
        super(1);
        this.f231406d = u3Var;
        this.f231407e = aVar;
        this.f231408f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String topic = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(topic, "topic");
        com.tencent.mars.xlog.Log.i("FinderLiveSetMicTopicController", "set topic: ".concat(topic));
        df2.u3 u3Var = this.f231406d;
        u3Var.getClass();
        com.tencent.mm.plugin.finder.live.util.y.d(u3Var, null, null, new df2.s3(u3Var, topic, null), 3, null);
        yz5.a aVar = this.f231407e;
        if (aVar != null) {
            aVar.invoke();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("topic", topic);
        if (((mm2.c1) u3Var.business(mm2.c1.class)).T) {
            df2.h3[] h3VarArr = df2.h3.f230280d;
            jSONObject.put(ya.b.SOURCE, 3);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.f327238i3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        } else if (((mm2.c1) u3Var.business(mm2.c1.class)).N7()) {
            jSONObject.put(ya.b.SOURCE, this.f231408f);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.K2, jSONObject.toString(), null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
