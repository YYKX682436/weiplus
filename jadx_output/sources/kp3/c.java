package kp3;

/* loaded from: classes11.dex */
public final class c implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.f f310966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f310967e;

    public c(kp3.f fVar, long j17) {
        this.f310966d = fVar;
        this.f310967e = j17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        kp3.f fVar = this.f310966d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = fVar.f310983t;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmGuideDialog", "autoHideTimer reach " + this.f310967e + " ms, hide dialog!");
        fVar.E("timeOut");
        return true;
    }
}
