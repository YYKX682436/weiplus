package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public abstract class w {
    public static void A(java.lang.String str, boolean z17) {
        ct.k3 k3Var = (ct.k3) i95.n0.c(ct.k3.class);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        qg5.e3 e3Var = (qg5.e3) k3Var;
        e3Var.getClass();
        if (str == null || valueOf == null || !kotlin.jvm.internal.o.b(str, "com.tencent.hunyuan.app.chat")) {
            return;
        }
        java.util.Map nj6 = e3Var.nj(e3Var.f362963n);
        if (nj6.isEmpty()) {
            return;
        }
        ((cy1.a) e3Var.ij()).Hj("app_jump_yuanbao_popup", "view_clk", kz5.c1.m(nj6, kz5.b1.e(new jz5.l("popup_action_type", java.lang.Integer.valueOf(valueOf.booleanValue() ? 1 : 0)))), 35480);
        if (valueOf.booleanValue()) {
            ((cy1.a) e3Var.ij()).Ej("active_yuanbao_succ", nj6, 35480);
        }
    }

    public static void B(java.lang.String str) {
        qg5.e3 e3Var = (qg5.e3) ((ct.k3) i95.n0.c(ct.k3.class));
        e3Var.getClass();
        if (str != null && kotlin.jvm.internal.o.b(str, "com.tencent.hunyuan.app.chat")) {
            java.util.Map nj6 = e3Var.nj(e3Var.f362963n);
            if (nj6.isEmpty()) {
                return;
            }
            ((cy1.a) e3Var.ij()).Hj("app_jump_yuanbao_popup", "view_exp", nj6, 35480);
        }
    }

    public static void a(android.os.Bundle bundle, int i17, int i18, java.lang.String str, int i19, java.lang.String str2) {
        java.lang.String string = bundle != null ? bundle.getString("current_page_url", "") : "";
        java.lang.String string2 = bundle != null ? bundle.getString("current_page_appid", "") : "";
        java.lang.String string3 = bundle != null ? bundle.getString("current_page_biz_info", "") : "";
        java.lang.String string4 = bundle != null ? bundle.getString("current_page_source_info", "") : "";
        java.lang.String replace = string != null ? string.replace(',', '.') : "";
        java.lang.String replace2 = str != null ? str.replace(',', '.') : "";
        int i27 = bundle != null ? bundle.getInt("current_page_secCtrlMode") : 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14102, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), replace2, java.lang.Integer.valueOf(i19), str2, replace, string2, string4, string3, java.lang.Integer.valueOf(i27), bundle != null ? bundle.getString("current_page_fromUsername", "") : "", java.lang.Integer.valueOf(bundle != null ? bundle.getInt("current_page_requestId") : 0), bundle != null ? bundle.getString("current_page_msgId", "") : "", bundle != null ? bundle.getString("current_page_msgUsername", "") : "", java.lang.Integer.valueOf(bundle != null ? bundle.getInt("current_page_msgType") : 0), java.lang.Integer.valueOf(bundle != null ? bundle.getInt("current_page_appMsgType") : 0), java.lang.Integer.valueOf(bundle != null ? bundle.getInt("current_page_a8keyScene") : 0));
    }

    public static void b(java.lang.String str, boolean z17, android.content.Intent intent) {
        if ("com.tencent.androidqqmail".equals(str)) {
            int intExtra = intent.getIntExtra("curPageId", 0);
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 11, 0, java.lang.Integer.valueOf(intExtra));
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11288, 12, 0, java.lang.Integer.valueOf(intExtra));
            }
        }
    }

    public static com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req c(android.content.Context context, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str) {
        com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req req = new com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        req.message = wXMediaMessage;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        req.transaction = kk.k.g(sb6.toString().getBytes());
        req.openId = str;
        req.lang = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        req.country = (java.lang.String) gm0.j1.u().c().l(274436, null);
        return req;
    }

    public static boolean d(com.tencent.mm.pluginsdk.model.app.m mVar) {
        if (mVar == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            return false;
        }
        if (true != ((mVar.field_appInfoFlag & 128) > 0)) {
            return false;
        }
        java.lang.String str = mVar.field_appId;
        java.util.HashMap hashMap = new java.util.HashMap();
        c01.z1.L(327682, hashMap);
        java.lang.String str2 = hashMap.containsKey(str) ? (java.lang.String) hashMap.get(str) : null;
        return str2 == null || str2.equals("0");
    }

    public static boolean e(java.lang.String str) {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (!str.startsWith("content")) {
            return com.tencent.mm.sdk.platformtools.t8.E0(str) && s(str);
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String authority = parse.getAuthority();
        if (authority == null || !(authority.contains("com.tencent.mm") || authority.contains("com.tencent.wmpf") || authority.contains(com.tencent.mm.sdk.platformtools.x2.f193072b))) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "checkContentUri not valid: %s", parse.toString());
            z17 = false;
        }
        return z17 && s(str);
    }

    public static boolean f(java.lang.String str) {
        if (!str.startsWith("content")) {
            if (!str.startsWith(zo3.p.Ai())) {
                ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).getClass();
                java.lang.String k17 = com.tencent.mm.pluginsdk.model.app.k0.k();
                kotlin.jvm.internal.o.f(k17, "getDefaultAttachDir(...)");
                if (!str.startsWith(k17)) {
                }
            }
            return false;
        }
        return true;
    }

    public static java.lang.String g(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!bundle.getBoolean("current_page_ad_onlineReport", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "getAdReportParams do not do onlineReport");
            return null;
        }
        java.lang.String string = bundle.getString("current_page_biz_info", "");
        java.lang.String string2 = bundle.getString("current_page_source_info", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) && com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "getAdReportParams null");
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (string != null) {
            try {
                jSONObject.put("bizInfo", string);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppInfoLogic", "getAdReportParams ex %s", e17.getMessage());
            }
        }
        if (string2 != null) {
            jSONObject.put("sourceInfo", string2);
        }
        return jSONObject.toString();
    }

    public static com.tencent.mm.pluginsdk.model.app.m h(java.lang.String str) {
        return j(str, true, false);
    }

    public static com.tencent.mm.pluginsdk.model.app.m i(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
            return null;
        }
        if (ap3.e.a() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.m wi6 = ((kt.a) ap3.e.a()).wi(str);
        if (wi6 == null || wi6.field_appVersion < i17) {
            ((kt.a) ap3.e.a()).Ai(str);
        }
        return wi6;
    }

    public static com.tencent.mm.pluginsdk.model.app.m j(java.lang.String str, boolean z17, boolean z18) {
        java.lang.String str2;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
            return null;
        }
        if (ap3.e.a() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return null;
        }
        com.tencent.mm.pluginsdk.model.app.m wi6 = ((kt.a) ap3.e.a()).wi(str);
        if (z17) {
            if ((wi6 == null || (str2 = wi6.field_appName) == null || str2.length() == 0) || (z18 && (true ^ com.tencent.mm.sdk.platformtools.t8.K0(wi6.field_packageName)))) {
                ((kt.a) ap3.e.a()).Ai(str);
            }
        }
        return wi6;
    }

    public static com.tencent.mm.pluginsdk.model.app.m k(java.lang.String str, boolean z17) {
        kt.a aVar;
        com.tencent.mm.pluginsdk.model.app.m wi6;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getAppInfo, appId is null");
            return null;
        }
        ap3.f a17 = ap3.e.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return null;
        }
        if (!z17 && (wi6 = (aVar = (kt.a) a17).wi(str)) != null) {
            aVar.Ai(str);
            return wi6;
        }
        return zo3.p.Ni().d(str, 3000L);
    }

    public static java.util.List l(android.content.Context context, boolean z17, boolean z18, boolean z19, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (ap3.e.a() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
            return arrayList;
        }
        if (z19) {
            arrayList = new java.util.ArrayList();
            if (ap3.e.a() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag, getISubCorePluginBase() == null");
            } else {
                ((kt.a) ap3.e.a()).getClass();
                android.database.Cursor L0 = zo3.p.Ri().L0(i17, i18);
                if (L0 != null) {
                    while (L0.moveToNext()) {
                        com.tencent.mm.pluginsdk.model.app.m mVar = new com.tencent.mm.pluginsdk.model.app.m();
                        mVar.convertFrom(L0);
                        arrayList.add(mVar);
                    }
                    L0.close();
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "getServiceByAppInfoFlagAndShowFlag: size is %s", java.lang.Integer.valueOf(arrayList.size()));
                }
            }
        }
        android.database.Cursor cursor = null;
        int[] iArr = (z17 && z18) ? new int[]{1, 5} : z17 ? new int[]{1} : z18 ? new int[]{5} : null;
        if (iArr == null) {
            return arrayList;
        }
        ((kt.a) ap3.e.a()).getClass();
        com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
        Ri.getClass();
        if (iArr.length > 0) {
            java.lang.String str = "select * from AppInfo where ";
            for (int i19 = 0; i19 < iArr.length; i19++) {
                str = str + " status = " + iArr[i19];
                if (i19 < iArr.length - 1) {
                    str = str + " or ";
                }
            }
            android.database.Cursor rawQuery = Ri.rawQuery(str + " order by status desc, modifyTime asc", new java.lang.String[0]);
            if (rawQuery == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
            } else {
                cursor = rawQuery;
            }
        }
        if (cursor != null) {
            while (cursor.moveToNext()) {
                com.tencent.mm.pluginsdk.model.app.m mVar2 = new com.tencent.mm.pluginsdk.model.app.m();
                mVar2.convertFrom(cursor);
                if (mVar2.field_status == 1) {
                    if (!r(context, mVar2.field_appId)) {
                        mVar2.field_status = 4;
                        ((kt.a) ap3.e.a()).getClass();
                        zo3.p.Ri().update(mVar2, new java.lang.String[0]);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar2.field_signature)) {
                        arrayList.add(mVar2);
                    }
                } else if (mVar2.field_signature != null) {
                    arrayList.add(mVar2);
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    public static java.lang.String m(android.content.Context context) {
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), context);
        return (o17 == null || o17.length() == 0 || o17.equalsIgnoreCase("zh_CN")) ? "zh_CN" : o17;
    }

    public static java.lang.String n(android.content.Context context, com.tencent.mm.pluginsdk.model.app.m mVar, java.lang.String str) {
        if (context == null || mVar == null) {
            return str;
        }
        java.lang.String m17 = m(context);
        java.lang.String str2 = m17.equalsIgnoreCase("zh_CN") ? mVar.field_appName : null;
        if (m17.equalsIgnoreCase("en")) {
            str2 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_en) ? mVar.field_appName : mVar.field_appName_en;
        }
        if (m17.equalsIgnoreCase("zh_TW") || m17.equalsIgnoreCase("zh_HK")) {
            if (m17.equalsIgnoreCase("zh_HK")) {
                str2 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_hk) ? mVar.field_appName_tw : mVar.field_appName_hk;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_tw) ? mVar.field_appName : mVar.field_appName_tw;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appName_en) ? mVar.field_appName : mVar.field_appName_en;
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(str2) ? str : str2;
    }

    public static java.lang.String o(android.content.pm.ResolveInfo resolveInfo) {
        android.content.pm.ActivityInfo activityInfo;
        if (resolveInfo == null) {
            return null;
        }
        java.lang.String str = resolveInfo.resolvePackageName;
        return (!android.text.TextUtils.isEmpty(str) || (activityInfo = resolveInfo.activityInfo) == null) ? str : activityInfo.packageName;
    }

    public static boolean p(com.tencent.mm.pluginsdk.model.app.m mVar, int i17) {
        if (mVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_appId)) {
            r0 = (mVar.field_appInfoFlag & i17) > 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "isAppHasFlag, appid = %s, flag = %s, ret = %b", mVar.field_appId, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(r0));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "appInfoFlag = " + mVar.field_appInfoFlag);
        }
        return r0;
    }

    public static boolean q(android.content.Context context, com.tencent.mm.pluginsdk.model.app.m mVar) {
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppInfoLogic", "app is null");
            return false;
        }
        java.lang.String str = mVar.field_packageName;
        if (str != null && str.length() != 0) {
            return com.tencent.mm.pluginsdk.model.app.j1.f(context, mVar.field_packageName);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppInfoLogic", "field_packageName is null");
        return false;
    }

    public static boolean r(android.content.Context context, java.lang.String str) {
        if (context != null && str != null && str.length() != 0) {
            return q(context, h(str));
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "isAppInstalled, invalid arguments");
        return false;
    }

    public static boolean s(java.lang.String str) {
        if (str != null) {
            try {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
                if (r6Var.m()) {
                    return r6Var.h();
                }
                return false;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppInfoLogic", e17, "isFileExistAndReadable exception", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public static boolean t(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.m j17 = j(str, false, false);
        if (j17 != null) {
            return j17.k();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppInfoLogic", "app is null, appId = " + str);
        return false;
    }

    public static boolean u(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var, android.os.Bundle bundle, java.lang.String str2, com.tencent.mm.pluginsdk.model.app.e5 e5Var) {
        if (context == null || intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, context or intent is null.");
            if (a5Var != null) {
                a5Var.a(false, false);
            }
            return false;
        }
        java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(context, intent);
        if ((w17 != null && !w17.isEmpty()) || com.tencent.mm.sdk.platformtools.t8.w0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            boolean z17 = true;
            java.lang.String o17 = (android.text.TextUtils.isEmpty(intent.getPackage()) && w17 != null && w17.size() == 1) ? o((android.content.pm.ResolveInfo) w17.get(0)) : intent.getPackage();
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.f193072b;
            if (str3 == null) {
                str3 = "";
            }
            if (str3.equals(o17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
                if (a5Var != null) {
                    a5Var.a(false, false);
                }
                return false;
            }
            if (w17 == null || w17.isEmpty()) {
                z(bundle);
            } else {
                java.lang.String g17 = g(bundle);
                if (g17 != null) {
                    ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationAppInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                    l44.z.s(true, g17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
                }
            }
            com.tencent.mm.pluginsdk.model.app.b1.a(o17, 1);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = o17;
            objArr[1] = java.lang.Boolean.valueOf((w17 == null || w17.isEmpty()) ? false : true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) by wechat with intent, activitys list is not empty: %b", objArr);
            if (i17 == 2) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/AppInfoLogic", "launchAppByWeChat", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/pluginsdk/model/app/OnLaunchAppCallback;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/model/app/OnLaunchCheckExposeCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/AppInfoLogic", "launchAppByWeChat", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/pluginsdk/model/app/OnLaunchAppCallback;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/model/app/OnLaunchCheckExposeCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    y(bundle);
                    B(o17);
                    A(o17, true);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", e17.getMessage());
                    z17 = false;
                }
                if (a5Var != null) {
                    a5Var.a(z17, false);
                }
                return z17;
            }
            if (w17 != null && !w17.isEmpty()) {
                ru5.g b17 = ru5.g.b();
                b17.f399801b = ru5.g.f399798j;
                return ((java.lang.Boolean) b17.f(new com.tencent.mm.pluginsdk.model.app.v(str, context, bundle, o17, str2, intent, a5Var, e5Var)).g()).booleanValue();
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppInfoLogic", "launchApp failed, not activity can resolve the intent.");
        if (a5Var != null) {
            a5Var.a(false, false);
        }
        return false;
    }

    public static boolean v(android.content.Context context, android.content.Intent intent, java.lang.String str, com.tencent.mm.pluginsdk.model.app.a5 a5Var, android.os.Bundle bundle) {
        return u(context, intent, str, 0, a5Var, bundle, null, null);
    }

    public static boolean w(android.content.Context context, java.lang.String str, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str2, java.lang.String str3, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var, android.os.Bundle bundle) {
        return x(context, str, str2, c(context, wXMediaMessage, str3), i17, a5Var, bundle);
    }

    public static boolean x(android.content.Context context, java.lang.String str, java.lang.String str2, com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Req req, int i17, com.tencent.mm.pluginsdk.model.app.a5 a5Var, android.os.Bundle bundle) {
        if (req == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, req is null.");
            if (a5Var != null) {
                a5Var.a(false, false);
            }
            return false;
        }
        if (android.text.TextUtils.isEmpty(str) || !com.tencent.mm.pluginsdk.model.app.j1.f(context, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, pkg is null or application has not installed.");
            com.tencent.mm.pluginsdk.model.app.b1.a(str, 1);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.pluginsdk.model.app.o(context));
            if (a5Var != null) {
                a5Var.a(false, false);
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp(pkg : %s) with appId(%s)", str, str2);
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.f193072b;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp failed, can not launch wechat page.");
            if (a5Var != null) {
                a5Var.a(false, false);
            }
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.b1.a(str, 1);
        com.tencent.mm.pluginsdk.model.app.p pVar = new com.tencent.mm.pluginsdk.model.app.p(req, str, context, a5Var);
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp with show confirm dialog(%s).", str);
            pVar.run();
            return true;
        }
        com.tencent.mm.pluginsdk.model.app.m h17 = h(str2);
        java.lang.String string = (h17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n(context, h17, null))) ? context.getString(com.tencent.mm.R.string.g_6) : context.getString(com.tencent.mm.R.string.g_7, n(context, h17, null));
        if (str2 == null) {
            str2 = "";
        }
        if ("wx073f4a4daff0abe8".equalsIgnoreCase(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 1, "", "");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppInfoLogic", "launchApp with args(showType : %s, pkg : %s)", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(string);
        u1Var.n(context.getString(com.tencent.mm.R.string.g_4));
        u1Var.j(context.getString(com.tencent.mm.R.string.f490347sg));
        u1Var.l(new com.tencent.mm.pluginsdk.model.app.r(bundle, str, str2, pVar));
        u1Var.i(new com.tencent.mm.pluginsdk.model.app.q(bundle, str, str2, a5Var));
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            u1Var.q(false);
        } else {
            ru5.g b17 = ru5.g.b();
            b17.f399801b = ru5.g.f399798j;
            b17.f(new com.tencent.mm.pluginsdk.model.app.s(u1Var)).g();
        }
        B(str);
        return true;
    }

    public static void y(android.os.Bundle bundle) {
        ca4.c a17;
        java.lang.String g17 = g(bundle);
        if (g17 == null) {
            return;
        }
        ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        java.util.ArrayList arrayList = l44.z.f316428a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        try {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: adReportParams is ".concat(g17));
            a17 = l44.z.a("reportLaunchApplicationSuccess", g17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: exp is " + th6);
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: adCommonData is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        } else {
            org.json.JSONObject jSONObject = a17.f39845b;
            org.json.JSONObject jSONObject2 = a17.f39846c;
            if (jSONObject != null && jSONObject2 != null) {
                ca4.f fVar = new ca4.f();
                fVar.o(a17.f39844a);
                fVar.p(a17.f39847d);
                fVar.n(a17.f39848e);
                fVar.q(a17.f39849f);
                fVar.d(g17);
                if (jSONObject.has("wxad")) {
                    if (jSONObject2.optInt(ya.b.SOURCE) == 4) {
                        fVar.m(4001016);
                        fVar.k(1);
                        a84.t0.a(fVar.a());
                        da4.i a18 = da4.i.a(jSONObject2.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME), 1, 0, "", a17.f39844a, "", null, false, g17);
                        if (a18 != null) {
                            da4.h.i(a18);
                        }
                    } else if (jSONObject2.opt(ya.b.SOURCE) != null) {
                        fVar.m(4002011);
                        fVar.h(1);
                        fVar.i(1);
                        a84.t0.a(fVar.a());
                    }
                } else if (jSONObject.has("xjad") && jSONObject2.opt(ya.b.SOURCE) != null) {
                    fVar.m(4002011);
                    fVar.h(3);
                    fVar.i(1);
                    a84.t0.a(fVar.a());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            }
            com.tencent.mars.xlog.Log.i("AdConversionOnlineReportHelper", "reportLaunchApplicationSuccess: sourceParams or sourceJsonObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationSuccess", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }

    public static void z(android.os.Bundle bundle) {
        java.lang.String g17 = g(bundle);
        if (g17 == null) {
            return;
        }
        ((ee0.c) ((fe0.k3) i95.n0.c(fe0.k3.class))).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLaunchApplicationAppNotInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
        l44.z.s(false, g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLaunchApplicationAppNotInstalled", "com.tencent.mm.feature.sns.AdConversionOnlineReportService");
    }
}
