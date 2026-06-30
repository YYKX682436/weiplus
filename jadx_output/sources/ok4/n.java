package ok4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f346024d = i17;
        this.f346025e = str;
        this.f346026f = str2;
        this.f346027g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i17 = this.f346024d;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f346027g;
        java.lang.String str2 = this.f346026f;
        java.lang.String str3 = this.f346025e;
        if (i17 == 2) {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = ok4.u.f346041a.a(str3);
            if (a17 != null) {
                a17.f59264y = a17.b("FullScreen_ReqFlag", str2, true);
                a17.A = a17.b("FullScreen_RespFlag", str, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReqFlagAndRepFlag >> " + str3 + ", " + str2 + ", " + str);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setFullScreenReqFlagAndRepFlag >> " + str3 + ", " + str + ", " + str + " but data is no find");
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a18 = ok4.u.f346041a.a(str3);
            if (a18 != null) {
                java.lang.String str4 = a18.f59254o;
                a18.f59254o = a18.b("Preview_ReqFlag", str2, true);
                a18.f59257r = a18.b("Preview_RespFlag", str, true);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setPreviewReqAndRespFlag >> " + str3 + ", " + str2 + ", " + str + ", " + str4);
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setPreviewReqAndRespFlag >> " + str3 + "  >> is no have struct");
            }
        }
        return f0Var;
    }
}
