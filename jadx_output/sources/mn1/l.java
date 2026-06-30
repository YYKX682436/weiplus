package mn1;

/* loaded from: classes12.dex */
public class l implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f329871d;

    public l(mn1.e eVar) {
        this.f329871d = eVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (mn1.e.O) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "try connect overtime failed.");
        mn1.e eVar = this.f329871d;
        com.tencent.mm.sdk.platformtools.b4 b4Var = eVar.G;
        if (b4Var != null) {
            b4Var.d();
        }
        eVar.m();
        return true;
    }
}
