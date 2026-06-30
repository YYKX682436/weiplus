package zj3;

/* loaded from: classes11.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f473298a = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy7) + "/mobile/wx-entry.html#/?scene=";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f473299b = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyv) + "/nl/meeting_intro_wxwork?scene=";

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D0(r7, r8.toLowerCase()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "MicroMsg.MeetingLinkHelper"
            r1 = 0
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L6a
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L6a
            r3 = 64
            android.content.pm.PackageInfo r7 = r2.getPackageInfo(r7, r3)     // Catch: java.lang.Exception -> L6a
            if (r7 == 0) goto L78
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: java.lang.Exception -> L6a
            r7 = r7[r1]     // Catch: java.lang.Exception -> L6a
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.Exception -> L6a
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Exception -> L6a
            r2.update(r7)     // Catch: java.lang.Exception -> L6a
            byte[] r7 = r2.digest()     // Catch: java.lang.Exception -> L6a
            if (r7 != 0) goto L2a
            r7 = 0
            goto L54
        L2a:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L6a
            int r3 = r7.length     // Catch: java.lang.Exception -> L6a
            r2.<init>(r3)     // Catch: java.lang.Exception -> L6a
            r3 = r1
        L31:
            int r4 = r7.length     // Catch: java.lang.Exception -> L6a
            if (r3 >= r4) goto L50
            r4 = r7[r3]     // Catch: java.lang.Exception -> L6a
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch: java.lang.Exception -> L6a
            int r5 = r4.length()     // Catch: java.lang.Exception -> L6a
            r6 = 2
            if (r5 >= r6) goto L46
            r2.append(r1)     // Catch: java.lang.Exception -> L6a
        L46:
            java.lang.String r4 = r4.toLowerCase()     // Catch: java.lang.Exception -> L6a
            r2.append(r4)     // Catch: java.lang.Exception -> L6a
            int r3 = r3 + 1
            goto L31
        L50:
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L6a
        L54:
            java.lang.String r2 = r8.toUpperCase()     // Catch: java.lang.Exception -> L6a
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.D0(r7, r2)     // Catch: java.lang.Exception -> L6a
            if (r2 != 0) goto L68
            java.lang.String r8 = r8.toLowerCase()     // Catch: java.lang.Exception -> L6a
            boolean r7 = com.tencent.mm.sdk.platformtools.t8.D0(r7, r8)     // Catch: java.lang.Exception -> L6a
            if (r7 == 0) goto L78
        L68:
            r1 = 1
            goto L78
        L6a:
            r7 = move-exception
            java.lang.String r8 = r7.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r2 = "checkPackageInstalled Exception: %s"
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r7, r2, r8)
        L78:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "checkPackageInstalled result:%s"
            com.tencent.mars.xlog.Log.i(r0, r8, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zj3.c.a(java.lang.String, java.lang.String):boolean");
    }

    public static java.lang.String b() {
        java.lang.String g17 = g();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return null;
        }
        try {
            return new cl0.g(g17).optString("banner_content");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e17, "getConfigBannerContentWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String c() {
        java.lang.String g17 = g();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return null;
        }
        try {
            return new cl0.g(g17).optString("banner_title");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e17, "getConfigBannerTitleWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String d() {
        java.lang.String g17 = g();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return null;
        }
        try {
            return new cl0.g(g17).optString("dialog");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e17, "getConfigDialogContentWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String e() {
        java.lang.String g17 = g();
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            return null;
        }
        try {
            return new cl0.g(g17).optString("dialog_goto");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e17, "getConfigDialogGotoWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static cl0.g f() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitalk_ad_extraconfig1, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            return null;
        }
        try {
            return new cl0.g(Zi);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e17, "getConfigExtraInfoJsonObject error", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String g() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitalk_ad_wording1, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            return null;
        }
        try {
            cl0.g gVar = new cl0.g(Zi);
            java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
            com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "getLocalConfigWording, langCode:%s", d17);
            return gVar.optString(d17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MeetingLinkHelper", e17, "getLocalConfigWording error", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String h() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multitalk_ad_url1, "", true);
        return com.tencent.mm.sdk.platformtools.t8.K0(Zi) ? l() ? f473298a : n() ? f473299b : Zi : Zi;
    }

    public static int i() {
        if (l()) {
            return 1;
        }
        if (n()) {
            return 2;
        }
        return m() ? 3 : 0;
    }

    public static void j(android.content.Context context, java.lang.String str) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "handleMeetingLinkClick, isAllowedToShowMeetingLink:%s, isAllowedToShowWorkWeChat:%s", java.lang.Boolean.valueOf(l()), java.lang.Boolean.valueOf(n()));
        if (k()) {
            if (l()) {
                z17 = a("com.tencent.wemeet.app", "EF1B5A11844923BB7515E6F6AFCBC45F");
                com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "check meetting install result::%s", java.lang.Boolean.valueOf(z17));
            } else if (n()) {
                z17 = a("com.tencent.wework", "011a40266c8c75d181ddd8e4ddc50075");
                com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "check wework install result:%s", java.lang.Boolean.valueOf(z17));
            } else {
                if (m()) {
                    cl0.g f17 = f();
                    java.lang.String optString = f17 != null ? f17.optString("package_name") : null;
                    cl0.g f18 = f();
                    java.lang.String optString2 = f18 != null ? f18.optString("md5") : null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "other app, packageName:%s, md5:%s", optString, optString2);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                        z17 = a(optString, optString2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "check wework install result:%s", java.lang.Boolean.valueOf(z17));
                    }
                }
                z17 = false;
            }
            int i17 = i();
            if (!z17) {
                zj3.d.c(i17, 0, 0, 0, str.equals("list") ? 2 : 1, 0, 0, 0, 0, h(), 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "not installed, jump download url, ");
                java.lang.String str2 = h() + str;
                com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "not installed, jump download url:%s", str2);
                if (n()) {
                    gw4.f fVar = new gw4.f(context);
                    fVar.f276157b = "mmdownloadapp_P1JsSxoAvEuC7tny5Q";
                    ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
                    return;
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str2);
                    try {
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                        return;
                    } catch (java.lang.Exception unused) {
                        zj3.d.c(i17, 0, 0, 0, 0, str.equals("list") ? 2 : 1, 0, 0, 0, h(), 0);
                        return;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "already installed, jump app");
            if (l()) {
                if (o(context, "com.tencent.wemeet.app", "wemeet://launch?referer=wechat&from=" + str, str.equals("list"))) {
                    zj3.d.a(i17, str.equals("list"));
                    return;
                } else {
                    zj3.d.b(i17, str.equals("list"));
                    return;
                }
            }
            if (n()) {
                if (o(context, "com.tencent.wework", "wxwork://jump?target=jump_to_third_app&businessid=10085&src=wx&scene=" + str, str.equals("list"))) {
                    zj3.d.a(i17, str.equals("list"));
                    return;
                } else {
                    zj3.d.b(i17, str.equals("list"));
                    return;
                }
            }
            if (m()) {
                cl0.g f19 = f();
                java.lang.String optString3 = f19 != null ? f19.optString("package_name") : null;
                cl0.g f27 = f();
                java.lang.String optString4 = f27 != null ? f27.optString("schema") : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(optString3) || com.tencent.mm.sdk.platformtools.t8.K0(optString4)) {
                    return;
                }
                if (o(context, optString3, optString4 + str, str.equals("list"))) {
                    zj3.d.a(i17, str.equals("list"));
                } else {
                    zj3.d.b(i17, str.equals("list"));
                }
            }
        }
    }

    public static boolean k() {
        return l() || n() || m();
    }

    public static boolean l() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_ad_type1, 0) == 1;
    }

    public static boolean m() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_ad_type1, 0) == 3;
    }

    public static boolean n() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_ad_type1, 0) == 2;
    }

    public static boolean o(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.MeetingLinkHelper", "jumpApp, packageName:%s, schema:%s", str, str2);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str2));
        intent.setPackage(str);
        intent.setFlags(268435456);
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        try {
            if (z17) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                try {
                    str3 = packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    str3 = null;
                }
                ((kt.c) i0Var).getClass();
                return com.tencent.mm.pluginsdk.model.app.w.v(context, intent, str3, null, null);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/utils/MeetingLinkHelper", "jumpApp", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/multitalk/utils/MeetingLinkHelper", "jumpApp", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477876e0, -1);
            return true;
        } catch (java.lang.Exception unused2) {
            return false;
        }
    }
}
