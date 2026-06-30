package re2;

/* loaded from: classes3.dex */
public final class i1 implements com.tencent.mm.sdk.platformtools.f7 {
    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "screenShotCallback onScreenShot: dateAdded=" + j17 + ", isPending=" + z17);
        re2.e0 e0Var = re2.j1.f394438b;
        if (e0Var != null && e0Var.d()) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "notifyScreenshotDetected: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
            e0Var.h();
        }
    }
}
