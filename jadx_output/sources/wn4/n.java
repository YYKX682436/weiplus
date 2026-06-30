package wn4;

/* loaded from: classes11.dex */
public final class n implements xv.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.hp.util.TinkerSyncResponse f447556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f447557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f447558c;

    public n(com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse, long j17, com.tencent.mm.vfs.r6 r6Var) {
        this.f447556a = tinkerSyncResponse;
        this.f447557b = j17;
        this.f447558c = r6Var;
    }

    @Override // xv.m0
    public void a(int i17) {
        if (i17 == 0) {
            new b83.e(lp0.a.f320249c, this.f447556a.f142419r).d(java.lang.System.currentTimeMillis() - this.f447557b);
            wn4.x xVar = wn4.x.f447571a;
            java.lang.String o17 = this.f447558c.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            xVar.a(o17, this.f447556a);
        } else {
            wn4.x xVar2 = wn4.x.f447571a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Updater.ManualUpdaterProcessor", "TCPFile Fail:" + i17);
        }
        wn4.x xVar3 = wn4.x.f447571a;
        ((ku5.t0) ku5.t0.f312615d).g(wn4.h.f447547d);
    }
}
