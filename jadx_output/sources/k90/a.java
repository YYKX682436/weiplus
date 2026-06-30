package k90;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k90.b f305503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f305504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oi3.g f305505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm5.y f305506h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305507i;

    public a(java.lang.String str, k90.b bVar, com.tencent.mm.storage.f9 f9Var, oi3.g gVar, bm5.y yVar, java.lang.String str2) {
        this.f305502d = str;
        this.f305503e = bVar;
        this.f305504f = f9Var;
        this.f305505g = gVar;
        this.f305506h = yVar;
        this.f305507i = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        bm5.v vVar;
        java.lang.String str3 = this.f305502d;
        if (this.f305503e.f305508d.add(com.tencent.mm.sdk.platformtools.w2.a(str3))) {
            com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
            msgRefactorReportStruct.p("c2c_write_old_path");
            msgRefactorReportStruct.u(str3);
            msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
            com.tencent.mm.storage.f9 f9Var = this.f305504f;
            oi3.g gVar = this.f305505g;
            bm5.y yVar = this.f305506h;
            if ((f9Var == null || (str = f9Var.Q0()) == null) && (gVar == null || (str = gVar.getString(gVar.f345617d + 3)) == null)) {
                str = yVar != null ? yVar.f22758a : null;
            }
            msgRefactorReportStruct.f59279h = msgRefactorReportStruct.b("msgTalker", str, true);
            msgRefactorReportStruct.f59278g = f9Var != null ? f9Var.getType() : gVar != null ? gVar.getInteger(gVar.f345617d + 4) : 0;
            long j17 = 0;
            msgRefactorReportStruct.f59280i = f9Var != null ? f9Var.getMsgId() : gVar != null ? gVar.getLong(gVar.f345617d + 0) : yVar != null ? yVar.f22759b : 0L;
            if (f9Var != null) {
                j17 = f9Var.I0();
            } else if (gVar != null) {
                j17 = gVar.getLong(gVar.f345617d + 1);
            } else if (yVar != null) {
                j17 = yVar.f22760c;
            }
            msgRefactorReportStruct.f59281j = j17;
            msgRefactorReportStruct.r(this.f305507i);
            if ((f9Var == null || (str2 = bm5.w.a(f9Var).f22753d) == null) && ((gVar == null || (str2 = bm5.w.b(gVar).f22753d) == null) && (yVar == null || (vVar = yVar.f22763f) == null || (str2 = vVar.f22753d) == null))) {
                str2 = "";
            }
            msgRefactorReportStruct.s(str2);
            msgRefactorReportStruct.k();
        }
    }
}
