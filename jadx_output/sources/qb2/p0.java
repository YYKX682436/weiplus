package qb2;

/* loaded from: classes10.dex */
public final class p0 extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f361266d = jz5.h.b(qb2.n0.f361260d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f361267e = jz5.h.b(qb2.o0.f361262d);

    public p0() {
        pm0.v.K(null, new qb2.m0(this, g92.b.f269769e.U()));
    }

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.tencent.mm.storage.f9 latestMsg) {
        qb2.t conv = (qb2.t) obj;
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
        if (i17 > 0) {
            zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
            int i18 = conv.field_scene;
            ((com.tencent.mm.plugin.finder.extension.reddot.e1) S).h(i18 == 1 ? null : conv.field_senderUserName, conv.field_type == 1 ? i18 == 1 ? zy2.y8.C : zy2.y8.D : i18 == 1 ? zy2.y8.E : zy2.y8.F);
        }
        int i19 = conv.field_scene;
        if (i19 == 1) {
            if (conv.field_type != 3) {
                return;
            }
            o();
            qb2.t D0 = r().D0("finderaliassessionholder");
            D0.field_digest = conv.field_digest;
            D0.field_readStatus = 0;
            D0.field_unReadCount += i17;
            D0.field_updateTime = conv.field_updateTime;
            r().update(D0.systemRowid, D0, false);
            return;
        }
        if (i19 == 2 && conv.field_type == 1) {
            java.lang.String field_senderUserName = conv.field_senderUserName;
            kotlin.jvm.internal.o.f(field_senderUserName, "field_senderUserName");
            q(field_senderUserName);
            qb2.t D02 = r().D0("findersayhisessionholder");
            D02.field_digest = conv.field_digest;
            D02.field_readStatus = 0;
            D02.field_unReadCount += i17;
            D02.field_updateTime = conv.field_updateTime;
            r().update(D02.systemRowid, D02, false);
        }
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo) {
        qb2.t conversation = (qb2.t) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return r().D0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((com.tencent.mm.plugin.finder.storage.dj0) ((jz5.n) this.f361266d).getValue()).J0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        qb2.t D0 = r().D0(sessionId);
        com.tencent.mars.xlog.Log.i("Finder.ConversationUpdater", "[onConversationMsgEmpty] " + D0.systemRowid);
        if (D0.systemRowid > 0) {
            D0.field_digest = "";
            r().update(D0.systemRowid, D0, false);
            r().doNotify(D0.field_sessionId, 1, D0);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        qb2.t conversation = (qb2.t) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        if (conversation.systemRowid <= 0) {
            r().insertNotify(conversation, false);
            r().doNotify(conversation.field_sessionId, 2, conversation);
        } else {
            r().update(conversation.systemRowid, conversation, false);
            r().doNotify(conversation.field_sessionId, 1, conversation);
        }
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return com.tencent.mm.storage.z3.V3(sessionId);
    }

    @Override // et1.c
    public java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.tencent.mm.storage.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        java.lang.String str;
        int i18;
        int i19;
        java.lang.String str2;
        java.lang.String str3;
        qb2.t conv = (qb2.t) obj;
        qb2.x1 sessionInfo = (qb2.x1) obj2;
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(lastMsgInfo, "lastMsgInfo");
        kotlin.jvm.internal.o.g(digestData, "digestData");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        java.lang.String str4 = sessionInfo.field_sessionId;
        java.lang.String str5 = sessionInfo.field_talker;
        int i27 = sessionInfo.field_type;
        int i28 = sessionInfo.field_actionPermission;
        int i29 = sessionInfo.field_rejectMsg;
        int i37 = sessionInfo.field_disableSendMsg;
        java.lang.String str6 = sessionInfo.field_senderUserName;
        int i38 = sessionInfo.field_senderRoleType;
        int i39 = sessionInfo.field_followFlag;
        boolean z17 = sessionInfo.field_disableSendmsgNeedFollow;
        if (i27 == 1 && (lastMsgInfo.A0() == 1 || kotlin.jvm.internal.o.b(str6, c01.z1.r()))) {
            com.tencent.mm.plugin.finder.storage.dj0 dj0Var = (com.tencent.mm.plugin.finder.storage.dj0) ((jz5.n) this.f361266d).getValue();
            kotlin.jvm.internal.o.d(str4);
            kotlin.jvm.internal.o.d(str5);
            zy2.bb bbVar = zy2.bb.f477356f;
            kotlin.jvm.internal.o.d(str6);
            i18 = i39;
            i19 = i38;
            str2 = str6;
            str3 = str5;
            dj0Var.L0(str4, str5, 2, 1, bbVar, i29, i37, str6, i18, z17);
            java.lang.String concat = "[updateFinderConversation] change type to normal. sessionId=".concat(str4);
            str = "Finder.ConversationUpdater";
            com.tencent.mars.xlog.Log.i(str, concat);
            i27 = 2;
            i28 = 1;
        } else {
            str = "Finder.ConversationUpdater";
            i18 = i39;
            i19 = i38;
            str2 = str6;
            str3 = str5;
        }
        boolean z18 = conv.systemRowid <= 0;
        int i47 = conv.field_unReadCount;
        conv.field_digest = digestData.f256564a.value;
        conv.field_digestUser = digestData.f256565b.value;
        conv.field_updateTime = lastMsgInfo.getCreateTime();
        conv.field_digestType = java.lang.String.valueOf(lastMsgInfo.getType());
        conv.field_unReadCount += i17;
        conv.field_lastMsgID = lastMsgInfo.getMsgId();
        conv.field_isSend = lastMsgInfo.A0();
        conv.field_status = lastMsgInfo.P0();
        java.lang.String str7 = str3;
        conv.field_talker = str7;
        conv.field_type = i27;
        conv.field_actionPermission = i28;
        java.lang.String str8 = str2;
        conv.field_senderUserName = str8;
        conv.field_senderRoleType = i19;
        conv.field_scene = (com.tencent.mm.storage.z3.S3(str7) && (kotlin.jvm.internal.o.b(str8, c01.z1.r()) || kotlin.jvm.internal.o.b(str8, c01.z1.k()))) ? 1 : 2;
        conv.field_readStatus = 0;
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        conv.field_senderUserNameVersion = I1 != null ? I1.field_username_history_version : 0;
        conv.field_followFlag = i18;
        com.tencent.mars.xlog.Log.i(str, "[updateFinderConversation] isNew=" + z18 + " beforeUnreadCount=" + i47 + " insertCount=" + i17 + ' ' + com.tencent.mm.plugin.finder.storage.u80.a(conv));
        return conv;
    }

    public final void o() {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("finderaliassessionholder");
        Di.m(linkedList);
        qb2.t D0 = r().D0("finderaliassessionholder");
        if (D0.systemRowid < 0) {
            qb2.t a17 = com.tencent.mm.plugin.finder.storage.t80.f128066e.a();
            a17.field_sessionId = "finderaliassessionholder";
            a17.field_talker = "finderaliassessionholder";
            a17.field_type = 200;
            a17.field_scene = 1;
            a17.field_unReadCount = r().L0(1, 3, "");
            r().insert(a17);
        }
        com.tencent.mars.xlog.Log.i("Finder.ConversationUpdater", "[checkInsertHolder] " + com.tencent.mm.plugin.finder.storage.u80.a(D0));
    }

    public final void q(java.lang.String str) {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("findersessionholder");
        Di.m(linkedList);
        qb2.t D0 = r().D0("findersayhisessionholder");
        if (D0.systemRowid < 0) {
            qb2.t a17 = com.tencent.mm.plugin.finder.storage.t80.f128066e.a();
            a17.field_sessionId = "findersayhisessionholder";
            a17.field_talker = "findersayhisessionholder";
            a17.field_placedFlag = 1000L;
            a17.field_type = 100;
            a17.field_scene = 2;
            a17.field_senderUserName = str;
            a17.field_unReadCount = r().L0(2, 1, str);
            r().insert(a17);
        }
        com.tencent.mars.xlog.Log.i("Finder.ConversationUpdater", "[checkInsertHolder] " + com.tencent.mm.plugin.finder.storage.u80.a(D0));
    }

    public final com.tencent.mm.plugin.finder.storage.t80 r() {
        return (com.tencent.mm.plugin.finder.storage.t80) ((jz5.n) this.f361267e).getValue();
    }
}
