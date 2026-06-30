package com.tencent.mm.plugin.report.service;

/* loaded from: classes12.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f158167a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f158168b;

    /* renamed from: c, reason: collision with root package name */
    public static long f158169c;

    /* renamed from: d, reason: collision with root package name */
    public static long f158170d;

    /* renamed from: e, reason: collision with root package name */
    public static long f158171e;

    static {
        new android.util.SparseArray();
        f158168b = true;
        f158169c = 0L;
        f158170d = 0L;
        f158171e = 0L;
    }

    public static void a(int i17) {
        if (f158168b) {
            android.util.SparseArray sparseArray = f158167a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sparseArray.put(i17, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            java.lang.System.currentTimeMillis();
        }
    }

    public static void b(int i17) {
        if (f158168b) {
            android.util.SparseArray sparseArray = f158167a;
            java.lang.Long l17 = (java.lang.Long) sparseArray.get(i17);
            if (l17 == null || l17.longValue() == -1) {
                return;
            }
            sparseArray.put(i17, -1L);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
            if (currentTimeMillis <= 0) {
                return;
            }
            switch (i17) {
                case 8:
                    if (!com.tencent.mm.sdk.platformtools.x2.f193074d) {
                        c(1, currentTimeMillis);
                        d(227, currentTimeMillis);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(23, 1, 2, (int) currentTimeMillis, false);
                        break;
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(23, 4, 5, (int) currentTimeMillis, false);
                        break;
                    }
                case 9:
                    c(3, currentTimeMillis);
                    d(229, currentTimeMillis);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.m(27, 1, 2, (int) currentTimeMillis, false);
                    break;
                case 10:
                    c(2, currentTimeMillis);
                    d(228, currentTimeMillis);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.m(28, 1, 2, (int) currentTimeMillis, false);
                    break;
                case 12:
                    c(6, currentTimeMillis);
                    break;
                case 13:
                    c(7, currentTimeMillis);
                    break;
                case 14:
                    c(8, currentTimeMillis);
                    break;
                case 18:
                    c(10, currentTimeMillis);
                    break;
                case 19:
                    c(9, currentTimeMillis);
                    break;
                case 20:
                    c(12, currentTimeMillis);
                    break;
                case 21:
                    c(11, currentTimeMillis);
                    break;
                case 22:
                    c(13, currentTimeMillis);
                    break;
                case 23:
                    c(16, currentTimeMillis);
                    break;
                case 24:
                    c(15, currentTimeMillis);
                    break;
                case 25:
                    c(14, currentTimeMillis);
                    break;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportLogInfo", "ReportLogInfo operationEnd eventID:%d  time:%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    public static void c(int i17, long j17) {
        com.tencent.mm.plugin.report.service.e0 e0Var;
        if (i17 == 6) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis < f158169c + 60000) {
                return;
            } else {
                f158169c = currentTimeMillis;
            }
        } else if (i17 == 7) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis2 < f158170d + 60000) {
                return;
            } else {
                f158170d = currentTimeMillis2;
            }
        } else if (i17 == 8) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis3 < f158171e + 60000) {
                return;
            } else {
                f158171e = currentTimeMillis3;
            }
        }
        synchronized (com.tencent.mm.plugin.report.service.e0.class) {
            if (com.tencent.mm.plugin.report.service.e0.f158160e == null) {
                com.tencent.mm.plugin.report.service.e0.f158160e = new com.tencent.mm.plugin.report.service.e0();
                com.tencent.mm.plugin.report.service.e0.a();
            }
            e0Var = com.tencent.mm.plugin.report.service.e0.f158160e;
        }
        if (e0Var.f158161a) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11335, true, false, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(e0Var.f158163c), java.lang.Long.valueOf(e0Var.f158162b[0]), java.lang.Long.valueOf(e0Var.f158162b[1]), java.lang.Long.valueOf(e0Var.f158164d));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.r(11335, true, false, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
    }

    public static void d(int i17, long j17) {
        if (j17 <= 0) {
            return;
        }
        if (j17 < 1000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(i17, 0, 1, false);
            return;
        }
        if (j17 < 2000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(i17, 0, 3, false);
            return;
        }
        if (j17 < 5000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(i17, 0, 5, false);
        } else if (j17 < com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(i17, 0, 7, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(i17, 0, 9, false);
        }
    }

    public static void e(int i17) {
        if (f158168b) {
            f158167a.put(i17, -1L);
        }
    }
}
