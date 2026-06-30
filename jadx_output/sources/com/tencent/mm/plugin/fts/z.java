package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.b0 f138405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.fts.b0 b0Var) {
        super(0);
        this.f138405d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Throwable th6;
        p13.c cVar;
        java.lang.String str;
        java.lang.String format;
        int i17;
        try {
        } catch (java.lang.Throwable th7) {
            th6 = th7;
            cVar = null;
            str = null;
        }
        if (!this.f138405d.f137376g) {
            com.tencent.mm.plugin.fts.b0 b0Var = this.f138405d;
            b0Var.f137373d = null;
            cVar = (p13.c) com.tencent.mm.plugin.fts.b0.f(b0Var).poll();
            if (cVar != null) {
                try {
                    java.lang.Thread.interrupted();
                    cVar.f351066f = false;
                    this.f138405d.f137373d = cVar;
                    cVar.getPriority();
                    str = cVar.getName();
                    try {
                        cVar.h();
                        o13.p.f(cVar.k(), cVar.f351067g);
                        o13.p.g(cVar.k(), cVar.f351067g);
                        if ((cVar.f351068h & 1) > 0) {
                            long j17 = cVar.f351067g;
                            if (j17 > 1000 && j17 < 3600000) {
                                o13.p.f(27, j17);
                                o13.p.g(27, cVar.f351067g);
                            }
                        }
                        if (cVar instanceof p13.t) {
                            format = java.lang.String.format(java.util.Locale.CHINA, "[%s][Request=%s][Result=%s] Done, %dms", java.util.Arrays.copyOf(new java.lang.Object[]{str, ((p13.t) cVar).f351135n.toString(), ((p13.t) cVar).f351136o.toString(), java.lang.Long.valueOf(cVar.f351067g)}, 4));
                            kotlin.jvm.internal.o.f(format, "format(...)");
                            i17 = ((p13.t) cVar).f351136o.f351160e.size();
                        } else {
                            format = java.lang.String.format(java.util.Locale.CHINA, "[%s] Done, %dms", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Long.valueOf(cVar.f351067g)}, 2));
                            kotlin.jvm.internal.o.f(format, "format(...)");
                            i17 = 0;
                        }
                        o13.p.h(cVar.k(), cVar.f351067g, i17);
                        java.lang.String l17 = cVar.l();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                            format = format + ' ' + l17;
                        }
                        java.lang.String j18 = cVar.j();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
                            format = format + ' ' + j18;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", format);
                    } catch (java.lang.Throwable th8) {
                        th6 = th8;
                        if (cVar != null) {
                            try {
                                if (th6 instanceof java.lang.InterruptedException) {
                                    if (!cVar.m()) {
                                        com.tencent.mm.plugin.fts.b0.f(this.f138405d).add(cVar);
                                    }
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "[%s][cancelled:%b] interruputed! %dms", str, java.lang.Boolean.valueOf(cVar.m()), java.lang.Long.valueOf(cVar.f351067g));
                                } else if (th6 instanceof com.tencent.mm.plugin.fts.q) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSThreadPoolQueue", "stop task and do nothing");
                                } else if (th6 instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDatabaseCorruptException");
                                } else if (th6 instanceof com.tencent.wcdb.database.SQLiteConstraintException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteConstraintException");
                                } else if (th6 instanceof p13.a0) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchFeatureException");
                                } else if (th6 instanceof com.tencent.wcdb.database.SQLiteDiskIOException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDiskIOException");
                                } else if (th6 instanceof java.lang.NullPointerException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("NullPointerException");
                                    this.f138405d.getClass();
                                } else if (th6 instanceof com.tencent.wcdb.database.SQLiteException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    if (th6.getMessage() != null) {
                                        java.lang.String message = th6.getMessage();
                                        kotlin.jvm.internal.o.d(message);
                                        if (r26.n0.B(message, "the connection is read-only", false)) {
                                            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteExceptionReadOnly");
                                            this.f138405d.getClass();
                                        }
                                    }
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteException");
                                    this.f138405d.getClass();
                                } else {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSThreadPoolQueue", th6, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("OtherException");
                                    this.f138405d.getClass();
                                }
                                com.tencent.mm.plugin.fts.e.a();
                                com.tencent.mm.plugin.fts.b0 b0Var2 = this.f138405d;
                                b0Var2.f137373d = null;
                                b0Var2.h();
                                return jz5.f0.f302826a;
                            } finally {
                                com.tencent.mm.plugin.fts.e.a();
                                this.f138405d.f137373d = null;
                            }
                        }
                        return jz5.f0.f302826a;
                    }
                } catch (java.lang.Throwable th9) {
                    th6 = th9;
                    str = null;
                }
                com.tencent.mm.plugin.fts.e.a();
                com.tencent.mm.plugin.fts.b0 b0Var22 = this.f138405d;
                b0Var22.f137373d = null;
                b0Var22.h();
                return jz5.f0.f302826a;
            }
        }
        return jz5.f0.f302826a;
    }
}
