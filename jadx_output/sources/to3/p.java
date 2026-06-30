package to3;

/* loaded from: classes9.dex */
public class p implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.q f420972d;

    public p(to3.q qVar) {
        this.f420972d = qVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        to3.q qVar = this.f420972d;
        if (qVar.f420976b != null) {
            if (!gm0.j1.a()) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = qVar.f420976b;
                int i17 = to3.q.f420973c;
                long j17 = 5000;
                b4Var.c(j17, j17);
                return false;
            }
            if (yo3.m.k()) {
                qVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "doGetOfflineMsg doScene:NetSceneOfflineGetMsg");
                wo3.e eVar = new wo3.e();
                gm0.j1.i();
                gm0.j1.n().f273288b.g(eVar);
            }
        }
        return false;
    }
}
