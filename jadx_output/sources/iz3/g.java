package iz3;

/* loaded from: classes12.dex */
public final class g implements f04.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iz3.j f296077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f296078b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry3.p f296079c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry3.r f296080d;

    public g(iz3.j jVar, long j17, ry3.p pVar, ry3.r rVar) {
        this.f296077a = jVar;
        this.f296078b = j17;
        this.f296079c = pVar;
        this.f296080d = rVar;
    }

    public final void a(boolean z17, byte[] bArr) {
        if (!z17 || bArr == null) {
            long j17 = this.f296078b;
            int i17 = this.f296079c.f401528b;
            ry3.r rVar = this.f296080d;
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), 101, "decode image failed");
            ry3.q qVar = new ry3.q();
            qVar.f401543a = j17;
            qVar.f401544b = false;
            qVar.f401545c = 3;
            qVar.f401546d = 101;
            qVar.f401547e = "decode image failed";
            ((ku5.t0) ku5.t0.f312615d).B(new iz3.t(rVar, j17, qVar));
            return;
        }
        iz3.j jVar = this.f296077a;
        ry3.p pVar = jVar.f296084a;
        kotlin.jvm.internal.o.d(pVar);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(bArr.length);
        objArr[1] = java.lang.Long.valueOf(pVar.f401527a);
        objArr[2] = java.lang.Integer.valueOf(pVar.f401534h);
        objArr[3] = java.lang.Boolean.valueOf(pVar.f401538l);
        com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo scanImagePHashInfo = pVar.f401537k;
        com.tencent.mm.modelbase.m1 m1Var = null;
        objArr[4] = scanImagePHashInfo != null ? scanImagePHashInfo.pHash : null;
        objArr[5] = scanImagePHashInfo != null ? scanImagePHashInfo.pHashVersion : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AiImageDefaultUploader", "uploadImageDefault imageData: %d, session: %s, mode: %d, needPHash: %s, pHash: %s, %s", objArr);
        int i18 = pVar.f401528b;
        if (i18 == 1) {
            m1Var = new com.tencent.mm.plugin.scanner.model.v(bArr, pVar.f401527a, pVar.f401533g, pVar.f401534h, 0, pVar.f401535i, pVar.f401536j, pVar.f401537k, null, null, null, "");
        } else if (i18 == 3) {
            m1Var = new kz3.x(bArr, pVar.f401527a, pVar.f401540n, 0, null, null, null, 112, null);
        }
        if (m1Var != null) {
            jVar.f296085b = m1Var.hashCode();
            gm0.j1.d().g(m1Var);
        }
    }
}
