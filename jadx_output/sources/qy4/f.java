package qy4;

/* loaded from: classes11.dex */
public final class f extends et1.a implements et1.n {
    @Override // et1.a, et1.l
    public w11.m1 b(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var != null) {
            java.lang.String str = r1Var.f442127b;
            java.lang.String s17 = s(str);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(r1Var.f442132g);
            java.lang.String str2 = r1Var.f442129d;
            ((px.c) e0Var).getClass();
            m1Var.f442088a = new dt1.d(valueOf != null ? valueOf.longValue() : 0L, 24, str, s17, str, str2);
        }
        return m1Var;
    }

    @Override // et1.a, et1.l
    public w11.m1 h(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var != null) {
            java.lang.String str = r1Var.f442127b;
            java.lang.String s17 = s(str);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.Long valueOf = java.lang.Long.valueOf(r1Var.f442132g);
            java.lang.String str2 = r1Var.f442129d;
            int i17 = r1Var.f442130e;
            ((px.c) e0Var).getClass();
            m1Var.f442088a = new dt1.e(valueOf != null ? valueOf.longValue() : 0L, 24, str, s17, str, str2, i17);
        }
        return m1Var;
    }

    @Override // et1.l
    public boolean k(w11.r1 r1Var) {
        if (r1Var != null) {
            return com.tencent.mm.storage.z3.L4(r1Var.f442127b) || o(r1Var);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et1.a, et1.l
    public w11.m1 l(w11.r1 r1Var) {
        w11.m1 m1Var = new w11.m1();
        if (r1Var instanceof k12.q) {
            java.lang.String sessionId = r1Var.f442127b;
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            r1Var.f442127b = sessionId;
            r1Var.f442128c = s(sessionId);
            qx.e0 e0Var = (qx.e0) i95.n0.c(qx.e0.class);
            java.lang.String str = r1Var.f442128c;
            java.lang.String str2 = r1Var.f442127b;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = ((h12.a) ((k12.q) r1Var)).f278077q;
            kotlin.jvm.internal.o.f(emojiInfo, "getEmojiInfo(...)");
            m1Var.f442088a = ((px.c) e0Var).wi(24, sessionId, str, str2, emojiInfo, r1Var.f442132g, r1Var.f442126a);
        }
        return m1Var;
    }

    @Override // et1.a, et1.l
    public w11.m1 m(w11.r1 r1Var) {
        c01.h7 h7Var;
        boolean z17 = true;
        if (r1Var != null && (h7Var = r1Var.f442135j) != null) {
            java.lang.String Ai = ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).Ai(r1Var.f442127b, h7Var.f37229d, h7Var.f37227b);
            if (Ai != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawCreateSendMsgInterceptor", "sendMsg: claw user forwarding unsupported msg type=%d, converting to text summary", java.lang.Integer.valueOf(r1Var.f442130e));
                r1Var.f442129d = Ai;
                r1Var.f442130e = 1;
            }
        }
        java.lang.Integer valueOf = r1Var != null ? java.lang.Integer.valueOf(r1Var.f442130e) : null;
        if (valueOf != null && valueOf.intValue() == 48) {
            return b(r1Var);
        }
        if ((valueOf == null || valueOf.intValue() != 42) && (valueOf == null || valueOf.intValue() != 66)) {
            z17 = false;
        }
        return z17 ? h(r1Var) : super.m(r1Var);
    }

    @Override // et1.a
    public boolean o(w11.r1 params) {
        kotlin.jvm.internal.o.g(params, "params");
        if (!(params instanceof m11.m1)) {
            return false;
        }
        java.lang.String str = params.f442141p;
        java.lang.String str2 = com.tencent.mm.storage.v3.f196273a;
        return str != null && str.endsWith("weclaw");
    }

    @Override // et1.a
    public int r() {
        return 24;
    }

    @Override // et1.a
    public java.lang.String s(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        return r17;
    }

    @Override // et1.a
    public java.lang.String t(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        return sessionId;
    }
}
