package tz2;

/* loaded from: classes14.dex */
public final class o implements h72.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tz2.q f423310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tz2.l f423311b;

    public o(tz2.q qVar, tz2.l lVar) {
        this.f423310a = qVar;
        this.f423311b = lVar;
    }

    @Override // h72.r
    public final void a(java.lang.String str) {
        tz2.q qVar = this.f423310a;
        tz2.q.a(qVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("video record done. using: ");
        long j17 = qVar.f423319c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
        sb6.append(" ms. file path: ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            tz2.q.a(qVar);
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashRecordManagerForPay", "cdn upload filePath is empty");
            h72.s.e().d();
            return;
        }
        int ordinal = this.f423311b.ordinal();
        if (ordinal == 0) {
            h72.s.e().d();
            return;
        }
        if (ordinal == 1) {
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new tz2.n(str, qVar, null), 1, null);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            tz2.q.a(qVar);
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashRecordManagerForPay", "invalid cdnUploadType");
            h72.s.e().d();
        } else {
            yz5.l lVar = qVar.f423318b;
            if (lVar != null) {
                kotlin.jvm.internal.o.d(str);
                lVar.invoke(str);
            }
        }
    }
}
