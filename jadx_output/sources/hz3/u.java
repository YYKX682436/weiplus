package hz3;

/* loaded from: classes12.dex */
public final class u implements hz3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz3.t f286366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hz3.w f286367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hz3.r f286368c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz3.s f286369d;

    public u(hz3.t tVar, hz3.w wVar, hz3.r rVar, hz3.s sVar) {
        this.f286366a = tVar;
        this.f286367b = wVar;
        this.f286368c = rVar;
        this.f286369d = sVar;
    }

    public void a(hz3.x checkCDNImageResult) {
        kotlin.jvm.internal.o.g(checkCDNImageResult, "checkCDNImageResult");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkImageCdnStatus result errType: ");
        int i17 = checkCDNImageResult.f286375a;
        sb6.append(i17);
        sb6.append(", errCode: ");
        int i18 = checkCDNImageResult.f286376b;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageCDNCheckHelper", sb6.toString());
        hz3.t tVar = this.f286366a;
        tVar.f286363c = i17;
        tVar.f286364d = i18;
        tVar.getClass();
        tVar.f286365e = "check cdn image error";
        if (i17 == 0 && i18 == 0) {
            hz3.w wVar = this.f286367b;
            if (kotlin.jvm.internal.o.b(wVar.f286370a, checkCDNImageResult.f286377c) && kotlin.jvm.internal.o.b(wVar.f286371b, checkCDNImageResult.f286378d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageCDNCheckHelper", "checkImageCdnStatus no need to re-upload, fileId: %s", wVar.f286370a);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageCDNCheckHelper", "checkImageCdnStatus re-upload image fileId: %s", checkCDNImageResult.f286377c);
                r45.si siVar = new r45.si();
                hz3.s sVar = this.f286369d;
                int i19 = sVar.f286359f;
                if (i19 == 1) {
                    siVar.f385743d = 3;
                } else if (i19 == 0) {
                    siVar.f385743d = 5;
                }
                android.graphics.Point point = sVar.f286356c;
                siVar.f385744e = point != null ? point.x : 0;
                siVar.f385745f = point != null ? point.y : 0;
                siVar.f385748i = 1;
                siVar.f385746g = checkCDNImageResult.f286377c;
                siVar.f385747h = checkCDNImageResult.f286378d;
                tVar.f286362b = siVar;
            }
        }
        hz3.r rVar = this.f286368c;
        if (rVar != null) {
            rVar.b(tVar);
        }
    }
}
