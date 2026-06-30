package r01;

/* loaded from: classes7.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f368280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.m0 f368281e;

    public z0(com.tencent.wechat.mm.biz.b bVar, r01.m0 m0Var) {
        this.f368280d = bVar;
        this.f368281e = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.biz.b bVar = this.f368280d;
        java.lang.String str = bVar.f217889e;
        r01.m0 m0Var = this.f368281e;
        if (kotlin.jvm.internal.o.b(str, m0Var.f368153a)) {
            m0Var.f368154b = bVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogin: update acctResp");
        }
    }
}
