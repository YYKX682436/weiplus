package fr4;

/* loaded from: classes11.dex */
public final class l extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f265844d = jz5.h.b(fr4.k.f265843d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f265845e = jz5.h.b(fr4.j.f265842d);

    @Override // et1.c, vg3.t3
    public void C0(com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo, boolean[] isConsumed) {
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        kotlin.jvm.internal.o.g(isConsumed, "isConsumed");
        java.lang.String str = notifyInfo.f454410a;
        if (str == null || !com.tencent.mm.storage.z3.J4(str)) {
            return;
        }
        jz5.f0 f0Var = null;
        if (f9Var != null) {
            if (!(f9Var.getMsgId() != 0)) {
                f9Var = null;
            }
            if (f9Var != null) {
                et1.b h17 = h(f9Var);
                int i17 = kotlin.jvm.internal.o.b(notifyInfo.f454411b, "insert") ? notifyInfo.f454413d : 0;
                kr4.g y07 = q().y0(str);
                s(y07, ((kr4.n) ((jz5.n) this.f265844d).getValue()).y0(str), f9Var, h17, i17, notifyInfo);
                l(y07);
                b(y07, i17, f9Var);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            k(str);
        }
        isConsumed[0] = true;
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo) {
        kr4.g conversation = (kr4.g) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return q().y0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((kr4.n) ((jz5.n) this.f265844d).getValue()).y0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kr4.g y07 = q().y0(sessionId);
        com.tencent.mars.xlog.Log.i("W1w.W1wConvUpdater", "[onConversationMsgEmpty] " + y07.systemRowid);
        if (y07.systemRowid > 0) {
            y07.field_digest = "";
            q().update(y07.systemRowid, y07, false);
            q().doNotify(y07.field_sessionId, 1, y07);
        }
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return com.tencent.mm.storage.z3.J4(sessionId);
    }

    @Override // et1.c
    public /* bridge */ /* synthetic */ java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.tencent.mm.storage.f9 f9Var, et1.b bVar, int i17, xg3.l0 l0Var) {
        kr4.g gVar = (kr4.g) obj;
        s(gVar, (kr4.o) obj2, f9Var, bVar, i17, l0Var);
        return gVar;
    }

    @Override // et1.c
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(kr4.g conv, int i17, com.tencent.mm.storage.f9 latestMsg) {
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
        if (conv.field_isHello == 1) {
            fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
            kr4.g y07 = q().y0("w1wsayhisessionholder@w1wmsg");
            kr4.k Ai = g0Var.Ai();
            java.lang.String field_talkerUserName = conv.field_talkerUserName;
            kotlin.jvm.internal.o.f(field_talkerUserName, "field_talkerUserName");
            kr4.e y08 = Ai.y0(field_talkerUserName);
            if (y08 == null) {
                hr4.p.f284263a.a(conv.field_talkerUserName, new fr4.i(conv, y07, this, i17));
                return;
            }
            com.tencent.mm.storage.z3 t07 = y08.t0();
            conv.Z = t07;
            conv.f311507x0 = t07.g2();
            y07.field_digest = conv.f311507x0 + ':' + conv.field_digest;
            t(y07, conv, i17);
        }
    }

    public final kr4.m q() {
        return (kr4.m) ((jz5.n) this.f265845e).getValue();
    }

    @Override // et1.c
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void l(kr4.g conversation) {
        kotlin.jvm.internal.o.g(conversation, "conversation");
        if (conversation.systemRowid <= 0) {
            q().insertNotify(conversation, false);
            q().doNotify(conversation.field_sessionId, 2, conversation);
        } else {
            q().update(conversation.systemRowid, conversation, false);
            q().doNotify(conversation.field_sessionId, 1, conversation);
        }
    }

    public kr4.g s(kr4.g conv, kr4.o sessionInfo, com.tencent.mm.storage.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(lastMsgInfo, "lastMsgInfo");
        kotlin.jvm.internal.o.g(digestData, "digestData");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        int i18 = sessionInfo.field_isHello;
        if (conv.field_isHello == 1 && lastMsgInfo.A0() == 1) {
            i18 = 0;
            kr4.n nVar = (kr4.n) ((jz5.n) this.f265844d).getValue();
            java.lang.String field_sessionId = sessionInfo.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            java.lang.String field_talkerUserName = sessionInfo.field_talkerUserName;
            kotlin.jvm.internal.o.f(field_talkerUserName, "field_talkerUserName");
            java.lang.String field_selfUserName = sessionInfo.field_selfUserName;
            kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
            nVar.D0(field_sessionId, field_talkerUserName, field_selfUserName, sessionInfo.field_status, sessionInfo.field_canRecvMsg, 0);
        }
        conv.field_selfUserName = sessionInfo.field_selfUserName;
        conv.field_digest = digestData.f256564a.value;
        conv.field_digestUser = digestData.f256565b.value;
        conv.field_updateTime = lastMsgInfo.getCreateTime();
        conv.field_digestType = java.lang.String.valueOf(lastMsgInfo.getType());
        conv.field_unReadCount += i17;
        conv.field_lastMsgID = lastMsgInfo.getMsgId();
        conv.field_isSend = lastMsgInfo.A0();
        conv.field_status = lastMsgInfo.P0();
        conv.field_talkerUserName = sessionInfo.field_talkerUserName;
        conv.field_readStatus = 0;
        conv.field_isHello = i18;
        if (i17 != 0) {
            ((fr4.g0) i95.n0.c(fr4.g0.class)).bj(3009, sessionInfo.field_selfUserName);
        }
        return conv;
    }

    public final void t(kr4.g gVar, kr4.g gVar2, int i17) {
        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
        gVar.field_unReadCount += i17;
        gVar.field_updateTime = gVar2.field_updateTime;
        gVar.field_selfUserName = g0Var.Di();
        gVar.field_placedFlag = 1000L;
        if (!g0Var.f265831r) {
            gVar.field_readStatus = 0;
        }
        if (q().update(gVar.systemRowid, gVar, false)) {
            q().doNotify(gVar.field_sessionId, 1, gVar);
        }
    }
}
