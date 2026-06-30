package ys4;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.wallet_core.model.h1 {
    public i(java.lang.String guardian, java.lang.String sessionId, java.lang.String message) {
        kotlin.jvm.internal.o.g(guardian, "guardian");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70665b = new r45.qx6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/pa/verifyparent";
        lVar.f70667d = 4815;
        r45.px6 px6Var = new r45.px6();
        px6Var.f383467d = guardian;
        px6Var.f383468e = com.tencent.mm.sdk.platformtools.t8.q0(sessionId, 0L);
        px6Var.f383469f = message;
        lVar.f70664a = px6Var;
        p(lVar.a());
    }
}
