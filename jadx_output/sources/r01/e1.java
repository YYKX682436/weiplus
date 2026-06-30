package r01;

/* loaded from: classes7.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f368055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f368056e;

    public e1(r01.l1 l1Var, com.tencent.wechat.mm.biz.b bVar) {
        this.f368055d = l1Var;
        this.f368056e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.l1 l1Var = this.f368055d;
        r01.m0 m0Var = l1Var.f368147i;
        com.tencent.wechat.mm.biz.b bVar = this.f368056e;
        java.lang.String biz = bVar.f217889e;
        kotlin.jvm.internal.o.f(biz, "biz");
        m0Var.getClass();
        m0Var.f368153a = biz;
        byte[] data = bVar.getData();
        kotlin.jvm.internal.o.f(data, "getData(...)");
        if (!(data.length == 0)) {
            l1Var.f368147i.f368154b = bVar;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPersonalCenterPluginAppHelper", "setupAllAccounts: bizResp empty, skip save biz resp cache");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "setupAllAccounts: biz cache initialized, biz=" + bVar.f217889e);
    }
}
