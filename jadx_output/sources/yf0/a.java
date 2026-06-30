package yf0;

/* loaded from: classes9.dex */
public final class a extends jm0.g implements qi3.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f461492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f461492f = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker;
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof yf0.l0) {
            int ordinal = event.f363691a.ordinal();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f461492f;
            if (ordinal != 3 && ordinal != 4) {
                if ((ordinal == 7 || ordinal == 8) && (msgIdTalker = event.f363697g) != null) {
                    return;
                }
                return;
            }
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = event.f363697g;
            float f17 = event.f363698h;
            if (msgIdTalker2 == null) {
                return;
            }
            java.lang.Float f18 = (java.lang.Float) concurrentHashMap.get(msgIdTalker2);
            if (f18 == null) {
                f18 = java.lang.Float.valueOf(0.0f);
            }
            if (f17 - f18.floatValue() < 3.0f) {
                return;
            }
            concurrentHashMap.put(msgIdTalker2, java.lang.Float.valueOf(f17));
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoBubbleProgressFSC", "notifyBubbleUpdate msgIdTalker=" + msgIdTalker2 + " percent=" + f17);
            com.tencent.mm.autogen.events.ChatMsgNotifyEvent chatMsgNotifyEvent = new com.tencent.mm.autogen.events.ChatMsgNotifyEvent();
            long j17 = msgIdTalker2.f149480d;
            am.a2 a2Var = chatMsgNotifyEvent.f54036g;
            a2Var.f6117a = j17;
            a2Var.f6118b = msgIdTalker2.a();
            chatMsgNotifyEvent.e();
        }
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
        this.f461492f.clear();
    }
}
