package qn1;

/* loaded from: classes12.dex */
public class e implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.d f364984d;

    public e(qn1.d dVar) {
        this.f364984d = dVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        qn1.d dVar = this.f364984d;
        if (dVar.f364968h) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "tryConnect overtime failed.");
        com.tencent.mm.sdk.platformtools.b4 b4Var = dVar.f364970j;
        if (b4Var != null) {
            b4Var.d();
        }
        qn1.d.a(dVar);
        xn1.c.b("Status", 3);
        return true;
    }
}
