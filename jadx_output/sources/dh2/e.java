package dh2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(dh2.x xVar) {
        super(1);
        this.f232440d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("revertInt", this.f232440d.f232475o);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        it.q(r26.i0.t(jSONObject2, ",", ";", false));
        return jz5.f0.f302826a;
    }
}
