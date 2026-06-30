package ji4;

/* loaded from: classes11.dex */
public final class x extends et1.c implements vg3.p4 {
    public x() {
        pm0.v.K(null, new ji4.w(this));
    }

    @Override // et1.c, vg3.t3
    public void S0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        java.util.Objects.toString(f9Var);
        java.util.Objects.toString(l4Var);
        java.util.Objects.toString(l0Var);
    }

    @Override // et1.c, vg3.t3
    public void W(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        java.util.Objects.toString(f9Var);
        java.util.Objects.toString(l4Var);
        java.util.Objects.toString(l0Var);
    }

    @Override // et1.c
    public void b(java.lang.Object obj, int i17, com.tencent.mm.storage.f9 latestMsg) {
        hi4.a conversation = (hi4.a) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(latestMsg, "latestMsg");
    }

    @Override // et1.c
    public void c(java.lang.Object obj, com.tencent.mm.storage.f9 f9Var, xg3.l0 notifyInfo) {
        hi4.a conversation = (hi4.a) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
    }

    @Override // et1.c
    public java.lang.Object f(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ni4.x.f337776d.h().z0(sessionId);
    }

    @Override // et1.c
    public java.lang.Object i(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return ni4.x.f337776d.m().y0(sessionId);
    }

    @Override // et1.c
    public void k(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        ni4.x xVar = ni4.x.f337776d;
        hi4.a z07 = xVar.h().z0(sessionId);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationUpdater", "[onConversationMsgEmpty] " + z07.systemRowid);
        if (z07.systemRowid > 0) {
            z07.field_digest = "";
            xVar.h().update(z07.systemRowid, z07, false);
            xVar.h().doNotify(z07.field_sessionId, 1, z07);
        }
    }

    @Override // et1.c
    public void l(java.lang.Object obj) {
        hi4.a conversation = (hi4.a) obj;
        kotlin.jvm.internal.o.g(conversation, "conversation");
        boolean z17 = true;
        if (conversation.systemRowid <= 0) {
            ni4.x xVar = ni4.x.f337776d;
            xVar.h().insertNotify(conversation, false);
            xVar.h().doNotify(conversation.field_sessionId, 2, conversation);
        } else {
            ni4.x xVar2 = ni4.x.f337776d;
            xVar2.h().update(conversation.systemRowid, conversation, false);
            xVar2.h().doNotify(conversation.field_sessionId, 1, conversation);
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(conversation.field_sessionId);
        if (Ai != null) {
            java.lang.String str = Ai.field_nickname;
            if (!(str == null || r26.n0.N(str))) {
                java.lang.String str2 = Ai.field_smallHeadImgUrl;
                if (str2 != null && !r26.n0.N(str2)) {
                    z17 = false;
                }
                if (!z17) {
                    return;
                }
            }
        }
        i95.m c17 = i95.n0.c(ki4.x.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ki4.x.wi((ki4.x) c17, new jz5.l(conversation.field_sessionId, conversation.field_talker), null, null, false, 14, null);
    }

    @Override // et1.c
    public boolean m(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return com.tencent.mm.storage.z3.H4(sessionId);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    @Override // et1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Object r18, java.lang.Object r19, com.tencent.mm.storage.f9 r20, et1.b r21, int r22, xg3.l0 r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji4.x.n(java.lang.Object, java.lang.Object, com.tencent.mm.storage.f9, et1.b, int, xg3.l0):java.lang.Object");
    }
}
