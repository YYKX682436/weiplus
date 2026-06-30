package u62;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f424951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f424952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v25.b f424953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg f424954g;

    public e(com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg extControlProviderMsg, com.tencent.mm.storage.z3 z3Var, java.lang.String[] strArr, v25.b bVar) {
        this.f424954g = extControlProviderMsg;
        this.f424951d = z3Var;
        this.f424952e = strArr;
        this.f424953f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent extNetSceneSendMsgEvent = new com.tencent.mm.autogen.events.ExtNetSceneSendMsgEvent();
        com.tencent.mm.storage.z3 z3Var = this.f424951d;
        java.lang.String d17 = z3Var.d1();
        am.i8 i8Var = extNetSceneSendMsgEvent.f54200g;
        i8Var.f6915a = d17;
        i8Var.f6916b = this.f424952e[1];
        i8Var.f6917c = c01.e2.C(z3Var.d1());
        boolean e17 = extNetSceneSendMsgEvent.e();
        v25.b bVar = this.f424953f;
        com.tencent.mm.plugin.ext.provider.ExtControlProviderMsg extControlProviderMsg = this.f424954g;
        if (!e17) {
            extControlProviderMsg.k(4);
            bVar.a();
            return;
        }
        am.j8 j8Var = extNetSceneSendMsgEvent.f54201h;
        com.tencent.mm.modelbase.m1 m1Var = j8Var.f7015b;
        try {
            c01.d9.e().a(522, new u62.d(this, com.tencent.mm.plugin.ext.key.AESUtil.b(j8Var.f7014a)));
            c01.d9.e().g(m1Var);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderMsg", e18.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtControlProviderMsg", e18, "", new java.lang.Object[0]);
            extControlProviderMsg.k(4);
            bVar.a();
        }
    }
}
