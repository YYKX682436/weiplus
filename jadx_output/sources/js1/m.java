package js1;

/* loaded from: classes7.dex */
public final class m implements zq1.f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f301492d = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));

    public void a(java.util.HashMap hashMap, com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo) {
        if (hashMap == null || transferResultInfo == null) {
            return;
        }
        hashMap.put("h5auth", java.lang.Integer.valueOf(transferResultInfo.f93929g ? 1 : 0));
        hashMap.put("retry", java.lang.Integer.valueOf(transferResultInfo.f93930h ? 1 : 0));
    }

    public java.lang.String b(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!com.tencent.mm.sdk.platformtools.s9.f192975c) {
            return null;
        }
        java.lang.String PROCESS_PUSH = com.tencent.mm.sdk.platformtools.w9.f193054b;
        kotlin.jvm.internal.o.f(PROCESS_PUSH, "PROCESS_PUSH");
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.f.b(PROCESS_PUSH, new com.tencent.mm.ipcinvoker.type.IPCString(str), new js1.d());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = iPCString != null ? iPCString.f68406d : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestServiceImpl", "getTransferDebugIPSync key: %s, result: %s", objArr);
        if (iPCString != null) {
            return iPCString.f68406d;
        }
        return null;
    }

    public void c(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo, zq1.g0 g0Var) {
        if (transferRequestInfo == null) {
            if (g0Var != null) {
                com.tencent.mm.plugin.brandservice.api.TransferResultInfo transferResultInfo = new com.tencent.mm.plugin.brandservice.api.TransferResultInfo();
                transferResultInfo.f93926d = 1;
                transferResultInfo.f93927e = "invalid requestInfo";
                g0Var.b(transferResultInfo);
                return;
            }
            return;
        }
        if (g0Var != null && g0Var.a(transferRequestInfo)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TransferRequestServiceImpl", "transferRequest intercepted");
        } else {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                kotlinx.coroutines.l.d(f301492d, null, null, new js1.h(transferRequestInfo, g0Var, null), 3, null);
                return;
            }
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, transferRequestInfo, new js1.k(), new js1.l(g0Var));
        }
    }
}
