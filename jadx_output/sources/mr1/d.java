package mr1;

/* loaded from: classes11.dex */
public final class d extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f330837d = jz5.h.b(mr1.b.f330835d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f330838e = jz5.h.b(mr1.c.f330836d);

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.tencent.mm.storage.f9 latestMsg) {
        hr1.e conv = (hr1.e) obj;
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo) {
        hr1.e conversation = (hr1.e) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return o().z0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((nr1.k) ((jz5.n) this.f330837d).getValue()).z0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        hr1.e z07 = o().z0(sessionId);
        com.tencent.mars.xlog.Log.i("BizFans.BizPhotoFansConversationUpdater", "[onConversationMsgEmpty] " + z07.systemRowid);
        if (z07.systemRowid > 0) {
            z07.field_digest = "";
            o().update(z07.systemRowid, z07, false);
            o().doNotify(z07.field_sessionId, 1, z07);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        hr1.e conversation = (hr1.e) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        if (conversation.systemRowid <= 0) {
            o().insertNotify(conversation, false);
            o().doNotify(conversation.field_sessionId, 2, conversation);
        } else {
            o().update(conversation.systemRowid, conversation, false);
            o().doNotify(conversation.field_sessionId, 1, conversation);
        }
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return com.tencent.mm.storage.z3.G3(sessionId);
    }

    @Override // et1.c
    public java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.tencent.mm.storage.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        hr1.e conv = (hr1.e) obj;
        hr1.m sessionInfo = (hr1.m) obj2;
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(lastMsgInfo, "lastMsgInfo");
        kotlin.jvm.internal.o.g(digestData, "digestData");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        java.lang.String str = sessionInfo.field_talker;
        int i18 = sessionInfo.field_type;
        boolean z17 = conv.systemRowid <= 0;
        int i19 = conv.field_unReadCount;
        conv.field_selfBiz = sessionInfo.field_senderUserName;
        com.tencent.mm.pointers.PString pString = digestData.f256564a;
        conv.field_digest = pString.value;
        conv.field_digestUser = digestData.f256565b.value;
        conv.field_updateTime = lastMsgInfo.getCreateTime();
        conv.field_digestType = java.lang.String.valueOf(lastMsgInfo.getType());
        conv.field_unReadCount += i17;
        conv.field_lastMsgID = lastMsgInfo.getMsgId();
        conv.field_isSend = lastMsgInfo.A0();
        conv.field_status = lastMsgInfo.P0();
        conv.field_talker = str;
        conv.field_type = i18;
        dr1.a aVar = dr1.a.f242584a;
        conv.field_isGreetSession = aVar.d() ? sessionInfo.field_isGreetSession : 0;
        conv.field_readStatus = 0;
        com.tencent.mars.xlog.Log.i("BizFans.BizPhotoFansConversationUpdater", "[updateBizPhotoFansConversation] isNew=" + z17 + " beforeUnreadCount=" + i19 + " insertCount=" + i17 + " isGreet=" + conv.field_isGreetSession);
        if (conv.field_isGreetSession == 1 && i17 > 0) {
            long createTime = lastMsgInfo.getCreateTime();
            java.lang.String str2 = pString.value;
            if (str2 == null) {
                str2 = "";
            }
            aVar.a(5, i17, createTime, str2);
        }
        return conv;
    }

    public final nr1.f o() {
        return (nr1.f) ((jz5.n) this.f330838e).getValue();
    }
}
