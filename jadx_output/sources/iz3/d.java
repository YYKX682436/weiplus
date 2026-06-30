package iz3;

/* loaded from: classes12.dex */
public final class d implements hz3.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f296069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ry3.p f296070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry3.r f296071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.j f296072d;

    public d(long j17, ry3.p pVar, ry3.r rVar, iz3.j jVar) {
        this.f296069a = j17;
        this.f296070b = pVar;
        this.f296071c = rVar;
        this.f296072d = jVar;
    }

    public void a(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.AiImageCDNUploader", "uploadImage-cdn onError %s %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
        iz3.f fVar = iz3.f.f296075a;
        long j17 = this.f296069a;
        int i19 = this.f296070b.f401528b;
        ry3.r rVar = this.f296071c;
        com.tencent.mars.xlog.Log.e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), errMsg);
        ry3.q qVar = new ry3.q();
        qVar.f401543a = j17;
        qVar.f401544b = false;
        qVar.f401545c = i17;
        qVar.f401546d = i18;
        qVar.f401547e = errMsg;
        ((ku5.t0) ku5.t0.f312615d).B(new iz3.t(rVar, j17, qVar));
        ((ku5.t0) ku5.t0.f312615d).B(new iz3.b(this.f296069a));
    }

    public void b(java.util.ArrayList cdnList) {
        com.tencent.mm.modelbase.m1 vVar;
        kotlin.jvm.internal.o.g(cdnList, "cdnList");
        com.tencent.mars.xlog.Log.i("MicroMsg.AiImageCDNUploader", "uploadImage-cdn onGetCDNInfoResult list size: %s", java.lang.Integer.valueOf(cdnList.size()));
        java.util.Iterator it = cdnList.iterator();
        while (it.hasNext()) {
            r45.si siVar = (r45.si) it.next();
            kotlin.jvm.internal.o.g(siVar, "<this>");
            kotlin.jvm.internal.o.f(java.lang.String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", java.util.Arrays.copyOf(new java.lang.Object[]{siVar.f385746g, java.lang.Integer.valueOf(siVar.f385744e), java.lang.Integer.valueOf(siVar.f385745f), java.lang.Integer.valueOf(siVar.f385743d), java.lang.Integer.valueOf(siVar.f385748i)}, 5)), "format(...)");
        }
        ry3.p pVar = this.f296070b;
        int i17 = pVar.f401528b;
        if (i17 != 1) {
            vVar = i17 != 3 ? null : new kz3.x(null, pVar.f401527a, pVar.f401540n, 0, null, null, cdnList, 48, null);
        } else {
            long j17 = this.f296069a;
            int i18 = pVar.f401533g;
            int i19 = pVar.f401534h;
            r45.cj cjVar = pVar.f401535i;
            r45.vi viVar = pVar.f401536j;
            com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo scanImagePHashInfo = pVar.f401537k;
            java.lang.String chat_uuid = pVar.f401532f;
            kotlin.jvm.internal.o.f(chat_uuid, "chat_uuid");
            vVar = new com.tencent.mm.plugin.scanner.model.v(null, j17, i18, i19, 0, cjVar, viVar, scanImagePHashInfo, null, null, cdnList, chat_uuid);
        }
        if (vVar != null) {
            this.f296072d.f296085b = vVar.hashCode();
            gm0.j1.d().g(vVar);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new iz3.c(this.f296069a));
    }
}
