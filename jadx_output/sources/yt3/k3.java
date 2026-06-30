package yt3;

/* loaded from: classes10.dex */
public final class k3 implements com.tencent.mm.plugin.mmsight.ui.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f465513a;

    public k3(yt3.r3 r3Var) {
        this.f465513a = r3Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.j0
    public final void a() {
        yt3.r3 r3Var = this.f465513a;
        long j17 = r3Var.f465637r;
        if (j17 != -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 <= r3Var.f465636q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onSimpleTap too often! %s", com.tencent.mm.sdk.platformtools.z3.b(true));
                dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
            }
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "onSimpleTap %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        ju3.d0.k(r3Var.f465627e, ju3.c0.f301901s, null, 2, null);
        r3Var.f465637r = android.os.SystemClock.elapsedRealtime();
        dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
    }
}
