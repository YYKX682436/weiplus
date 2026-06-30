package mq0;

/* loaded from: classes7.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a f330600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq0.s0 f330601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f330605i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330606m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f330607n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mq0.a aVar, mq0.s0 s0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, java.util.Map map) {
        super(0);
        this.f330600d = aVar;
        this.f330601e = s0Var;
        this.f330602f = str;
        this.f330603g = str2;
        this.f330604h = str3;
        this.f330605i = z17;
        this.f330606m = str4;
        this.f330607n = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mq0.a aVar = mq0.a.f330514f;
        java.lang.String str = this.f330602f;
        mq0.s0 s0Var = this.f330601e;
        mq0.a aVar2 = this.f330600d;
        if ((aVar2 != aVar || !s0Var.f330615d.containsKey(str)) && (aVar2 != mq0.a.f330515g || s0Var.f330615d.containsKey(str))) {
            com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct magicCardIndexSystemReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct();
            magicCardIndexSystemReporterStruct.p(aVar2.name());
            magicCardIndexSystemReporterStruct.f59068d = magicCardIndexSystemReporterStruct.b("BizScene", this.f330603g, true);
            magicCardIndexSystemReporterStruct.f59069e = magicCardIndexSystemReporterStruct.b("BizSubScene", this.f330604h, true);
            magicCardIndexSystemReporterStruct.f59070f = this.f330605i ? 1 : 0;
            magicCardIndexSystemReporterStruct.f59073i = magicCardIndexSystemReporterStruct.b("TraceId", this.f330606m, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : this.f330607n.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            magicCardIndexSystemReporterStruct.q(r26.i0.t(jSONObject2, ",", ";", false));
            magicCardIndexSystemReporterStruct.l();
            if (aVar2 == mq0.a.f330514f) {
                s0Var.f330615d.put(str, magicCardIndexSystemReporterStruct);
            } else if (aVar2 == mq0.a.f330515g) {
                s0Var.f330615d.remove(str);
            }
            java.lang.String n17 = magicCardIndexSystemReporterStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            com.tencent.mars.xlog.Log.i("MagicCardIndexSystemReporter", "report struct: ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, ", ", false)));
        }
        return jz5.f0.f302826a;
    }
}
