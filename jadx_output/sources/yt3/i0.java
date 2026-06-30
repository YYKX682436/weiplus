package yt3;

/* loaded from: classes10.dex */
public final class i0 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f465489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yt3.p0 f465490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f465491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f465492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465493e;

    public i0(long j17, yt3.p0 p0Var, java.util.ArrayList arrayList, boolean z17, yz5.l lVar) {
        this.f465489a = j17;
        this.f465490b = p0Var;
        this.f465491c = arrayList;
        this.f465492d = z17;
        this.f465493e = lVar;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditor onSuccess: ");
        sb6.append(bitmap);
        sb6.append(" isNever：");
        sb6.append(z17);
        sb6.append("  cost:");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f465489a;
        sb6.append(elapsedRealtime - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - j17, false);
        if (bitmap == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yt3.h0(bitmap, this.f465490b, this.f465489a, this.f465491c, this.f465492d, this.f465493e, null), 2, null);
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("MicroMsg.EditPhotoPluginLayout", "photoEditor onError: %s", e17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 125L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f465489a, false);
        nu3.i.f340218a.h();
        this.f465490b.f465589q = false;
    }
}
