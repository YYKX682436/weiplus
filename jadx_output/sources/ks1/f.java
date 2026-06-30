package ks1;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks1.g f311590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f311591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.api.TransferRequestInfo f311592f;

    public f(ks1.g gVar, zq1.g0 g0Var, com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        this.f311590d = gVar;
        this.f311591e = g0Var;
        this.f311592f = transferRequestInfo;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.modelbase.r1 d17;
        com.tencent.mm.network.s sVar;
        ks1.g gVar = this.f311590d;
        gVar.getClass();
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c && (d17 = gm0.j1.d()) != null && (sVar = d17.f70764d) != null) {
            sVar.p1(gVar.d(), "", 0);
        }
        zq1.g0 g0Var = this.f311591e;
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            r45.z24 e17 = gVar.e(oVar);
            if (e17 == null) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str4 = "transfer failed invalid jsApiResponse";
                } else {
                    kotlin.jvm.internal.o.d(str);
                    str4 = str;
                }
                if (g0Var != null) {
                    com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
                    transferResultInfo.f93926d = 3;
                    transferResultInfo.f93927e = "[" + i17 + ", " + i18 + ", " + str4 + ']';
                    g0Var.b(transferResultInfo);
                }
            } else if (g0Var != null) {
                com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo2 = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
                transferResultInfo2.f93926d = 0;
                transferResultInfo2.f93927e = "";
                transferResultInfo2.f93928f = e17;
                g0Var.b(transferResultInfo2);
            }
        } else if (i18 == -262 || i18 == -263) {
            ((js1.s) gVar.f311593a).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestTokenManager", "clearToken");
            ((ku5.t0) ku5.t0.f312615d).h(js1.n.f301493d, "TransferRequestTokenManager");
            com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo = this.f311592f;
            if (transferRequestInfo.f93923q) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] transfer failed, token expire and retry failed");
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str2 = "transfer failed, token expire and retry failed";
                } else {
                    kotlin.jvm.internal.o.d(str);
                    str2 = str;
                }
                if (g0Var != null) {
                    com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo3 = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
                    transferResultInfo3.f93926d = 4;
                    transferResultInfo3.f93927e = "[" + i17 + ", " + i18 + ", " + str2 + ']';
                    g0Var.b(transferResultInfo3);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseTransferRequest", "[transferRequest-" + gVar.f() + "] h5Session timeout and retry");
                transferRequestInfo.f93923q = true;
                ks1.g.a(gVar, transferRequestInfo);
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new ks1.e(gVar, transferRequestInfo, g0Var, null), 3, null);
            }
        } else {
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                str3 = "transfer failed";
            } else {
                kotlin.jvm.internal.o.d(str);
                str3 = str;
            }
            if (g0Var != null) {
                com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo4 = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
                transferResultInfo4.f93926d = 5;
                transferResultInfo4.f93927e = "[" + i17 + ", " + i18 + ", " + str3 + ']';
                g0Var.b(transferResultInfo4);
            }
        }
        return 0;
    }
}
