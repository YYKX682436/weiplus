package rd5;

/* loaded from: classes9.dex */
public abstract class e {
    public static final boolean a(com.tencent.mm.storage.f9 oldMsg, com.tencent.mm.storage.f9 newMsg) {
        kotlin.jvm.internal.o.g(oldMsg, "oldMsg");
        kotlin.jvm.internal.o.g(newMsg, "newMsg");
        jz5.g gVar = com.tencent.mm.ui.chatting.adapter.m.f198435a;
        if (((mb5.a) ((jz5.n) com.tencent.mm.ui.chatting.adapter.m.f198435a).getValue()).f325493a.contains(java.lang.Integer.valueOf(oldMsg.getType())) || !oldMsg.compareContent(newMsg)) {
            return false;
        }
        com.tencent.mm.storage.a9 a9Var = oldMsg.f193927g2;
        com.tencent.mm.storage.a9 a9Var2 = newMsg.f193927g2;
        return (a9Var != null || a9Var2 != null) ? (a9Var == null || a9Var2 == null) ? false : a9Var.U(a9Var2) : true;
    }
}
