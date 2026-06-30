package i62;

/* loaded from: classes13.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn5.l f288941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yn5.l lVar) {
        super(0);
        this.f288941d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean isDebug = com.tencent.mars.xlog.Log.isDebug();
        yn5.l result = this.f288941d;
        if (isDebug) {
            result.toString();
            result.c();
        }
        kotlin.jvm.internal.o.g(result, "result");
        i62.o oVar = i62.o.f288963a;
        if (oVar.c(e42.d0.clicfg_inflate_xml_sample_and)) {
            long j17 = result.f464036b;
            int a17 = oVar.a();
            yn5.f fVar = (yn5.f) ((jz5.n) result.f464038d).getValue();
            com.tencent.mm.autogen.mmdata.rpt.XMLInflateMonitorStruct xMLInflateMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.XMLInflateMonitorStruct();
            xMLInflateMonitorStruct.f63085d = xMLInflateMonitorStruct.b("ActName", result.f464035a, true);
            xMLInflateMonitorStruct.f63086e = j17;
            xMLInflateMonitorStruct.f63087f = a17;
            xMLInflateMonitorStruct.f63088g = fVar.f464021a;
            xMLInflateMonitorStruct.f63089h = fVar.f464022b;
            xMLInflateMonitorStruct.f63090i = fVar.f464023c;
            xMLInflateMonitorStruct.f63091j = fVar.f464024d;
            xMLInflateMonitorStruct.f63092k = fVar.f464025e;
            xMLInflateMonitorStruct.f63093l = fVar.f464026f;
            float f17 = 100;
            xMLInflateMonitorStruct.f63094m = fVar.f464027g * f17;
            xMLInflateMonitorStruct.f63095n = fVar.f464028h * f17;
            xMLInflateMonitorStruct.k();
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                java.lang.String n17 = xMLInflateMonitorStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false);
            }
        }
        return jz5.f0.f302826a;
    }
}
