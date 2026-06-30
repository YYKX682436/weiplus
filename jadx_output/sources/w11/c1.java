package w11;

/* loaded from: classes5.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w11.c1 f441989a = new w11.c1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f441990b = new java.util.HashMap();

    public static final boolean a(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, com.tencent.mm.modelbase.m1 scene) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(msgIdTalker, "msgIdTalker");
        kotlin.jvm.internal.o.g(scene, "scene");
        int type = scene.getType();
        java.util.HashMap hashMap = f441990b;
        synchronized (hashMap) {
            w11.b1 b1Var = (w11.b1) hashMap.get(msgIdTalker);
            if (b1Var != null && b1Var.f441984b) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RevokeMsgManager", "tryToSendMsgCgi() called with isRevokingMsg: msgIdTalker = " + msgIdTalker + " sceneType:" + type + " scene:" + scene + " cancel msg send");
                return true;
            }
            java.lang.Object obj2 = hashMap.get(msgIdTalker);
            if (obj2 == null) {
                obj2 = new w11.b1(false, false, 0L, false, 15, null);
                hashMap.put(msgIdTalker, obj2);
            }
            ((w11.b1) obj2).f441983a = true;
            if (msgIdTalker.f149480d == 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                obj = new com.tencent.mm.sdk.platformtools.z3();
            } else {
                obj = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgManager", "tryToSendMsgCgi() called with: msgIdTalker = " + msgIdTalker + " sceneType:" + type + ' ' + obj);
            return false;
        }
    }

    public final boolean b(com.tencent.mm.storage.f9 oriMsg, boolean z17) {
        kotlin.jvm.internal.o.g(oriMsg, "oriMsg");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(oriMsg.Q0(), oriMsg.getMsgId());
        long msgId = n17.getMsgId();
        int type = n17.getType();
        int P0 = n17.P0();
        java.lang.String Q0 = n17.Q0();
        if (msgId <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", msgTalker = " + Q0 + ", oriMsgId = " + oriMsg.getMsgId() + ", oriMsgTalker = " + oriMsg.Q0() + ", status: " + P0);
            return false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", msgTalker = " + Q0 + ", type=" + type + " status:" + P0 + " not Support Revoke BeforeSendMsg");
            return false;
        }
        if (n17.P0() == 2 || n17.h2() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", msgTalker = " + Q0 + ", type=" + type + " flag=" + n17.h2() + " already sent or web flag");
            return false;
        }
        java.util.HashMap hashMap = f441990b;
        synchronized (hashMap) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(msgId, Q0);
            w11.b1 b1Var = (w11.b1) hashMap.get(msgIdTalker);
            if (b1Var != null && b1Var.f441983a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgIdTalker = " + msgIdTalker + ", type=" + type + " status=" + P0 + " already sending msg cgi");
                return false;
            }
            java.lang.Object obj = hashMap.get(msgIdTalker);
            if (obj == null) {
                obj = new w11.b1(false, false, 0L, false, 15, null);
                hashMap.put(msgIdTalker, obj);
            }
            ((w11.b1) obj).f441984b = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgIdTalker = " + msgIdTalker + ", type=" + type + " status=" + P0 + " isRevokeBeforeSendMsg = " + z17);
            return true;
        }
    }
}
