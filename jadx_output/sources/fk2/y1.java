package fk2;

/* loaded from: classes2.dex */
public final class y1 {
    public y1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, r45.gj1 payload, com.tencent.mm.pluginsdk.ui.span.f0 finallyUserMessage) {
        java.lang.String string;
        int L;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(payload, "payload");
        kotlin.jvm.internal.o.g(finallyUserMessage, "finallyUserMessage");
        r45.ze2 ze2Var = (r45.ze2) payload.getCustom(0);
        if (ze2Var == null || (string = ze2Var.getString(2)) == null || (L = r26.n0.L(finallyUserMessage, string, 0, false, 6, null)) < 0 || string.length() + L > finallyUserMessage.length()) {
            return;
        }
        finallyUserMessage.c(new fk2.x1(context, payload), L, string.length() + L, 33);
    }
}
