package com.tencent.mm.plugin.finder.report;

/* loaded from: classes15.dex */
public final class v1 {

    /* renamed from: b, reason: collision with root package name */
    public static long f125394b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f125395c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.extension.reddot.jb f125396d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.v1 f125393a = new com.tencent.mm.plugin.finder.report.v1();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125397e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125398f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f125399g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f125400h = new java.util.HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    public static void o(com.tencent.mm.plugin.finder.report.v1 v1Var, int i17, boolean z17, r45.qt2 qt2Var, boolean z18, long j17, boolean z19, int i18, java.lang.Object obj) {
        r45.xs2 xs2Var;
        if ((i18 & 4) != 0) {
            qt2Var = null;
        }
        ?? r102 = z18;
        if ((i18 & 8) != 0) {
            r102 = 0;
        }
        long j18 = 0;
        if ((i18 & 16) != 0) {
            j17 = 0;
        }
        if ((i18 & 32) != 0) {
            z19 = true;
        }
        com.tencent.mm.plugin.finder.report.r1 e17 = v1Var.e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (qt2Var != null) {
                    java.lang.String string = qt2Var.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    e17.C = string;
                    java.lang.String string2 = qt2Var.getString(2);
                    if (string2 == null) {
                        string2 = "";
                    }
                    e17.D = string2;
                    e17.E = qt2Var.getInteger(5);
                }
                if (z17) {
                    if (e17.f125301f <= 0 || e17.f125308i0 != 1) {
                        long c17 = c01.id.c();
                        e17.f125301f = c17;
                        if (e17.f125290J > 0) {
                            long j19 = e17.f125299e;
                            if (j19 > 0) {
                                j18 = c17 - j19;
                            }
                        }
                        e17.f125310j0 = j18;
                        return;
                    }
                    long c18 = c01.id.c();
                    e17.f125303g = c18;
                    if (e17.f125290J > 0) {
                        long j27 = e17.f125299e;
                        if (j27 > 0) {
                            j18 = c18 - j27;
                        }
                    }
                    e17.f125310j0 = j18;
                    return;
                }
                e17.f125293b = true;
                e17.f125315m = c01.id.c();
                e17.G = 1L;
                e17.T = r102;
                e17.f125318n0 = j17;
                if (e17.f125298d0 == 0) {
                    e17.f125298d0 = 1;
                    e17.f125300e0 = 1;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "notifyLoadingStatus: loading end, tabType=" + i17 + ", pullType=" + e17.H + ", commentScene=" + e17.E + ", cgiType=" + e17.F + ", firstVideoFeedId=" + pm0.v.u(j17) + ", firstFeedIsPhoto=" + ((boolean) r102) + ", needRecordVideoPlay=" + z19);
                com.tencent.mm.plugin.finder.report.v1 v1Var2 = f125393a;
                if ((i17 == 4 || i17 == 3 || i17 == 1 || i17 == 35) && z19 && r102 == 0) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125399g;
                    com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
                    if (r1Var != null) {
                        if (v1Var2.g(r1Var.F) && r1Var.f125324s == 0) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "cacheLateReportData: abnormal report, cgiType=5");
                            r1Var.f125324s = c01.id.c();
                        }
                        v1Var2.u(r1Var, i17);
                    }
                    concurrentHashMap.put(java.lang.Integer.valueOf(i17), e17);
                    return;
                }
                if (e17.X == 1 || v1Var2.g(e17.F)) {
                    long j28 = f125394b;
                    if (j28 > 0) {
                        e17.f125297d = j28;
                        long c19 = c01.id.c();
                        e17.f125299e = c19;
                        f125394b = 0L;
                        e17.f125290J = c19 - e17.f125297d;
                        boolean z27 = f125395c;
                        e17.U = z27 ? 1 : 0;
                        if (z27) {
                            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = f125396d;
                            e17.f125292a0 = jbVar != null ? jbVar.field_ctrType : 0L;
                            java.lang.String str = jbVar != null ? jbVar.field_tipsId : null;
                            e17.Z = str != null ? str : "";
                            if (jbVar != null && (xs2Var = jbVar.N) != null) {
                                j18 = xs2Var.getInteger(22);
                            }
                            e17.f125294b0 = j18;
                        }
                        f125396d = null;
                        f125395c = false;
                    }
                }
                v1Var2.u(e17, i17);
            }
        }
    }

    public static void t(com.tencent.mm.plugin.finder.report.v1 v1Var, int i17, int i18, r45.qt2 qt2Var, long j17, boolean z17, int i19, java.lang.Object obj) {
        if ((i19 & 8) != 0) {
            j17 = 0;
        }
        if ((i19 & 16) != 0) {
            z17 = false;
        }
        v1Var.getClass();
        if (!(i18 == 0 || i18 == 1 || i18 == 2) || qt2Var == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "prepare: not support to report tabType = " + i17 + ", contextObj = " + qt2Var);
            return;
        }
        com.tencent.mm.plugin.finder.report.r1 e17 = v1Var.e(i17);
        if (e17 != null) {
            jz5.f0 f0Var = null;
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (e17.f125308i0 == 1 && !e17.f125295c && i18 == 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "prepare: remove duplicate enter report");
                    return;
                }
                com.tencent.mm.plugin.finder.report.r1 r1Var = (e17.f125313l > 0L ? 1 : (e17.f125313l == 0L ? 0 : -1)) == 0 && (e17.G > 2L ? 1 : (e17.G == 2L ? 0 : -1)) == 0 ? e17 : null;
                com.tencent.mm.plugin.finder.report.v1 v1Var2 = f125393a;
                if (r1Var != null) {
                    v1Var2.h(i17, false);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    e17.f125293b = true;
                    v1Var2.u(e17, i17);
                }
            }
        }
        com.tencent.mm.plugin.finder.report.r1 e18 = v1Var.e(i17);
        if (e18 != null) {
            e18.f125291a = true;
            e18.H = i18;
            java.lang.String string = qt2Var.getString(0);
            if (string == null) {
                string = "";
            }
            e18.C = string;
            java.lang.String string2 = qt2Var.getString(2);
            e18.D = string2 != null ? string2 : "";
            e18.E = qt2Var.getInteger(5);
            e18.F = j17;
            e18.B = z17;
        }
    }

    public final void a(int i17, int i18) {
        com.tencent.mm.plugin.finder.report.r1 e17;
        if (i18 > 0 && (e17 = e(i17)) != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                e17.Y += i18;
            }
        }
    }

    public final void b(int i17) {
        r45.xs2 xs2Var;
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            long j17 = f125394b;
            long j18 = 0;
            if (j17 > 0) {
                e17.f125297d = j17;
                java.lang.Long l17 = (java.lang.Long) f125398f.get(java.lang.Integer.valueOf(i17));
                long longValue = l17 == null ? 0L : l17.longValue();
                e17.f125299e = longValue;
                f125394b = 0L;
                e17.f125290J = longValue > 0 ? longValue - e17.f125297d : 0L;
                boolean z17 = f125395c;
                e17.U = z17 ? 1 : 0;
                if (z17) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = f125396d;
                    e17.f125292a0 = jbVar != null ? jbVar.field_ctrType : 0L;
                    java.lang.String str = jbVar != null ? jbVar.field_tipsId : null;
                    if (str == null) {
                        str = "";
                    }
                    e17.Z = str;
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = f125396d;
                    if (jbVar2 != null && (xs2Var = jbVar2.N) != null) {
                        j18 = xs2Var.getInteger(22);
                    }
                    e17.f125294b0 = j18;
                }
                f125396d = null;
                f125395c = false;
            }
        }
    }

    public final void c() {
        f125394b = 0L;
        f125395c = false;
        f125396d = null;
    }

    public final void d() {
        f125394b = c01.id.c();
        ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).f433195d = java.lang.System.currentTimeMillis();
    }

    public final com.tencent.mm.plugin.finder.report.r1 e(int i17) {
        boolean z17 = true;
        if (i17 != 4 && i17 != 3 && i17 != 1 && i17 != 35 && i17 != 2 && i17 != 6 && i17 != 5 && i17 != 7 && i17 != 8 && i17 != 9) {
            z17 = false;
        }
        if (!z17) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125397e;
        com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (r1Var != null && !r1Var.f125293b) {
            return r1Var;
        }
        com.tencent.mm.plugin.finder.report.r1 r1Var2 = new com.tencent.mm.plugin.finder.report.r1();
        r1Var2.I = i17;
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), r1Var2);
        return r1Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3 A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198 A[Catch: all -> 0x0370, TryCatch #0 {, blocks: (B:4:0x0008, B:5:0x000c, B:7:0x0012, B:10:0x0026, B:13:0x0052, B:15:0x0060, B:21:0x0070, B:23:0x0075, B:29:0x0085, B:30:0x0087, B:32:0x0099, B:34:0x009f, B:38:0x00a9, B:39:0x00b5, B:44:0x00cf, B:48:0x00d9, B:49:0x0109, B:50:0x00de, B:52:0x00e2, B:54:0x00e8, B:57:0x00ee, B:60:0x0101, B:63:0x00c3, B:67:0x00ac, B:71:0x0110, B:73:0x0184, B:75:0x01b9, B:77:0x01bd, B:79:0x0273, B:81:0x0188, B:83:0x0198, B:85:0x004f, B:88:0x0369), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f() {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.v1.f():java.util.List");
    }

    public final boolean g(long j17) {
        return j17 == 5 || j17 == 6;
    }

    public final void h(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (z17) {
                    e17.f125313l = 0L;
                    return;
                }
                if (e17.f125313l <= 0 || e17.f125308i0 != 1) {
                    e17.f125313l = c01.id.c();
                    if (e17.G == 2) {
                        e17.f125293b = true;
                        e17.f125295c = false;
                        f125393a.u(e17, i17);
                    }
                }
            }
        }
    }

    public final void i(int i17, java.lang.String tag, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) f125399g.get(java.lang.Integer.valueOf(i17));
        if (r1Var != null) {
            long j18 = r1Var.f125318n0;
            if (!(j18 == 0 || j18 == j17 || r1Var.f125321p == 0)) {
                r1Var = null;
            }
            if (r1Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "notifyDecodeStart: " + tag + ", feedId=" + pm0.v.u(j17) + ", checkVideoPreload=" + z17 + ", usePreloadCache=" + r1Var.W + ", cgiType=" + r1Var.F + ", videoDecodeStart=" + r1Var.f125322q);
                if (!z17 || ((r1Var.W == 1 && r1Var.f125322q == 0) || (f125393a.g(r1Var.F) && r1Var.f125322q == 0))) {
                    r1Var.f125322q = c01.id.c();
                }
            }
        }
    }

    public final void j(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 == null || e17.f125298d0 != 0) {
                return;
            }
            e17.f125298d0 = z17 ? 3 : 4;
            e17.f125300e0 = 4;
            if (e17.f125304g0 == 0) {
                e17.f125304g0 = e17.f125302f0;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "notifyFinishScene " + i17 + ' ' + z17 + " switchCommentScene:" + e17.f125304g0);
        }
    }

    public final void k(int i17) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                e17.f125329x = c01.id.c();
            }
        }
    }

    public final void l(int i17, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            int i18 = 1;
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (!z17) {
                    e17.f125326u = c01.id.c();
                    return;
                }
                e17.f125325t = c01.id.c();
                if (z18 && z19) {
                    i18 = 3;
                } else if (!z18) {
                    i18 = 2;
                }
                e17.f125296c0 = i18;
            }
        }
    }

    public final void m(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (z17) {
                    e17.f125327v = c01.id.c();
                } else {
                    e17.f125328w = c01.id.c();
                }
            }
        }
    }

    public final void n(int i17, boolean z17) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (!z17) {
                    e17.f125311k = c01.id.c();
                } else {
                    e17.f125309j = c01.id.c();
                    e17.F = e17.F == 0 ? 2L : 3L;
                }
            }
        }
    }

    public final void p(int i17, boolean z17, com.tencent.mm.protobuf.g gVar, r45.xw xwVar) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (z17) {
                    e17.f125305h = c01.id.c();
                    e17.F = 1L;
                } else {
                    e17.f125307i = c01.id.c();
                    e17.f125320o0 = xwVar;
                    e17.A = gVar;
                }
            }
        }
    }

    public final void q(int i17, int i18) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 == null || e17.f125302f0 != 0) {
                return;
            }
            e17.f125302f0 = i18;
            com.tencent.mars.xlog.Log.i("Finder.FinderLoadingTimeReporter", "notifySwitchPageSceneOnNoFinish " + i17 + ' ' + i18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (kotlin.jvm.internal.o.b(r18, r0 != null ? r0.n() : null) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r16, com.tencent.mm.protobuf.g r17, java.lang.String r18, r45.xw r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            java.lang.String r0 = "preloadMediaId"
            kotlin.jvm.internal.o.g(r7, r0)
            com.tencent.mm.plugin.finder.report.r1 r0 = r15.e(r16)
            if (r0 == 0) goto Lc3
            boolean r1 = r0.f125291a
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L23
            boolean r1 = r0.f125293b
            if (r1 != 0) goto L23
            int r1 = r0.f125308i0
            if (r1 != 0) goto L23
            r1 = r12
            goto L24
        L23:
            r1 = r11
        L24:
            r13 = 0
            if (r1 == 0) goto L29
            r14 = r0
            goto L2a
        L29:
            r14 = r13
        L2a:
            if (r14 == 0) goto Lc3
            long r0 = r14.F
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3e
            long r0 = c01.id.c()
            r14.f125307i = r0
            r0 = 2
            r14.W = r0
            goto L82
        L3e:
            r14.W = r12
            if (r9 != 0) goto L82
            int r0 = r18.length()
            if (r0 <= 0) goto L4a
            r0 = r12
            goto L4b
        L4a:
            r0 = r11
        L4b:
            if (r0 == 0) goto L82
            java.lang.Class<c61.yb> r0 = c61.yb.class
            i95.m r0 = i95.n0.c(r0)
            c61.yb r0 = (c61.yb) r0
            c61.p2 r0 = (c61.p2) r0
            r0.getClass()
            cu2.x r0 = cu2.x.f222449a
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r1 = r18
            so2.i3 r0 = cu2.x.c(r0, r1, r2, r3, r4, r5, r6)
            boolean r0 = r0.F0()
            if (r0 != 0) goto L7c
            mn2.g4 r0 = bs2.f.f23832c
            if (r0 == 0) goto L76
            java.lang.String r13 = r0.n()
        L76:
            boolean r0 = kotlin.jvm.internal.o.b(r7, r13)
            if (r0 == 0) goto L7d
        L7c:
            r11 = r12
        L7d:
            if (r11 != 0) goto L82
            r0 = 3
            r14.W = r0
        L82:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "notifyUsePreloadCache: usePreloadCache="
            r0.<init>(r1)
            int r1 = r14.W
            r0.append(r1)
            java.lang.String r1 = ", tabType="
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", preloadMediaId="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", isFirstFeedPhoto="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", showCacheWithoutRefresh="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLoadingTimeReporter"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = r17
            r14.A = r0
            if (r8 == 0) goto Lc1
            r14.f125320o0 = r8
        Lc1:
            r14.X = r10
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.v1.r(int, com.tencent.mm.protobuf.g, java.lang.String, r45.xw, boolean, boolean):void");
    }

    public final void s(int i17) {
        r45.xs2 xs2Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125398f;
        concurrentHashMap.put(valueOf, java.lang.Long.valueOf(c01.id.c()));
        com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) f125399g.get(java.lang.Integer.valueOf(i17));
        if (r1Var != null) {
            if (r1Var.X == 1 || f125393a.g(r1Var.F)) {
                long j17 = f125394b;
                long j18 = 0;
                if (j17 > 0) {
                    r1Var.f125297d = j17;
                    java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
                    long longValue = l17 == null ? 0L : l17.longValue();
                    r1Var.f125299e = longValue;
                    f125394b = 0L;
                    r1Var.f125290J = longValue > 0 ? longValue - r1Var.f125297d : 0L;
                    boolean z17 = f125395c;
                    r1Var.U = z17 ? 1 : 0;
                    if (z17) {
                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = f125396d;
                        r1Var.f125292a0 = jbVar != null ? jbVar.field_ctrType : 0L;
                        java.lang.String str = jbVar != null ? jbVar.field_tipsId : null;
                        if (str == null) {
                            str = "";
                        }
                        r1Var.Z = str;
                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = f125396d;
                        if (jbVar2 != null && (xs2Var = jbVar2.N) != null) {
                            j18 = xs2Var.getInteger(22);
                        }
                        r1Var.f125294b0 = j18;
                    }
                    f125396d = null;
                    f125395c = false;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0311, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02f1, code lost:
    
        if (g(r33.F) != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0106, code lost:
    
        if (r13 > 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r9 > 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        if (r13 > 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(com.tencent.mm.plugin.finder.report.r1 r33, int r34) {
        /*
            Method dump skipped, instructions count: 1789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.v1.u(com.tencent.mm.plugin.finder.report.r1, int):void");
    }

    public final void v(int i17) {
        com.tencent.mm.plugin.finder.report.v1 v1Var = f125393a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f125399g;
        if (i17 != -1) {
            com.tencent.mm.plugin.finder.report.r1 r1Var = (com.tencent.mm.plugin.finder.report.r1) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            if (r1Var != null) {
                v1Var.u(r1Var, i17);
            }
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
            return;
        }
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            v1Var.u((com.tencent.mm.plugin.finder.report.r1) entry.getValue(), ((java.lang.Number) entry.getKey()).intValue());
        }
        concurrentHashMap.clear();
    }

    public final void w(int i17, r45.qt2 qt2Var) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (qt2Var != null) {
                    java.lang.String string = qt2Var.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    e17.C = string;
                    java.lang.String string2 = qt2Var.getString(2);
                    e17.D = string2 != null ? string2 : "";
                    e17.E = qt2Var.getInteger(5);
                }
                e17.f125293b = true;
                long c17 = c01.id.c();
                e17.f125315m = c17;
                if (e17.f125305h > 0 && e17.f125307i == 0) {
                    e17.f125307i = c17;
                }
                if (e17.f125309j > 0 && e17.f125311k == 0) {
                    e17.f125311k = c17;
                }
                e17.G = 3L;
                e17.f125300e0 = 3;
                f125393a.u(e17, i17);
            }
        }
    }

    public final void x(int i17, r45.qt2 qt2Var) {
        com.tencent.mm.plugin.finder.report.r1 e17 = e(i17);
        if (e17 != null) {
            if (!(e17.f125291a && !e17.f125293b)) {
                e17 = null;
            }
            if (e17 != null) {
                if (qt2Var != null) {
                    java.lang.String string = qt2Var.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    e17.C = string;
                    java.lang.String string2 = qt2Var.getString(2);
                    e17.D = string2 != null ? string2 : "";
                    e17.E = qt2Var.getInteger(5);
                }
                if (e17.G != 0) {
                    return;
                }
                long c17 = c01.id.c();
                e17.f125315m = c17;
                e17.S = 3;
                if (e17.f125305h > 0 && e17.f125307i == 0) {
                    e17.f125307i = c17;
                    e17.S = 1;
                }
                if (e17.f125309j > 0 && e17.f125311k == 0) {
                    e17.f125311k = c17;
                    e17.S = 2;
                }
                e17.f125298d0 = 2;
                e17.f125300e0 = 2;
                e17.G = 2L;
                e17.f125293b = true;
                f125393a.u(e17, i17);
            }
        }
    }
}
