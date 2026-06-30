package y24;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct f459120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f459121e;

    public a(com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct, int i17) {
        this.f459120d = shakeActionReportStruct;
        this.f459121e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct shakeActionReportStruct = this.f459120d;
        if (shakeActionReportStruct == null) {
            shakeActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ShakeActionReportStruct();
        }
        shakeActionReportStruct.f60324d = this.f459121e;
        shakeActionReportStruct.f60335o = shakeActionReportStruct.b("SessionID", y24.b.f459122a, true);
        shakeActionReportStruct.f60325e = java.lang.System.currentTimeMillis();
        shakeActionReportStruct.f60333m = y24.b.f459124c;
        shakeActionReportStruct.f60332l = y24.b.f459123b;
        shakeActionReportStruct.k();
    }
}
