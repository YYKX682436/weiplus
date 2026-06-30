package su4;

/* loaded from: classes8.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f412912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f412913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f412914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f412915h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f412916i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412917m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f412918n;

    public h3(java.lang.String str, long j17, int i17, int i18, int i19, long j18, java.lang.String str2, int i27) {
        this.f412911d = str;
        this.f412912e = j17;
        this.f412913f = i17;
        this.f412914g = i18;
        this.f412915h = i19;
        this.f412916i = j18;
        this.f412917m = str2;
        this.f412918n = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) gm0.j1.u().c().l(68377, null)) ? 1 : 0;
        int i18 = 0;
        int f17 = ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi() != null ? ((com.tencent.mm.plugin.sns.storage.w1) ((ee0.l4) ((fe0.h4) i95.n0.c(fe0.h4.class))).wi()).f() : 0;
        if (f17 > 0) {
            i18 = 2;
        } else {
            f17 = 0;
            if (i17 > 0) {
                i18 = 1;
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.TopStoryRedDotReportClientStruct topStoryRedDotReportClientStruct = new com.tencent.mm.autogen.mmdata.rpt.TopStoryRedDotReportClientStruct();
        topStoryRedDotReportClientStruct.f61325d = topStoryRedDotReportClientStruct.b("RedDotId", this.f412911d, true);
        topStoryRedDotReportClientStruct.f61325d = topStoryRedDotReportClientStruct.b("RedDotId", java.lang.String.valueOf(this.f412912e), true);
        topStoryRedDotReportClientStruct.f61326e = topStoryRedDotReportClientStruct.b("NetType", com.tencent.mm.plugin.websearch.l2.b(), true);
        topStoryRedDotReportClientStruct.f61327f = this.f412913f;
        topStoryRedDotReportClientStruct.f61328g = this.f412914g;
        topStoryRedDotReportClientStruct.f61329h = this.f412915h;
        topStoryRedDotReportClientStruct.f61330i = this.f412916i;
        topStoryRedDotReportClientStruct.f61331j = topStoryRedDotReportClientStruct.b("NotShowReason", this.f412917m, true);
        topStoryRedDotReportClientStruct.f61332k = i18;
        topStoryRedDotReportClientStruct.f61333l = f17;
        topStoryRedDotReportClientStruct.f61334m = this.f412918n;
        topStoryRedDotReportClientStruct.k();
        topStoryRedDotReportClientStruct.o();
    }
}
