package um2;

/* loaded from: classes3.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.Map a() {
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f1584l;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("live_id", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).f327866e));
        linkedHashMap.put("feed_id", pm0.v.u(((ml2.r0) i95.n0.c(ml2.r0.class)).f327869h));
        linkedHashMap.put("live_start_time", java.lang.Long.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).f327865d));
        linkedHashMap.put("enter_session_id", java.lang.Long.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).f327878q));
        linkedHashMap.put("finder_username", ((ml2.r0) i95.n0.c(ml2.r0.class)).f327867f);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        long j17 = ((ml2.r0) i95.n0.c(ml2.r0.class)).f327869h;
        kotlin.jvm.internal.o.d(str);
        linkedHashMap.put("session_buffer", r0Var.Ui(j17, str, ((ml2.r0) i95.n0.c(ml2.r0.class)).f327870i));
        ml2.r0 r0Var2 = (ml2.r0) i95.n0.c(ml2.r0.class);
        r0Var2.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = r0Var2.f327865d;
        linkedHashMap.put("live_time", java.lang.Long.valueOf(currentTimeMillis > j18 ? currentTimeMillis - j18 : 0L));
        return linkedHashMap;
    }
}
