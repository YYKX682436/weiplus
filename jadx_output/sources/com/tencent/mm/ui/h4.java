package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f208774a = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/wework_admin/commdownload?from=conv%s";

    public static int a(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        r01.m y07 = r01.q3.bj().y0(str);
        if ((y07 == null || (y07.field_userFlag & 2) == 0) ? false : true) {
            return (y07.field_wwExposeTimes < y07.field_wwMaxExposeTimes || com.tencent.mm.pluginsdk.model.app.j1.f(context, "com.tencent.wework")) ? 2 : 1;
        }
        return 0;
    }

    public static void b(android.content.Context context, java.lang.String str, int i17) {
        android.content.Intent launchIntentForPackage;
        f(str, 1, i17);
        e(str, 2, i17);
        r01.m J0 = r01.q3.bj().J0(str);
        java.lang.String str2 = null;
        if (4 == i17 || 3 == i17) {
            r01.q3.bj().getClass();
            if (r01.q.f368186g == null) {
                r01.q.f368186g = new r45.ud();
            }
            java.lang.String str3 = r01.q.f368186g.f387252h;
            if (str3 != null && str3.length() > 0 && str3.toLowerCase().startsWith("http")) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str3);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            str2 = str3;
        }
        if (com.tencent.mm.pluginsdk.model.app.j1.f(context, "com.tencent.wework")) {
            f(str, 2, i17);
            android.content.pm.PackageInfo a17 = ik1.b.a(context, "com.tencent.wework");
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17.versionName) || a17.versionName.compareTo("1.3.3") < 0) {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.tencent.wework");
            } else {
                launchIntentForPackage = new android.content.Intent();
                launchIntentForPackage.setAction("android.intent.action.VIEW");
                if ((i17 == 4 || 3 == i17) && str2 != null && str2.length() > 0) {
                    launchIntentForPackage.setData(android.net.Uri.parse(str2));
                } else {
                    launchIntentForPackage.setData(android.net.Uri.parse((i17 == 2 || i17 == 4 || i17 == 6) ? "wxwork://createconversation" : "wxwork://conversationlist"));
                }
            }
            p95.a.a(new com.tencent.mm.ui.g4(context, launchIntentForPackage));
            return;
        }
        if (J0.field_use_preset_banner_tips) {
            db5.e1.j(context, com.tencent.mm.R.string.c1q, 0, com.tencent.mm.R.string.c1p, com.tencent.mm.R.string.f490347sg, new com.tencent.mm.ui.d4(context, str, i17), null);
            return;
        }
        if (!J0.field_show_confirm) {
            c(context, str, i17);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.j(context.getString(com.tencent.mm.R.string.f490347sg));
        u1Var.m(com.tencent.mm.R.string.c1p);
        r01.q bj6 = r01.q3.bj();
        r01.q3.bj();
        java.lang.String z07 = bj6.z0(1);
        if (z07 == null) {
            u1Var.g(context.getString(com.tencent.mm.R.string.c1q));
        } else {
            u1Var.g(z07);
        }
        u1Var.c(new com.tencent.mm.ui.e4(), new com.tencent.mm.ui.f4(context, str, i17));
        u1Var.q(false);
    }

    public static void c(android.content.Context context, java.lang.String str, int i17) {
        f(str, 3, i17);
        e(str, 3, i17);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = com.tencent.mm.sdk.platformtools.t8.K0(r01.q3.cj().d1(str)) ? "off" : "on";
        java.lang.String format = java.lang.String.format(f208774a, objArr);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r17 = com.tencent.mm.plugin.downloader.model.r0.i().r(format);
        if (r17 != null && r17.f96963f == 3 && com.tencent.mm.vfs.w6.j(r17.f96964g)) {
            com.tencent.mm.vfs.w6.h(r17.f96964g);
        }
        gw4.f fVar = new gw4.f(context);
        fVar.f276157b = "mmdownloadapp_P1JsSxoAvEuC7tny5Q";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
    }

    public static void d(android.content.Context context, java.lang.String str) {
        r01.q bj6;
        r01.m J0;
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.pluginsdk.model.app.j1.f(context, "com.tencent.wework") || (i17 = (J0 = (bj6 = r01.q3.bj()).J0(str)).field_wwExposeTimes) >= J0.field_wwMaxExposeTimes) {
            return;
        }
        J0.field_wwExposeTimes = i17 + 1;
        bj6.P0(J0);
    }

    public static void e(java.lang.String str, int i17, int i18) {
        qk.o b17 = r01.q3.cj().b1(str);
        if (i18 == 3) {
            i18 = 2;
        }
        int i19 = i18 != 4 ? i18 : 3;
        if (b17.G0()) {
            str = b17.y0();
        }
        r01.m y07 = r01.q3.bj().y0(str);
        gm0.j1.n().f273288b.g(new r01.h3(y07, 1, i17, i19, 0, new java.lang.Object()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15162, java.lang.Long.valueOf(y07.field_wwCorpId), java.lang.Long.valueOf(y07.field_wwUserVid), java.lang.Integer.valueOf(y07.field_chatOpen ? 1 : 0), java.lang.Integer.valueOf(y07.field_wwUnreadCnt), java.lang.Integer.valueOf(y07.field_show_confirm ? 1 : 0), java.lang.Integer.valueOf(y07.field_userType), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }

    public static int f(java.lang.String str, int i17, int i18) {
        qk.o b17 = r01.q3.cj().b1(str);
        if (b17.G0()) {
            str = b17.y0();
        }
        r01.m y07 = r01.q3.bj().y0(str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13656, java.lang.Integer.valueOf(y07 != null ? y07.field_qyUin : 0), java.lang.Integer.valueOf(y07 != null ? y07.field_userUin : 0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L));
        return i18;
    }
}
