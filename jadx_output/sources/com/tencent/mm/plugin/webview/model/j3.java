package com.tencent.mm.plugin.webview.model;

/* loaded from: classes15.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f182959a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f182960b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f182961c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f182962d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f182963e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f182964f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f182965g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f182966h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f182967i;

    public j3(android.content.Context context, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f182965g = false;
        this.f182959a = context;
        this.f182965g = z17;
        this.f182960b = str;
        this.f182966h = str2;
    }

    public static void a(r45.xv5 xv5Var, java.util.LinkedList linkedList) {
        if (n("snsapi_userinfo", xv5Var.f390513d) != null) {
            linkedList.add("snsapi_userinfo");
        } else if (n("snsapi_login", xv5Var.f390513d) != null) {
            linkedList.add("snsapi_login");
        } else {
            linkedList.add("group_sns_login");
        }
    }

    public static java.lang.Boolean b(r45.xv5 xv5Var, boolean z17) {
        java.util.LinkedList linkedList;
        com.tencent.mm.protobuf.g gVar = xv5Var.A;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(gVar != null && gVar.f192156a.length > 0);
        objArr[1] = java.lang.Boolean.valueOf(xv5Var.B);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "gameBuffer is not empty = %s, have gameCenter page = %s, isFromQRCodeScan = %s", objArr);
        if (gVar != null && gVar.f192156a.length > 0 && xv5Var.B) {
            r45.lq3 lq3Var = new r45.lq3();
            try {
                lq3Var.parseFrom(gVar.g());
                java.util.LinkedList linkedList2 = lq3Var.f379720d;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    r45.aw6 aw6Var = lq3Var.f379722f;
                    if (aw6Var == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "interface config is null!");
                        return java.lang.Boolean.FALSE;
                    }
                    r45.zv6 zv6Var = aw6Var.f370317e;
                    if (zv6Var != null && (linkedList = zv6Var.f392414d) != null && !linkedList.isEmpty()) {
                        r45.cw6 cw6Var = lq3Var.f379722f.f370316d;
                        if (cw6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(cw6Var.f371876f) && !com.tencent.mm.sdk.platformtools.t8.K0(lq3Var.f379722f.f370316d.f371877g) && !com.tencent.mm.sdk.platformtools.t8.K0(lq3Var.f379722f.f370316d.f371875e)) {
                            return java.lang.Boolean.TRUE;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "interface_config title is not enough");
                        return java.lang.Boolean.FALSE;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "interface_config body is empty");
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "grant info list is empty!");
                return java.lang.Boolean.FALSE;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "parse proto fail, %s", e17.getMessage());
            }
        }
        return java.lang.Boolean.FALSE;
    }

    public static r45.xv5 c(r45.dg5 dg5Var) {
        if (dg5Var == null) {
            return null;
        }
        r45.xv5 xv5Var = new r45.xv5();
        xv5Var.BaseResponse = dg5Var.BaseResponse;
        xv5Var.f390517h = false;
        xv5Var.f390518i = false;
        xv5Var.f390521o = true;
        xv5Var.f390519m = false;
        xv5Var.f390513d = dg5Var.f372438e;
        xv5Var.f390514e = dg5Var.f372440g;
        xv5Var.f390515f = dg5Var.f372441h;
        xv5Var.f390516g = "";
        xv5Var.f390520n = dg5Var.f372442i;
        xv5Var.f390522p = dg5Var.f372443m;
        xv5Var.f390523q = dg5Var.f372444n;
        xv5Var.f390524r = dg5Var.f372445o;
        xv5Var.f390525s = dg5Var.f372446p;
        xv5Var.f390526t = dg5Var.f372447q;
        xv5Var.f390531y = dg5Var.f372448r;
        xv5Var.C = dg5Var.f372449s;
        xv5Var.A = dg5Var.f372451u;
        xv5Var.B = dg5Var.f372452v;
        return xv5Var;
    }

    public static void g(final android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "delayFish activity: " + activity);
        activity.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.model.j3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "delayFish activity done");
                activity.finish();
            }
        };
        long j17 = fp.h.c(28) ? 10L : 500L;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, j17, false);
    }

    public static java.lang.String l(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((java.lang.String) it.next()) + ", ";
        }
        return str;
    }

    public static boolean m(r45.xv5 xv5Var) {
        java.util.LinkedList linkedList = new java.util.LinkedList(xv5Var.f390513d);
        java.util.Iterator it = xv5Var.f390513d.iterator();
        while (true) {
            boolean z17 = true;
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.px4 px4Var = (r45.px4) it.next();
            if (px4Var != null) {
                if (!"snsapi_friend".equals(px4Var.f383458d) && !"snsapi_wxaapp_info".equals(px4Var.f383458d)) {
                    z17 = false;
                }
                z18 = z17;
            }
            if (z18 || p(px4Var)) {
                linkedList.remove(px4Var);
            }
        }
        return linkedList.size() != 0;
    }

    public static r45.px4 n(java.lang.String str, java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.px4 px4Var = (r45.px4) it.next();
            if (str.equals(px4Var.f383458d)) {
                return px4Var;
            }
        }
        return null;
    }

    public static boolean p(r45.px4 px4Var) {
        if (px4Var == null) {
            return false;
        }
        return "snsapi_userinfo".equals(px4Var.f383458d) || "snsapi_login".equals(px4Var.f383458d) || "group_sns_login".equals(px4Var.f383458d);
    }

    public void d(int i17, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options, java.lang.String str, int i18, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "dealWithCancel");
        boolean z18 = this.f182965g;
        android.content.Context context = this.f182959a;
        if (z18) {
            gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.p1(2, this.f182966h, null, 0));
            ((com.tencent.mm.ui.MMActivity) context).finish();
            return;
        }
        java.lang.String k17 = k(this.f182960b);
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.r1(2, this.f182960b, this.f182963e, k17, null, 0, this.f182961c, this.f182967i, str, i18, z17));
        com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp = new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp();
        resp.transaction = this.f182962d;
        resp.errCode = i17;
        resp.lang = "zh_CN";
        resp.country = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(resp.state)) {
            resp.state = this.f182963e;
        }
        h(k17, resp, options);
        ((com.tencent.mm.ui.MMActivity) context).finish();
    }

    public void e(com.tencent.mm.plugin.webview.model.i3 i3Var, java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options) {
        com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp;
        java.lang.String b17 = i3Var.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback url : %s", b17);
        java.lang.String k17 = k(this.f182960b);
        if (com.tencent.mm.sdk.platformtools.t8.K0(k17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "dealWithLoginCallback pkg nil");
            return;
        }
        boolean equals = str.trim().equals("snsapi_wxaapp_info");
        if (i3Var.c() == null || i3Var.c().f192156a.length <= 0) {
            resp = new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp();
        } else {
            com.tencent.mm.opensdk.modelmsg.SendTdiAuth.Resp resp2 = new com.tencent.mm.opensdk.modelmsg.SendTdiAuth.Resp(android.os.Bundle.EMPTY);
            resp2.tdiAuthBuffer = i3Var.c().g();
            resp = resp2;
        }
        resp.transaction = this.f182962d;
        resp.lang = "zh_CN";
        resp.country = "";
        java.lang.String str2 = null;
        android.net.Uri parse = !com.tencent.mm.sdk.platformtools.t8.K0(b17) ? android.net.Uri.parse(b17) : null;
        if (parse != null) {
            str2 = parse.getQueryParameter("code");
            resp.state = parse.getQueryParameter("state");
            resp.errStr = parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON);
        } else {
            resp.state = this.f182963e;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || equals) {
            if ((str2 != null ? str2 : "").toLowerCase().equals("authdeny")) {
                resp.errCode = -4;
            } else {
                resp.errCode = 0;
                if (equals) {
                    resp.authResult = true;
                } else {
                    resp.code = str2;
                }
            }
        } else {
            resp.errCode = -1;
        }
        if (!equals) {
            resp.url = b17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback, pkg:%s code:%s errCode:%d state:%s type:%d", k17, resp.code, java.lang.Integer.valueOf(resp.errCode), resp.state, java.lang.Integer.valueOf(resp.getType()));
        h(k17, resp, options);
        ((com.tencent.mm.ui.MMActivity) this.f182959a).finish();
    }

    public void f(android.content.Context context, com.tencent.mm.plugin.webview.model.i3 i3Var, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options, boolean z17) {
        if (!i3Var.d() || com.tencent.mm.sdk.platformtools.t8.K0(i3Var.a())) {
            e(i3Var, str5, options);
            com.tencent.mm.pluginsdk.model.app.j1.a(i17, str2, str, 1, com.tencent.mm.pluginsdk.model.app.f5.a(i18), 1);
            return;
        }
        java.lang.String a17 = i3Var.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "showUserConfirmDialog  message:" + a17 + " iconUrl:" + str3 + "  appName:" + str4);
        if (context != null && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "showUserConfirmDialog  activity is Destroy " + context);
                com.tencent.mm.pluginsdk.model.app.j1.a(i17, str2, str, 1, com.tencent.mm.pluginsdk.model.app.f5.a(i18), 2);
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.it, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hlr);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.native_oauth_default_head_img;
        fVar.f342097u = context.getResources().getDimension(com.tencent.mm.R.dimen.a9i);
        fVar.f342096t = true;
        n11.a.b().h(str3, imageView, fVar.a());
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.okx)).setText(str4);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(a17);
        u1Var.d(inflate);
        u1Var.n(context.getString(com.tencent.mm.R.string.f490507x1));
        u1Var.j(context.getString(com.tencent.mm.R.string.f490347sg));
        u1Var.l(new com.tencent.mm.plugin.webview.model.l3(this, i3Var, str5, options, i17, str2, str, i18));
        u1Var.i(new com.tencent.mm.plugin.webview.model.k3(this, options, str, i18, z17, i17, str2));
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            u1Var.q(false);
        } else {
            ru5.g b17 = ru5.g.b();
            b17.f399801b = ru5.g.f399798j;
            b17.f(new com.tencent.mm.plugin.webview.model.m3(this, u1Var)).g();
        }
        com.tencent.mm.pluginsdk.model.app.j1.a(i17, str2, str, 1, com.tencent.mm.pluginsdk.model.app.f5.a(i18), 2);
    }

    public final void h(java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options) {
        if (this.f182964f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "doCallback has callback");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "doCallback pkg is empty");
            return;
        }
        this.f182964f = true;
        android.os.Bundle bundle = new android.os.Bundle();
        resp.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        if (options != null && !com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "doCallback options.callbackClassName:" + options.callbackClassName);
            args.targetClassName = options.callbackClassName;
            args.flags = options.callbackFlags;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "doCallback pkg:" + str);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(this.f182959a, args);
    }

    public void i(int i17, java.util.LinkedList linkedList, int i18, java.lang.String str, com.tencent.mm.protobuf.g gVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            sb6.append((java.lang.String) linkedList.get(i19));
            sb6.append(",");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "doQRCodeOauthAuthorizeConfirm selectedScopes: %s", sb6.toString());
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.p1(i17, str, linkedList, i18, gVar, z17));
    }

    public void j(int i17, java.util.LinkedList linkedList, int i18, java.lang.String str, int i19, com.tencent.mm.protobuf.g gVar, java.lang.Boolean bool, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            sb6.append((java.lang.String) linkedList.get(i27));
            sb6.append(",");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "doSDKOauthAuthorizeConfirm selectedScopes: %s, isOption1:%b", sb6.toString(), java.lang.Boolean.valueOf(z17));
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String str3 = this.f182960b;
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.r1(i17, str3, this.f182963e, k(str3), linkedList, i18, this.f182961c, this.f182967i, str, i19, gVar, bool, z17));
    }

    public final java.lang.String k(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j17 != null) {
            return j17.field_packageName;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SDKOauthUtil", "dealWithCancel getAppInfo null; appid: %s", str);
        return null;
    }

    public final boolean o(int i17) {
        if (i17 == 1 || i17 == 2 || i17 == 7 || i17 == 8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, errType = " + i17);
            return false;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, not connected");
        return false;
    }

    public void q(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "onQRCodeOauthAuthorizeConfirmEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.content.Context context = this.f182959a;
        if (i17 == 0 && i18 == 0) {
            ((com.tencent.mm.ui.MMActivity) context).finish();
        } else if (o(i17)) {
            s(str, options);
        } else {
            s(context.getString(com.tencent.mm.R.string.l8c), options);
        }
    }

    public void r(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, int i27, java.lang.String str5, com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKOauthUtil", "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 != 0 || i27 != 0) {
            if (o(i19)) {
                s(str5, options);
                return;
            } else {
                s(this.f182959a.getString(com.tencent.mm.R.string.l8c), options);
                return;
            }
        }
        com.tencent.mm.plugin.webview.model.r1 r1Var = (com.tencent.mm.plugin.webview.model.r1) m1Var;
        r45.vv5 resp = (r45.vv5) r1Var.f183085d.f70711b.f70700a;
        java.lang.String h17 = u46.l.h(new java.util.LinkedList(r1Var.f183088g), ",");
        kotlin.jvm.internal.o.g(resp, "resp");
        f(context, new com.tencent.mm.plugin.webview.model.g3(resp), str, i17, str2, i18, str3, str4, h17, options, z17);
    }

    public final void s(java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Options options) {
        android.content.Context context = this.f182959a;
        db5.e1.t(context, str, context.getString(com.tencent.mm.R.string.l8b), new com.tencent.mm.plugin.webview.model.n3(this, str, options));
    }

    public j3(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f182965g = false;
        this.f182959a = context;
        this.f182960b = str;
        this.f182962d = str2;
        this.f182963e = str3;
        this.f182964f = false;
        this.f182961c = str4;
    }
}
