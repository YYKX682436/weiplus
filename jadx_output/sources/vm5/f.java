package vm5;

/* loaded from: classes10.dex */
public final class f implements com.tencent.tav.player.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f438154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f438155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vm5.g f438156c;

    public f(long j17, long j18, vm5.g gVar) {
        this.f438154a = j17;
        this.f438155b = j18;
        this.f438156c = gVar;
    }

    @Override // com.tencent.tav.player.Callback
    public final void call() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f438154a;
        xm5.b.c("VideoCompositionPlayer", "seekTo:" + this.f438155b + " completed", new java.lang.Object[0]);
        vm5.c cVar = this.f438156c.f438166j;
        if (cVar != null) {
            java.util.ArrayList arrayList = ((bp4.e0) cVar).f23149a.f23218q.f301032a;
            if (arrayList.size() < 50) {
                arrayList.add(java.lang.Long.valueOf(currentTimeMillis));
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.B(1468L, 1L);
            g0Var.C(1468L, 2L, currentTimeMillis);
            if (currentTimeMillis <= 30) {
                g0Var.B(1468L, 4L);
                return;
            }
            if (currentTimeMillis <= 100) {
                g0Var.B(1468L, 5L);
                return;
            }
            if (currentTimeMillis <= 500) {
                g0Var.B(1468L, 6L);
            } else if (currentTimeMillis <= 1000) {
                g0Var.B(1468L, 7L);
            } else {
                g0Var.B(1468L, 8L);
            }
        }
    }
}
