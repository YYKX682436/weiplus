package yt3;

/* loaded from: classes5.dex */
public final class s1 implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f465662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f465663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f465664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465665d;

    public s1(long j17, yt3.b2 b2Var, boolean z17, yz5.l lVar) {
        this.f465662a = j17;
        this.f465663b = b2Var;
        this.f465664c = z17;
        this.f465665d = lVar;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditor onSuccess: ");
        sb6.append(bitmap);
        sb6.append(" isNever：");
        sb6.append(z17);
        sb6.append("  cost:");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = this.f465662a;
        sb6.append(elapsedRealtime - j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
        boolean z19 = this.f465664c;
        yt3.b2 b2Var = this.f465663b;
        if (z19) {
            str = (java.lang.String) ((jz5.n) b2Var.f465359h).getValue();
        } else {
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = b2Var.f465361m;
            str = recordConfigProvider != null ? recordConfigProvider.E : null;
        }
        java.lang.String str2 = str;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(985L, 128L, elapsedRealtime2, false);
        if (bitmap == null) {
            g0Var.idkeyStat(985L, 126L, 1L, false);
        }
        if (bitmap != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yt3.r1(bitmap, str2, this.f465662a, this.f465663b, this.f465665d, null), 2, null);
        }
    }

    @Override // qk.p7
    public void onError(java.lang.Exception e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("MicroMsg.EditPhotoPluginLayout", "photoEditor onError: %s", e17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 125L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 128L, android.os.SystemClock.elapsedRealtime() - this.f465662a, false);
        this.f465663b.f465367s = false;
    }
}
