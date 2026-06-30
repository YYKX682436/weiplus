package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class n1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.r1 f187866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187867b;

    public n1(com.tencent.mm.plugin.webview.webcompt.r1 r1Var, java.lang.String str) {
        this.f187866a = r1Var;
        this.f187867b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        java.lang.String str2;
        java.lang.String str3 = this.f187867b;
        com.tencent.mm.plugin.webview.webcompt.r1 r1Var = this.f187866a;
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt._callback(");
            sb6.append(com.tencent.mm.plugin.webview.webcompt.a.c(str3));
            sb6.append(", ");
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WebComptCommCgiResp");
            sb6.append(((r45.h97) fVar).f375970d);
            sb6.append(')');
            com.tencent.mm.plugin.webview.webcompt.r1.a(r1Var, sb6.toString());
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("WeixinWebCompt._callback(");
        sb7.append(com.tencent.mm.plugin.webview.webcompt.a.c(str3));
        sb7.append(", {errType:");
        sb7.append(i17);
        sb7.append(", errCode:");
        sb7.append(i18);
        sb7.append(", errMsg:");
        if (str == null || (str2 = com.tencent.mm.plugin.webview.webcompt.a.c(str)) == null) {
            str2 = "";
        }
        sb7.append(str2);
        sb7.append("})");
        com.tencent.mm.plugin.webview.webcompt.r1.a(r1Var, sb7.toString());
        com.tencent.mm.plugin.webview.webcompt.s1 s1Var = r1Var.f187894a.f187812b;
        if (s1Var != null) {
            s1Var.a(com.tencent.mm.plugin.webview.webcompt.b.K);
        }
    }
}
