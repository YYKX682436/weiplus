package dd4;

/* loaded from: classes4.dex */
public final class s implements xd4.g0, ok4.d {

    /* renamed from: k, reason: collision with root package name */
    public static final dd4.r f229045k = new dd4.r(null);

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f229046l = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ok4.w f229047a;

    /* renamed from: b, reason: collision with root package name */
    public final ok4.c f229048b;

    /* renamed from: c, reason: collision with root package name */
    public int f229049c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f229050d;

    /* renamed from: e, reason: collision with root package name */
    public long f229051e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f229052f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f229053g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.VideoInfo f229054h;

    /* renamed from: i, reason: collision with root package name */
    public int f229055i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f229056j;

    public s(r45.jj4 jj4Var, kotlin.jvm.internal.i iVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f229050d = "";
        this.f229051e = -1L;
        this.f229052f = "";
        this.f229053g = "";
        this.f229056j = "";
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct();
        tPVideoPlayReportStruct.P = 1L;
        ok4.w wVar = new ok4.w(tPVideoPlayReportStruct, currentTimeMillis, 2);
        this.f229047a = wVar;
        this.f229048b = new ok4.c(currentTimeMillis);
        java.lang.String str = jj4Var.f377855d;
        com.tencent.mars.xlog.Log.e("MicroMsg.TPPlayerReporter", "markMediaId media id:" + str);
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct2 = wVar.f346044a;
        tPVideoPlayReportStruct2.f61053g = tPVideoPlayReportStruct2.b("MediaId", str, true);
    }

    public static final /* synthetic */ java.util.HashMap d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReporterMap$cp", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        java.util.HashMap hashMap = f229046l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReporterMap$cp", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        return hashMap;
    }

    @Override // ok4.d
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.getClass();
        this.f229048b.a(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // xd4.g0
    public com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct videoRptStruct = new com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct();
        videoRptStruct.f166556c = this.f229049c;
        videoRptStruct.f166555b = this.f229050d;
        videoRptStruct.f166554a = this.f229051e;
        videoRptStruct.f166557d = this.f229052f;
        videoRptStruct.f166559f = this.f229053g;
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.f229054h;
        if (videoInfo != null) {
            videoRptStruct.f166560g = videoInfo != null ? videoInfo.requestFlag : null;
            videoRptStruct.f166561h = videoInfo != null ? videoInfo.svrFlag : null;
        }
        videoRptStruct.f166564k = this.f229055i;
        videoRptStruct.f166565l = this.f229056j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        return videoRptStruct;
    }

    @Override // xd4.g0
    public long c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        return 0L;
    }

    @Override // ok4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBufferingStarted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.e();
        this.f229048b.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBufferingStarted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeek", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.g(i17, i18);
        this.f229048b.g(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeek", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBufferingStopped", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.h();
        this.f229048b.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBufferingStopped", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void onCompleted() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.onCompleted();
        this.f229048b.onCompleted();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.onError(i17, i18);
        this.f229048b.onError(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.onPause();
        this.f229048b.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.onStart();
        this.f229048b.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.onStop();
        this.f229048b.onStop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.q();
        this.f229048b.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekCompleted", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFirstVideoFrame", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.s();
        this.f229048b.s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFirstVideoFrame", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        this.f229047a.t(i17, j17, j18);
        this.f229048b.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
    }
}
