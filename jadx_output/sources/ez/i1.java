package ez;

/* loaded from: classes12.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ez.k1 f257741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f257742f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257743g;

    public i1(java.lang.String str, ez.k1 k1Var, long j17, java.lang.String str2) {
        this.f257740d = str;
        this.f257741e = k1Var;
        this.f257742f = j17;
        this.f257743g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f257740d;
        if (this.f257741e.f257751d.add(com.tencent.mm.sdk.platformtools.w2.a(str))) {
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct.p("msg_empty_table");
            msgRefactorReportStruct.u(str);
            msgRefactorReportStruct.f59280i = this.f257742f;
            java.lang.String str2 = this.f257743g;
            if (str2 == null) {
                str2 = "";
            }
            msgRefactorReportStruct.r(str2);
            msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            msgRefactorReportStruct.k();
        }
    }
}
