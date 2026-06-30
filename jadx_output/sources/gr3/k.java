package gr3;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final gr3.k f274889a = new gr3.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f274890b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f274891c = "";

    public final void a(java.lang.String eventId, java.lang.String str, com.tencent.mm.storage.z3 z3Var, int i17) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        boolean z17 = false;
        if (!(str == null)) {
            if (!(z3Var == null)) {
                z17 = c01.e2.E(str);
            }
        }
        if (z17) {
            b(eventId, str, z3Var);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Gj(i17, eventId, f274890b, 32204);
        }
    }

    public final void b(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.z3 z3Var) {
        if (f274891c.length() == 0) {
            f274891c = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        java.util.Map map = f274890b;
        ((java.util.LinkedHashMap) map).clear();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        map.put("relation_sessionid", f274891c);
        java.lang.String d17 = n17.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        map.put("chatroom_username", d17);
        if (z3Var == null || z3Var.d1() == null) {
            return;
        }
        java.lang.String d18 = z3Var.d1();
        kotlin.jvm.internal.o.f(d18, "getUsername(...)");
        map.put("target_username", d18);
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            map.put("target_user_role", 2);
        } else if (com.tencent.mm.storage.z3.O4(z3Var.d1())) {
            map.put("target_user_role", 1);
        } else {
            map.put("target_user_role", 0);
        }
    }

    public final void c(java.lang.String eventId, java.lang.String str, com.tencent.mm.storage.z3 z3Var, java.lang.String viewId) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        boolean z17 = false;
        if (!(str == null)) {
            if (!(z3Var == null)) {
                z17 = c01.e2.E(str);
            }
        }
        if (z17) {
            b(eventId, str, z3Var);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, f274890b, 32204);
        }
    }
}
