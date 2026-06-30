package ez;

/* loaded from: classes12.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f257746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ez.k1 f257748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257749g;

    public j1(com.tencent.mm.storage.f9 f9Var, java.lang.String str, ez.k1 k1Var, java.lang.String str2) {
        this.f257746d = f9Var;
        this.f257747e = str;
        this.f257748f = k1Var;
        this.f257749g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        long c17 = c01.id.c();
        com.tencent.mm.storage.f9 f9Var = this.f257746d;
        if (c17 - f9Var.getCreateTime() > 1209600000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgFeatureService", "ignore report, msgId:" + f9Var.getMsgId());
            return;
        }
        java.lang.String str2 = this.f257747e;
        if (this.f257748f.f257751d.add(com.tencent.mm.sdk.platformtools.w2.a(str2))) {
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct.p("msg_check_talker");
            msgRefactorReportStruct.u(str2);
            msgRefactorReportStruct.f59279h = msgRefactorReportStruct.b("msgTalker", f9Var.Q0(), true);
            msgRefactorReportStruct.f59278g = f9Var.getType();
            msgRefactorReportStruct.f59280i = f9Var.getMsgId();
            msgRefactorReportStruct.f59281j = f9Var.I0();
            msgRefactorReportStruct.r(this.f257749g);
            msgRefactorReportStruct.s(bm5.w.a(f9Var).name());
            msgRefactorReportStruct.t(java.lang.String.valueOf(f9Var.getCreateTime()));
            msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            msgRefactorReportStruct.k();
        }
    }
}
