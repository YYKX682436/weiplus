package com.tencent.mm.plugin.webview.core;

/* loaded from: classes2.dex */
public final class j1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f181854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f181855e;

    public j1(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ipcinvoker.r rVar) {
        this.f181854d = c0Var;
        this.f181855e = rVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.c0 c0Var = this.f181854d;
        if (c0Var.f310112d) {
            return 0;
        }
        boolean z17 = true;
        c0Var.f310112d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewAdHelper", "onCgiBack, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        com.tencent.mm.ipcinvoker.r rVar = this.f181855e;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            if (fVar instanceof r45.ns3) {
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetWuidResp");
                r45.ns3 ns3Var = (r45.ns3) fVar;
                java.lang.String str2 = ns3Var.f381640e;
                if (str2 != null && !r26.n0.N(str2)) {
                    z17 = false;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewAdHelper", "onCgiBack wuid is null");
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString());
                    com.tencent.mm.plugin.webview.core.n1.f181891a.b(2L);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewAdHelper", "onCgiBack wuid=" + ns3Var.f381640e);
                    rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(ns3Var.f381640e));
                    com.tencent.mm.plugin.webview.core.n1.f181891a.b(1L);
                }
                return 0;
            }
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString());
        com.tencent.mm.plugin.webview.core.n1.f181891a.b(3L);
        return 0;
    }
}
