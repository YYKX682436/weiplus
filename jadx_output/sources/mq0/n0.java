package mq0;

/* loaded from: classes7.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a f330587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f330589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f330590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(mq0.a aVar, java.lang.String str, int i17, java.util.Map map) {
        super(0);
        this.f330587d = aVar;
        this.f330588e = str;
        this.f330589f = i17;
        this.f330590g = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct magicCardIndexSystemReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct();
        mq0.a aVar = this.f330587d;
        magicCardIndexSystemReporterStruct.p(aVar.name());
        magicCardIndexSystemReporterStruct.f59068d = magicCardIndexSystemReporterStruct.b("BizScene", this.f330588e, true);
        magicCardIndexSystemReporterStruct.f59070f = aVar != mq0.a.f330513e ? 0 : 1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("GroupId", this.f330589f);
        for (java.util.Map.Entry entry : this.f330590g.entrySet()) {
            jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        magicCardIndexSystemReporterStruct.q(r26.i0.t(jSONObject2, ",", ";", false));
        magicCardIndexSystemReporterStruct.l();
        java.lang.String n17 = magicCardIndexSystemReporterStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MagicCardIndexSystemReporter", "expt struct: ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, ", ", false)));
        return jz5.f0.f302826a;
    }
}
