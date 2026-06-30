package tl;

/* loaded from: classes12.dex */
public class p implements com.tencent.mm.sdk.platformtools.a4 {
    public p(tl.t tVar) {
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAudioRecorder", "Acc try interrupt read");
        try {
            ((android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility")).interrupt();
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }
}
