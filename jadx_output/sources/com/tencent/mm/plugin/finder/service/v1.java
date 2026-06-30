package com.tencent.mm.plugin.finder.service;

@j95.b
/* loaded from: classes10.dex */
public final class v1 extends i95.w implements zy2.g6 {
    public v1() {
        xu5.b.a("FinderConversationNotify");
    }

    public boolean Ai(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (com.tencent.mm.storage.z3.V3(str)) {
            return ((c61.l7) i95.n0.c(c61.l7.class)).Kj().D0(str).field_placedFlag > 0;
        }
        throw new java.lang.RuntimeException("sessionId[" + str + "] is not session");
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        le0.x.Q0.add(com.tencent.mm.plugin.finder.service.u1.f126217a);
    }

    public int wi(java.lang.String sessionId) {
        if (sessionId == null || sessionId.length() == 0) {
            return 0;
        }
        if (!com.tencent.mm.storage.z3.V3(sessionId)) {
            throw new java.lang.RuntimeException("sessionId[" + sessionId + "] is not session");
        }
        com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        Kj.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        p75.n0 n0Var = dm.a4.B;
        p75.d UNREADCOUNT = dm.a4.D;
        kotlin.jvm.internal.o.f(UNREADCOUNT, "UNREADCOUNT");
        p75.i0 h17 = n0Var.h(UNREADCOUNT);
        h17.f352657d = dm.a4.C.j(sessionId);
        h17.f352656c = "Finder.ConversationStorage";
        p75.l0 a17 = h17.a();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int m17 = a17.m(Kj.f128069d);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.lang.String sql = a17.f352636a;
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getUnreadCount#sessionId", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", "[getUnreadCount] sessionId=" + sessionId + ' ' + m17);
        return m17;
    }
}
