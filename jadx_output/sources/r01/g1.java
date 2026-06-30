package r01;

/* loaded from: classes7.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f368085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f368086e;

    public g1(r01.l1 l1Var, com.tencent.wechat.mm.biz.b bVar) {
        this.f368085d = l1Var;
        this.f368086e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.l1 l1Var = this.f368085d;
        r01.m0 m0Var = l1Var.f368148m;
        com.tencent.wechat.mm.biz.b bVar = this.f368086e;
        java.lang.String biz = bVar.f217889e;
        kotlin.jvm.internal.o.f(biz, "biz");
        m0Var.getClass();
        m0Var.f368153a = biz;
        byte[] data = bVar.getData();
        kotlin.jvm.internal.o.f(data, "getData(...)");
        if (!(data.length == 0)) {
            l1Var.f368148m.f368154b = bVar;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPersonalCenterPluginAppHelper", "setupAllAccounts: photoResp empty, skip save photo resp cache");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "setupAllAccounts: photo cache initialized, biz=" + bVar.f217889e);
    }
}
