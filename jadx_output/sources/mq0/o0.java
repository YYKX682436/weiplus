package mq0;

/* loaded from: classes7.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.s0 f330592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq0.g0 f330593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(mq0.s0 s0Var, mq0.g0 g0Var) {
        super(0);
        this.f330592d = s0Var;
        this.f330593e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Collection values = this.f330592d.f330615d.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct magicCardIndexSystemReporterStruct = (com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct) kz5.n0.Y(values);
        if (magicCardIndexSystemReporterStruct != null) {
            magicCardIndexSystemReporterStruct.p("JumpTo");
            java.lang.String str = magicCardIndexSystemReporterStruct.f59072h;
            if (str == null || str.length() == 0) {
                magicCardIndexSystemReporterStruct.q("");
            }
            java.lang.String str2 = magicCardIndexSystemReporterStruct.f59072h;
            kotlin.jvm.internal.o.f(str2, "getExtraJson(...)");
            org.json.JSONObject jSONObject = new org.json.JSONObject(r26.i0.t(str2, ";", ",", false));
            jSONObject.put("JumpTo", this.f330593e.name());
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            magicCardIndexSystemReporterStruct.q(r26.i0.t(jSONObject2, ",", ";", false));
            magicCardIndexSystemReporterStruct.l();
            java.lang.String n17 = magicCardIndexSystemReporterStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            com.tencent.mars.xlog.Log.i("MagicCardIndexSystemReporter", "jump, struct: ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, ", ", false)));
        }
        return jz5.f0.f302826a;
    }
}
