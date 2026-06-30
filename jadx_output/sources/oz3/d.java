package oz3;

/* loaded from: classes12.dex */
public final class d implements oz3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final oz3.d f350255a = new oz3.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f350256b = jz5.h.b(oz3.b.f350253d);

    @Override // oz3.a
    public boolean a(oz3.e request) {
        kotlin.jvm.internal.o.g(request, "request");
        if (!((java.lang.Boolean) ((jz5.n) f350256b).getValue()).booleanValue()) {
            return false;
        }
        oz3.f fVar = request.f350264h;
        int i17 = fVar.f350268d;
        oz3.f fVar2 = oz3.f.f350265e;
        if ((i17 & 1) != 0) {
            return request.f350263g != null;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ScanCodeOcrNormalReporter", "scanCodeReportOcrNormal ocrReportType " + fVar + " not support normal");
        return false;
    }

    @Override // oz3.a
    public void b(oz3.e request, fk0.a aVar) {
        kotlin.jvm.internal.o.g(request, "request");
        new mz3.a(request, aVar).l().q(new oz3.c(request));
    }

    @Override // oz3.a
    public java.lang.String name() {
        return "ScanCodeOcrNormalReporter";
    }
}
