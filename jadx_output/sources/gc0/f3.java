package gc0;

/* loaded from: classes5.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public static final gc0.f3 f270172a = new gc0.f3();

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Throwable, com.tencent.mm.storage.f9] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final com.tencent.mm.storage.f9 a(final java.lang.String str) {
        ?? r37;
        android.database.Cursor H0;
        com.tencent.mm.storage.f9 f9Var;
        gc0.q2 q2Var = gc0.q2.f270257a;
        final long b17 = q2Var.b(str);
        final long a17 = b17 + q2Var.a();
        final int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkCount()) * 2;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        cj6.getClass();
        android.database.Cursor cursor = null;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getLimitNonSys fail, argument is invalid");
            r37 = 0;
        } else {
            final java.lang.String X8 = cj6.X8(str);
            if (cj6.Da(X8)) {
                H0 = ot0.c3.l().c("getLimitSysMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$n1
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.String str2 = X8;
                        java.lang.String str3 = str;
                        int i17 = c17;
                        long j17 = a17;
                        long j18 = b17;
                        ot0.z2 z2Var = ot0.z2.f348822a;
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        return z2Var.H0(g9Var.f193989r, str2, str3, i17, j17, j18, java.util.Arrays.asList(g9Var.D8()));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$p1
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        g9Var.getClass();
                        return g9Var.f193989r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND createTime <= " + a17 + " AND createTime > " + b17 + " order by createTime ASC limit " + c17, null, 2);
                    }
                });
            } else if (cj6.Pb(X8)) {
                H0 = ot0.z2.f348822a.H0(cj6.f193989r, X8, str, c17, a17, b17, java.util.Arrays.asList(cj6.D8()));
            } else {
                r37 = 0;
                cursor = cj6.f193989r.f("select * from " + X8 + " where" + cj6.Z8(str) + "AND type IN (10000,10002,570425393,64,855638065,889192497,922746929,268445456,1077936177,603979825) AND createTime <= " + a17 + " AND createTime > " + b17 + " order by createTime ASC limit " + c17, null, 2);
            }
            cursor = H0;
            r37 = 0;
        }
        do {
            try {
                if (!cursor.moveToNext()) {
                    vz5.b.a(cursor, r37);
                    return r37;
                }
                f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(cursor);
            } finally {
            }
        } while (!f9Var.U2());
        vz5.b.a(cursor, r37);
        return f9Var;
    }

    public final void b(java.lang.String talker, boolean z17) {
        com.tencent.mm.storage.f9 a17;
        kotlin.jvm.internal.o.g(talker, "talker");
        if ((z17 || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.remark.system_tip.RepairerConfigRecommendRemarkSysTipClear()) == 1) && (a17 = a(talker)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemarkSysTipHelper", "remove sys tip, talker: " + talker + ", msgId: " + a17.getMsgId() + ", createdTime: " + a17.getCreateTime());
            c01.w9.f(a17.getMsgId(), talker);
        }
    }
}
