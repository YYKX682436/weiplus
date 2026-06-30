package yt3;

/* loaded from: classes10.dex */
public final class v2 implements com.tencent.mm.plugin.mmsight.ui.u3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f465700a;

    public v2(yt3.z2 z2Var) {
        this.f465700a = z2Var;
    }

    public void a() {
        yt3.z2 z2Var = this.f465700a;
        long j17 = z2Var.f465745o;
        if (j17 != -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 <= z2Var.f465744n) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap too often! %s", com.tencent.mm.sdk.platformtools.z3.b(true));
                dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
            }
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        z2Var.f465740g.setTouchEnable(false);
        ju3.d0.k(z2Var.f465738e, ju3.c0.f301901s, null, 2, null);
        z2Var.f465745o = android.os.SystemClock.elapsedRealtime();
        dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
    }
}
