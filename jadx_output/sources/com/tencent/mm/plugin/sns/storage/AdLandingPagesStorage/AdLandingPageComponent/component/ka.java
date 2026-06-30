package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public abstract class ka {

    /* renamed from: a, reason: collision with root package name */
    public static android.graphics.Typeface f165323a;

    public static java.lang.String a(java.lang.String str, boolean z17, java.lang.String... strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (strArr == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return str;
        }
        if (!z17 && !ca4.m0.p()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2056, 13);
            try {
                java.net.URI uri = new java.net.URI(str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (java.lang.String str2 : strArr) {
                    sb6.append(str2);
                    sb6.append("&");
                }
                if (sb6.length() > 1) {
                    java.lang.StringBuilder deleteCharAt = sb6.deleteCharAt(sb6.length() - 1);
                    java.lang.String query = uri.getQuery();
                    java.net.URI uri2 = new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), query == null ? deleteCharAt.toString() : query + "&" + deleteCharAt.toString(), uri.getFragment());
                    if (com.tencent.mars.xlog.Log.isDebug()) {
                        uri2.toString();
                    }
                    java.lang.String uri3 = uri2.toString();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                    return uri3;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LandingPageUtil", e17, "", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return str;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2056, 14);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        if (str == null) {
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        } else {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.Iterator a17 = kotlin.jvm.internal.c.a(strArr);
                while (true) {
                    kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    sb7.append((java.lang.String) bVar.next());
                    sb7.append("&");
                }
                if (sb7.length() > 1) {
                    java.lang.StringBuilder deleteCharAt2 = sb7.deleteCharAt(sb7.length() - 1);
                    kotlin.jvm.internal.o.f(deleteCharAt2, "deleteCharAt(...)");
                    java.lang.String encodedQuery = parse.getEncodedQuery();
                    android.net.Uri.Builder encodedQuery2 = parse.buildUpon().clearQuery().encodedQuery(encodedQuery == null ? deleteCharAt2.toString() : encodedQuery + '&' + ((java.lang.Object) deleteCharAt2));
                    com.tencent.mars.xlog.Log.i("UrlHelper", "appendUriParams url:" + str + "  query:" + ((java.lang.Object) deleteCharAt2) + "  finalUrl = " + encodedQuery2);
                    java.lang.String builder = encodedQuery2.toString();
                    kotlin.jvm.internal.o.f(builder, "toString(...)");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
                    str = builder;
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("UrlHelper", e18, "", new java.lang.Object[0]);
                ca4.q.a("UrlHelper", "appendUriParams Error!", 7);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUriParams", "com.tencent.mm.plugin.sns.ad.utils.UrlHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return str;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String... strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        java.lang.String a17 = a(str, false, strArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return a17;
    }

    public static int[] c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        int[] iArr = {point.x, point.y};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return iArr;
    }

    public static boolean d(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, java.lang.String str3, com.tencent.mm.pluginsdk.model.app.a5 a5Var, int i17) {
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.tencent.mars.xlog.Log.i("LandingPageUtil", "openApp, pkg=" + str + ", appName=" + str3 + ", showType=" + i17 + ", pageUrl=" + str2 + ", intent=" + intent);
        if (context == null || (android.text.TextUtils.isEmpty(str) && intent == null)) {
            com.tencent.mars.xlog.Log.e("LandingPageUtil", "openApp, null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return false;
        }
        if (intent != null) {
            p95.a.a(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.fa(context, intent, str3, i17, a5Var));
        } else if (android.text.TextUtils.isEmpty(str2)) {
            p95.a.a(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ja(context, str, str3, i17, a5Var));
        } else {
            com.tencent.mars.xlog.Log.i("LandingPageUtil", "openApp, jump pageUrl=" + str2);
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str2));
            intent2.addFlags(268435456);
            java.util.List w17 = com.tencent.mm.sdk.platformtools.t8.w1(context, intent2);
            if (w17 != null && !w17.isEmpty()) {
                if (android.text.TextUtils.isEmpty(intent2.getPackage()) && w17.size() == 1) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) w17.get(0);
                    ((kt.c) i0Var).getClass();
                    str4 = com.tencent.mm.pluginsdk.model.app.w.o(resolveInfo);
                } else {
                    str4 = intent2.getPackage();
                }
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.x2.f193072b;
                if (str5 == null) {
                    str5 = "";
                }
                if (!str5.equals(str4)) {
                    p95.a.a(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ha(context, intent2, str3, i17, a5Var));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return true;
    }

    public static void e(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendSetUiOptionLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        b4.d.a(context).c(new android.content.Intent("com.tencent.mm.adlanding.set_uioption"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendSetUiOptionLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    public static void f(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        boolean u17 = com.tencent.mm.ui.bk.u(activity, false);
        com.tencent.mars.xlog.Log.i("LandingPageUtil", "setFullScreen, hasCut=" + u17);
        activity.getWindow().getDecorView().setSystemUiVisibility((!u17 ? 1542 : 514) | 4096);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    public static void g(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.tencent.mars.xlog.Log.i("LandingPageUtil", "setFullScreen");
        activity.getWindow().getDecorView().setSystemUiVisibility(5638);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    public static java.lang.String h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return "";
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.h(), "tmpLargeCanvasDir");
        if (!r6Var.m()) {
            r6Var.J();
        }
        try {
            byte[] bytes = str.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, java.lang.System.currentTimeMillis() + "").o();
            if (com.tencent.mm.vfs.w6.S(o17, bytes, 0, bytes.length) == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                return o17;
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("LandingPageUtil", "writeTempCanvasXmlToLocal fail");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeTempCanvasXmlToLocal", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return "";
    }
}
