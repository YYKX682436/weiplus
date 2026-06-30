package js1;

/* loaded from: classes7.dex */
public final class g implements js1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.api.TransferRequestInfo f301485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f301486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f301487c;

    public g(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo, zq1.g0 g0Var, long j17) {
        this.f301485a = transferRequestInfo;
        this.f301486b = g0Var;
        this.f301487c = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [ks1.k] */
    /* JADX WARN: Type inference failed for: r15v5, types: [ks1.i] */
    /* JADX WARN: Type inference failed for: r15v6, types: [ks1.l] */
    /* JADX WARN: Type inference failed for: r15v7, types: [ks1.a] */
    /* JADX WARN: Type inference failed for: r15v8, types: [ks1.b] */
    /* JADX WARN: Type inference failed for: r15v9, types: [ks1.j] */
    @Override // js1.a
    public void a(js1.b bVar, boolean z17) {
        ks1.h hVar;
        ks1.h hVar2;
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = this.f301485a;
        boolean a17 = js1.s.a(bVar, transferRequestInfo);
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestServiceImpl", "[transferRequestInMM] getToken onResult tokenValid: " + a17 + ", fromCache: " + z17);
        int i17 = 2;
        zq1.g0 g0Var = this.f301486b;
        if (!a17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransferRequestServiceImpl", "[transferRequestInMM] onResult getToken failed");
            if (g0Var != null) {
                com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
                transferResultInfo.f93926d = 2;
                transferResultInfo.f93927e = "transfer get token failed";
                transferResultInfo.f93929g = !z17;
                transferResultInfo.f93930h = transferRequestInfo.f93923q;
                g0Var.b(transferResultInfo);
                return;
            }
            return;
        }
        js1.f fVar = new js1.f(g0Var, z17, this.f301487c);
        kotlinx.coroutines.y0 y0Var = js1.m.f301492d;
        int i18 = transferRequestInfo.f93913d;
        java.lang.String str = transferRequestInfo.f93915f;
        js1.s sVar = js1.s.f301499a;
        r45.yh4 yh4Var = str == null ? null : (r45.yh4) js1.s.f301503e.get(str);
        if (yh4Var == null) {
            hVar = null;
        } else {
            if (i18 == 3 || i18 == 4) {
                i17 = 1;
            } else if (i18 != 5 && i18 != 6) {
                i17 = 0;
            }
            int i19 = yh4Var.f391085e;
            java.lang.String cgiUrl = yh4Var.f391086f;
            kotlin.jvm.internal.o.f(cgiUrl, "cgiUrl");
            hVar = new ks1.h(i19, cgiUrl, i17, sVar);
        }
        if (hVar == null) {
            switch (i18) {
                case 1:
                    hVar2 = new ks1.i(sVar);
                    hVar = hVar2;
                    break;
                case 2:
                    hVar2 = new ks1.l(sVar);
                    hVar = hVar2;
                    break;
                case 3:
                    hVar2 = new ks1.a(sVar);
                    hVar = hVar2;
                    break;
                case 4:
                    hVar2 = new ks1.b(sVar);
                    hVar = hVar2;
                    break;
                case 5:
                    hVar2 = new ks1.j(sVar);
                    hVar = hVar2;
                    break;
                case 6:
                    hVar2 = new ks1.k(sVar);
                    hVar = hVar2;
                    break;
                default:
                    hVar = null;
                    break;
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestServiceImpl", "createTransferRequester scope:" + str + " use dynamicRoutingRequester, cgiId:" + hVar.f311594b + ", cgiUrl:" + hVar.f311595c);
        }
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TransferRequestServiceImpl", "transferRequest invalid transfer type");
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new ks1.e(hVar, transferRequestInfo, new js1.e(fVar), null), 3, null);
        }
    }
}
