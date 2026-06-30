package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class m0 extends java.lang.Thread implements com.tencent.mm.plugin.fts.c0 {

    /* renamed from: d, reason: collision with root package name */
    public int f137760d;

    /* renamed from: e, reason: collision with root package name */
    public int f137761e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.PriorityBlockingQueue f137762f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f137763g;

    /* renamed from: h, reason: collision with root package name */
    public p13.c f137764h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f137765i;

    public m0() {
        super("SearchDaemon");
        this.f137760d = 0;
        this.f137761e = Integer.MAX_VALUE;
        this.f137762f = new java.util.concurrent.PriorityBlockingQueue();
        this.f137763g = false;
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void a(p13.c cVar) {
        cVar.n();
        this.f137762f.remove(cVar);
        if (this.f137764h == cVar) {
            interrupt();
        }
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public boolean b() {
        return isAlive();
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "***** FTSTaskDaemon clear all task.");
        this.f137762f.clear();
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public void d(p13.c cVar) {
        if (this.f137763g) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.SearchTaskThread", "***** postTask was ignored since mQuitRequested flag was set.");
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("PostTaskWhenQuit");
            return;
        }
        int priority = cVar.getPriority();
        this.f137762f.put(cVar);
        java.lang.String name = cVar.getName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(name)) {
            name = cVar.toString();
        }
        java.lang.String str = "";
        if (name == null) {
            name = "";
        }
        p13.c cVar2 = this.f137764h;
        if (cVar2 != null) {
            java.lang.String name2 = cVar2.getName();
            if (com.tencent.mm.sdk.platformtools.t8.K0(name2)) {
                name2 = cVar2.toString();
            }
            if (name2 != null) {
                str = name2;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "[PostTask] name=%s, priority=%d, queueSize=%d, currentRunning=%s(priority=%d)", name, java.lang.Integer.valueOf(priority), java.lang.Integer.valueOf(this.f137762f.size()), str, java.lang.Integer.valueOf(this.f137761e));
        if (this.f137764h == null) {
            h(priority);
        } else if (priority < this.f137761e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.SearchTaskThread", "[PostTask] Preempting! new=%s(%d) interrupts current=%s(%d)", name, java.lang.Integer.valueOf(priority), str, java.lang.Integer.valueOf(this.f137761e));
            interrupt();
            h(priority);
        }
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public synchronized void e(boolean z17) {
        int i17;
        if (this.f137765i == z17) {
            return;
        }
        this.f137765i = z17;
        if (this.f137761e >= 0 && isAlive() && (i17 = this.f137760d) != 0) {
            int i18 = this.f137765i ? 10 : 0;
            try {
                android.os.Process.setThreadPriority(i17, i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "*** Switch priority: ".concat(this.f137765i ? "foreground" : "background"));
            } catch (java.lang.SecurityException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e17, "setLowPriorityMode failed, tid=%d, p=%d", java.lang.Integer.valueOf(this.f137760d), java.lang.Integer.valueOf(i18));
            }
        }
    }

    public final void f() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "clearRunningTaskName");
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("fts_task_block_detect_" + j62.e.g().n());
            if (M == null) {
                return;
            }
            M.putString("running_task_name", "");
            M.putLong("running_task_start_time", 0L);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e17, "clearRunningTaskName failed", new java.lang.Object[0]);
        }
    }

    public final void g(java.lang.String str) {
        try {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("fts_task_block_detect_" + j62.e.g().n());
            if (M == null) {
                return;
            }
            M.putString("running_task_name", str);
            M.putLong("running_task_start_time", c01.id.c());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e17, "persistRunningTaskName failed", new java.lang.Object[0]);
        }
    }

    public final synchronized void h(int i17) {
        if (this.f137761e != i17 && isAlive()) {
            if (i17 < 0 && this.f137761e >= 0) {
                android.os.Process.setThreadPriority(this.f137760d, -8);
            } else if (i17 >= 0 && this.f137761e < 0) {
                android.os.Process.setThreadPriority(this.f137760d, this.f137765i ? 10 : 0);
            }
            this.f137761e = i17;
        }
    }

    @Override // com.tencent.mm.plugin.fts.c0
    public synchronized void quit() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "***** FTSTaskDaemon thread was quitting.");
        this.f137762f.clear();
        this.f137764h = null;
        this.f137763g = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        p13.c cVar;
        java.lang.String str;
        char c17;
        int i17;
        java.lang.String format;
        int i18;
        this.f137760d = android.os.Process.myTid();
        int i19 = 4;
        char c18 = 1;
        int i27 = 2;
        try {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("fts_task_block_detect_" + j62.e.g().n());
            if (M != null) {
                java.lang.String string = M.getString("running_task_name", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    long j17 = M.getLong("running_task_start_time", 0L);
                    long currentTimeMillis = j17 > 0 ? java.lang.System.currentTimeMillis() - j17 : 0L;
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTS.SearchTaskThread", "[BlockDetect] Last process task stuck until killed: %s, duration=%dms", string, java.lang.Long.valueOf(currentTimeMillis));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22021, 20260509, 0, string, java.lang.Long.valueOf(j17), "", "", "", java.lang.Long.valueOf(currentTimeMillis));
                    M.putString("running_task_name", "");
                    M.putLong("running_task_start_time", 0L);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e17, "checkLastTaskBlock failed", new java.lang.Object[0]);
        }
        while (true) {
            try {
                try {
                    java.lang.Thread.interrupted();
                } catch (java.lang.Exception e18) {
                    e = e18;
                    cVar = null;
                    str = null;
                }
                if (this.f137763g) {
                    com.tencent.mm.plugin.fts.e.a();
                    f();
                    this.f137764h = null;
                    this.f137760d = 0;
                    return;
                }
                this.f137764h = null;
                cVar = (p13.c) this.f137762f.take();
                if (cVar == null) {
                    com.tencent.mm.plugin.fts.e.a();
                    f();
                    this.f137764h = null;
                } else {
                    try {
                        this.f137764h = cVar;
                        h(cVar.getPriority());
                        str = cVar.getName();
                    } catch (java.lang.Exception e19) {
                        e = e19;
                        str = null;
                    }
                    try {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            str = cVar.toString();
                        }
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = str;
                        objArr[c18] = java.lang.Integer.valueOf(cVar.getPriority());
                        objArr[i27] = java.lang.Integer.valueOf(this.f137762f.size());
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "[ExecTask] name=%s, priority=%d, pendingQueueSize=%d", objArr);
                        g(str);
                        cVar.h();
                        o13.p.f(cVar.k(), cVar.f351067g);
                        o13.p.g(cVar.k(), cVar.f351067g);
                        if (((cVar.f351068h & 1) > 0 ? c18 : (char) 0) != 0) {
                            long j18 = cVar.f351067g;
                            if (j18 > 1000 && j18 < 3600000) {
                                o13.p.f(27, j18);
                                o13.p.g(27, cVar.f351067g);
                            }
                        }
                        if (cVar instanceof p13.t) {
                            p13.t tVar = (p13.t) cVar;
                            java.util.Locale locale = java.util.Locale.CHINA;
                            java.lang.Object[] objArr2 = new java.lang.Object[i19];
                            objArr2[0] = str;
                            objArr2[c18] = tVar.f351135n.toString();
                            objArr2[i27] = tVar.f351136o.toString();
                            objArr2[3] = java.lang.Long.valueOf(cVar.f351067g);
                            format = java.lang.String.format(locale, "[%s][Request=%s][Result=%s] Done, %dms", objArr2);
                            i18 = tVar.f351136o.f351160e.size();
                        } else {
                            java.util.Locale locale2 = java.util.Locale.CHINA;
                            java.lang.Object[] objArr3 = new java.lang.Object[i27];
                            objArr3[0] = str;
                            objArr3[c18] = java.lang.Long.valueOf(cVar.f351067g);
                            format = java.lang.String.format(locale2, "[%s] Done, %dms", objArr3);
                            i18 = 0;
                        }
                        o13.p.h(cVar.k(), cVar.f351067g, i18);
                        java.lang.String l17 = cVar.l();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
                            format = format + " " + l17;
                        }
                        java.lang.String j19 = cVar.j();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(j19)) {
                            format = format + " " + j19;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", format);
                        com.tencent.mm.plugin.fts.e.a();
                        f();
                        this.f137764h = null;
                        c17 = 1;
                        i17 = 2;
                    } catch (java.lang.Exception e27) {
                        e = e27;
                        if (cVar == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "continue, baseSearchTask is null");
                            com.tencent.mm.plugin.fts.e.a();
                            f();
                            this.f137764h = null;
                            i19 = 4;
                            c18 = 1;
                            i27 = 2;
                        } else {
                            if (e instanceof java.lang.InterruptedException) {
                                if (!cVar.m()) {
                                    this.f137762f.put(cVar);
                                }
                                c17 = 1;
                                i17 = 2;
                                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "[%s][cancelled:%b] interruputed! %dms", str, java.lang.Boolean.valueOf(cVar.m()), java.lang.Long.valueOf(cVar.f351067g));
                            } else {
                                c17 = 1;
                                i17 = 2;
                                if (e instanceof com.tencent.mm.plugin.fts.q) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SearchTaskThread", "stop task and do nothing");
                                } else if (e instanceof com.tencent.wcdb.database.SQLiteDatabaseCorruptException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDatabaseCorruptException");
                                } else if (e instanceof com.tencent.wcdb.database.SQLiteConstraintException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).nj();
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteConstraintException");
                                } else if (e instanceof p13.a0) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SearchFeatureException");
                                } else if (e instanceof com.tencent.wcdb.database.SQLiteDiskIOException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteDiskIOException");
                                } else if (e instanceof java.lang.NullPointerException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("NullPointerException");
                                } else if (e instanceof com.tencent.wcdb.database.SQLiteException) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    if (e.getMessage() == null || !e.getMessage().contains("the connection is read-only")) {
                                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteException");
                                    } else {
                                        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("SQLiteExceptionReadOnly");
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.SearchTaskThread", e, "[%s] failed with exception.\n", str);
                                    ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).rj("OtherException");
                                }
                            }
                            com.tencent.mm.plugin.fts.e.a();
                            f();
                            this.f137764h = null;
                            c18 = c17;
                            i27 = i17;
                            i19 = 4;
                        }
                    }
                    c18 = c17;
                    i27 = i17;
                    i19 = 4;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.fts.e.a();
                f();
                this.f137764h = null;
                throw th6;
            }
        }
    }
}
