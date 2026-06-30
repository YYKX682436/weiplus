package fk;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.q0 f263253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263255h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263256i;

    public b(java.lang.String str, java.lang.String str2, wj.q0 q0Var, int i17, java.lang.String str3, java.lang.String str4) {
        this.f263251d = str;
        this.f263252e = str2;
        this.f263253f = q0Var;
        this.f263254g = i17;
        this.f263255h = str3;
        this.f263256i = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.MagicAdReportStruct magicAdReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MagicAdReportStruct();
        magicAdReportStruct.f59016d = magicAdReportStruct.b("PosId", this.f263251d, true);
        java.lang.String str = this.f263252e;
        if (str == null) {
            str = "";
        }
        magicAdReportStruct.f59017e = magicAdReportStruct.b("Aid", str, true);
        magicAdReportStruct.f59018f = this.f263253f.f446497d;
        magicAdReportStruct.f59019g = this.f263254g;
        java.lang.String str2 = this.f263255h;
        magicAdReportStruct.f59020h = magicAdReportStruct.b("Extra", str2 != null ? r26.i0.u(str2, ',', ';', false, 4, null) : null, true);
        java.lang.String str3 = this.f263256i;
        magicAdReportStruct.f59021i = magicAdReportStruct.b("Extra2", str3 != null ? r26.i0.u(str3, ',', ';', false, 4, null) : null, true);
        magicAdReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicAdCommonReporter", "35978, posId = " + magicAdReportStruct.f59016d + ", aid = " + magicAdReportStruct.f59017e + ", actionType = " + magicAdReportStruct.f59018f + ", value = " + magicAdReportStruct.f59019g + ", extra = " + magicAdReportStruct.f59020h + ", extra2 = " + magicAdReportStruct.f59021i);
    }
}
