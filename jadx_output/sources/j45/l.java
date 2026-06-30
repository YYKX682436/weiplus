package j45;

/* loaded from: classes11.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f297713a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f297714b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f297715c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f297716d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.LOCATION, "talkroom");
        hashMap.put("talkroom", "voip");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        f297713a = copyOnWriteArrayList;
        f297714b = new java.util.concurrent.CopyOnWriteArrayList();
        copyOnWriteArrayList.add(new j45.e());
        f297715c = new java.lang.String[]{com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt), com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyx), com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyr)};
        f297716d = new j45.f();
    }

    public static void A(android.content.Intent intent) {
        l85.h1.e(intent, "mm", true, e("mm"));
    }

    public static void B(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        boolean z17;
        java.lang.String str3 = str + str2;
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(context, str3, intent, 0, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.String str4 = "com.tencent.mm.plugin." + str;
        if (str2.startsWith(".")) {
            str2 = str4 + str2;
        }
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str2);
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
    }

    public static void C(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, android.content.Intent intent2) {
        boolean z17;
        java.lang.String str3 = str + str2;
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(context, str3, intent, 0, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.String str4 = "com.tencent.mm.plugin." + str;
        if (str2.startsWith(".")) {
            str2 = str4 + str2;
        }
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str2);
        com.tencent.mm.ui.MMWizardActivity.Y6(context, intent, intent2);
    }

    public static void D(android.content.Intent intent) {
        l85.h1.f(intent, "mm", true, e("mm"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r8.endsWith("." + r4) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[LOOP:0: B:4:0x000b->B:15:0x003d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean E(android.net.Uri r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L40
            java.lang.String r8 = r8.getHost()
            java.lang.String[] r1 = j45.l.f297715c
            int r2 = r1.length
            r3 = r0
        Lb:
            if (r3 >= r2) goto L40
            r4 = r1[r3]
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            r6 = 1
            if (r5 != 0) goto L39
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 == 0) goto L1d
            goto L39
        L1d:
            boolean r5 = r8.equals(r4)
            if (r5 != 0) goto L37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "."
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            boolean r4 = r8.endsWith(r4)
            if (r4 == 0) goto L39
        L37:
            r4 = r6
            goto L3a
        L39:
            r4 = r0
        L3a:
            if (r4 == 0) goto L3d
            return r6
        L3d:
            int r3 = r3 + 1
            goto Lb
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j45.l.E(android.net.Uri):boolean");
    }

    public static void a(android.content.Context context, java.lang.String str, android.content.Intent intent) {
        if (intent != null) {
            if (f297716d.contains(str)) {
                intent.putExtra("animation_pop_in", true);
            }
            db5.f.a(context, intent);
        }
    }

    public static java.lang.String b(android.content.Intent intent, android.net.Uri uri, java.lang.String str) {
        java.lang.String queryParameter = uri.getQueryParameter("not_in_game_luggage");
        int intExtra = intent.getIntExtra("KHalfScreenHeight", 0);
        float floatExtra = intent.getFloatExtra("KHalfScreenHeightPercent", 0.0f);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (!queryParameter.equals("1")) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.game_luggage, true)) {
                return (intExtra > 0 || floatExtra > 0.0f) ? com.tencent.mm.pluginsdk.model.g4.a() ? "com.tencent.mm.plugin.game.luggage.MMLuggageGameHalfWebViewUI" : "com.tencent.mm.plugin.game.luggage.LuggageGameHalfWebViewUI" : com.tencent.mm.pluginsdk.model.g4.a() ? "com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI" : "com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI";
            }
        }
        return ".ui.tools.game.GameWebViewUI";
    }

    public static boolean c(android.net.Uri uri) {
        if (uri != null && uri.getHost() != null && uri.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
            java.lang.String queryParameter = uri.getQueryParameter("not_in_game_luggage");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (!queryParameter.equals("1")) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.game_luggage, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static java.lang.String d(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        java.lang.String str4 = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (".ui.tools.WebViewUI".equals(str4) || "com.tencent.mm.plugin.webview.ui.tools.WebViewUI".equals(str4))) {
            int startPerformance = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizTimeout(), com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcBizAction(), "MicroMsg.PluginHelper");
            try {
                java.lang.String stringExtra = intent.getStringExtra("rawUrl");
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "summer hardcoder biz startPerformance [%s][%s], url: %s", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX), java.lang.Integer.valueOf(startPerformance), stringExtra);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    android.net.Uri parse = android.net.Uri.parse(stringExtra);
                    if (intent.getLongExtra("start_activity_time", 0L) == 0) {
                        intent.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
                    }
                    if (intent.getLongExtra("startTime", 0L) == 0) {
                        intent.putExtra("startTime", java.lang.System.currentTimeMillis());
                    }
                    if (parse.getHost() != null && parse.getHost().equals("mp.weixin.qq.com") && !com.tencent.mm.sdk.platformtools.f9.SessionOa.k(context, null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "Block mp url %s", stringExtra);
                        return null;
                    }
                    if (parse.getHost() == null || !parse.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
                        str2 = ".ui.tools.WebViewUI";
                        z17 = false;
                    } else {
                        str2 = b(intent, parse, str4);
                        z17 = true;
                    }
                    if (z17 || !com.tencent.mm.pluginsdk.model.g4.b()) {
                        str3 = str2;
                    } else {
                        str3 = ".ui.tools.MMWebViewUI";
                        if (!E(parse) && com.tencent.xweb.a3.p(stringExtra)) {
                            str3 = ".ui.tools.WebViewUI";
                        }
                    }
                    try {
                        java.lang.String uuid = java.util.UUID.randomUUID().toString();
                        intent.putExtra("key_jsapi_pay_uuid", uuid);
                        com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "open WebViewUI set uuid:%s ret:%s", uuid, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.L().D("key_jsapi_pay_uuid", uuid)));
                        str4 = str3;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str4 = str3;
                        com.tencent.mars.xlog.Log.e("MicroMsg.PluginHelper", "parse url failed :" + e.getMessage());
                        return str4;
                    }
                }
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        } else {
            if (com.tencent.mm.pluginsdk.model.g4.b()) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str4.endsWith(".ui.TmplWebViewToolUI")) {
                    return ".ui.timeline.preload.ui.TmplWebViewMMUI";
                }
            }
            if ((com.tencent.mm.sdk.platformtools.t8.K0(str) ? false : str4.endsWith("ui.tools.CustomSchemeEntryWebViewUI")) && com.tencent.mm.pluginsdk.model.g4.b()) {
                return ".ui.tools.CustomSchemeEntryMMWebViewUI";
            }
        }
        return str4;
    }

    public static android.content.Intent e(java.lang.String str) {
        java.lang.Class cls;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1854767153:
                if (str.equals("support")) {
                    c17 = 0;
                    break;
                }
                break;
            case -1335091396:
                if (str.equals("dexopt")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3488:
                if (str.equals("mm")) {
                    c17 = 2;
                    break;
                }
                break;
            case 3322030:
                if (str.equals("lite")) {
                    c17 = 3;
                    break;
                }
                break;
            case 3452698:
                if (str.equals(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
                    c17 = 4;
                    break;
                }
                break;
            case 110545371:
                if (str.equals("tools")) {
                    c17 = 5;
                    break;
                }
                break;
            case 1865400007:
                if (str.equals("sandbox")) {
                    c17 = 6;
                    break;
                }
                break;
            case 2016254153:
                if (str.equals("exdevice")) {
                    c17 = 7;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                cls = com.tencent.mm.service.ProcessService$SupportProcessService.class;
                break;
            case 1:
                cls = com.tencent.mm.service.ProcessService$DexOptProcessService.class;
                break;
            case 2:
                cls = com.tencent.mm.service.ProcessService$MMProcessService.class;
                break;
            case 3:
                cls = com.tencent.mm.service.ProcessService$LiteProcessService.class;
                break;
            case 4:
                cls = com.tencent.mm.service.ProcessService$PushProcessServicer.class;
                break;
            case 5:
                cls = com.tencent.mm.service.ProcessService$ToolsProcessService.class;
                break;
            case 6:
                cls = com.tencent.mm.service.ProcessService$SandBoxProcessService.class;
                break;
            case 7:
                cls = com.tencent.mm.service.ProcessService$ExDeviceProcessService.class;
                break;
            default:
                cls = null;
                break;
        }
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) cls);
        l85.j1.b("MicroMsg.PluginHelper", intent);
        return intent;
    }

    public static boolean f() {
        return (com.tencent.mm.sdk.platformtools.x2.n() && gm0.j1.a()) || gm0.m.i() != 0;
    }

    public static synchronized boolean g(java.lang.String str) {
        synchronized (j45.l.class) {
        }
        return true;
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2) {
        k(context, str, str2, null, true);
    }

    public static void i(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        j(context, str, str2, intent, null);
    }

    public static void j(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, android.os.Bundle bundle) {
        if (!fp.h.a(21)) {
            try {
                if (context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("settings_multi_webview", false) && ".ui.tools.WebViewUI".endsWith(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
                    intent.addFlags(134217728);
                    intent.addFlags(524288);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginHelper", "%s", e17.getMessage());
            }
        }
        l(context, str, str2, intent, true, bundle);
    }

    public static void k(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17) {
        l(context, str, str2, intent, true, null);
    }

    public static void l(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17, android.os.Bundle bundle) {
        int i17;
        boolean z18;
        android.content.Intent intent2;
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "start activity, need try load plugin[%B], entry:%s", java.lang.Boolean.valueOf(z17), str2);
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginHelper", "start activity error, context is null");
            return;
        }
        java.lang.String str3 = str + str2;
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = 1;
                z18 = false;
                break;
            }
            java.lang.String str4 = str3;
            java.lang.String str5 = str3;
            i17 = 1;
            if (((j45.i) it.next()).b(context, str4, intent, 0, null)) {
                z18 = true;
                break;
            }
            str3 = str5;
        }
        if (z18) {
            return;
        }
        if (intent != null && !com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("rawUrl"))) {
            intent.putExtra("startTime", java.lang.System.currentTimeMillis());
        }
        java.lang.String d17 = d(context, intent, str2);
        if (d17 == null) {
            return;
        }
        if (intent == null) {
            try {
                intent2 = new android.content.Intent();
            } catch (java.lang.ClassNotFoundException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PluginHelper", "Class Not Found when startActivity %s", e17);
                return;
            }
        } else {
            intent2 = intent;
        }
        java.lang.String str6 = "com.tencent.mm.plugin." + str;
        if (d17.startsWith(".")) {
            d17 = str6 + d17;
        }
        intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, d17);
        java.lang.Class.forName(d17, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "Activity startActivity: %s", d17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(i17));
            yj0.a.f(context, "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            return;
        }
        intent2.addFlags(268435456);
        if (com.tencent.mm.ui.MMFragmentActivity.isVASActivity(intent2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "VASActivity startActivity: %s", d17);
            try {
                lk5.q0.d(context, intent2, bundle);
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginHelper", "context startActivity: %s", d17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(bundle);
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(i17));
        yj0.a.f(context, "com/tencent/mm/pluginstub/PluginHelper", "startActivity", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ZLandroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    public static void m(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        o(context, str, str2, null, i17, true);
    }

    public static void n(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17) {
        o(context, str, str2, intent, i17, true);
    }

    public static void o(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17, boolean z17) {
        boolean z18;
        java.lang.String str3;
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginHelper", "start activity error, context is null");
            return;
        }
        java.lang.String str4 = str + str2;
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = false;
                break;
            } else if (((j45.i) it.next()).b(context, str4, intent, i17, null)) {
                z18 = true;
                break;
            }
        }
        if (z18) {
            return;
        }
        if (intent != null && !com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("rawUrl"))) {
            intent.putExtra("startTime", java.lang.System.currentTimeMillis());
        }
        java.lang.String d17 = d(context, intent, str2);
        if (d17 == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        java.lang.String str5 = "com.tencent.mm.plugin." + str;
        if (d17.startsWith(".")) {
            str3 = str5 + d17;
        } else {
            str3 = d17;
        }
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str3);
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.PluginHelper", "context not activity, skipped");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/pluginstub/PluginHelper", "startActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZ)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        a(context, d17, intent);
    }

    public static void p(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17) {
        boolean z17;
        java.lang.String str3;
        android.content.Context context = fragment.getContext();
        java.lang.String str4 = str + str2;
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(context, str4, intent, i17, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        java.lang.String str5 = "com.tencent.mm.plugin." + str;
        if (str2.startsWith(".")) {
            str3 = str5 + str2;
        } else {
            str3 = str2;
        }
        intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str3);
        fragment.startActivityForResult(intent2, i17);
        a(fragment.getActivity(), str2, intent);
    }

    public static void q(j45.h hVar, android.content.Intent intent, int i17, j45.g gVar) {
        s(hVar, "", "", intent, i17, false, gVar);
    }

    public static void r(j45.h hVar, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17, j45.g gVar) {
        s(hVar, str, str2, intent, i17, true, gVar);
    }

    public static void s(j45.h hVar, java.lang.String str, java.lang.String str2, android.content.Intent intent, int i17, boolean z17, j45.g gVar) {
        boolean z18;
        java.lang.String str3;
        com.tencent.mm.ui.chatting.manager.e eVar = (com.tencent.mm.ui.chatting.manager.e) hVar;
        yb5.d dVar = (yb5.d) eVar.f201966a.get();
        androidx.fragment.app.FragmentActivity activity = (dVar != null ? dVar.f460717l : null).getActivity();
        java.lang.String str4 = str + str2;
        com.tencent.mm.pluginsdk.ui.m mVar = new com.tencent.mm.pluginsdk.ui.m(eVar, gVar);
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = false;
                break;
            } else if (((j45.i) it.next()).b(activity, str4, intent, i17, mVar)) {
                z18 = true;
                break;
            }
        }
        if (z18) {
            return;
        }
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String str5 = "com.tencent.mm.plugin." + str;
            if (str2.startsWith(".")) {
                str3 = str5 + str2;
            } else {
                str3 = str2;
            }
            intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str3);
        }
        eVar.a(intent2, i17, gVar);
        yb5.d dVar2 = (yb5.d) eVar.f201966a.get();
        a((dVar2 != null ? dVar2.f460717l : null).getActivity(), str2, intent);
    }

    public static void t(android.content.Context context, java.lang.String str, android.content.Intent intent) {
        u(context, str, intent, null);
    }

    public static void u(android.content.Context context, java.lang.String str, android.content.Intent intent, android.os.Bundle bundle) {
        boolean z17;
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        if (str.startsWith(".")) {
            str = "com.tencent.mm".concat(str);
        }
        intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, str);
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(context, str, intent, 0, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
            yj0.a.f(context, "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            return;
        }
        intent2.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(bundle);
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(context, "com/tencent/mm/pluginstub/PluginHelper", "startAppActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    public static void v(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17) {
        boolean z17;
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        java.lang.String concat = str.startsWith(".") ? "com.tencent.mm".concat(str) : str;
        intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, concat);
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(context, concat, intent, i17, null)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.PluginHelper", "context not activity, skipped");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/pluginstub/PluginHelper", "startAppActivityForResult", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        a(context, str, intent);
    }

    public static void w(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.da daVar) {
        boolean z17;
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        java.lang.String concat = str.startsWith(".") ? "com.tencent.mm".concat(str) : str;
        com.tencent.mm.pluginsdk.ui.n nVar = new com.tencent.mm.pluginsdk.ui.n(daVar);
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(mMActivity, concat, intent, i17, nVar)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, concat);
        mMActivity.mmStartActivityForResult(daVar, intent, i17);
        a(mMActivity, str, intent);
    }

    public static void x(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, java.lang.String str, android.content.Intent intent, int i17, com.tencent.mm.ui.xc xcVar) {
        boolean z17;
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        java.lang.String concat = str.startsWith(".") ? "com.tencent.mm".concat(str) : str;
        com.tencent.mm.pluginsdk.ui.o oVar = new com.tencent.mm.pluginsdk.ui.o(xcVar);
        java.util.List list = f297713a;
        kotlin.jvm.internal.o.f(list, "getInterceptors(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (((j45.i) it.next()).b(mMFragmentActivity, concat, intent, i17, oVar)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            return;
        }
        intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, concat);
        mMFragmentActivity.mmStartActivityForResult(xcVar, intent, i17);
        a(mMFragmentActivity, str, intent);
    }

    public static void y(android.content.Context context, android.content.Intent intent) {
        j(context, "webview", ".ui.tools.fts.MMFTSSOSHomeWebViewUI", intent, null);
    }

    public static void z(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        j(context, "webview", ".ui.tools.fts.MMFTSSearchTabWebViewUI", intent, bundle);
    }
}
