package k41;

/* loaded from: classes9.dex */
public final class v0 implements com.tencent.mm.storage.j8 {
    @Override // com.tencent.mm.storage.j8
    public void p(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l8 l8Var) {
        if (l4Var == null) {
            return;
        }
        java.lang.String h17 = l4Var.h1();
        if (!com.tencent.mm.storage.z3.p4(h17)) {
            if (com.tencent.mm.storage.z3.o4(h17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConversationExtension", "openImKeService is created");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConversationExtension", "onMsgChangeNotify conversation is openim kefu username: %s", h17);
            l4Var.T1("opencustomerservicemsg");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(l4Var, h17);
            ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ui(l4Var);
        }
    }
}
