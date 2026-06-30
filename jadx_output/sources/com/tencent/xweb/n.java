package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f220341a = {"ppt", "pptx", "xls", "xlsx", "doc", "docx", "wps", "et", "dps", "pdf", "txt", "mp3", "m4a", "wav", "aac"};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f220342b = {"mp3", "m4a", "wav", "aac"};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f220343c = {"ppt", "pptx", "xls", "xlsx", "doc", "docx", "wps", "et", "dps"};

    public static int a(cy5.y yVar, boolean z17, int i17) {
        if (yVar == null) {
            by5.c4.c("XFilesReaderHelper", "canExplicitInstall error, readerPlugin is null");
            return -1;
        }
        by5.c4.f("XFilesReaderHelper", "canExplicitInstall plugin:" + yVar.m() + ", curVersion: " + yVar.f224879a + ", require: " + i17 + ", embedVersion: -1, canTryEmbed: false, canExplicitDownload: " + z17);
        if (com.tencent.xweb.g2.a()) {
            by5.c4.f("XFilesReaderHelper", "canExplicitInstall forbid download code");
            by5.c4.f("XFilesReaderHelper", "canExplicitInstall no embed");
            return -2;
        }
        if (z17) {
            by5.c4.f("XFilesReaderHelper", "canExplicitInstall can download");
            return 1;
        }
        by5.c4.f("XFilesReaderHelper", "canExplicitInstall can not explicit download");
        by5.c4.f("XFilesReaderHelper", "canExplicitInstall no embed");
        return -3;
    }

    public static java.lang.String b(int i17) {
        return i17 == 40 ? "hardcode" : i17 == 41 ? "force" : i17 == 42 ? "cmd" : i17 == 43 ? "xfile_recent_crash" : i17 == 44 ? "xfile_forbid_download" : i17 == 45 ? "xfile_not_installed" : i17 == 46 ? "xfile_too_old" : i17 == 47 ? "xfile_not_support" : i17 == 48 ? "xfile_context_error" : i17 == 49 ? "xfile_inner_error" : i17 == 50 ? "miniqb_error" : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }

    public static void c(android.content.Intent intent, int i17) {
        if (intent != null) {
            intent.putExtra("open_x5_from_scene", i17);
        }
    }

    public static long d(android.content.Context context) {
        by5.c4.f("XFilesReaderHelper", "getCurrentProcessMemory start");
        try {
            if (context == null) {
                by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory failed, context is null");
                return 0L;
            }
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (activityManager == null) {
                by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory failed, activityManager is null");
                return 0L;
            }
            android.os.Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{android.os.Process.myPid()});
            if (processMemoryInfo != null && processMemoryInfo.length > 0) {
                long totalPrivateClean = (processMemoryInfo[0].getTotalPrivateClean() + processMemoryInfo[0].getTotalPrivateDirty()) / 1024;
                by5.c4.f("XFilesReaderHelper", "getCurrentProcessMemory " + totalPrivateClean);
                return totalPrivateClean;
            }
            by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory failed, memoryInfo is empty");
            return 0L;
        } catch (java.lang.Throwable th6) {
            by5.c4.c("XFilesReaderHelper", "getCurrentProcessMemory error, msg:" + th6.getMessage());
            return 0L;
        }
    }

    public static int e(java.util.HashMap hashMap) {
        try {
            if (hashMap == null) {
                by5.c4.c("XFilesReaderHelper", "getOpenFileFrom failed, extra params is null");
                return 0;
            }
            java.lang.String str = (java.lang.String) hashMap.get("extra_param_open_file_from");
            if (str != null && !str.isEmpty()) {
                return java.lang.Integer.parseInt(str);
            }
            by5.c4.c("XFilesReaderHelper", "getOpenFileFrom failed, strScene is empty");
            return 0;
        } catch (java.lang.Exception e17) {
            by5.c4.c("XFilesReaderHelper", "getOpenFileFrom error: " + e17.getMessage());
            return 0;
        }
    }

    public static int f(java.util.HashMap hashMap) {
        try {
            if (hashMap == null) {
                by5.c4.c("XFilesReaderHelper", "getOpenFileScene failed, extra params is null");
                return 0;
            }
            java.lang.String str = (java.lang.String) hashMap.get("extra_param_open_file_scene");
            if (str != null && !str.isEmpty()) {
                return java.lang.Integer.parseInt(str);
            }
            by5.c4.c("XFilesReaderHelper", "getOpenFileScene failed, strScene is empty");
            return 0;
        } catch (java.lang.Exception e17) {
            by5.c4.c("XFilesReaderHelper", "getOpenFileScene error: " + e17.getMessage());
            return 0;
        }
    }

    public static cy5.h g(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.equalsIgnoreCase("ppt") || str.equalsIgnoreCase("pptx") || str.equalsIgnoreCase("dps")) {
            return j(str, true) ? cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE) : cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT);
        }
        if (str.equalsIgnoreCase("pdf")) {
            return cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF);
        }
        if (str.equalsIgnoreCase("doc") || str.equalsIgnoreCase("docx") || str.equalsIgnoreCase("wps")) {
            return j(str, true) ? cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE) : cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD);
        }
        if (str.equalsIgnoreCase("xls") || str.equalsIgnoreCase("xlsx") || str.equalsIgnoreCase("et")) {
            return j(str, true) ? cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE) : cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL);
        }
        if (str.equalsIgnoreCase("txt")) {
            return cy5.m.d(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT);
        }
        return null;
    }

    public static com.tencent.xweb.k h(java.lang.String str, boolean z17, android.content.Intent intent) {
        boolean z18;
        int a17;
        c(intent, 40);
        com.tencent.xweb.k kVar = com.tencent.xweb.k.X5;
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "getReaderType fileExt is empty, use x5");
            return kVar;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.xweb.c z19 = com.tencent.xweb.c.z();
        com.tencent.xweb.k y17 = z19.y(lowerCase, z19.A());
        by5.c4.f("XFilesReaderHelper", "getReaderType cmd type: " + y17.toString());
        c(intent, 42);
        if (y17 == kVar) {
            by5.c4.f("XFilesReaderHelper", "getReaderType use x5");
            return kVar;
        }
        if (!lowerCase.isEmpty()) {
            java.lang.String[] strArr = f220341a;
            for (int i17 = 0; i17 < 15; i17++) {
                if (lowerCase.equalsIgnoreCase(strArr[i17])) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!z18) {
            by5.c4.f("XFilesReaderHelper", "getReaderType not support " + lowerCase + ", use x5");
            c(intent, 47);
            return kVar;
        }
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        android.content.SharedPreferences e17 = by5.d4.e();
        if (!(e17 == null ? false : e17.getBoolean("fr_disable_crash_detect", false)) && com.tencent.xweb.g.a(lowerCase)) {
            by5.c4.f("XFilesReaderHelper", "getReaderType recent crashed, use x5");
            c(intent, 43);
            return kVar;
        }
        boolean k17 = k(lowerCase);
        com.tencent.xweb.k kVar2 = com.tencent.xweb.k.XWEB;
        if (k17) {
            by5.c4.f("XFilesReaderHelper", "getReaderType is supported audio file, use xweb");
            return kVar2;
        }
        if (!z17) {
            by5.c4.f("XFilesReaderHelper", "getReaderType skip check plugin, use xweb");
            return kVar2;
        }
        cy5.h g17 = g(lowerCase);
        if (!(g17 instanceof cy5.y)) {
            by5.c4.f("XFilesReaderHelper", "getReaderType can not find plugin, not support " + lowerCase + ", use x5");
            c(intent, 47);
            return kVar;
        }
        cy5.y yVar = (cy5.y) g17;
        int f17 = yVar.f(true);
        int C = yVar.C(0);
        if ((f17 > 0 && f17 >= C) || (a17 = a(yVar, com.tencent.xweb.c.z().v(true), C)) > 0) {
            by5.c4.f("XFilesReaderHelper", "getReaderType version support, use xweb");
            return kVar2;
        }
        by5.c4.f("XFilesReaderHelper", "getReaderType can not explicit install, use x5");
        if (a17 == -2) {
            c(intent, 44);
        } else if (a17 == -3) {
            c(intent, f17 <= 0 ? 45 : 46);
        }
        return kVar;
    }

    public static com.tencent.xweb.l i(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "getReportTarget fileExt is null");
            return null;
        }
        if (str.equalsIgnoreCase("ppt")) {
            return new com.tencent.xweb.l(j(str, false) ? 1880 : 1068, false);
        }
        if (str.equalsIgnoreCase("pptx")) {
            return new com.tencent.xweb.l(j(str, false) ? 1880 : 1068, true);
        }
        if (str.equalsIgnoreCase("xls")) {
            return new com.tencent.xweb.l(j(str, false) ? 1879 : 1070, false);
        }
        if (str.equalsIgnoreCase("xlsx")) {
            return new com.tencent.xweb.l(j(str, false) ? 1879 : 1070, true);
        }
        if (str.equalsIgnoreCase("doc")) {
            return new com.tencent.xweb.l(j(str, false) ? 1891 : 1069, false);
        }
        if (str.equalsIgnoreCase("docx")) {
            return new com.tencent.xweb.l(j(str, false) ? 1891 : 1069, true);
        }
        if (str.equalsIgnoreCase("pdf")) {
            return new com.tencent.xweb.l(1071, false);
        }
        if (str.equalsIgnoreCase("txt")) {
            return new com.tencent.xweb.l(1889, false);
        }
        if (k(str)) {
            return new com.tencent.xweb.l(1900, false);
        }
        return null;
    }

    public static boolean j(java.lang.String str, boolean z17) {
        com.tencent.xweb.m b17 = com.tencent.xweb.t0.f220594a.b(str);
        if (z17) {
            by5.c4.f("XFilesReaderHelper", "getUseOfficeReader force = " + b17.toString());
        }
        if (b17 == com.tencent.xweb.m.none) {
            com.tencent.xweb.c z18 = com.tencent.xweb.c.z();
            z18.getClass();
            b17 = z18.x(str, org.xwalk.core.XWalkEnvironment.m("tools"));
            if (z17) {
                by5.c4.f("XFilesReaderHelper", "getUseOfficeReader cmd = " + b17.toString());
            }
        }
        return b17 != com.tencent.xweb.m.no;
    }

    public static boolean k(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            java.lang.String[] strArr = f220342b;
            for (int i17 = 0; i17 < 4; i17++) {
                if (str.equalsIgnoreCase(strArr[i17])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void l(java.lang.String str, int i17, java.lang.String str2, java.lang.Throwable th6) {
        if (str == null || str.isEmpty() || str2 == null || th6 == null) {
            by5.c4.c("XFilesReaderHelper", "reportException wrong param");
            return;
        }
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th6.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.lang.String stringWriter2 = stringWriter.toString();
            java.lang.String str3 = "empty";
            if (stringWriter2.isEmpty()) {
                stringWriter2 = "empty";
            }
            java.lang.String replace = stringWriter2.substring(0, java.lang.Math.min(stringWriter2.length(), 1000)).replace(',', ' ').replace(':', ' ');
            java.lang.String str4 = str2 + " " + th6.getMessage();
            if (!str4.isEmpty()) {
                str3 = str4;
            }
            java.lang.String str5 = i17 + "," + str + "," + replace + "," + str3.substring(0, java.lang.Math.min(str3.length(), 1000)).replace(',', ' ').replace(':', ' ');
            by5.c4.b("XFilesReaderHelper", "reportException kv key:17565, val:" + str5);
            by5.s0.t(17565, str5);
        } catch (java.lang.Throwable th7) {
            by5.c4.d("XFilesReaderHelper", "reportException error", th7);
        }
    }

    public static long m(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportFileSize param is null");
            return 0L;
        }
        java.lang.String lowerCase = str2.toLowerCase();
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            by5.c4.c("XFilesReaderHelper", "reportFileSize file not exist");
            return 0L;
        }
        long length = file.length() / 1048576;
        if (length == 0) {
            length++;
        }
        java.lang.String str3 = (lowerCase.length() > 50 ? lowerCase.substring(0, 50) : lowerCase) + "," + length;
        by5.c4.b("XFilesReaderHelper", "reportFileSize kv key:17562, val:" + str3);
        by5.s0.t(17562, str3);
        com.tencent.xweb.l i17 = i(lowerCase);
        if (i17 == null) {
            by5.c4.b("XFilesReaderHelper", "reportFileSize idkey skip ".concat(lowerCase));
            return length;
        }
        boolean z17 = i17.f220327b;
        int i18 = length <= 10 ? z17 ? 24 : 20 : length <= 20 ? z17 ? 25 : 21 : length <= 50 ? z17 ? 26 : 22 : z17 ? 27 : 23;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportFileSize idkey id:");
        int i19 = i17.f220326a;
        sb6.append(i19);
        sb6.append(", key:");
        sb6.append(i18);
        by5.c4.b("XFilesReaderHelper", sb6.toString());
        by5.s0.e(i19, i18, 1L);
        return length;
    }

    public static void n(java.lang.String str, int i17) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportIDKeyByFileExt param is null");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.xweb.l i18 = i(lowerCase);
        if (i18 == null) {
            by5.c4.b("XFilesReaderHelper", "reportIDKeyByFileExt skip " + lowerCase);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportIDKeyByFileExt id:");
        int i19 = i18.f220326a;
        sb6.append(i19);
        sb6.append(", key:");
        sb6.append(i17);
        by5.c4.b("XFilesReaderHelper", sb6.toString());
        by5.s0.e(i19, i17, 1L);
    }

    public static void o(com.tencent.xweb.j jVar) {
        if (jVar == null) {
            by5.c4.c("XFilesReaderHelper", "reportOpenFile failed, data is null");
            return;
        }
        java.lang.String str = "android," + jVar.f220302a + "," + jVar.f220303b + "," + jVar.f220304c + "," + jVar.f220305d + "," + jVar.f220306e + "," + jVar.f220307f + "," + jVar.f220308g + "," + jVar.f220309h;
        if (str == null || str.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportOpenFile failed, reportVal is empty");
        } else {
            by5.c4.f("XFilesReaderHelper", "reportOpenFile kv key:25414, val:".concat(str));
            by5.s0.t(25414, str);
        }
    }

    public static void p(com.tencent.xweb.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        if (jVar == null) {
            by5.c4.c("XFilesReaderHelper", "reportOpenFileRet failed, data is null");
            return;
        }
        java.lang.String str3 = jVar.f220314m;
        if (str3 != null && !str3.isEmpty()) {
            try {
                str = str3.substring(0, java.lang.Math.min(str3.length(), 150)).replace(',', ' ').replace(':', ' ');
            } catch (java.lang.Throwable th6) {
                by5.c4.c("XFilesReaderHelper", "getSafeMsg error: " + th6.getMessage());
            }
            str2 = "android," + jVar.f220302a + "," + jVar.f220303b + "," + jVar.f220304c + "," + jVar.f220305d + "," + jVar.f220306e + "," + jVar.f220307f + "," + jVar.f220308g + "," + jVar.f220309h + "," + jVar.f220310i + "," + jVar.f220311j + "," + jVar.f220312k + "," + jVar.f220313l + "," + str + "," + jVar.f220315n;
            if (str2 != null || str2.isEmpty()) {
                by5.c4.c("XFilesReaderHelper", "reportOpenFileRet failed, reportVal is empty");
            } else {
                by5.c4.f("XFilesReaderHelper", "reportOpenFileRet kv key:25415, val:".concat(str2));
                by5.s0.t(25415, str2);
                return;
            }
        }
        str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        str2 = "android," + jVar.f220302a + "," + jVar.f220303b + "," + jVar.f220304c + "," + jVar.f220305d + "," + jVar.f220306e + "," + jVar.f220307f + "," + jVar.f220308g + "," + jVar.f220309h + "," + jVar.f220310i + "," + jVar.f220311j + "," + jVar.f220312k + "," + jVar.f220313l + "," + str + "," + jVar.f220315n;
        if (str2 != null) {
        }
        by5.c4.c("XFilesReaderHelper", "reportOpenFileRet failed, reportVal is empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.StringBuilder] */
    public static void q(java.lang.String str, java.lang.String str2) {
        char c17;
        int i17;
        ?? r76;
        java.lang.String str3;
        boolean z17;
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            by5.c4.c("XFilesReaderHelper", "reportPVUV param is null");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.xweb.l i18 = i(lowerCase);
        if (i18 == null) {
            by5.c4.b("XFilesReaderHelper", "reportPVUV skip " + lowerCase + ", " + str2);
            return;
        }
        boolean equalsIgnoreCase = "XWEB".equalsIgnoreCase(str2);
        boolean z18 = i18.f220327b;
        if (equalsIgnoreCase) {
            r76 = z18;
            i17 = z18 ? 3 : 2;
        } else {
            if ("X5".equalsIgnoreCase(str2)) {
                c17 = z18 ? (char) 5 : (char) 4;
                i17 = z18 ? 7 : 6;
            } else if ("QQBROWSER".equalsIgnoreCase(str2)) {
                c17 = z18 ? (char) 17 : (char) 16;
                i17 = z18 ? 19 : 18;
            } else if (!"THIRDAPP".equalsIgnoreCase(str2)) {
                by5.c4.c("XFilesReaderHelper", "reportPVUV unknown type, skip");
                return;
            } else {
                c17 = z18 ? '\t' : '\b';
                i17 = z18 ? 11 : 10;
            }
            r76 = c17;
        }
        try {
            str3 = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        } catch (java.lang.Throwable th6) {
            by5.c4.c("XFilesReaderHelper", "reportPVUV get cur date error: " + th6.getMessage());
            str3 = "";
        }
        java.lang.String str4 = lowerCase + "_" + str2 + "__report_uv_date";
        android.content.SharedPreferences b17 = by5.d4.b();
        if (b17 != null) {
            z17 = !b17.getString(str4, "").equals(str3);
        } else {
            by5.c4.c("XFilesReaderHelper", "reportPVUV sp is null, skip uv report");
            z17 = false;
        }
        ?? sb6 = new java.lang.StringBuilder("reportPV id:");
        int i19 = i18.f220326a;
        sb6.append(i19);
        sb6.append(", key:");
        sb6.append(r76);
        by5.c4.b("XFilesReaderHelper", sb6.toString());
        by5.s0.e(i19, (long) r76, 1L);
        if (z17) {
            by5.c4.b("XFilesReaderHelper", "reportUV id:" + i19 + ", key:" + i17);
            by5.s0.e((long) i19, (long) i17, 1L);
            android.content.SharedPreferences.Editor edit = b17.edit();
            if (edit == null) {
                by5.c4.c("XFilesReaderHelper", "reportPVUV editor is null, skip");
            } else {
                edit.putString(str4, str3);
                edit.commit();
            }
        }
    }

    public static void r(java.lang.String str, int i17, int i18, android.content.Context context, com.tencent.xweb.j jVar) {
        java.lang.String str2;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        java.lang.String str3;
        java.lang.String str4;
        if (jVar != null) {
            if (i18 == 0) {
                str4 = ya.b.SUCCESS;
            } else if (i18 == -1) {
                str4 = "forbid_download_code";
            } else if (i18 == -2) {
                str4 = "plugin_not_installed";
            } else if (i18 == -3) {
                str4 = "invoke_error";
            } else if (i18 == -4) {
                str4 = "init_error";
            } else if (i18 == -5) {
                str4 = "wrong_param";
            } else if (i18 == -6) {
                str4 = "file_not_exist";
            } else if (i18 == -7) {
                str4 = "file_not_support";
            } else if (i18 == -8) {
                str4 = "task_exist";
            } else if (i18 == -9) {
                str4 = "task_prepare_error";
            } else if (i18 == -10) {
                str4 = "task_run_error";
            } else if (i18 == -11) {
                str4 = "version_too_old";
            } else if (i18 == -12) {
                str4 = "password_error";
            } else if (i18 == -13) {
                str4 = "so_error";
            } else if (i18 == -14) {
                str4 = "view_destroy";
            } else {
                if (i18 == -15) {
                    str4 = "download_cancel";
                } else if (i18 == -18) {
                    str4 = "download_start_failed";
                } else if (i18 == -19) {
                    str4 = "download_no_network";
                    str3 = str4;
                    str2 = "XFilesReaderHelper";
                    i27 = -1;
                    i19 = -2;
                    i28 = -3;
                    i29 = -4;
                    jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                    p(jVar);
                } else if (i18 == -20) {
                    str4 = "download_no_need_to_fetch_config";
                    str3 = str4;
                    str2 = "XFilesReaderHelper";
                    i27 = -1;
                    i19 = -2;
                    i28 = -3;
                    i29 = -4;
                    jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                    p(jVar);
                } else {
                    if (i18 == -21) {
                        str4 = "download_others_is_updating";
                    } else if (i18 == -22) {
                        str4 = "download_config_download_failed";
                    } else if (i18 == -23) {
                        str4 = "download_config_parse_failed";
                    } else if (i18 == -24) {
                        str4 = "download_no_plugin_in_config";
                    } else if (i18 == -25) {
                        str4 = "download_no_available_update";
                    } else if (i18 == -26) {
                        str4 = "download_plugin_update_error";
                    } else if (i18 == -27) {
                        str4 = "download_plugin_only_download_error";
                    } else if (i18 == -28) {
                        str4 = "download_plugin_only_install_error";
                    } else if (i18 == -17) {
                        str4 = "disable_password";
                    } else {
                        by5.c4.c("XFilesReaderHelper", "convertXWebErrorCodeToMsg unknown code: " + i18);
                        str3 = com.eclipsesource.mmv8.Platform.UNKNOWN;
                        str2 = "XFilesReaderHelper";
                        i27 = -1;
                        i19 = -2;
                        i28 = -3;
                        i29 = -4;
                        jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                        p(jVar);
                    }
                    str3 = str4;
                    str2 = "XFilesReaderHelper";
                    i27 = -1;
                    i19 = -2;
                    i28 = -3;
                    i29 = -4;
                    jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                    p(jVar);
                }
                str3 = str4;
                str2 = "XFilesReaderHelper";
                i27 = -1;
                i19 = -2;
                i28 = -3;
                i29 = -4;
                jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
                p(jVar);
            }
            str3 = str4;
            str2 = "XFilesReaderHelper";
            i27 = -1;
            i19 = -2;
            i28 = -3;
            i29 = -4;
            jVar.a(d(context), java.lang.System.currentTimeMillis(), i18, str3);
            p(jVar);
        } else {
            str2 = "XFilesReaderHelper";
            i19 = -2;
            i27 = -1;
            i28 = -3;
            i29 = -4;
        }
        if (str == null || str.isEmpty()) {
            by5.c4.c(str2, "reportXWebErrorCode param is null");
            return;
        }
        if (i18 == 0) {
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        com.tencent.xweb.l i38 = i(lowerCase);
        if (i38 == null) {
            by5.c4.b(str2, "reportXWebErrorCode skip " + lowerCase);
            return;
        }
        java.lang.String str5 = i17 + "," + lowerCase + "," + i18 + ",xweb";
        by5.c4.b(str2, "reportXWebErrorCode kv key:17566, val:" + str5);
        by5.s0.t(17566, str5);
        int i39 = i38.f220327b ? 13 : 12;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportXWebErrorCode first idkey id:");
        int i47 = i38.f220326a;
        sb6.append(i47);
        sb6.append(", key:");
        sb6.append(i39);
        by5.c4.b(str2, sb6.toString());
        long j17 = i47;
        by5.s0.e(j17, i39, 1L);
        if (i18 == i27) {
            i37 = 151;
        } else if (i18 == i19) {
            i37 = 152;
        } else if (i18 == i28) {
            i37 = com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS;
        } else if (i18 == i29) {
            i37 = 154;
        } else if (i18 == -5) {
            i37 = 155;
        } else if (i18 == -6) {
            i37 = 156;
        } else if (i18 == -7) {
            i37 = 157;
        } else if (i18 == -8) {
            i37 = 158;
        } else if (i18 == -9) {
            i37 = com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX;
        } else if (i18 == -10) {
            i37 = 160;
        } else if (i18 == -11) {
            i37 = 161;
        } else if (i18 == -12) {
            i37 = 162;
        } else if (i18 == -13) {
            i37 = 163;
        } else if (i18 == -14) {
            i37 = 164;
        } else if (i18 == -15) {
            i37 = 165;
        } else if (i18 == -18 || i18 == -19 || i18 == -20 || i18 == -21 || i18 == -22 || i18 == -23 || i18 == -24 || i18 == -25 || i18 == -26 || i18 == -27 || i18 == -28) {
            i37 = 166;
        } else {
            if (i18 != -17) {
                by5.c4.c(str2, "reportXWebErrorCode idkey unknown ret: " + i18);
                return;
            }
            i37 = com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
        }
        by5.c4.b(str2, "reportXWebErrorCode second idkey id:" + i47 + ", key:" + i37);
        by5.s0.e(j17, (long) i37, 1L);
    }
}
