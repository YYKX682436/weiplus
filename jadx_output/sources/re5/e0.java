package re5;

/* loaded from: classes11.dex */
public final class e0 implements ok4.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f394570a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct f394571b;

    /* renamed from: c, reason: collision with root package name */
    public final long f394572c;

    public e0(java.util.Map reportParams, com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct fileVideoPlayerReportStruct, long j17, int i17, kotlin.jvm.internal.i iVar) {
        reportParams = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : reportParams;
        j17 = (i17 & 4) != 0 ? java.lang.System.currentTimeMillis() : j17;
        kotlin.jvm.internal.o.g(reportParams, "reportParams");
        kotlin.jvm.internal.o.g(fileVideoPlayerReportStruct, "fileVideoPlayerReportStruct");
        this.f394570a = reportParams;
        this.f394571b = fileVideoPlayerReportStruct;
        this.f394572c = j17;
    }

    @Override // ok4.d
    public void a(int i17) {
    }

    @Override // ok4.d
    public void e() {
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
    }

    @Override // ok4.d
    public void h() {
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
        re5.d[] dVarArr = re5.d.f394562d;
        com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct fileVideoPlayerReportStruct = this.f394571b;
        fileVideoPlayerReportStruct.f56392d = fileVideoPlayerReportStruct.b("EventId", "tp_on_prepare", true);
        fileVideoPlayerReportStruct.f56393e = fileVideoPlayerReportStruct.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(kz5.c1.t(this.f394570a))), ",", ";", false), true);
        fileVideoPlayerReportStruct.k();
    }

    @Override // ok4.d
    public void onCompleted() {
    }

    @Override // ok4.d
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Video.LocalVideoPlayerReporter", "onError: errorCode=" + i17 + ", errorType=" + i18);
        java.util.Map t17 = kz5.c1.t(this.f394570a);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        re5.e[] eVarArr = re5.e.f394569d;
        t17.put("tp_error_code", valueOf);
        t17.put("tp_error_type", java.lang.Integer.valueOf(i18));
        re5.d[] dVarArr = re5.d.f394562d;
        com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct fileVideoPlayerReportStruct = this.f394571b;
        fileVideoPlayerReportStruct.f56392d = fileVideoPlayerReportStruct.b("EventId", "tp_on_error", true);
        fileVideoPlayerReportStruct.f56393e = fileVideoPlayerReportStruct.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(t17)), ",", ";", false), true);
        fileVideoPlayerReportStruct.k();
    }

    @Override // ok4.d
    public void onPause() {
    }

    @Override // ok4.d
    public void onStart() {
    }

    @Override // ok4.d
    public void onStop() {
    }

    @Override // ok4.d
    public void q() {
    }

    @Override // ok4.d
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Video.LocalVideoPlayerReporter", "onFirstVideoFrame");
        java.util.Map t17 = kz5.c1.t(this.f394570a);
        re5.e[] eVarArr = re5.e.f394569d;
        t17.put("tp_start_play_duration", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f394572c));
        re5.d[] dVarArr = re5.d.f394562d;
        com.tencent.mm.autogen.mmdata.rpt.FileVideoPlayerReportStruct fileVideoPlayerReportStruct = this.f394571b;
        fileVideoPlayerReportStruct.f56392d = fileVideoPlayerReportStruct.b("EventId", "tp_on_first_frame", true);
        fileVideoPlayerReportStruct.f56393e = fileVideoPlayerReportStruct.b("EventParams", r26.i0.t(java.lang.String.valueOf(ri.l0.a(t17)), ",", ";", false), true);
        fileVideoPlayerReportStruct.k();
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
        java.util.Objects.toString(this.f394570a);
    }
}
