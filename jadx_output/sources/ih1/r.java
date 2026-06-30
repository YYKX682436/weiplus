package ih1;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f291522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f291523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ih1.u uVar, long j17, android.app.Activity activity) {
        super(0);
        this.f291521d = uVar;
        this.f291522e = j17;
        this.f291523f = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appId[");
        ih1.u uVar = this.f291521d;
        sb6.append(uVar.f291530a);
        sb6.append("], prepare");
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", sb6.toString());
        uVar.f291532c = ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ai(new ih1.p(uVar), uVar.f291530a);
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "prepare on thread " + java.lang.Thread.currentThread().getName() + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms");
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        iq0.c cVar = uVar.f291532c;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).wi(cVar, this.f291523f);
        }
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "active on thread " + java.lang.Thread.currentThread().getName() + ", cost " + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + " ms");
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("appId[");
        sb7.append(uVar.f291530a);
        sb7.append("], start done, cost:%s");
        com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", sb7.toString(), java.lang.String.valueOf(currentTimeMillis3 - this.f291522e));
        return jz5.f0.f302826a;
    }
}
