package qm2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.e f364706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f364707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qm2.e eVar, yz5.a aVar) {
        super(1);
        this.f364706d = eVar;
        this.f364707e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String topic = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(topic, "topic");
        com.tencent.mars.xlog.Log.i("FinderStartLiveMicTopicUIC", "set topic: ".concat(topic));
        qm2.e eVar = this.f364706d;
        gk2.e eVar2 = eVar.f364711d;
        mm2.g1 g1Var = eVar2 != null ? (mm2.g1) eVar2.a(mm2.g1.class) : null;
        if (g1Var != null) {
            g1Var.A = topic;
        }
        android.widget.TextView textView = eVar.f364713f;
        if (textView != null) {
            textView.setText(topic);
        }
        yz5.a aVar = this.f364707e;
        if (aVar != null) {
            aVar.invoke();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("topic", topic);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 82L, jSONObject.toString(), null, 4, null);
        return jz5.f0.f302826a;
    }
}
