package qx5;

/* loaded from: classes13.dex */
public abstract class u {
    public static void a(android.content.Context context, java.lang.String str, boolean z17, boolean z18, android.webkit.ValueCallback valueCallback) {
        cy5.p pVar = new cy5.p();
        qx5.r rVar = new qx5.r(str, z17, context, pVar, z18, valueCallback);
        pVar.f224893a = str;
        pVar.f224894b = rVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("UpdaterCheckType", "1");
        pVar.c(context, hashMap);
    }

    public static boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equalsIgnoreCase(str) || android.text.TextUtils.isEmpty(str)) {
            by5.a1.g(context, "开始检测所有插件更新", false);
            by5.l0.W(true);
            zx5.p.Z().S();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", str2);
            cy5.t tVar = new cy5.t();
            tVar.n(hashMap, "", null);
            tVar.e(new java.lang.String[0]);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO.equalsIgnoreCase(str)) {
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO, z17, false, null);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equalsIgnoreCase(str)) {
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF, z17, false, null);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equalsIgnoreCase(str)) {
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT, z17, false, null);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equalsIgnoreCase(str)) {
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD, z17, false, null);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equalsIgnoreCase(str)) {
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL, z17, false, null);
        } else if (com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equalsIgnoreCase(str)) {
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE, z17, false, null);
        } else {
            if (!com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equalsIgnoreCase(str)) {
                by5.a1.g(context, "检测插件更新失败，参数错误", z17);
                return false;
            }
            a(context, com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT, z17, false, null);
        }
        return true;
    }

    public static boolean c(java.lang.String str, com.tencent.xweb.m mVar) {
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        java.lang.String[] strArr = (str == null || str.isEmpty() || com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL.equalsIgnoreCase(str)) ? com.tencent.xweb.n.f220343c : new java.lang.String[]{str};
        java.lang.String j17 = u0Var.j(strArr, mVar);
        by5.c4.f("XWebDebugPluginHelper", "forceUseOfficeReader, result:" + j17 + ", useOfficeReader:" + mVar + ", ext:" + str);
        if (j17.isEmpty()) {
            return false;
        }
        com.tencent.xweb.g.d(strArr);
        return true;
    }

    public static java.lang.String d() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n\n>>>>>> plugin info start >>>>>>\n plugin config url = ");
        sb6.append(by5.e4.b());
        sb6.append("\n plugin config period(minutes) = ");
        sb6.append(by5.e4.c() / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        sb6.append("\n\n plugin version:");
        java.util.Iterator it = ((java.util.ArrayList) cy5.m.b()).iterator();
        while (it.hasNext()) {
            cy5.h hVar = (cy5.h) it.next();
            if (hVar != null) {
                sb6.append("\n ");
                sb6.append(hVar.m());
                sb6.append(" = ");
                sb6.append(hVar.f(true));
            }
        }
        sb6.append("\n\n plugin commands:");
        com.tencent.xweb.c z17 = com.tencent.xweb.c.z();
        z17.getClass();
        try {
            str = z17.d();
        } catch (java.lang.Throwable th6) {
            by5.c4.d("CommandCfgPlugin", "getAbstractInfo error", th6);
            str = "";
        }
        if (str == null || str.isEmpty()) {
            sb6.append("\n null\n");
        } else {
            sb6.append("\n");
            sb6.append(str);
        }
        sb6.append("\n\n xfiles setting:\n disable cache = ");
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        android.content.SharedPreferences e17 = by5.d4.e();
        sb6.append(e17 == null ? false : e17.getBoolean("fr_disable_cache", false));
        sb6.append("\n disable crash detect = ");
        android.content.SharedPreferences e18 = by5.d4.e();
        sb6.append(e18 == null ? false : e18.getBoolean("fr_disable_crash_detect", false));
        sb6.append("\n\n plugin scheduler:");
        java.util.Iterator it6 = ((java.util.ArrayList) cy5.m.b()).iterator();
        while (it6.hasNext()) {
            cy5.h hVar2 = (cy5.h) it6.next();
            if (hVar2 != null) {
                cy5.a a17 = cy5.b.a(hVar2.m());
                sb6.append("\n ");
                sb6.append(a17.c());
            }
        }
        cy5.a aVar = new cy5.a("");
        sb6.append("\n plugin update match gap backward(update speed) = ");
        sb6.append(aVar.d(aVar.f(false)));
        sb6.append("\n plugin update match gap forward(提前更新) = ");
        sb6.append(aVar.d(aVar.f(true)));
        sb6.append(e());
        sb6.append("\n<<<<<< plugin info end <<<<<<\n");
        return "" + sb6.toString();
    }

    public static java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n\n file reader type:");
        java.lang.String[] strArr = com.tencent.xweb.n.f220341a;
        for (int i17 = 0; i17 < 15; i17++) {
            java.lang.String str = strArr[i17];
            sb6.append("\n ");
            sb6.append(str);
            sb6.append(":  cmd-tools-");
            sb6.append(com.tencent.xweb.c.z().y(str, "tools"));
            sb6.append("  cmd-appbrand-");
            sb6.append(com.tencent.xweb.c.z().y(str, "appbrand"));
        }
        sb6.append("\n\n use office reader:");
        java.lang.String[] strArr2 = com.tencent.xweb.n.f220343c;
        for (int i18 = 0; i18 < 9; i18++) {
            java.lang.String str2 = strArr2[i18];
            sb6.append("\n ");
            sb6.append(str2);
            sb6.append(": force-");
            sb6.append(com.tencent.xweb.t0.f220594a.b(str2));
            sb6.append("  cmd-tools-");
            sb6.append(com.tencent.xweb.c.z().x(str2, "tools"));
            sb6.append("  cmd-appbrand-");
            sb6.append(com.tencent.xweb.c.z().x(str2, "appbrand"));
            sb6.append("  cmd-mm-");
            sb6.append(com.tencent.xweb.c.z().x(str2, "mm"));
        }
        return sb6.toString();
    }

    public static boolean f(android.content.Context context, java.lang.String str, boolean z17, boolean z18, android.webkit.ValueCallback valueCallback) {
        java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory().getPath());
        if (file.listFiles() == null) {
            android.widget.Toast.makeText(context, "请确认应用权限，在权限管理打开应用的读写存储权限", 0).show();
            valueCallback.onReceiveValue(java.lang.Boolean.FALSE);
            return false;
        }
        cy5.h d17 = cy5.m.d(str);
        if (d17 == null) {
            android.widget.Toast.makeText(context, "找不到对应插件", 0).show();
            valueCallback.onReceiveValue(java.lang.Boolean.FALSE);
            return false;
        }
        java.lang.String str2 = com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO.equals(str) ? "xweb_fullscreen_video.js" : com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PPT.equals(str) ? "xfiles_ppt_reader.zip" : com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_PDF.equals(str) ? z18 ? "xfiles_pdf_reader_arm64.zip" : "xfiles_pdf_reader_arm.zip" : com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_WORD.equals(str) ? z18 ? "xfiles_word_reader_arm64.zip" : "xfiles_word_reader_arm.zip" : com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_EXCEL.equals(str) ? "xfiles_excel_reader.zip" : com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_OFFICE.equals(str) ? z18 ? "xfiles_office_reader_arm64.zip" : "xfiles_office_reader_arm.zip" : com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_TXT.equals(str) ? "xfiles_txt_reader.zip" : "";
        new qx5.t(context, d17, -1, z17, str2, file.getPath() + "/apkxwebtest/" + str2, false, valueCallback).e(new java.lang.Void[0]);
        return true;
    }
}
