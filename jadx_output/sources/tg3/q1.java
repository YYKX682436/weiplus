package tg3;

/* loaded from: classes5.dex */
public abstract class q1 {
    public static final void a(com.tencent.mm.storage.i9 i9Var, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(i9Var, "<this>");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        tg3.o1 o1Var = tg3.p1.f419206a;
        java.lang.String Q0 = msgInfo.Q0();
        long msgId = msgInfo.getMsgId();
        if (Q0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgProcessingManager", "msgTalker is null, msgId: " + msgId);
        } else {
            i9Var.f195032m = java.lang.System.currentTimeMillis();
            java.lang.String c17 = o1Var.c(Q0, msgId);
            tg3.p1.f419209d.d(c17, i9Var);
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) tg3.p1.f419208c).getValue()).H(c17, i9Var.toByteArray());
        }
    }
}
