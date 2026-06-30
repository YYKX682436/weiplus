package ys4;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.wallet_core.model.h1 {
    public h(java.lang.String guardian, java.lang.String sessionId, java.lang.String message) {
        kotlin.jvm.internal.o.g(guardian, "guardian");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70665b = new r45.rj5();
        lVar.f70666c = "/cgi-bin/mmpay-bin/tenpay/realnameverifyguardian";
        lVar.f70667d = 4877;
        r45.qj5 qj5Var = new r45.qj5();
        qj5Var.f384054d = guardian;
        qj5Var.f384055e = sessionId;
        qj5Var.f384056f = message;
        lVar.f70664a = qj5Var;
        p(lVar.a());
    }
}
