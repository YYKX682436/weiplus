package ks1;

/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final js1.c f311593a;

    public g(js1.c tokenManager) {
        kotlin.jvm.internal.o.g(tokenManager, "tokenManager");
        this.f311593a = tokenManager;
    }

    public static final void a(ks1.g gVar, com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] needClientCheckData: " + transferRequestInfo.f93918i);
        if (transferRequestInfo.f93918i && transferRequestInfo.f93919m == null) {
            r45.k57 k57Var = new r45.k57();
            java.lang.System.currentTimeMillis();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f378396f = cu5Var;
            java.lang.System.currentTimeMillis();
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.toByteArray());
            transferRequestInfo.f93919m = cu5Var2;
        }
    }

    public static final void b(ks1.g gVar, com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo, zq1.g0 g0Var) {
        com.tencent.mm.network.s sVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transferRequest-");
        sb6.append(gVar.f());
        sb6.append("] method: ");
        r45.y24 y24Var = transferRequestInfo.f93917h;
        sb6.append(y24Var != null ? java.lang.Integer.valueOf(y24Var.f390729h) : null);
        sb6.append(", h5Url: ");
        sb6.append(transferRequestInfo.f93914e);
        sb6.append(", reqUrl: ");
        r45.y24 y24Var2 = transferRequestInfo.f93917h;
        sb6.append(y24Var2 != null ? y24Var2.f390725d : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTransferRequest", sb6.toString());
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            java.lang.String str2 = transferRequestInfo.f93924r;
            if (!(str2 == null || str2.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] cgi: " + gVar.d() + ", debugIP: " + transferRequestInfo.f93924r);
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                if (d17 != null && (sVar = d17.f70764d) != null) {
                    sVar.p1(gVar.d(), transferRequestInfo.f93924r, 0);
                }
            }
        }
        com.tencent.mm.modelbase.z2.d(gVar.c(transferRequestInfo), new ks1.f(gVar, g0Var, transferRequestInfo), false);
    }

    public abstract com.tencent.mm.modelbase.o c(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo);

    public abstract java.lang.String d();

    public abstract r45.z24 e(com.tencent.mm.modelbase.o oVar);

    public abstract java.lang.String f();
}
