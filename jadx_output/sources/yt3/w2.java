package yt3;

/* loaded from: classes10.dex */
public final class w2 implements com.tencent.mm.plugin.mmsight.ui.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f465707a;

    public w2(yt3.z2 z2Var) {
        this.f465707a = z2Var;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onLongPressFinish");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        yt3.z2 z2Var = this.f465707a;
        z2Var.f465745o = elapsedRealtime;
        z2Var.m(false);
        dx1.g.f244489a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f36310e);
    }
}
