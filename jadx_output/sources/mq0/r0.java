package mq0;

/* loaded from: classes7.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330611g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, java.lang.String str2) {
        super(0);
        this.f330608d = str;
        this.f330609e = h0Var;
        this.f330610f = h0Var2;
        this.f330611g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct magicCardIndexSystemReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct();
        magicCardIndexSystemReporterStruct.p("thumbplayer_" + this.f330608d);
        magicCardIndexSystemReporterStruct.f59068d = magicCardIndexSystemReporterStruct.b("BizScene", (java.lang.String) this.f330609e.f310123d, true);
        magicCardIndexSystemReporterStruct.f59070f = 1;
        magicCardIndexSystemReporterStruct.f59073i = magicCardIndexSystemReporterStruct.b("TraceId", (java.lang.String) this.f330610f.f310123d, true);
        java.lang.String str = this.f330611g;
        if (str == null || str.length() == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis());
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            magicCardIndexSystemReporterStruct.q(r26.i0.t(jSONObject2, ",", ";", false));
        } else {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
            jSONObject3.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.System.currentTimeMillis());
            java.lang.String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            magicCardIndexSystemReporterStruct.q(r26.i0.t(jSONObject4, ",", ";", false));
        }
        magicCardIndexSystemReporterStruct.f59074j = magicCardIndexSystemReporterStruct.b("ReportSource", "native", true);
        magicCardIndexSystemReporterStruct.k();
        java.lang.String n17 = magicCardIndexSystemReporterStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MB_External_surface_event", "thumbPlayerEvent, struct: ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, ", ", false)));
        return jz5.f0.f302826a;
    }
}
