package my3;

/* loaded from: classes13.dex */
public final class y implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.c0 f332845d;

    public y(my3.c0 c0Var) {
        this.f332845d = c0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "require login but expire time");
        my3.v vVar = this.f332845d.f332792g;
        if (vVar == null) {
            return false;
        }
        ((iy3.e) vVar).a("", "");
        return false;
    }
}
