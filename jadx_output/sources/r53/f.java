package r53;

/* loaded from: classes8.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f392653a = true;

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.sdk.platformtools.n3 f392654b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f392655c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f392656d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.util.HashMap f392657e = null;

    /* renamed from: f, reason: collision with root package name */
    public static long f392658f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static android.util.DisplayMetrics f392659g;

    static {
        new android.graphics.Rect();
        com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_MONTH);
    }

    public static cl0.g A(android.net.Uri uri, cl0.g gVar) {
        java.lang.String query = uri.getQuery();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (query == null) {
            query = "";
        }
        java.lang.String[] split = query.split("&");
        if (split == null || split.length == 0) {
            return null;
        }
        cl0.g gVar2 = gVar;
        for (java.lang.String str : split) {
            java.lang.String[] split2 = str.split("=");
            if (split2 != null && split2.length == 2) {
                if (gVar2 == null) {
                    try {
                        gVar2 = new cl0.g();
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameCenterUtil", e17, "JSONException", new java.lang.Object[0]);
                    }
                }
                gVar.h(split2[0], split2[1]);
            }
        }
        return gVar;
    }

    public static synchronized void B(java.lang.String str, float f17) {
        synchronized (r53.f.class) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            com.tencent.mm.autogen.events.GameMsgDownloadImgEvent gameMsgDownloadImgEvent = new com.tencent.mm.autogen.events.GameMsgDownloadImgEvent();
            am.ue ueVar = gameMsgDownloadImgEvent.f54367g;
            ueVar.f8078a = 1;
            ueVar.f8079b = str;
            gameMsgDownloadImgEvent.e();
            if (gameMsgDownloadImgEvent.f54368h.f8194b) {
                java.lang.String str2 = gameMsgDownloadImgEvent.f54368h.f8193a + kk.k.g(str.getBytes());
                o11.f fVar = new o11.f();
                fVar.f342078b = true;
                fVar.f342082f = str2;
                n11.a.b().k(str, null, fVar.a(), new r53.h(gameMsgDownloadImgEvent), new r53.i(f17, gameMsgDownloadImgEvent));
            }
        }
    }

    public static void C(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "setNotDisturbMsg, msgRelatedId:%s, flag:%b", str, java.lang.Boolean.valueOf(z17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotDisturb_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        java.lang.String sb7 = sb6.toString();
        if (z17) {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().L0(sb7, "1".getBytes());
        } else {
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().z0(sb7);
        }
    }

    public static void D(android.content.Context context, android.content.Intent intent) {
        l33.c.c();
        if (intent.getIntExtra("game_report_from_scene", 0) == 901) {
            r53.d dVar = r53.b.f392640a;
            r53.c cVar = dVar.f392649c;
            cVar.f392642a = 0L;
            cVar.f392643b = 0L;
            cVar.f392644c = 0L;
            cVar.f392645d = 0L;
            cVar.f392642a = java.lang.System.currentTimeMillis();
            dVar.f392649c.f392645d = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.game.model.d0.d((android.app.Activity) context, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r0.getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy)) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(android.content.Intent r4, android.content.Context r5) {
        /*
            java.lang.String r0 = "rawUrl"
            java.lang.String r0 = r4.getStringExtra(r0)
            java.lang.Class<kj0.l> r1 = kj0.l.class
            i95.m r1 = i95.n0.c(r1)
            kj0.l r1 = (kj0.l) r1
            e42.d0 r2 = e42.d0.game_luggage
            kj0.i r1 = (kj0.i) r1
            r3 = 1
            boolean r1 = r1.Bi(r2, r3)
            r2 = 0
            if (r1 != 0) goto L1c
        L1a:
            r3 = r2
            goto L3e
        L1c:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 == 0) goto L23
            goto L1a
        L23:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r1 = r0.getHost()
            if (r1 == 0) goto L1a
            java.lang.String r0 = r0.getHost()
            r1 = 2131769592(0x7f1038f8, float:1.9170463E38)
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.t9.a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
        L3e:
            if (r3 == 0) goto L44
            F(r4, r5)
            goto L54
        L44:
            com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent r0 = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent
            r0.<init>()
            am.nl r1 = r0.f54542g
            r1.f7433a = r2
            r1.f7434b = r5
            r1.f7435c = r4
            r0.e()
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.E(android.content.Intent, android.content.Context):void");
    }

    public static void F(android.content.Intent intent, android.content.Context context) {
        com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent();
        am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
        nlVar.f7433a = 2;
        nlVar.f7434b = context;
        nlVar.f7435c = intent;
        notifyGameWebviewOperationEvent.e();
    }

    public static java.util.LinkedList G(java.lang.String str) {
        java.lang.String[] split = str.substring(1, str.length() - 1).split(",");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : split) {
            linkedList.add(str2.trim());
        }
        return linkedList;
    }

    public static void H(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return;
            }
            android.net.Uri parse = android.net.Uri.parse(str3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = parse.getQueryParameter("wechat_pkgid");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                java.lang.String queryParameter = parse.getQueryParameter("liteapp");
                if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                    return;
                }
                java.lang.String[] split = queryParameter.split("\\?");
                if (split.length == 0) {
                    return;
                }
                str2 = split[0].replace("liteapp://", "");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    return;
                }
            }
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str2);
        d(str, str2, Bj == null ? null : Bj.patchId);
    }

    public static boolean I(android.view.View view, android.content.Context context) {
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
            return false;
        }
        java.lang.String str = (java.lang.String) view.getTag();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        E(intent, context);
        return true;
    }

    public static java.lang.String a(java.lang.String str, java.util.Map map) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || map == null || map.isEmpty()) {
            return str;
        }
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        for (java.lang.String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (java.lang.String) map.get(str2));
        }
        return buildUpon.build().toString();
    }

    public static java.util.LinkedList b(org.json.JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            java.lang.String trim = jSONArray.optString(i17).trim();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                linkedList.add(trim);
            }
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "MicroMsg.GameCenterUtil"
            android.net.Uri r13 = android.net.Uri.parse(r13)
            java.lang.String r1 = "weapp"
            java.lang.String r13 = r13.getQueryParameter(r1)
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r13)
            r2 = 0
            if (r1 != 0) goto Lac
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch: java.lang.Exception -> L96
            java.lang.String r6 = r13.getAuthority()     // Catch: java.lang.Exception -> L96
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r6)     // Catch: java.lang.Exception -> L96
            if (r1 == 0) goto L29
            java.lang.String r12 = "targetAppId is null"
            com.tencent.mars.xlog.Log.w(r0, r12)     // Catch: java.lang.Exception -> L96
            return r2
        L29:
            java.lang.String r1 = "env_version"
            java.lang.String r1 = r13.getQueryParameter(r1)     // Catch: java.lang.Exception -> L96
            java.lang.String r3 = "path"
            java.lang.String r9 = r13.getQueryParameter(r3)     // Catch: java.lang.Exception -> L96
            if (r1 != 0) goto L39
            java.lang.String r1 = ""
        L39:
            int r13 = r1.hashCode()     // Catch: java.lang.Exception -> L96
            r3 = 110628630(0x6980f16, float:5.719821E-35)
            r11 = 1
            if (r13 == r3) goto L53
            r3 = 1559690845(0x5cf6fe5d, float:5.5618016E17)
            if (r13 == r3) goto L49
            goto L5e
        L49:
            java.lang.String r13 = "develop"
            boolean r13 = r1.equals(r13)     // Catch: java.lang.Exception -> L96
            if (r13 == 0) goto L5e
            r13 = r2
            goto L5f
        L53:
            java.lang.String r13 = "trial"
            boolean r13 = r1.equals(r13)     // Catch: java.lang.Exception -> L96
            if (r13 == 0) goto L5e
            r13 = r11
            goto L5f
        L5e:
            r13 = -1
        L5f:
            r1 = 2
            if (r13 == 0) goto L68
            if (r13 == r11) goto L66
            r7 = r2
            goto L69
        L66:
            r7 = r1
            goto L69
        L68:
            r7 = r11
        L69:
            java.lang.String r13 = "jumpWeApp, appId: %s, versionType: %d, path: %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L96
            r3[r2] = r6     // Catch: java.lang.Exception -> L96
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L96
            r3[r11] = r4     // Catch: java.lang.Exception -> L96
            r3[r1] = r9     // Catch: java.lang.Exception -> L96
            com.tencent.mars.xlog.Log.i(r0, r13, r3)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r10 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject     // Catch: java.lang.Exception -> L96
            r10.<init>()     // Catch: java.lang.Exception -> L96
            r13 = 1079(0x437, float:1.512E-42)
            r10.f87790f = r13     // Catch: java.lang.Exception -> L96
            java.lang.Class<com.tencent.mm.plugin.appbrand.service.h6> r13 = com.tencent.mm.plugin.appbrand.service.h6.class
            i95.m r13 = i95.n0.c(r13)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.plugin.appbrand.service.h6 r13 = (com.tencent.mm.plugin.appbrand.service.h6) r13     // Catch: java.lang.Exception -> L96
            r5 = 0
            r8 = 0
            r3 = r13
            com.tencent.mm.plugin.appbrand.launching.xc r3 = (com.tencent.mm.plugin.appbrand.launching.xc) r3     // Catch: java.lang.Exception -> L96
            r4 = r12
            r3.aj(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L96
            return r11
        L96:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "checkJumpWeApp: "
            r13.<init>(r1)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.mars.xlog.Log.e(r0, r12)
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.c(android.content.Context, java.lang.String):boolean");
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "checkPatchExist fail,pkgId or appId is empty");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new r53.j(str, str2, str3));
    }

    public static android.app.Dialog e(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bhf, null);
        com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(context, com.tencent.mm.R.style.f494222hh);
        k2Var.setContentView(inflate);
        k2Var.setCancelable(true);
        k2Var.setCanceledOnTouchOutside(false);
        k2Var.setOnCancelListener(new r53.g(k2Var));
        return k2Var;
    }

    public static java.lang.String f(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        if (!it.hasNext()) {
            return "()";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        while (true) {
            sb6.append("\"" + ((java.lang.String) it.next()).trim() + "\"");
            if (!it.hasNext()) {
                sb6.append(')');
                return sb6.toString();
            }
            sb6.append(',');
        }
    }

    public static java.lang.String g() {
        m53.e1 e1Var;
        m53.e1 e1Var2;
        java.lang.String Ai = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_center_home_url_android, "");
        if (Ai != null && !com.tencent.mm.sdk.platformtools.t8.K0(Ai.trim())) {
            if (Ai.equals("native")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, 11L, 1L, false);
                return null;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, 10L, 1L, false);
            return Ai;
        }
        com.tencent.mm.plugin.game.commlib.i.e();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = com.tencent.mm.plugin.game.commlib.i.f139381a;
        if (getGameCenterGlobalSettingResponse != null && (e1Var2 = getGameCenterGlobalSettingResponse.GameIndexSetting) != null && e1Var2.f323644f == 1) {
            return e1Var2.f323645g;
        }
        com.tencent.mm.plugin.game.commlib.i.s();
        com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse2 = com.tencent.mm.plugin.game.commlib.i.f139381a;
        if (getGameCenterGlobalSettingResponse2 == null || (e1Var = getGameCenterGlobalSettingResponse2.GameIndexSetting) == null || e1Var.f323644f != 1) {
            return null;
        }
        return e1Var.f323645g;
    }

    public static int h(android.content.Context context) {
        if (context == null) {
            return 0;
        }
        if (f392659g == null) {
            f392659g = new android.util.DisplayMetrics();
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(f392659g);
        }
        return f392659g.widthPixels;
    }

    public static int i(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameCenterUtil", "Null or Nil path");
            return 0;
        }
        android.content.pm.PackageInfo packageArchiveInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo == null) {
            return 0;
        }
        return packageArchiveInfo.versionCode;
    }

    public static int j(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
            return 0;
        }
        try {
            packageInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameCenterUtil", "Exception: %s", e17.toString());
            packageInfo = null;
        }
        if (packageInfo == null) {
            return 0;
        }
        return packageInfo.versionCode;
    }

    public static java.lang.String k(java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
            return "";
        }
        try {
            packageInfo = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getPackageInfo(str, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameCenterUtil", "Exception: %s", e17.toString());
            packageInfo = null;
        }
        return packageInfo == null ? "" : packageInfo.versionName;
    }

    public static com.tencent.mm.sdk.platformtools.n3 l() {
        if (f392654b == null) {
            synchronized (f392655c) {
                if (f392654b == null) {
                    f392654b = new com.tencent.mm.sdk.platformtools.n3("SubCoreGameCenter#WorkThread");
                    lm5.i.c("SubCoreGameCenter#WorkThread", new t65.g("SubCoreGameCenter#WorkThread"));
                }
            }
        }
        return f392654b;
    }

    public static boolean m(java.lang.String str) {
        return ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(str) != null;
    }

    public static boolean n(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotDisturb_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().D0(sb6.toString()) != null;
    }

    public static int o(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, int i17) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && bundle == null) {
            bundle = new android.os.Bundle();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return v(context, str2, "game_center_detail", null);
        }
        m53.v0 f17 = com.tencent.mm.plugin.game.commlib.i.f();
        int i18 = f17 != null ? f17.f324116d : 0;
        if (i18 == 2) {
            return p(context, str, i17);
        }
        if (i18 == 1) {
            q(context, bundle);
            return 6;
        }
        java.lang.String d07 = com.tencent.mm.sdk.platformtools.t8.d0(context);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d07) || d07.toLowerCase().equals("cn")) {
            return p(context, str, i17);
        }
        q(context, bundle);
        return 6;
    }

    public static int p(android.content.Context context, java.lang.String str, int i17) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        m53.v0 f17 = com.tencent.mm.plugin.game.commlib.i.f();
        java.lang.String str3 = f17 != null ? f17.f324117e : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str2 = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/gamecenter/detail.html?appid=" + str;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("appid", str);
            if (i17 > 0) {
                hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, java.lang.String.valueOf(i17));
            }
            str2 = a(str3, hashMap);
        }
        return v(context, str2, "game_center_detail", null);
    }

    public static void q(android.content.Context context, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, "com.tencent.mm.plugin.game.ui.GameDetailUI2");
        intent.putExtras(bundle);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/utils/GameCenterUtil", "jumpGameDetailNative", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/utils/GameCenterUtil", "jumpGameDetailNative", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void r(android.content.Context context, com.tencent.mm.plugin.game.model.e1 e1Var, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", e1Var.f140291p2.f140323a);
        intent.putExtra("finishviewifloadfailed", true);
        com.tencent.mm.plugin.game.model.h0 h0Var = e1Var.f140291p2;
        intent.putExtra("show_full_screen", h0Var.f140324b);
        intent.putExtra("disable_progress_bar", h0Var.f140324b);
        int i17 = h0Var.f140325c;
        intent.putExtra("screen_orientation", i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? -1 : 1002 : 1001 : 1 : 0);
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("open_game_float", true);
        com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent = new com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent();
        am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
        nlVar.f7433a = 1;
        nlVar.f7434b = context;
        nlVar.f7435c = intent;
        notifyGameWebviewOperationEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(final android.content.Context r17, final com.tencent.mm.plugin.game.model.r0 r18, java.lang.String r19, java.lang.String r20, final q80.f0 r21) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.s(android.content.Context, com.tencent.mm.plugin.game.model.r0, java.lang.String, java.lang.String, q80.f0):void");
    }

    public static void t(android.content.Context context, java.lang.String str, cl0.g gVar, com.tencent.mm.plugin.game.model.r0 r0Var, q80.f0 f0Var) {
        boolean z17;
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str2 = "";
        try {
            bundle.putString("appId", str);
            if (gVar.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE)) {
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, gVar.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE));
            }
            if (gVar.has("query")) {
                bundle.putString("query", gVar.a("query").toString());
            }
            if (str.contains("?")) {
                bundle.putString("pkgId", str.split("\\?")[1]);
            }
            if (gVar.has("isTransparent")) {
                bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, gVar.getBoolean("isTransparent"));
            }
            if (gVar.has("pageOrientation")) {
                bundle.putString("pageOrientation", "portrait");
            }
            if (gVar.has("isHalfScreen")) {
                z17 = gVar.getBoolean("isHalfScreen");
                if (z17) {
                    bundle.putBoolean("isHalfScreen", true);
                }
            } else {
                z17 = false;
            }
            if (gVar.has("heightPercent")) {
                bundle.putDouble("heightPercent", gVar.getDouble("heightPercent"));
            }
            if (gVar.has("enableDragToCloseInHalfScreen")) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(gVar.getBoolean("enableDragToCloseInHalfScreen"));
                if (z17) {
                    bundle.putBoolean("enableDragToCloseInHalfScreen", valueOf.booleanValue());
                }
            }
            if (gVar.has("isForbidRightGesture")) {
                bundle.putBoolean("forbidRightGesture", gVar.getBoolean("isForbidRightGesture"));
            }
            cl0.g b17 = gVar.b("keepAlive");
            if (b17 != null) {
                bundle.putInt("keepAliveSeconds", b17.optInt("seconds", 0));
            }
            if (gVar.has("ignoreAlive")) {
                bundle.putInt("ignoreAlive", b17.optInt("seconds", 0));
            }
            if (gVar.has("preInjectData")) {
                java.lang.String string = gVar.getString("preInjectData");
                try {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        bundle.putString("preInjectData", string);
                    }
                    str2 = string;
                } catch (org.json.JSONException e17) {
                    e = e17;
                    str2 = string;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameCenterUtil", e, "JSONException", new java.lang.Object[0]);
                    y(context, r0Var, 0, str2, bundle, f0Var);
                }
            }
            if (gVar.has("withDownloadLoading")) {
                bundle.putBoolean("withDownloadLoading", gVar.getBoolean("withDownloadLoading"));
            }
            if (gVar.has("entranceStoreData")) {
                bundle.putString("entranceStoreData", gVar.getString("entranceStoreData"));
            }
            if (gVar.has("fromFindGameEntrance")) {
                bundle.putBoolean("fromFindGameEntrance", gVar.getBoolean("fromFindGameEntrance"));
            }
            if (gVar.has("pkgId")) {
                bundle.putString("pkgId", gVar.getString("pkgId"));
            }
        } catch (org.json.JSONException e18) {
            e = e18;
        }
        y(context, r0Var, 0, str2, bundle, f0Var);
    }

    public static int u(android.content.Context context, java.lang.String str) {
        return v(context, str, null, null);
    }

    public static int v(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        if (c(context, str)) {
            return 30;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("game_pre_inject_data", str3);
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str2);
        E(intent, context);
        return 7;
    }

    public static void w(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        b1Var.f317022f = str2;
        b1Var.f317016c = i17;
        b1Var.f317032k = 1079;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context, b1Var);
    }

    public static int x(android.content.Context context, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo, int i17, java.lang.String str) {
        com.tencent.mm.plugin.game.autogen.chatroom.HalfScreen halfScreen = jumpInfo.half_screen;
        if (halfScreen != null) {
            int i18 = halfScreen.type;
            if (i18 == 1) {
                com.tencent.mm.plugin.game.commlib.util.n.a(context, jumpInfo.jump_url, i17, true, halfScreen.screen_height_dp, -1.0f, "", str);
                return 2;
            }
            if (i18 == 2) {
                com.tencent.mm.plugin.game.commlib.util.n.a(context, jumpInfo.jump_url, i17, true, 0, halfScreen.screen_height_percent, "", str);
                return 2;
            }
        }
        return v(context, jumpInfo.jump_url, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(android.content.Context r13, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r14, int r15, java.lang.String r16, android.os.Bundle r17, q80.f0 r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.f.y(android.content.Context, com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo, int, java.lang.String, android.os.Bundle, q80.f0):void");
    }

    public static int z(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "parseColor: " + e17.getMessage());
            }
        }
        return 0;
    }
}
