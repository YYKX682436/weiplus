package nz3;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f341583a = jz5.h.b(nz3.b.f341582d);

    public static final void a(oz3.e request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.qbar.ScanIdentifyReportInfo scanIdentifyReportInfo = request.f350263g;
        if (scanIdentifyReportInfo == null || !scanIdentifyReportInfo.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanCodeOcrHandler", "handleOcr request invalid and ignore");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new nz3.a(request), "MicroMsg.ScanCodeOcrHandler");
    }
}
