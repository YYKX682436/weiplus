package r01;

/* loaded from: classes7.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.m0 f368025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368026e;

    public b1(r01.m0 m0Var, java.lang.String str) {
        this.f368025d = m0Var;
        this.f368026e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.m0 m0Var = this.f368025d;
        java.lang.String str = m0Var.f368153a;
        java.lang.String str2 = this.f368026e;
        if (kotlin.jvm.internal.o.b(str, str2)) {
            m0Var.getClass();
            m0Var.f368153a = "";
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogout: clear biz");
        }
        com.tencent.wechat.mm.biz.b bVar = m0Var.f368154b;
        if (kotlin.jvm.internal.o.b(bVar != null ? bVar.f217889e : null, str2)) {
            m0Var.f368154b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogout: clear acctResp");
        }
    }
}
