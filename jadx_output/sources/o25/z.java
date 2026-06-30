package o25;

/* loaded from: classes9.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f342593a = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/deeplink/noaccess#wechat_redirect";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f342594b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f342595c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f342596d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f342596d = hashMap;
        hashMap.put("weixin://", 0L);
        hashMap.put("weixin://dl/stickers", 1L);
        hashMap.put("weixin://dl/games", 2L);
        hashMap.put("weixin://dl/moments", 4L);
        hashMap.put("weixin://dl/add", 8L);
        hashMap.put("weixin://dl/shopping", 16L);
        hashMap.put("weixin://dl/groupchat", 32L);
        hashMap.put("weixin://dl/scan", 64L);
        hashMap.put("weixin://dl/profile", 128L);
        hashMap.put("weixin://dl/settings", 256L);
        hashMap.put("weixin://dl/general", 512L);
        hashMap.put("weixin://dl/help", 1024L);
        hashMap.put("weixin://dl/notifications", 2048L);
        hashMap.put("weixin://dl/terms", 4096L);
        hashMap.put("weixin://dl/chat", 8192L);
        hashMap.put("weixin://dl/features", 16384L);
        hashMap.put("weixin://dl/clear", 32768L);
        hashMap.put("weixin://dl/feedback", 65536L);
        hashMap.put("weixin://dl/faq", 131072L);
        hashMap.put("weixin://dl/recommendation", 262144L);
        hashMap.put("weixin://dl/groups", 524288L);
        hashMap.put("weixin://dl/tags", 1048576L);
        hashMap.put("weixin://dl/officialaccounts", 2097152L);
        hashMap.put("weixin://dl/posts", 4194304L);
        hashMap.put("weixin://dl/favorites", 8388608L);
        hashMap.put("weixin://dl/privacy", 16777216L);
        hashMap.put("weixin://dl/security", 33554432L);
        hashMap.put("weixin://dl/wallet", 67108864L);
        hashMap.put("weixin://dl/businessPay", 134217728L);
        hashMap.put("weixin://dl/businessPay/", 134217728L);
        hashMap.put("weixin://dl/wechatout", 268435456L);
        hashMap.put("weixin://dl/protection", 1073741824L);
        hashMap.put("weixin://dl/card", 2147483648L);
        hashMap.put("weixin://dl/about", 1125899906842624L);
        hashMap.put("weixin://dl/blacklist", 4294967296L);
        hashMap.put("weixin://dl/textsize", 8589934592L);
        hashMap.put("weixin://dl/sight", 17179869184L);
        hashMap.put("weixin://dl/languages", 34359738368L);
        hashMap.put("weixin://dl/chathistory", 68719476736L);
        hashMap.put("weixin://dl/bindqq", 137438953472L);
        hashMap.put("weixin://dl/bindmobile", 274877906944L);
        hashMap.put("weixin://dl/bindemail", 549755813888L);
        hashMap.put("weixin://dl/securityassistant", 1099511627776L);
        hashMap.put("weixin://dl/broadcastmessage", 2199023255552L);
        hashMap.put("weixin://dl/setname", 4398046511104L);
        hashMap.put("weixin://dl/myQRcode", 8796093022208L);
        hashMap.put("weixin://dl/myaddress", 17592186044416L);
        hashMap.put("weixin://dl/hidemoments", 35184372088832L);
        hashMap.put("weixin://dl/blockmoments", 70368744177664L);
        hashMap.put("weixin://dl/stickersetting", 140737488355328L);
        hashMap.put("weixin://dl/log", 281474976710656L);
        hashMap.put("weixin://dl/wechatoutcoupon", 562949953421312L);
        hashMap.put("weixin://dl/wechatoutshare", 18014398509481984L);
        hashMap.put("weixin://dl/personalemoticon", 4503599627370496L);
        hashMap.put("weixin://dl/designeremoji", 9007199254740992L);
        hashMap.put("weixin://dl/jumpWxa/", 576460752303423489L);
        hashMap.put("weixin://dl/offlinepay/", 576460752303423490L);
        hashMap.put("weixin://dl/channels/shareVideo/", 576460752303423492L);
        hashMap.put("weixin://dl/channels/profile/", 576460752303423496L);
        hashMap.put("weixin://dl/channels/live/", 576460752303423504L);
        hashMap.put("weixin://dl/channels/feed/", 576460752303423520L);
        hashMap.put("weixin://dl/customerService/", 576460752303423552L);
        hashMap.put("weixin://dl/channels/openEvent/", 576460752303423744L);
        hashMap.put("weixin://dl/channels/startLive/", 576460752303423616L);
        hashMap.put("weixin://dl/channels/bind/", 576460752303423745L);
        hashMap.put("weixin://dl/finder_home", 576460752303427584L);
        hashMap.put("weixin://dl/teenmode_intro", 1152921504606846976L);
        hashMap.put("weixin://dl/opensdkGeta8Key/", 2305843009213693952L);
    }

    public static l81.e1 a(android.content.Context context, o25.k0 k0Var) {
        if (k0Var instanceof o25.l0) {
            return new o25.i0(context, new o25.h0((o25.l0) k0Var));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r5) {
        /*
            java.lang.String r0 = "weixin://dl/wechatout"
            boolean r0 = r5.equals(r0)
            r1 = 0
            if (r0 != 0) goto L1c
            java.lang.String r0 = "weixin://dl/wechatoutcoupon"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L1c
            java.lang.String r0 = "weixin://dl/wechatoutshare"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L80
        L1c:
            boolean r5 = gm0.j1.a()
            r0 = 1
            if (r5 == 0) goto L59
            java.lang.Class<c25.e> r5 = c25.e.class
            lm0.a r5 = gm0.j1.s(r5)
            c25.e r5 = (c25.e) r5
            com.tencent.mm.plugin.zero.a r5 = (com.tencent.mm.plugin.zero.a) r5
            ip.j r5 = r5.b()
            java.lang.String r2 = "WCOEntranceSwitch"
            int r5 = r5.b(r2, r1)
            if (r5 <= 0) goto L4a
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r5.x(r2, r3)
            r5 = r0
            goto L5a
        L4a:
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r2 = com.tencent.mm.storage.u3.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r5.x(r2, r3)
        L59:
            r5 = r1
        L5a:
            if (r5 != 0) goto L80
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r5.setFlags(r1)
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r2 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            r5.setClassName(r1, r2)
            java.lang.String r1 = "rawUrl"
            java.lang.String r2 = o25.z.f342593a
            r5.putExtra(r1, r2)
            android.content.Context r1 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2 = 0
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            j45.l.j(r1, r3, r4, r5, r2)
            return r0
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.z.b(java.lang.String):boolean");
    }

    public static boolean c(java.lang.String str) {
        java.lang.String v17 = v(w(str));
        if (((java.util.HashMap) f342596d).containsKey(v17)) {
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17) && v17.startsWith("weixin://dl/business")) {
            return true;
        }
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(v17) && v17.startsWith("weixin://dl/openbusinesswebview")) || s(v17)) {
            return true;
        }
        return (!com.tencent.mm.sdk.platformtools.t8.K0(v17) && v17.startsWith("weixin://biz/")) || r(v17);
    }

    public static void d(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, o25.k0 k0Var) {
        java.lang.String str4;
        java.lang.String str5;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str5 = str2;
            str4 = str3;
        } else {
            str4 = str;
            str5 = str2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "doDeepLink url: %s, username: %s", str4, str5);
        if (b(str4)) {
            return;
        }
        if (!str4.isEmpty()) {
            if (str4.equals("weixin://dl/SettingsNotifyRemindSwitch")) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("HighLightCheckBoxPreference", "settings_new_msg_notification_switch");
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/DeepLinkHelper", "doDeepLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/DeepLinkHelper", "doDeepLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29634, 1, 0);
                return;
            }
            if (str4.equals("weixin://dl/SettingsVoIPNotifyRemindSwitch")) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("HighLightCheckBoxPreference", "settings_new_voip_msg_invite_notification");
                intent2.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginsdk/DeepLinkHelper", "doDeepLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/DeepLinkHelper", "doDeepLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29634, 2, 0);
                return;
            }
            if (str4.equals("weixin://dl/RtosWatchLoginUI")) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0).getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, "");
                java.lang.String a17 = c01.b9.f37069c.a("last_avatar_path", "");
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setFlags(268435456);
                intent3.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI");
                intent3.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, string);
                intent3.putExtra("avatar", a17);
                intent3.putExtra("reconnect", true);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/pluginsdk/DeepLinkHelper", "doDeepLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/DeepLinkHelper", "doDeepLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
        }
        java.lang.Object Ai = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).Ai(str4, str2, i17, 0, o45.cg.a(), new byte[0]);
        gm0.j1.d().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, new o25.a0(context, i17, str2, str4, k0Var));
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) Ai);
    }

    public static void e(cl0.g gVar) {
        if (gVar == null) {
            return;
        }
        java.lang.String optString = gVar.optString("package_info");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "package_info is null in invokeData");
            return;
        }
        try {
            cl0.e eVar = new cl0.e(optString);
            if (eVar.length() <= 0) {
                return;
            }
            java.lang.String str = gm0.j1.u().h() + "TempMiniProgram/";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < eVar.length(); i17++) {
                cl0.g gVar2 = new cl0.g(eVar.getString(i17));
                java.lang.String optString2 = gVar2.optString("downloadUrl");
                long optLong = gVar2.optLong("expireTime");
                java.lang.String optString3 = gVar2.optString("extraBytes");
                java.lang.String optString4 = gVar2.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                java.lang.String optString5 = gVar2.optString("fileMd5");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString5) && !com.tencent.mm.sdk.platformtools.t8.K0(optString2) && !com.tencent.mm.sdk.platformtools.t8.K0(optString4) && !com.tencent.mm.sdk.platformtools.t8.K0(optString3) && optLong > 0) {
                    if (optString4.startsWith("content") && com.tencent.mm.vfs.w6.j(optString4)) {
                        if (!com.tencent.mm.vfs.w6.j(str)) {
                            com.tencent.mm.vfs.w6.u(str);
                        }
                        java.lang.String str2 = str + com.tencent.mm.sdk.platformtools.t8.z1("%s.%s", optString5, com.tencent.mm.vfs.w6.n(optString4));
                        if (com.tencent.mm.vfs.w6.d(optString4, str2, false) <= 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkHelper", "file copy failed");
                        } else {
                            byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(optString3);
                            sg1.e eVar2 = new sg1.e();
                            eVar2.b(h17);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", eVar2.toString());
                            eVar2.f407880m = optLong;
                            eVar2.f407878h = optString5;
                            eVar2.f407879i = optString2;
                            arrayList.add(new android.util.Pair(eVar2, str2));
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "file not Exists, path = %s", optString4);
                }
            }
            ((rg1.h) ((sg1.f) i95.n0.c(sg1.f.class))).Ai(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkHelper", e17.getMessage());
        }
    }

    public static void f(android.content.Context context, java.lang.String str, int i17, android.os.Bundle bundle, o25.k0 k0Var, java.lang.String str2, java.lang.String str3) {
        g(context, str, i17, bundle, k0Var, str2, str3, false);
    }

    public static void g(android.content.Context context, java.lang.String str, int i17, android.os.Bundle bundle, o25.k0 k0Var, java.lang.String str2, java.lang.String str3, boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.y7 y7Var = new r45.y7();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "package name = %s, package signature = %s", str2, str3);
            y7Var.f390832e = str2;
            y7Var.f390831d = str3;
            linkedList.add(y7Var);
        }
        if (b(str)) {
            return;
        }
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.h1 h1Var = new com.tencent.mm.modelsimple.h1(str, i17, linkedList);
        if (str.startsWith("weixin://dl/channels/shareVideo/") && bundle != null) {
            java.lang.String string = bundle.getString("key_finder_share_video_jump_info_string", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                    int optInt = jSONObject.optInt("jumpType");
                    jSONObject.remove("jumpType");
                    org.json.JSONObject H = h1Var.H(optInt, jSONObject);
                    if (H == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneTranslateLink", "setFinderJumpInfo jumpInfo invalid");
                    } else {
                        h1Var.f71338f = H.toString();
                        H.remove("jumpType");
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneTranslateLink", "setFinderJumpInfo finderJumpInfo: %s, jumpInfo: %s", string, H);
                        r45.sv5 sv5Var = new r45.sv5();
                        r45.xy0 xy0Var = new r45.xy0();
                        sv5Var.f385983d = xy0Var;
                        xy0Var.f390591d = optInt;
                        xy0Var.f390592e = H.toString();
                        ((r45.yp6) h1Var.f71337e.f70710a.f70684a).f391282m = sv5Var;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTranslateLink", e17, "setFinderComponentInfo exception", new java.lang.Object[0]);
                }
            }
        }
        gm0.j1.d().a(1200, new o25.d0(h1Var, z17, k0Var, str, bundle, context, i17));
        gm0.j1.d().g(h1Var);
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2) {
        int i17;
        if (b(str2)) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490468vx), true, true, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (com.tencent.mm.storage.z3.R4(str)) {
                i17 = 7;
            } else if (c01.e2.G(str)) {
                i17 = 9;
            }
            g(context, str2, i17, null, new o25.j0(Q, context), null, null, false);
        }
        i17 = 6;
        g(context, str2, i17, null, new o25.j0(Q, context), null, null, false);
    }

    public static android.content.Intent i(java.lang.String str, android.content.Context context) {
        if (context == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.startsWith("weixin://dl/businessPay")) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DeepLinkHelper", "payUri null");
            return null;
        }
        java.lang.String queryParameter = parse.getQueryParameter("reqkey");
        java.lang.String queryParameter2 = parse.getQueryParameter("appid");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.DeepLinkHelper", "reqkey null");
            return null;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = queryParameter;
        payInfo.f192116o = queryParameter2;
        payInfo.f192109e = 36;
        payInfo.f192112h = false;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_pay_info", payInfo);
        if (context instanceof android.app.Activity) {
            intent.putExtra("key_context_hashcode", context.hashCode());
            com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkHelper", "startPay context %s %s", context, java.lang.Integer.valueOf(context.hashCode()));
        }
        if (c01.z1.I()) {
            j45.l.n(context, "wallet_payu", ".pay.ui.WalletPayUPayUI", intent, 1);
        } else {
            j45.l.n(context, "wallet", ".pay.ui.WalletPayUI", intent, 1);
        }
        return intent;
    }

    public static void j(android.content.Context context, int i17) {
        java.lang.String string = (com.tencent.mm.sdk.platformtools.a0.f192448k || !com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN")) ? com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK") ? context.getString(com.tencent.mm.R.string.f493685la1) : com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW") ? context.getString(com.tencent.mm.R.string.f493686la2) : context.getString(com.tencent.mm.R.string.f493687la3) : context.getString(com.tencent.mm.R.string.f493684la0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("show_feedback", false);
        intent.putExtra("KShowFixToolsBtn", true);
        intent.putExtra("geta8key_session_id", i17);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void k(android.content.Context context, int i17) {
        java.lang.String string = (com.tencent.mm.sdk.platformtools.a0.f192448k || !(com.tencent.mm.sdk.platformtools.m2.d().equals("zh_CN") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_HK") || com.tencent.mm.sdk.platformtools.m2.d().equals("zh_TW"))) ? context.getString(com.tencent.mm.R.string.l8h) : context.getString(com.tencent.mm.R.string.l8g);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("show_feedback", false);
        intent.putExtra("KShowFixToolsBtn", true);
        intent.putExtra("geta8key_session_id", i17);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public static void l(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url is null. finish");
            return;
        }
        if (!str.startsWith("weixin://dl/login/phone_view")) {
            if (!str.startsWith("weixin://dl/login/common_view")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url not Correct:%s", str);
                return;
            }
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter(dm.i4.COL_USERNAME);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("login_username", queryParameter);
            intent.putExtra("from_deep_link", true);
            intent.addFlags(268435456);
            j45.l.j(context, "account", ".ui.LoginUI", intent, null);
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String queryParameter2 = parse.getQueryParameter("cc");
        java.lang.String queryParameter3 = parse.getQueryParameter("num");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("couttry_code", queryParameter2);
        intent2.putExtra("input_mobile_number", queryParameter3);
        intent2.putExtra("from_deep_link", true);
        intent2.putExtra("mobile_input_purpose", 1);
        intent2.addFlags(268435456);
        j45.l.j(context, "account", ".ui.MobileInputUI", intent2, null);
    }

    public static boolean m(android.content.Context context, java.lang.String str) {
        return n(context, str, null, 0, null, o45.cg.a(), new byte[0], null);
    }

    public static boolean n(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, android.os.Bundle bundle, int i18, byte[] bArr, java.lang.String str2) {
        return o(context, str, intent, i17, bundle, i18, bArr, str2, 0, "", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0dc9  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0d11 A[Catch: Exception -> 0x0cfe, TRY_LEAVE, TryCatch #16 {Exception -> 0x0cfe, blocks: (B:387:0x0ce7, B:389:0x0cf1, B:390:0x0d05, B:392:0x0d11, B:395:0x0d02), top: B:386:0x0ce7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x10c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x07cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o(android.content.Context r40, java.lang.String r41, android.content.Intent r42, int r43, android.os.Bundle r44, int r45, byte[] r46, java.lang.String r47, int r48, java.lang.String r49, o25.k0 r50) {
        /*
            Method dump skipped, instructions count: 6225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.z.o(android.content.Context, java.lang.String, android.content.Intent, int, android.os.Bundle, int, byte[], java.lang.String, int, java.lang.String, o25.k0):boolean");
    }

    public static boolean p(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, android.os.Bundle bundle, int i18, byte[] bArr, java.lang.String str2, int i19, java.lang.String str3, o25.k0 k0Var) {
        java.lang.String string;
        bc0.e deepLinkSource = bc0.e.f19144d;
        if (bundle != null && (string = bundle.getString("IDeepLinkService.DeepLinkSource")) != null && string.length() > 0) {
            try {
                deepLinkSource = bc0.e.valueOf(string);
            } catch (java.lang.Exception unused) {
            }
        }
        bc0.g gVar = new bc0.g();
        gVar.f19146a = i17;
        gVar.f19147b = i18;
        gVar.f19148c = bArr;
        gVar.f19149d = intent;
        gVar.f19150e = str2;
        gVar.f19151f = i19;
        gVar.f19152g = str3;
        gVar.f19153h = bundle;
        o25.z$$a z__a = k0Var != null ? new o25.z$$a(k0Var) : null;
        qv.c0 c0Var = (qv.c0) ((bc0.i) i95.n0.c(bc0.i.class));
        c0Var.getClass();
        kotlin.jvm.internal.o.g(deepLinkSource, "deepLinkSource");
        kotlin.jvm.internal.o.g(context, "context");
        android.net.Uri parse = str != null ? android.net.Uri.parse(str) : null;
        if (parse == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkService", "handleDeepLink, uri parse failed, uriStr: " + str);
            return false;
        }
        java.lang.String aj6 = c0Var.aj(parse);
        if (aj6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkService", "handleDeepLink, uriPrefix decode failed, uriStr: " + str + ", uri: " + parse);
            return false;
        }
        r25.i iVar = (r25.i) ((java.util.HashMap) qv.c0.f366840m).get(aj6);
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkService", "handleDeepLink, handler not found, uriStr: " + str + ", uri: " + parse + ", uriPrefix: " + aj6);
            return false;
        }
        boolean a17 = iVar.a(deepLinkSource, context, parse, gVar, z__a);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkService", "handleDeepLink, uriStr: " + str + ", handler: " + iVar + ", result: " + a17);
        return a17;
    }

    public static boolean q(java.lang.String str, long j17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String v17 = v(str);
            java.util.HashMap hashMap = (java.util.HashMap) f342596d;
            long longValue = hashMap.containsKey(v17) ? ((java.lang.Long) hashMap.get(v17)).longValue() : -1L;
            if (longValue != -1 && (longValue == 0 || (longValue & j17) == longValue)) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith("weixin://dl/liteapp");
    }

    public static boolean s(java.lang.String str) {
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && (str.startsWith("weixin://dl/jumpFakeWxa/") || str.startsWith("weixin://dl/openNativeView/") || str.startsWith("weixin://dl/openLiteApp/"));
    }

    public static boolean t(android.net.Uri uri) {
        if (uri == null) {
            return false;
        }
        return uri.toString().startsWith("weixin://dl/business/tempsession/") || uri.toString().startsWith("weixin://dl/businessTempSession/");
    }

    public static boolean u(android.net.Uri uri) {
        if (uri == null || !nf.z.d(uri.toString(), "weixin://dl/")) {
            return false;
        }
        java.lang.String queryParameter = uri.getQueryParameter("ticket");
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            queryParameter = uri.getQueryParameter("t");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
            return t(uri);
        }
        return true;
    }

    public static java.lang.String v(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        return parse.getScheme() + "://" + parse.getHost() + parse.getPath();
    }

    public static java.lang.String w(java.lang.String str) {
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (!yp5.a.f464409a.a() && str.startsWith("wechat://")) {
            str.replace("wechat://", "weixin://");
        }
        return str;
    }
}
