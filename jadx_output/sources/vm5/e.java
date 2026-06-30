package vm5;

/* loaded from: classes10.dex */
public final class e implements com.tencent.tav.player.OnCompositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f438148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vm5.g f438149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tav.coremedia.CMTime f438150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f438151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tav.coremedia.CMTime f438152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f438153f;

    public e(long j17, vm5.g gVar, com.tencent.tav.coremedia.CMTime cMTime, long j18, com.tencent.tav.coremedia.CMTime cMTime2, boolean z17) {
        this.f438148a = j17;
        this.f438149b = gVar;
        this.f438150c = cMTime;
        this.f438151d = j18;
        this.f438152e = cMTime2;
        this.f438153f = z17;
    }

    @Override // com.tencent.tav.player.OnCompositionUpdateListener
    public final void onUpdated(com.tencent.tav.player.Player player, boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f438148a;
        vm5.g gVar = this.f438149b;
        vm5.c cVar = gVar.f438166j;
        if (cVar != null) {
            java.util.ArrayList arrayList = ((bp4.e0) cVar).f23149a.f23218q.f301033b;
            if (arrayList.size() < 50) {
                arrayList.add(java.lang.Long.valueOf(currentTimeMillis));
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.B(1468L, 11L);
            g0Var.C(1468L, 12L, currentTimeMillis);
        }
        xm5.b.c("VideoCompositionPlayer", "on composition update, success:" + z17 + ", position:" + (player.position().getTimeUs() / 1000) + ", originPosition:" + this.f438150c + ", isStarted:" + gVar.f438164h + ", cost:" + (android.os.SystemClock.elapsedRealtime() - this.f438151d), new java.lang.Object[0]);
        player.seekToTime(this.f438152e);
        if (this.f438153f || gVar.f438164h) {
            player.play();
        }
        gVar.f438165i = false;
    }
}
