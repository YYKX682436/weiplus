package q12;

/* loaded from: classes5.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.vfs.z7 z7Var;
        com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent checkResUpdatePreOperationEvent = (com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) iEvent;
        am.t2 t2Var = checkResUpdatePreOperationEvent.f54055g;
        if (t2Var.f7966a == 37) {
            if (t2Var.f7967b == 5 && t2Var.f7968c == 2) {
                y12.j e17 = y12.j.e();
                e17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "delete emoji egg!");
                try {
                    java.lang.String c17 = y12.j.c();
                    com.tencent.mm.vfs.z7 a17 = c17 == null ? null : com.tencent.mm.vfs.z7.a(c17);
                    if (a17 == null) {
                        z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("egg", false, false), null, null);
                    } else {
                        z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/egg", false, false), a17.f213280g, a17.f213281h);
                    }
                    com.tencent.mm.vfs.w6.f(z7Var.toString());
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", e18, "", new java.lang.Object[0]);
                }
                synchronized (e17) {
                    e17.f458874b = null;
                }
            }
            am.t2 t2Var2 = checkResUpdatePreOperationEvent.f54055g;
            if (t2Var2.f7968c == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiResUpdateOperationListener", "cache res type:%d subType:%d", java.lang.Integer.valueOf(t2Var2.f7966a), java.lang.Integer.valueOf(t2Var2.f7967b));
            }
        }
        return false;
    }
}
