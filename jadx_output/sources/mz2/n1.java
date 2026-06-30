package mz2;

/* loaded from: classes9.dex */
public class n1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f333161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pz2.c f333162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz2.p1 f333163f;

    public n1(mz2.p1 p1Var, int i17, pz2.c cVar) {
        this.f333163f = p1Var;
        this.f333161d = i17;
        this.f333162e = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthMgrImp", "timeout: %s", java.lang.Integer.valueOf(this.f333161d));
        this.f333163f.f333085d.cancel();
        this.f333162e.a(2000, -1, -1, -1);
        return false;
    }
}
