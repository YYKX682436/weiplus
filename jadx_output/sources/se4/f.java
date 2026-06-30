package se4;

/* loaded from: classes9.dex */
public class f implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f406922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ re4.z f406923b;

    public f(long j17, re4.z zVar) {
        this.f406922a = j17;
        this.f406923b = zVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitManager", "onTerminate");
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterInitManager", "init takes %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f406922a));
        re4.z zVar = this.f406923b;
        if (zVar != null) {
            zVar.h(0, "");
        }
        se4.h.b(0, "");
    }
}
