package en3;

@j95.b
/* loaded from: classes8.dex */
public final class b0 extends i95.w implements ra0.w {

    /* renamed from: d, reason: collision with root package name */
    public r45.jv4 f255289d;

    public static final long wi(en3.b0 b0Var, r45.jv4 jv4Var, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.lang.Object obj2;
        b0Var.getClass();
        java.util.LinkedList list = jv4Var.getList(7);
        kotlin.jvm.internal.o.f(list, "getActionList(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((r45.iv4) obj2).getString(0), str)) {
                break;
            }
        }
        r45.iv4 iv4Var = (r45.iv4) obj2;
        java.util.LinkedList list2 = jv4Var.getList(7);
        kotlin.jvm.internal.o.f(list2, "getActionList(...)");
        java.util.Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (kotlin.jvm.internal.o.b(((r45.iv4) next).getString(0), str2)) {
                obj = next;
                break;
            }
        }
        r45.iv4 iv4Var2 = (r45.iv4) obj;
        if (iv4Var == null || iv4Var2 == null) {
            return 0L;
        }
        long j17 = iv4Var2.getLong(2) - iv4Var.getLong(2);
        if (j17 > 0) {
            return j17;
        }
        return 0L;
    }

    public void Ai(java.lang.String action) {
        kotlin.jvm.internal.o.g(action, "action");
        long c17 = c01.id.c();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        r45.jv4 jv4Var = this.f255289d;
        if (jv4Var != null) {
            java.lang.String string = jv4Var.getString(0);
            ra0.a0 a0Var = ra0.a0.f393458a;
            com.tencent.mars.xlog.Log.isDebug();
            if (!kotlin.jvm.internal.o.b(string, ra0.a0.f393459b)) {
                jv4Var = null;
            }
            r45.jv4 jv4Var2 = jv4Var;
            if (jv4Var2 != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new en3.z(action, c17, elapsedRealtime, jv4Var2, this), "NewLifeReportAction");
            }
        }
    }

    public r45.kv0 Bi(int i17, int i18) {
        r45.kv0 a17 = db2.t4.f228171a.a(i18);
        a17.set(1, java.lang.Integer.valueOf(i17));
        a17.set(4, new r45.g40());
        r45.g40 g40Var = (r45.g40) a17.getCustom(4);
        if (g40Var != null) {
            java.lang.String debugInfo = "genNewLifeFinderBaseRequest[" + i17 + '-' + i18 + ']';
            ra0.a0 a0Var = ra0.a0.f393458a;
            kotlin.jvm.internal.o.g(debugInfo, "debugInfo");
            com.tencent.mars.xlog.Log.isDebug();
            g40Var.set(0, ra0.a0.f393459b);
        }
        return a17;
    }
}
