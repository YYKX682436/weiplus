package zf4;

/* loaded from: classes13.dex */
public class z implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.a0 f472707d;

    public z(zf4.a0 a0Var) {
        this.f472707d = a0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        try {
            zf4.a0.a(this.f472707d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoiceRemindService", e17, "", new java.lang.Object[0]);
        }
        return false;
    }
}
