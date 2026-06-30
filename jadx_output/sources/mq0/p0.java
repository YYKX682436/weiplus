package mq0;

/* loaded from: classes7.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f330596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, java.lang.String str2) {
        super(0);
        this.f330594d = str;
        this.f330595e = h0Var;
        this.f330596f = h0Var2;
        this.f330597g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct magicCardIndexSystemReporterStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct();
        magicCardIndexSystemReporterStruct.p(this.f330594d);
        magicCardIndexSystemReporterStruct.f59068d = magicCardIndexSystemReporterStruct.b("BizScene", (java.lang.String) this.f330595e.f310123d, true);
        magicCardIndexSystemReporterStruct.f59070f = 2;
        magicCardIndexSystemReporterStruct.f59073i = magicCardIndexSystemReporterStruct.b("TraceId", (java.lang.String) this.f330596f.f310123d, true);
        java.lang.String str = this.f330597g;
        magicCardIndexSystemReporterStruct.q(str != null ? r26.i0.t(str, ",", ";", false) : null);
        magicCardIndexSystemReporterStruct.f59074j = magicCardIndexSystemReporterStruct.b("ReportSource", "native", true);
        magicCardIndexSystemReporterStruct.k();
        java.lang.String n17 = magicCardIndexSystemReporterStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MagicCardIndexSystemReporter", "mediaEvent, struct: ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, ", ", false)));
        return jz5.f0.f302826a;
    }
}
