package f95;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f260543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f260544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260545c;

    /* renamed from: d, reason: collision with root package name */
    public final int f260546d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f260547e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f260548f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f260549g;

    /* renamed from: h, reason: collision with root package name */
    public long f260550h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f260551i;

    public e() {
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = " from message".toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        this.f260543a = lowerCase;
        this.f260544b = 10000;
        this.f260545c = 2000;
        this.f260546d = 22631;
        this.f260547e = jz5.h.b(f95.c.f260541d);
        this.f260548f = jz5.h.b(f95.d.f260542d);
        this.f260549g = new java.util.concurrent.ConcurrentHashMap();
        this.f260551i = new java.lang.Object();
    }

    public final java.lang.String a(java.lang.String str) {
        if (str.length() == 0) {
            return "";
        }
        int P = r26.n0.P(str, "/", 0, false, 6, null);
        if (P == -1) {
            return str;
        }
        java.lang.String substring = str.substring(P + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public final java.lang.String b(java.lang.String str) {
        if (str.length() == 0) {
            return "";
        }
        java.util.List g17 = new r26.t("\\s+").g(str, 0);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        if (r26.i0.y(lowerCase, "select", false) || r26.i0.y(lowerCase, "delete", false)) {
            int size = g17.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 < g17.size() - 1 && r26.i0.p((java.lang.String) g17.get(i17), "from", true)) {
                    int i18 = i17 + 1;
                    if (((java.lang.CharSequence) g17.get(i18)).length() > 0) {
                        return (java.lang.String) g17.get(i18);
                    }
                }
            }
        } else if (r26.i0.y(lowerCase, "update", false)) {
            int size2 = g17.size();
            for (int i19 = 0; i19 < size2; i19++) {
                if (i19 < g17.size() - 1 && r26.i0.p((java.lang.String) g17.get(i19), "update", true)) {
                    int i27 = i19 + 1;
                    if (((java.lang.CharSequence) g17.get(i27)).length() > 0) {
                        return (java.lang.String) g17.get(i27);
                    }
                }
            }
        } else if (r26.i0.y(lowerCase, "insert", false)) {
            int size3 = g17.size();
            for (int i28 = 0; i28 < size3; i28++) {
                if (i28 < g17.size() - 1 && r26.i0.p((java.lang.String) g17.get(i28), "into", true)) {
                    int i29 = i28 + 1;
                    if (((java.lang.CharSequence) g17.get(i29)).length() > 0) {
                        java.lang.String str2 = (java.lang.String) g17.get(i29);
                        int K = r26.n0.K(str2, '(', 0, false, 6, null);
                        if (K == -1) {
                            return str2;
                        }
                        java.lang.String substring = str2.substring(K + 1);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        return substring;
                    }
                }
            }
        }
        return "";
    }

    public final void c(java.lang.String dbPath, java.lang.String sql, int i17, long j17, boolean z17) {
        boolean B;
        kotlin.jvm.internal.o.g(dbPath, "dbPath");
        kotlin.jvm.internal.o.g(sql, "sql");
        if (sql.length() == 0) {
            B = false;
        } else {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.o.f(locale, "getDefault(...)");
            java.lang.String lowerCase = sql.toLowerCase(locale);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            B = r26.n0.B(lowerCase, this.f260543a, false);
        }
        if (B) {
            if (((java.lang.Boolean) ((jz5.n) this.f260547e).getValue()).booleanValue()) {
                java.lang.Throwable th6 = new java.lang.Throwable();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.z3.c(th6);
                int hashCode = c17.hashCode();
                f95.a aVar = (f95.a) this.f260549g.get(java.lang.Integer.valueOf(hashCode));
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                synchronized (this.f260551i) {
                    if (aVar != null) {
                        try {
                            if (currentTimeMillis - this.f260550h > ((java.lang.Number) ((jz5.n) this.f260548f).getValue()).longValue()) {
                                if (!aVar.f260535c) {
                                    aVar.f260535c = true;
                                    this.f260550h = currentTimeMillis;
                                    ((ku5.t0) ku5.t0.f312615d).g(new f95.b(this, i17, j17, aVar, c17));
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            throw th7;
                        }
                    }
                    if (aVar == null) {
                        this.f260549g.putIfAbsent(java.lang.Integer.valueOf(hashCode), new f95.a(sql, z17, false));
                    }
                }
            }
            if (z17 && j17 >= this.f260545c) {
                d(sql, dbPath, a(dbPath), b(sql), j17, z17, 1);
            } else if (j17 >= this.f260544b) {
                d(sql, dbPath, a(dbPath), b(sql), j17, z17, 0);
            }
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, boolean z17, int i17) {
        jx3.f.INSTANCE.d(this.f260546d, str2, str, "", "", java.lang.Long.valueOf(j17), bm5.f1.a(), java.lang.Integer.valueOf(z17 ? 1 : 0), str3, str4, com.tencent.mm.app.w.l(), 0L, java.lang.Integer.valueOf(com.tencent.mm.app.w.INSTANCE.f53889n ? 1 : 0), java.lang.Integer.valueOf(i17), java.lang.Thread.currentThread().getName());
    }
}
