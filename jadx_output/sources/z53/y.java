package z53;

/* loaded from: classes8.dex */
public final class y extends et1.c implements vg3.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f470272d = jz5.h.b(z53.w.f470270d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f470273e = jz5.h.b(z53.v.f470269d);

    /* renamed from: f, reason: collision with root package name */
    public long f470274f;

    @Override // et1.c, vg3.t3
    public void S0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        com.tencent.mars.xlog.Log.i("GameLife.ConversationUpdateCallback", "msgInfo = " + f9Var + ", conversation = " + l4Var + ", newCon = " + z17 + ", notifyInfo = " + l0Var);
    }

    @Override // et1.c, vg3.t3
    public void W(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
    }

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.tencent.mm.storage.f9 latestMsg) {
        z53.i conversation = (z53.i) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo) {
        ot0.q v17;
        java.util.Map map;
        z53.i conversation = (z53.i) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        java.util.ArrayList arrayList = notifyInfo.f454412c;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) it.next();
                if (f9Var2 != null && f9Var2.A0() != 1 && f9Var2.k2() && (v17 = ot0.q.v(f9Var2.j())) != null && (map = v17.Z1) != null) {
                    conversation.field_digestPrefix = (java.lang.String) map.get(com.tencent.mm.sdk.platformtools.m2.d());
                }
            }
        }
        com.tencent.mars.xlog.Log.i("GameLife.ConversationUpdateCallback", "[beforeConvUpdate] notifyFunc:" + notifyInfo.f454411b + " delId:" + notifyInfo.f454416g);
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return o().z0(sessionId);
    }

    @Override // et1.c
    public et1.b h(com.tencent.mm.storage.f9 latestMsg) {
        java.lang.String str;
        ot0.q v17;
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        java.lang.String str2 = null;
        if (!latestMsg.C2() || latestMsg.z0() == null) {
            if (latestMsg.k2() && (v17 = ot0.q.v(latestMsg.U1())) != null && v17.f348666i == 66) {
                str2 = v17.f348654f;
            }
            str = str2;
        } else {
            java.lang.String z07 = latestMsg.z0();
            if (z07 != null && z07.length() == 32) {
                str2 = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Bi(z07);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490382tf);
            } else {
                str = "[" + str2 + ']';
            }
        }
        if (str == null) {
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString3 = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            ((com.tencent.mm.app.u7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w()).getClass();
            qm.a0.d(latestMsg, pString2, pString3, pInt, false);
            str = pString2.value;
        }
        pString.value = str;
        return new et1.b(pString, new com.tencent.mm.pointers.PString());
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ((f63.k) ((jz5.n) this.f470272d).getValue()).y0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        z53.i z07 = o().z0(sessionId);
        com.tencent.mars.xlog.Log.i("GameLife.ConversationUpdateCallback", "[onConversationMsgEmpty] " + z07.systemRowid);
        if (z07.systemRowid > 0) {
            z07.field_digest = "";
            o().update(z07.systemRowid, z07, false);
            o().doNotify(z07.field_talker, 8, z07);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        z53.i conversation = (z53.i) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        boolean z17 = conversation.systemRowid <= 0;
        if (z17) {
            o().insertNotify(conversation, false);
            o().doNotify("single", 2, conversation);
        } else {
            o().update(conversation.systemRowid, conversation, false);
            o().doNotify("single", 1, conversation);
        }
        com.tencent.mars.xlog.Log.i("GameLife.ConversationUpdateCallback", "[updateGameLifeConversation] isNew=" + z17 + " conLastMsgId:" + this.f470274f + " sessionId=" + conversation.field_sessionId + " talker=" + conversation.field_talker + ' ' + z53.u.a(conversation));
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return com.tencent.mm.storage.z3.a4(sessionId);
    }

    @Override // et1.c
    public java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, com.tencent.mm.storage.f9 lastMsgInfo, et1.b digestData, int i17, xg3.l0 notifyInfo) {
        z53.i conv = (z53.i) obj;
        f63.e sessionInfo = (f63.e) obj2;
        kotlin.jvm.internal.o.g(conv, "conv");
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(lastMsgInfo, "lastMsgInfo");
        kotlin.jvm.internal.o.g(digestData, "digestData");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        java.lang.String str = sessionInfo.field_selfUserName;
        if (!(str == null || str.length() == 0)) {
            java.lang.String str2 = sessionInfo.field_talker;
            if (!(str2 == null || str2.length() == 0)) {
                this.f470274f = conv.field_lastMsgID;
                conv.field_digest = digestData.f256564a.value;
                conv.field_updateTime = lastMsgInfo.getCreateTime();
                conv.field_unReadCount += i17;
                conv.field_lastMsgID = lastMsgInfo.getMsgId();
                conv.field_talker = sessionInfo.field_talker;
                conv.field_selfUserName = sessionInfo.field_selfUserName;
                if (conv.systemRowid <= 0) {
                    ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(kz5.c0.i(conv.field_talker, conv.field_selfUserName), z53.x.f470271a);
                } else if (kotlin.jvm.internal.o.b(notifyInfo.f454411b, "delete")) {
                    com.tencent.mars.xlog.Log.i("GameLife.ConversationUpdateCallback", "[updateGameLifeConversation] delete msg");
                    if (notifyInfo.f454416g == this.f470274f) {
                        o().update(conv.systemRowid, conv, false);
                        o().doNotify("single", 8, conv);
                    }
                    return null;
                }
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).K7("Common_IPC_appid", new com.tencent.mm.plugin.gamelife.conversation.GameLifeOutputDataWrapper(sessionInfo.u0(), sessionInfo.v0(), sessionInfo.t0()));
                return conv;
            }
        }
        com.tencent.mars.xlog.Log.e("GameLife.ConversationUpdateCallback", "getSessionInfo invalid: " + sessionInfo);
        return null;
    }

    public final z53.t o() {
        return (z53.t) ((jz5.n) this.f470273e).getValue();
    }
}
