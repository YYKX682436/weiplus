package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class c implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.c f182813a = new com.tencent.mm.plugin.webview.model.c();

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AISummarySearchLogic", "requestAiSearchConfig errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.n0)) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AISummarySearchConfigResponse");
            r45.n0 n0Var = (r45.n0) fVar;
            if (n0Var.f380966d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AISummarySearchLogic", "json is null");
                return;
            }
            try {
                cl0.g gVar = new cl0.g(n0Var.f380966d);
                com.tencent.mm.plugin.webview.model.h.f182902b = gVar;
                java.lang.String.valueOf(gVar);
                cl0.g gVar2 = com.tencent.mm.plugin.webview.model.h.f182902b;
                kotlin.jvm.internal.o.d(gVar2);
                cl0.g b17 = gVar2.b("aiSearchConfig");
                if (b17 != null) {
                    com.tencent.mm.plugin.webview.model.h.f182905e = b17.optString("placeholder");
                }
                cl0.g gVar3 = com.tencent.mm.plugin.webview.model.h.f182902b;
                kotlin.jvm.internal.o.d(gVar3);
                int optInt = gVar3.optInt("configType");
                com.tencent.mm.plugin.webview.model.a[] aVarArr = com.tencent.mm.plugin.webview.model.a.f182755d;
                if (optInt == 1) {
                    com.tencent.mm.plugin.webview.model.h.f182904d = n0Var.f380967e;
                    return;
                }
                com.tencent.mm.plugin.webview.model.a[] aVarArr2 = com.tencent.mm.plugin.webview.model.a.f182755d;
                if (optInt == 2) {
                    com.tencent.mm.plugin.webview.model.h.f182903c = n0Var.f380967e;
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.AISummarySearchLogic", "requestAiSearchConfig config = " + optInt + " is invalid");
            } catch (cl0.f unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AISummarySearchLogic", "requestAiSearchConfig parse aiSearchConfigData fail");
            }
        }
    }
}
