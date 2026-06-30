package f95;

/* loaded from: classes12.dex */
public final class l implements com.tencent.wcdb.core.Database.PerformanceTracer {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f260567a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f260568b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260569c;

    /* renamed from: d, reason: collision with root package name */
    public final int f260570d;

    /* renamed from: e, reason: collision with root package name */
    public final int f260571e;

    /* renamed from: f, reason: collision with root package name */
    public final jx3.b f260572f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f260573g;

    public l(com.tencent.wcdb.core.Database db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f260567a = db6;
        new java.util.concurrent.ConcurrentHashMap();
        this.f260568b = jz5.h.b(f95.k.f260566d);
        this.f260569c = 10000;
        this.f260570d = 2000;
        this.f260571e = 22631;
        this.f260572f = new jx3.b(463);
        this.f260573g = new int[]{27, 39, 24, 36, 27, 39, 48, 54, 33, 45, 30, 42, 33, 45, 51, 57};
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.util.Collection collection;
        java.util.List g17 = new r26.t(" ").g(str, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f313996d;
        boolean z17 = false;
        for (java.lang.String str3 : (java.lang.String[]) collection.toArray(new java.lang.String[0])) {
            int length = str3.length() - 1;
            int i17 = 0;
            boolean z18 = false;
            while (i17 <= length) {
                boolean z19 = kotlin.jvm.internal.o.i(str3.charAt(!z18 ? i17 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    }
                    length--;
                } else if (z19) {
                    i17++;
                } else {
                    z18 = true;
                }
            }
            java.lang.String obj = str3.subSequence(i17, length + 1).toString();
            if (z17) {
                if (obj.length() > 0) {
                    return str3;
                }
            }
            if (r26.i0.p(obj, str2, true)) {
                z17 = true;
            }
        }
        return "";
    }

    public final void b(java.lang.String str, java.lang.String str2, long j17, int i17, long j18, int i18) {
        java.lang.String a17;
        java.lang.String str3;
        if (r26.i0.y(str, "select", false) || r26.i0.y(str, "SELECT", false) || r26.i0.y(str, "delete", false) || r26.i0.y(str, "DELETE", false)) {
            a17 = a(str, "from");
        } else if (r26.i0.y(str, "update", false) || r26.i0.y(str, "UPDATE", false)) {
            a17 = a(str, "update");
        } else {
            if (!r26.i0.y(str, "insert", false) && !r26.i0.y(str, "INSERT", false)) {
                str3 = "";
                java.lang.String substring = str2.substring(r26.n0.P(str2, "/", 0, false, 6, null) + 1);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                jx3.f.INSTANCE.d(this.f260571e, str2, str, "", "", java.lang.Long.valueOf(j17), bm5.f1.a(), java.lang.Integer.valueOf(i17), substring, str3, com.tencent.mm.app.w.l(), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(com.tencent.mm.app.w.INSTANCE.f53889n ? 1 : 0), java.lang.Integer.valueOf(i18), java.lang.Thread.currentThread().getName());
            }
            a17 = a(str, "into");
            if (r26.n0.D(a17, "(", false, 2, null)) {
                a17 = a17.substring(r26.n0.L(a17, "(", 0, false, 6, null) + 1);
                kotlin.jvm.internal.o.f(a17, "substring(...)");
            }
        }
        str3 = a17;
        java.lang.String substring2 = str2.substring(r26.n0.P(str2, "/", 0, false, 6, null) + 1);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        jx3.f.INSTANCE.d(this.f260571e, str2, str, "", "", java.lang.Long.valueOf(j17), bm5.f1.a(), java.lang.Integer.valueOf(i17), substring2, str3, com.tencent.mm.app.w.l(), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(com.tencent.mm.app.w.INSTANCE.f53889n ? 1 : 0), java.lang.Integer.valueOf(i18), java.lang.Thread.currentThread().getName());
    }

    @Override // com.tencent.wcdb.core.Database.PerformanceTracer
    public void onTrace(long j17, java.lang.String path, long j18, java.lang.String sql, com.tencent.wcdb.core.Database.PerformanceInfo info) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(sql, "sql");
        kotlin.jvm.internal.o.g(info, "info");
        long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(info.costInNanoseconds);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(path);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        kotlin.jvm.internal.o.f(str2, "getName(...)");
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            l75.e1 e1Var = d95.z.f227715f;
            synchronized (e1Var) {
                e1Var.f316958b = 0;
                e1Var.f316960d = 0L;
            }
        }
        if (r26.i0.y(str2, "EnMicroMsg.db", false)) {
            kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
            java.lang.Thread.currentThread().getId();
            int sqlStatementType = com.tencent.wcdb.DatabaseUtils.getSqlStatementType(sql);
            int i17 = this.f260573g[(sqlStatementType != 1 ? 8 : 0) + 2];
            this.f260572f.b(i17 + 1, i17 + 2, (int) millis);
            boolean b17 = kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper());
            f95.e eVar = (f95.e) ((jz5.n) this.f260568b).getValue();
            java.lang.String path2 = this.f260567a.getPath();
            kotlin.jvm.internal.o.f(path2, "getPath(...)");
            eVar.c(path2, sql, sqlStatementType, millis, b17);
        }
        if (millis >= this.f260570d) {
            boolean b18 = kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper());
            if (b18) {
                b(sql, str2, millis, b18 ? 1 : 0, j18, 1);
            } else if (millis >= this.f260569c) {
                b(sql, str2, millis, b18 ? 1 : 0, j18, 0);
            }
        }
    }
}
