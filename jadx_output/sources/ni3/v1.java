package ni3;

/* loaded from: classes12.dex */
public class v1 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni3.g2 f337749e;

    public v1(ni3.g2 g2Var) {
        this.f337749e = g2Var;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "reportAllRunnable";
    }

    @Override // java.lang.Runnable
    public void run() {
        ni3.g2 g2Var;
        long j17;
        long j18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv reportAllRunnable run");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreBaseMonitor", "account has not initalized!");
            return;
        }
        synchronized (this.f337749e) {
            long j19 = com.tencent.mm.sdk.platformtools.o4.L().getLong("vfs_daily_last_report_time", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - j19 > 86400000) {
                com.tencent.mm.vfs.c1.d();
                com.tencent.mm.sdk.platformtools.o4.L().B("vfs_daily_last_report_time", currentTimeMillis);
            }
        }
        this.f337749e.Vi();
        synchronized (this.f337749e) {
            if (java.lang.System.currentTimeMillis() - com.tencent.mm.sdk.platformtools.o4.L().getLong("report_duplicate_file_report_time", 0L) >= 259200000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "reportDuplicateFile");
                java.lang.String string = com.tencent.mm.sdk.platformtools.o4.L().getString("DuplicateFileDailyReport", "");
                if (string != null && !string.isEmpty()) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                        boolean has = jSONObject.has("v3");
                        long j27 = jSONObject.getLong("allFileSize");
                        long j28 = jSONObject.getLong("image2DuplicateFileDiskSpace");
                        long j29 = jSONObject.getLong("videoDuplicateFileDiskSpace");
                        long j37 = jSONObject.getLong("voice2DuplicateFileDiskSpace");
                        long j38 = jSONObject.getLong("recordDuplicateFileDiskSpace");
                        jx3.f.INSTANCE.d(25355, has ? "DuplicateFileDaily-v3" : "DuplicateFileDaily-v2", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(jSONObject.getLong("allDuplicatedFileSize")), java.lang.Long.valueOf(jSONObject.getInt("fileSizeRatio")), java.lang.Long.valueOf(jSONObject.getLong("openapiDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("attachmentDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("emulatedDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("favoriteDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("allDuplicatedDiskSpace")), java.lang.Long.valueOf(jSONObject.getInt("fileDiskSpaceRatio")), java.lang.Long.valueOf(jSONObject.getLong("downloadDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("otherDuplicateFileDiskSpace")), java.lang.Long.valueOf(jSONObject.getLong("wechatTotalSize")), java.lang.Long.valueOf(jSONObject.getInt("fileDiskSpaceWechatRatio")), java.lang.Long.valueOf(jSONObject.getLong("allDuplicatedFileCount")), 0, java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(jSONObject.optLong("duplicateFileTotalSize", -1L)));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreBaseMonitor", "duplicateFileString jsonArray Failed, e = " + e17.getMessage());
                    }
                }
                com.tencent.mm.sdk.platformtools.o4.L().B("report_duplicate_file_report_time", java.lang.System.currentTimeMillis());
            }
        }
        ni3.g2 g2Var2 = this.f337749e;
        synchronized (g2Var2) {
            try {
                long q17 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_report_time", 0L);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                if (currentTimeMillis2 - q17 >= 604800000) {
                    try {
                        if (currentTimeMillis2 % 100 != 0) {
                            com.tencent.mm.sdk.platformtools.o4.L().B("report_freelist_report_time", java.lang.System.currentTimeMillis());
                        } else {
                            long q18 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_EnMicroMsg", -10L);
                            long q19 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_EnMicroMsg_db_file_ratio", -10L);
                            long o17 = com.tencent.mm.sdk.platformtools.o4.L().o("report_freelist_daily_ratio_EnMicroMsg", -10);
                            if (q18 >= 0) {
                                jx3.f.INSTANCE.d(25824, "EnMicroMsg.db", "", 0, 0, java.lang.Long.valueOf(q18), "daily", 0, 0, 0, java.lang.Long.valueOf(q19), 0, 0, java.lang.Long.valueOf(o17));
                            }
                            long q27 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_WxFileIndex", -10L);
                            long q28 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_WxFileIndex_db_file_ratio", -10L);
                            long o18 = com.tencent.mm.sdk.platformtools.o4.L().o("report_freelist_daily_ratio_WxFileIndex", -10);
                            if (q27 >= 0) {
                                jx3.f.INSTANCE.d(25824, "WxFileIndex.db", "", 0, 0, java.lang.Long.valueOf(q27), "daily", 0, 0, 0, java.lang.Long.valueOf(q28), 0, 0, java.lang.Long.valueOf(o18));
                            }
                            g2Var = g2Var2;
                            try {
                                long q29 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_FTS", -10L);
                                long q37 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_FTS_db_file_ratio", -10L);
                                long o19 = com.tencent.mm.sdk.platformtools.o4.L().o("report_freelist_daily_ratio_FTS", -10);
                                if (q29 >= 0) {
                                    j17 = q19;
                                    jx3.f.INSTANCE.d(25824, "FTS5IndexMicroMsg_encrypt.db", "", 0, 0, java.lang.Long.valueOf(q29), "daily", 0, 0, 0, java.lang.Long.valueOf(q37), 0, 0, java.lang.Long.valueOf(o19));
                                } else {
                                    j17 = q19;
                                }
                                long q38 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_NewBiz", -10L);
                                long q39 = com.tencent.mm.sdk.platformtools.o4.L().q("report_freelist_daily_NewBiz_db_file_ratio", -10L);
                                long o27 = com.tencent.mm.sdk.platformtools.o4.L().o("report_freelist_daily_ratio_NewBiz", -10);
                                if (q38 >= 0) {
                                    j18 = o17;
                                    jx3.f.INSTANCE.d(25824, "UnEncryptNewBiz.db", "", 0, 0, java.lang.Long.valueOf(q38), "daily", 0, 0, 0, java.lang.Long.valueOf(q39), 0, 0, java.lang.Long.valueOf(o27));
                                } else {
                                    j18 = o17;
                                }
                                if (q18 >= 0 && q27 >= 0 && q29 >= 0 && q38 >= 0) {
                                    jx3.f.INSTANCE.d(25824, "Total", "", 0, 0, java.lang.Long.valueOf(q18 + q27 + q29 + q38), "daily", 0, 0, 0, java.lang.Long.valueOf((j17 < 0 || q28 < 0 || q37 < 0 || q39 < 0) ? -1L : q39 + j18 + q28 + q37), 0, 0, java.lang.Long.valueOf((j18 < 0 || o18 < 0 || o19 < 0 || o27 < 0) ? -1L : j18 + o18 + o19 + o27));
                                }
                                com.tencent.mm.sdk.platformtools.o4.L().B("report_freelist_report_time", java.lang.System.currentTimeMillis());
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        g2Var = g2Var2;
                    }
                } else {
                    g2Var = g2Var2;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                g2Var = g2Var2;
            }
        }
        com.tencent.mm.vfs.x3.a();
        ni3.g2 g2Var3 = this.f337749e;
        g2Var3.getClass();
        if (gm0.j1.a()) {
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_REPORT_SD_STATUS_TIME_LONG;
            long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis3 - longValue > 259200000 || longValue > currentTimeMillis3) {
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis3));
                ((ku5.t0) ku5.t0.f312615d).h(new ni3.s1(g2Var3), "reportSDStatus");
            }
        }
        ni3.g2 g2Var4 = this.f337749e;
        g2Var4.getClass();
        gm0.j1.i();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_WECHAT_DB_REPORT_LAST_TIME_LONG;
        long longValue2 = ((java.lang.Long) c18.m(u3Var2, 0L)).longValue();
        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
        if (currentTimeMillis4 - longValue2 > g2Var4.f337592q * 60000 || longValue2 > currentTimeMillis4) {
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(currentTimeMillis4));
            ((ku5.t0) ku5.t0.f312615d).h(new ni3.p1(g2Var4, g2Var4.f337584f * 1024 * 1024, g2Var4.f337589n * 1024 * 1024, g2Var4.f337585g, g2Var4.f337586h, g2Var4.f337587i, g2Var4.f337588m), "reportDBInfo");
        }
        ni3.g2.Bi(this.f337749e);
        ni3.g2.Di(this.f337749e);
        ni3.g2.Ni(this.f337749e);
        dr0.m mVar = (dr0.m) ((lh.k) i95.n0.c(lh.k.class));
        mVar.getClass();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            throw new java.lang.UnsupportedOperationException("Call in main proc for now!");
        }
        ((ku5.t0) ku5.t0.f312615d).g(new dr0.f(mVar));
        yv1.b1 b1Var = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
        b1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "tryCreateSecondIndex");
        ((ku5.t0) ku5.t0.f312615d).h(new yv1.z0(b1Var), "MicroMsg.CleanService");
        yv1.b1 b1Var2 = (yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class));
        b1Var2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "tryCreateThirdIndex");
        ((ku5.t0) ku5.t0.f312615d).h(new yv1.a1(b1Var2), "MicroMsg.CleanService");
        fp.r0 r0Var = fp.r0.f265232a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            w55.a aVar = com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageNoSpaceThreshold.f192218a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            aVar.b(context);
        }
        this.f337749e.f337601z.b();
        ((ku5.t0) ku5.t0.f312615d).k(this.f337749e.f337601z, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
