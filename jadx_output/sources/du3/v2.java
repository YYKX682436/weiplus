package du3;

/* loaded from: classes10.dex */
public final class v2 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f243752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f243754c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f243755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f243756e;

    public v2(long j17, du3.t3 t3Var, java.util.ArrayList arrayList, boolean z17, yz5.l lVar) {
        this.f243752a = j17;
        this.f243753b = t3Var;
        this.f243754c = arrayList;
        this.f243755d = z17;
        this.f243756e = lVar;
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
        long j17 = this.f243752a;
        sb6.append(elapsedRealtime - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - j17, false);
        if (bitmap == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new du3.u2(bitmap, this.f243753b, this.f243752a, this.f243754c, this.f243755d, this.f243756e, null), 2, null);
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "photoEditor onError: %s", e17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 125L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f243752a, false);
        nu3.i.f340218a.h();
        this.f243753b.A = false;
    }
}
