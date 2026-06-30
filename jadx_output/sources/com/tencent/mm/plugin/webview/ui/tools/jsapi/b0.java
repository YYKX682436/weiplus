package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class b0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 f184939d = new com.tencent.mm.plugin.webview.ui.tools.jsapi.b0();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f184940e;

    public static final void e(com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var, nw4.k kVar, nw4.y2 y2Var, int i17, int i18, android.content.Intent intent) {
        b0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "request to open file chooser for passport image, result code = " + i18);
        if (i18 == -1) {
            new com.tencent.mm.plugin.webview.ui.tools.jsapi.s(intent, kVar, y2Var).invoke();
        } else if (i18 != 0) {
            kVar.f340863d.e(y2Var.f341013c, "choosePassport:fail", null);
        } else {
            kVar.f340863d.e(y2Var.f341013c, "choosePassport:cancel", null);
        }
    }

    public static final java.lang.String f(com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var, java.lang.String str, long j17, long j18) {
        java.lang.String str2;
        b0Var.getClass();
        com.tencent.mm.plugin.webview.model.l4 Zi = com.tencent.mm.plugin.webview.modeltools.z.Zi();
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = Zi != null ? Zi.b(str) : null;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s localId:%s", "item_null", str);
            return null;
        }
        java.lang.String str3 = b17.f182738g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s localId:%s", "path_empty", str);
            return null;
        }
        if (str3 == null) {
            return null;
        }
        if (!com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s srcPath:%s", "src_not_exist", h(b0Var, str3, 0, 2, null));
            return null;
        }
        long k17 = com.tencent.mm.vfs.w6.k(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport album original param need:%b maxMB:%d localId:%s srcSize:%d srcPath:%s", java.lang.Boolean.TRUE, java.lang.Long.valueOf(j17), str, java.lang.Long.valueOf(k17), h(b0Var, str3, 0, 2, null));
        if (k17 > j18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s srcSize:%d maxBytes:%d", "over_max_size", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(j18));
            return null;
        }
        java.lang.String str4 = lp0.b.e() + "tmpChoosePassportOriginal/";
        com.tencent.mm.vfs.w6.u(str4);
        com.tencent.mm.vfs.w6.t(str4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str4);
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('_');
        sb6.append(java.util.UUID.randomUUID());
        int O = r26.n0.O(str3, '/', 0, false, 6, null);
        int O2 = r26.n0.O(str3, '.', 0, false, 6, null);
        if (O2 <= O || O2 >= str3.length() - 1) {
            str2 = "";
        } else {
            str2 = str3.substring(O2);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        long d17 = com.tencent.mm.vfs.w6.d(str3, sb7, false);
        if (d17 < 0 || !com.tencent.mm.vfs.w6.j(sb7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s ret:%d dstPath:%s", "copy_failed", java.lang.Long.valueOf(d17), h(b0Var, sb7, 0, 2, null));
            return null;
        }
        long k18 = com.tencent.mm.vfs.w6.k(sb7);
        if (k17 != k18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original skip reason:%s srcSize:%d dstSize:%d", "copy_size_mismatch", java.lang.Long.valueOf(k17), java.lang.Long.valueOf(k18));
            return null;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d18 = com.tencent.mm.plugin.webview.model.m4.d(sb7);
        d18.f182748t = false;
        com.tencent.mm.plugin.webview.model.l4 Zi2 = com.tencent.mm.plugin.webview.modeltools.z.Zi();
        if (Zi2 != null) {
            Zi2.a(d18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "choosePassport original saved originLocalId:%s srcSize:%d dstSize:%d dstPath:%s", d18.f182736e, java.lang.Long.valueOf(k17), java.lang.Long.valueOf(k18), h(b0Var, sb7, 0, 2, null));
        return d18.f182736e;
    }

    public static final void g(com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap, java.lang.String str) {
        long j17;
        b0Var.getClass();
        java.lang.Object obj = y2Var.f340790a.get("originalImageMaxSize");
        if (obj instanceof java.lang.Number) {
            j17 = ((java.lang.Number) obj).longValue();
        } else {
            if (obj instanceof java.lang.String) {
                java.lang.String str2 = (java.lang.String) obj;
                java.lang.Long j18 = r26.h0.j(str2);
                if (j18 != null) {
                    j17 = j18.longValue();
                } else {
                    java.lang.Double e17 = r26.g0.e(str2);
                    java.lang.Long valueOf = e17 != null ? java.lang.Long.valueOf((long) e17.doubleValue()) : null;
                    if (valueOf != null) {
                        j17 = valueOf.longValue();
                    }
                }
            }
            j17 = 10;
        }
        long j19 = j17 > 0 ? j17 : 10L;
        dw4.a.a(new com.tencent.mm.plugin.webview.ui.tools.jsapi.x(str, j19, j19 * 1048576, hashMap, kVar, y2Var));
    }

    public static java.lang.String h(com.tencent.mm.plugin.webview.ui.tools.jsapi.b0 b0Var, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 160;
        }
        b0Var.getClass();
        if (str != null && str.length() > i17) {
            java.lang.String substring = str.substring(0, i17);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            return substring.concat("...");
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str;
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        j(1);
        new com.tencent.mm.ui.tools.s6(env.f340860a).a(null, new com.tencent.mm.plugin.webview.ui.tools.jsapi.y(env), new com.tencent.mm.plugin.webview.ui.tools.jsapi.z(env, msg), new com.tencent.mm.plugin.webview.ui.tools.jsapi.a0(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 507;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "choosePassport";
    }

    public final void i(nw4.k kVar, nw4.y2 y2Var, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pick_local_pic_capture", i17);
        intent.putExtra("key_pick_local_pic_query_source_type", 8);
        intent.putExtra("query_media_type", 1);
        intent.putExtra("key_pick_local_pic_count", 1);
        java.lang.String str = (java.lang.String) y2Var.f340790a.get("liteAppBusinessScene");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "doChooseImageIdCard liteapp business scene:%s", str);
        if (str.length() > 0) {
            intent.putExtra("key_liteapp_business_scene", str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePassport", "doChooseImageIdCard: realScene: %d, querySourceType: %d", java.lang.Integer.valueOf(i17), 8);
        android.content.Context context = kVar.f340860a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(new com.tencent.mm.plugin.webview.ui.tools.jsapi.t(kVar, y2Var));
            j45.l.o(kVar.f340860a, "webview", ".ui.tools.OpenFileChooserUI", intent, 43, false);
        }
        java.lang.Object obj = kVar.f340860a;
        if (obj instanceof q80.z) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            ((q80.z) obj).R1(new com.tencent.mm.plugin.webview.ui.tools.jsapi.u(kVar, y2Var));
            j45.l.o(kVar.f340860a, "webview", ".ui.tools.OpenFileChooserUI", intent, 43, false);
        }
    }

    public final void j(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(32227, i17 + ",0,0,0");
    }
}
