package j00;

@j95.b
/* loaded from: classes9.dex */
public final class u1 extends i95.w implements c00.i3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f296907d = jz5.h.b(j00.t1.f296896d);

    public final boolean Ai(java.lang.String str) {
        wi();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && Ni().containsKey(str)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSendSessionMgr", "checkValidWithSendGiftTicket passed ticket invalid:%s", str);
        c00.f3 f3Var = (c00.f3) i95.n0.c(c00.f3.class);
        int i17 = h20.f.f278266a;
        ((j00.o1) f3Var).wi(6, "");
        return false;
    }

    public java.lang.String Bi() {
        wi();
        java.lang.String Y = com.tencent.mm.sdk.platformtools.t8.Y(10);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSendSessionMgr", "genSendGiftTicket sendGiftTicket:" + Y);
        java.util.concurrent.ConcurrentHashMap Ni = Ni();
        kotlin.jvm.internal.o.d(Y);
        Ni.put(Y, new c00.h3());
        return Y;
    }

    public java.lang.String Di(java.lang.String str) {
        c00.h3 h3Var;
        java.lang.String str2;
        wi();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSendSessionMgr", "getSendGiftSessionChatroomUsernameByTicket passedTicket:" + str + " currentTicket:" + str);
        return (!Ai(str) || (h3Var = (c00.h3) Ni().get(str)) == null || (str2 = h3Var.f36983b) == null) ? "" : str2;
    }

    public final java.util.concurrent.ConcurrentHashMap Ni() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f296907d).getValue();
    }

    public void Ri(java.lang.String str, java.lang.String str2) {
        c00.h3 h3Var;
        wi();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftSendSessionMgr", "updateSendGiftSessionChatroomUsername passedTicket:" + str2);
        if (Ai(str2) && (h3Var = (c00.h3) Ni().get(str2)) != null) {
            h3Var.f36983b = str;
        }
    }

    public final boolean wi() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return true;
        }
        b00.p0.b(b00.p0.f16747a, "Not main process!", null, 2, null);
        return false;
    }
}
