package mg0;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public int f326198b;

    /* renamed from: c, reason: collision with root package name */
    public int f326199c;

    /* renamed from: d, reason: collision with root package name */
    public int f326200d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f326201e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f326197a = "";

    /* renamed from: f, reason: collision with root package name */
    public int f326202f = -1;

    public final void a() {
        boolean z17;
        if (kotlin.jvm.internal.o.b(this.f326197a, "0")) {
            this.f326201e = true;
            return;
        }
        if (this.f326202f < 3) {
            this.f326202f = 3;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            this.f326201e = false;
            com.tencent.mm.autogen.mmdata.rpt.VoIPMobileReportStruct voIPMobileReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPMobileReportStruct();
            voIPMobileReportStruct.f61640e = voIPMobileReportStruct.b("RoomUin", this.f326197a, true);
            voIPMobileReportStruct.f61642g = this.f326198b;
            voIPMobileReportStruct.f61641f = this.f326199c;
            voIPMobileReportStruct.f61639d = this.f326200d;
            voIPMobileReportStruct.f61643h = 1;
            voIPMobileReportStruct.f61644i = 2;
            voIPMobileReportStruct.o();
            voIPMobileReportStruct.k();
        }
    }
}
