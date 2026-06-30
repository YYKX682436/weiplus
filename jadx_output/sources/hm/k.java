package hm;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.l0 f282156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xg3.l0 l0Var) {
        super(0);
        this.f282156d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        xg3.l0 l0Var = this.f282156d;
        if (l0Var != null && (arrayList = l0Var.f454412c) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                if (f9Var.A0() == 1) {
                    w11.c1 c1Var = w11.c1.f441989a;
                    int P0 = f9Var.P0();
                    if (P0 == 2 || P0 == 5) {
                        java.util.HashMap hashMap = w11.c1.f441990b;
                        synchronized (hashMap) {
                            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0());
                            w11.b1 b1Var = (w11.b1) hashMap.get(msgIdTalker);
                            if (b1Var != null && b1Var.f441983a && b1Var.f441985c == -1) {
                                hashMap.remove(msgIdTalker);
                                com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgManager", "onMsgSendFinished() called remove msgIdTalker:" + msgIdTalker + " , status:" + P0 + " preStatus:" + b1Var);
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
