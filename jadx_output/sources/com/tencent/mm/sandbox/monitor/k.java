package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.sandbox.monitor.j f192292a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f192293b = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Runnable f192294c = new com.tencent.mm.sandbox.monitor.i();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f192295d = false;

    public k(int i17) {
        if (i17 == 1) {
            com.tencent.mm.app.p4.a(19);
        }
        if (i17 == 2) {
            com.tencent.mm.app.p4.a(20);
        }
    }

    public static void c(android.content.Context context, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.x2.f193077g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ExceptionMonitor", "manProc standby, skip pulling");
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.sandbox.monitor.CrashUploadAlarmReceiver.class);
        intent.putExtra("use_bugreporter", z17);
        l85.j1.b("MicroMsg.ExceptionMonitor", intent);
        if (jk.b.b(context, 108, intent, fp.g0.a(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING), true) == null) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() + 1800000;
            jk.b.d(context, 108, 0, currentTimeMillis, intent, 0, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "dkcrash startAlarmMgr %d", java.lang.Long.valueOf(currentTimeMillis));
        }
    }

    public void a(android.content.Intent intent) {
        java.lang.String str;
        int c17;
        org.json.JSONObject optJSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "handleCommand()");
        com.tencent.mm.app.p4.a(23);
        if (intent == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = f192293b;
        java.lang.Runnable runnable = f192294c;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 300000L);
        f192295d = true;
        try {
            java.lang.Thread.sleep(200L);
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExceptionMonitor", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "handleCommand");
        intent.getAction();
        try {
            java.lang.String stringExtra = intent.getStringExtra("tag");
            java.lang.String str2 = stringExtra == null ? "exception" : stringExtra;
            com.tencent.mm.app.p4.a(24);
            java.lang.String stringExtra2 = intent.getStringExtra("exceptionProcess");
            if (com.tencent.mm.sdk.platformtools.t8.D0(stringExtra2, "mm")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 11L, 1L, true);
            } else if (com.tencent.mm.sdk.platformtools.t8.D0(stringExtra2, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 12L, 1L, true);
            } else if (com.tencent.mm.sdk.platformtools.t8.D0(stringExtra2, "other")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 13L, 1L, true);
            }
            int intExtra = intent.getIntExtra("exceptionPid", 0);
            intent.getLongExtra("exceptionTime", android.os.SystemClock.elapsedRealtime());
            java.lang.String stringExtra3 = intent.getStringExtra("exceptionMsg");
            java.lang.String stringExtra4 = intent.getStringExtra("userName");
            java.lang.String stringExtra5 = intent.getStringExtra("exceptionPreventPath");
            boolean booleanExtra = intent.getBooleanExtra("exceptionWriteSdcard", true);
            boolean booleanExtra2 = intent.getBooleanExtra("use_bugreporter", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "processName:%s crashPreventPath:%s", stringExtra2, stringExtra5);
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                return;
            }
            if (str2.equals("exception")) {
                java.lang.String stringExtra6 = intent.getStringExtra("fulldump_path");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str3 = new java.lang.String(android.util.Base64.decode(stringExtra3, 2));
                if (stringExtra6 == null || !stringExtra6.endsWith(".fulldmp")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "fulldmp is null");
                    if (booleanExtra2) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(str3);
                            if (jSONObject.has(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN) && (optJSONObject = jSONObject.optJSONObject(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN)) != null && optJSONObject.has("patchid")) {
                                java.lang.String optString = optJSONObject.optString("patchid", "");
                                if (!optString.isEmpty() && !optString.equals(com.tencent.mm.app.MMCrashReportContents.f53236b)) {
                                    com.tencent.mm.app.l0.c(optString);
                                }
                            }
                        } catch (java.lang.Exception unused) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "tryDealJavaCrashHashNew failed");
                        }
                        stringExtra3 = android.util.Base64.encodeToString(kk.y.a(str3.getBytes()), 2);
                    } else {
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (stringExtra3.contains("#[jni_crash]")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "tryDealCrashHash jni crash");
                        } else {
                            java.lang.String str4 = new java.lang.String(android.util.Base64.decode(stringExtra3, 2));
                            int indexOf = str4.indexOf(com.tencent.mm.app.MMCrashReportContents.f53234a);
                            java.lang.String a17 = indexOf > 0 ? com.tencent.mm.app.l0.a(str4.substring(indexOf + 14)) : "";
                            if (!a17.isEmpty()) {
                                java.lang.String encodeToString = android.util.Base64.encodeToString(str4.replaceAll(com.tencent.mm.app.MMCrashReportContents.f53236b, a17).getBytes(), 2);
                                com.tencent.mm.app.l0.c(a17);
                                stringExtra3 = encodeToString;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "tryDealCrashHash cost: %s ms hash:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2), a17);
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "append fulldmp %s", stringExtra6);
                    if (booleanExtra2) {
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str3);
                            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                            rp.i.c(jSONObject2, stringExtra6);
                            jSONObject2.putOpt("parseFullDump", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis3));
                            stringExtra3 = android.util.Base64.encodeToString(kk.y.a(jSONObject2.toString().getBytes()), 2);
                        } catch (java.lang.Exception e18) {
                            stringExtra3 = android.util.Base64.encodeToString(kk.y.a(str3.getBytes()), 2);
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExceptionMonitor", e18, "parseFullDumpToJSON failed", new java.lang.Object[0]);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "appendFullDumpForJniCrash cost:%d useBugReporter:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Boolean.valueOf(booleanExtra2));
                str = stringExtra6;
            } else {
                str = null;
            }
            java.lang.String str5 = stringExtra3;
            com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "noteReportedPid: " + intExtra + ", tag=" + str2);
            mm.g0.e(str2, intExtra);
            com.tencent.mm.app.p4.a(25);
            if (!booleanExtra2) {
                if (com.tencent.mm.sandbox.monitor.f.d(stringExtra4, str2, new com.tencent.mm.sandbox.monitor.ErrLog$Error(stringExtra4, str2, com.tencent.mm.sdk.platformtools.t8.i1(), str5, booleanExtra), stringExtra5, str, false) == 0) {
                    c(com.tencent.mm.sdk.platformtools.x2.f193071a, false);
                    return;
                }
                return;
            }
            com.tencent.mm.sandbox.monitor.ErrLog$Error errLog$Error = new com.tencent.mm.sandbox.monitor.ErrLog$Error(stringExtra4, str2, com.tencent.mm.sdk.platformtools.t8.i1(), "json_" + str5, booleanExtra);
            java.lang.String str6 = com.tencent.mm.sandbox.monitor.m.f192302a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(errLog$Error.toString())) {
                c17 = -1;
            } else {
                java.lang.String str7 = com.tencent.mm.sandbox.monitor.m.f192302a;
                java.io.File file = new java.io.File(str7);
                if (!file.exists()) {
                    file.mkdir();
                }
                java.lang.String str8 = str7 + stringExtra4 + "." + str2 + "." + java.lang.System.currentTimeMillis() + ".crashlog";
                com.tencent.mars.xlog.Log.i("MicroMsg.MMBugReporter", "crash:[%s] len:[%d]", str8, java.lang.Integer.valueOf(errLog$Error.toString().length()));
                if (errLog$Error.f192278i) {
                    java.io.File file2 = new java.io.File(lp0.b.a());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    java.io.File[] listFiles = file2.listFiles();
                    if (listFiles != null) {
                        for (java.io.File file3 : listFiles) {
                            long lastModified = file3.lastModified();
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            if (java.lang.System.currentTimeMillis() - lastModified > 604800000) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.MMBugReporter", "dealWithSdcardCrash del old file: %s", file3.getPath());
                                file3.delete();
                            }
                        }
                    }
                    java.lang.String str9 = lp0.b.a() + "crash_" + new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(new java.util.Date()) + ".txt";
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMBugReporter", "dealWithSdcardCrash %s", str9);
                    com.tencent.mm.sandbox.monitor.m.b(str9, errLog$Error);
                }
                com.tencent.mm.sandbox.monitor.m.b(str8, errLog$Error);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                    com.tencent.mm.sandbox.monitor.o.b(stringExtra5);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMBugReporter", "delete prevent " + stringExtra5);
                }
                if (str != null && str.endsWith(".fulldmp")) {
                    com.tencent.mm.sandbox.monitor.o.b(str);
                    com.tencent.mm.sandbox.monitor.o.b(str.replace(".fulldmp", ".dmp"));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMBugReporter", "delete jniFullDump ".concat(str));
                }
                c17 = com.tencent.mm.sandbox.monitor.m.c(stringExtra4, str2, str8);
            }
            if (c17 == 0) {
                c(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExceptionMonitor", e19, "", new java.lang.Object[0]);
        }
    }

    public void b(com.tencent.mm.sandbox.monitor.j jVar) {
        f192292a = jVar;
        q65.d.a(hashCode(), this);
        com.tencent.mm.sdk.platformtools.n3 n3Var = f192293b;
        java.lang.Runnable runnable = f192294c;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 300000L);
        f192295d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExceptionMonitor", "onCreate");
    }
}
