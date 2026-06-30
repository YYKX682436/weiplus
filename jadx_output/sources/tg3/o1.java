package tg3;

/* loaded from: classes5.dex */
public final class o1 {
    public o1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.storage.i9 a(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mm.storage.i9 b17 = b(msgInfo.Q0(), msgInfo.getMsgId());
        return b17 == null ? new com.tencent.mm.storage.i9() : b17;
    }

    public final com.tencent.mm.storage.i9 b(java.lang.String str, long j17) {
        if (!(str == null || str.length() == 0) && j17 > 0) {
            java.lang.String c17 = c(str, j17);
            com.tencent.mm.sdk.platformtools.c0 c0Var = tg3.p1.f419209d;
            com.tencent.mm.storage.i9 i9Var = (com.tencent.mm.storage.i9) c0Var.b(c17);
            if (i9Var != null) {
                return i9Var;
            }
            byte[] j18 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) tg3.p1.f419208c).getValue()).j(c17);
            if (j18 != null) {
                try {
                    com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.storage.i9().parseFrom(j18);
                    kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.storage.MsgProcessingInfo");
                    com.tencent.mm.storage.i9 i9Var2 = (com.tencent.mm.storage.i9) parseFrom;
                    c0Var.d(c17, i9Var2);
                    return i9Var2;
                } catch (java.io.IOException unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgProcessingManager", "chris: can not parse from mmkv data!");
                } catch (java.lang.ClassCastException unused2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgProcessingManager", "chris: can not parse to msg processing info");
                    return null;
                }
            }
        }
        return null;
    }

    public final java.lang.String c(java.lang.String str, long j17) {
        return str + '_' + j17;
    }

    public final void d(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.lang.String Q0 = msgInfo.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        e(Q0, msgInfo.getMsgId());
    }

    public final void e(java.lang.String msgTalker, long j17) {
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        java.lang.String c17 = c(msgTalker, j17);
        tg3.p1.f419209d.e(c17);
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) tg3.p1.f419208c).getValue()).remove(c17);
    }
}
