package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class s extends com.tencent.mm.plugin.webview.stub.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.WebViewStubService f183566d;

    public s(com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService) {
        this.f183566d = webViewStubService;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void A5(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "removeCallback, id = %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        java.util.Iterator it = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
            if (webViewStubCallbackWrapper.f183796e == i17) {
                it.remove();
            } else if (!com.tencent.mm.plugin.webview.stub.WebViewStubService.b(webViewStubService, webViewStubCallbackWrapper)) {
                it.remove();
            }
        }
        webViewStubService.f183481d.remove(i17);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void D8(java.lang.String str, int[] iArr, int i17, int i18) {
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        if (webViewStubService.f183483f == null) {
            webViewStubService.f183483f = new java.util.HashMap();
            webViewStubService.f183484g.alive();
            webViewStubService.f183485h.alive();
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(i17));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(i18));
        com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileEvent();
        am.aq aqVar = recogQBarOfImageFileEvent.f54659g;
        aqVar.f6175b = str;
        aqVar.f6174a = java.lang.System.currentTimeMillis();
        aqVar.f6179f = 2;
        if (iArr != null && iArr.length > 0) {
            aqVar.f6177d = new java.util.HashSet();
            for (int i19 : iArr) {
                aqVar.f6177d.add(java.lang.Integer.valueOf(i19));
            }
        }
        recogQBarOfImageFileEvent.e();
        webViewStubService.f183483f.put(str, 1);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void Dd(java.lang.String str) {
        boolean a17 = gm0.j1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "triggerGetContact, accHasReady = " + a17);
        com.tencent.mm.plugin.webview.stub.y yVar = new com.tencent.mm.plugin.webview.stub.y(this, 1000L, null, str);
        if (a17) {
            yVar.a(null);
        } else {
            yVar.a(this.f183566d.f183488n);
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean F4(int i17, android.os.Bundle bundle) {
        com.tencent.mm.modelsimple.k0 k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "doScene, type = %d", java.lang.Integer.valueOf(i17));
        if (i17 != 233) {
            com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
            if (i17 == 666) {
                if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                }
                int i18 = com.tencent.mm.plugin.webview.stub.WebViewStubService.B;
                webViewStubService.getClass();
                java.lang.String string = bundle.getString("emoji_store_jump_url");
                ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.o5) i95.n0.c(com.tencent.mm.feature.emoji.api.o5.class))).getClass();
                f11.k kVar = new f11.k(string);
                kVar.f258566f = java.lang.Integer.valueOf(bundle.getInt("webview_binder_id"));
                return gm0.j1.d().h(kVar, 0);
            }
            if (i17 == 673) {
                if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                }
                com.tencent.mm.plugin.webview.model.f1 f1Var = new com.tencent.mm.plugin.webview.model.f1(bundle.getString("reading_mode_data_url"), bundle.getString("reading_mode_data_useragent"), bundle.getInt("reading_mode_data_width"), bundle.getInt("reading_mode_data_height"));
                f1Var.f182872f = java.lang.Integer.valueOf(bundle.getInt("webview_binder_id"));
                return gm0.j1.d().h(f1Var, 0);
            }
            if (i17 == 1295) {
                if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                }
                if (bundle != null) {
                    java.lang.String string2 = bundle.getString("ad_report_data_str");
                    if (i95.n0.c(p94.c0.class) != null) {
                        ((n34.c) ((p94.c0) i95.n0.c(p94.c0.class))).wi(13791, string2, (int) com.tencent.mm.sdk.platformtools.t8.i1());
                        return true;
                    }
                }
                return false;
            }
            if (i17 != 2836) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "doScene fail, invalid type = %d", java.lang.Integer.valueOf(i17));
                return false;
            }
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                return false;
            }
            int i19 = com.tencent.mm.plugin.webview.stub.WebViewStubService.B;
            webViewStubService.getClass();
            java.lang.String string3 = bundle.getString("service_click_tid");
            long j17 = bundle.getLong("service_click_stime", 0L);
            long j18 = bundle.getLong("service_click_etime", 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "doServiceClick tid = %s, stime = %d, etime = %d", string3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            if (string3 == null || string3.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "doServiceClick fail, tid is null");
                return false;
            }
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.m06();
            lVar.f70665b = new r45.n06();
            lVar.f70666c = "/cgi-bin/mmoc-bin/ad/service_click";
            lVar.f70667d = 2836;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.m06 m06Var = (r45.m06) a17.f70710a.f70684a;
            m06Var.f380049d = string3;
            m06Var.f380050e = j17;
            m06Var.f380051f = j18;
            com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.plugin.webview.stub.j0(webViewStubService), false);
            return true;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
            return false;
        }
        java.lang.String string4 = bundle.getString("geta8key_data_req_url");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(bundle.getString("k_share_url"))) {
            com.tencent.mm.plugin.webview.model.c6.a(string4, bundle.getString("k_share_url"));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
            w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
            java.lang.String string5 = bundle.getString("geta8key_data_appid");
            java.lang.String string6 = bundle.getString("geta8key_data_scope");
            java.lang.String string7 = bundle.getString("geta8key_data_state");
            int i27 = bundle.getInt("geta8key_session_id", 0);
            ((v60.u) jVar).getClass();
            k0Var = new com.tencent.mm.modelsimple.k0(string5, string6, string7, i27);
        } else {
            w60.j jVar2 = (w60.j) i95.n0.c(w60.j.class);
            java.lang.String string8 = bundle.getString("geta8key_data_username");
            int i28 = bundle.getInt("geta8key_data_scene");
            int i29 = bundle.getInt("geta8key_data_reason");
            int i37 = bundle.getInt("geta8key_data_flag");
            java.lang.String string9 = bundle.getString("geta8key_data_net_type");
            int i38 = bundle.getInt("geta8key_session_id", 0);
            java.lang.String string10 = bundle.getString("geta8key_data_appid");
            java.lang.String string11 = bundle.getString("key_function_id");
            int i39 = bundle.getInt("key_wallet_region", 0);
            byte[] byteArray = bundle.getByteArray("k_a8key_cookie");
            ((v60.u) jVar2).getClass();
            com.tencent.mm.modelsimple.k0 k0Var2 = new com.tencent.mm.modelsimple.k0(string4, i29);
            r45.r83 r83Var = (r45.r83) k0Var2.f71356e.f70710a.f70684a;
            r83Var.f384610d = 2;
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = string4;
            du5Var.f372757e = true;
            r83Var.f384615i = du5Var;
            r83Var.f384618o = i28;
            r83Var.f384619p = string8;
            r83Var.f384622s = i29;
            r83Var.f384624u = i37;
            r83Var.f384625v = string9;
            r83Var.f384628y = i38;
            r83Var.f384629z = string11;
            r83Var.A = i39;
            r45.du5 du5Var2 = new r45.du5();
            du5Var2.f372756d = string10;
            du5Var2.f372757e = true;
            r83Var.f384612f = du5Var2;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(byteArray);
            r83Var.B = cu5Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s", string4, string8, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), string9, java.lang.Integer.valueOf(i38), string10, string11, java.lang.Integer.valueOf(i39), com.tencent.mm.sdk.platformtools.t8.l(byteArray));
            k0Var = k0Var2;
        }
        k0Var.f71360i = java.lang.Integer.valueOf(bundle.getInt("webview_binder_id"));
        int i47 = bundle.getInt("geta8key_data_subscene", -1);
        com.tencent.mm.modelbase.o oVar = k0Var.f71356e;
        if (i47 > 0) {
            ((r45.r83) oVar.f70710a.f70684a).D = i47;
        }
        java.lang.String string12 = bundle.getString("geta8key_outer_url");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string12)) {
            ((r45.r83) oVar.f70710a.f70684a).C = string12;
        }
        return gm0.j1.d().h(k0Var, 0);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void Gd(java.lang.String str, int i17) {
        new android.os.Bundle().putInt("webview_binder_id", i17);
        com.tencent.mm.plugin.webview.stub.WebViewStubService.a(this.f183566d, 5, null, i17);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String Ge(java.lang.String str) {
        o25.z.m(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        return "";
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public int J3() {
        return gm0.j1.b().h();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean Jg(java.lang.String str) {
        j45.l.g(str);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void M7(int i17) {
        android.os.Parcelable parcelable;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.f184992u = true;
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.pluginsdk.ui.tools.r8.f191881a).iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.tools.q8 q8Var = (com.tencent.mm.pluginsdk.ui.tools.q8) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onWebViewUIPause, pause plugin = " + q8Var.getName());
            q8Var.b(this.f183566d);
        }
        android.os.Bundle bundle = a17.f184984o;
        if (bundle == null || (parcelable = bundle.getParcelable("KSnsAdTag")) == null || !(parcelable instanceof com.tencent.mm.modelsns.SnsAdClick)) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((com.tencent.mm.modelsns.SnsAdClick) parcelable).f71474o = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean Mb(java.lang.String str) {
        return c01.e2.J(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:54|(2:56|(2:58|59))|60|61|63|59|52) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0190, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "ExDeviceConnectDeviceEvent publish failed");
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHandler", r0, "", new java.lang.Object[0]);
     */
    @Override // com.tencent.mm.plugin.webview.stub.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Md(int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.stub.s.Md(int, boolean):void");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String O3(java.lang.String str) {
        return com.tencent.mm.plugin.webview.model.c6.b(str);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String R9(java.lang.String str) {
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        java.lang.String c17 = com.tencent.mm.modelavatar.g.c(str, false, false);
        if (!com.tencent.mm.vfs.w6.j(c17)) {
            dw4.a.a(new com.tencent.mm.plugin.webview.stub.v(this, str));
        }
        return c17;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void Ri() {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        intent.setFlags(268435456);
        intent.putExtra("sns_userName", str);
        intent.addFlags(67108864);
        intent.putExtra("sns_adapter_type", 1);
        gm0.j1.u().c().w(68389, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(68389, null), 0) + 1));
        intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI");
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(webViewStubService, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewStubService.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(webViewStubService, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String S1(java.lang.String str) {
        java.lang.String format;
        com.tencent.mm.app.plugin.n nVar = (com.tencent.mm.app.plugin.n) ((o25.x1) i95.n0.c(o25.x1.class));
        nVar.getClass();
        java.util.ArrayList b17 = com.tencent.mm.pluginsdk.ui.span.b.b(this.f183566d, str);
        if (b17.size() == 0) {
            return str;
        }
        java.util.Collections.sort(b17, new com.tencent.mm.app.plugin.m(nVar));
        java.util.Iterator it = b17.iterator();
        java.lang.String str2 = str;
        while (it.hasNext()) {
            r35.m3 m3Var = (r35.m3) it.next();
            int i17 = m3Var.f369192a;
            int i18 = m3Var.f369193b;
            int i19 = m3Var.f369195d;
            java.lang.String str3 = i19 != 1 ? i19 != 24 ? i19 != 25 ? null : "<a href=\"%s@tel@\">%s</a>" : "<a href=\"%s@mailto@\">%s</a>" : "<a href=\"%s\">%s</a>";
            if (str3 != null) {
                java.lang.String e17 = m3Var.e();
                if (i19 != 1 || e17.startsWith("http://")) {
                    format = java.lang.String.format(str3, e17.trim(), e17.trim());
                } else {
                    format = java.lang.String.format(str3, "http://" + e17.trim(), e17.trim());
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(format) && i17 < i18) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    try {
                        sb6.append(str2.subSequence(0, i17 + 0));
                        sb6.append(format);
                        sb6.append(str2.subSequence(i18 + 0, str2.length()));
                        format.length();
                        str2 = sb6.toString();
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.QrCodeURLHelper", e18.getMessage());
                        str2 = "";
                    }
                }
                if (str2.length() == 0) {
                    return str;
                }
            }
        }
        return str2;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public int Sg(java.lang.String str) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 1, str);
        doFavoriteEvent.e();
        return doFavoriteEvent.f54091h.f6433a;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean T1(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "hasBindNetworkDevice, msgid:" + j17);
        if (j17 == Long.MIN_VALUE && str2 == null) {
            return false;
        }
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        if (j17 != Long.MIN_VALUE) {
            b6Var.f6219a = j17;
            b6Var.f6220b = str;
        }
        if (str2 != null) {
            b6Var.f6221c = str2;
        }
        exDeviceHaveBindNetworkDeviceEvent.e();
        if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
            return true;
        }
        if (gm0.j1.a() && j17 != Long.MIN_VALUE) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
            if (Li.getType() == 49) {
                boolean R4 = com.tencent.mm.storage.z3.R4(Li.Q0());
                java.lang.String j18 = Li.j();
                int A0 = Li.A0();
                if (R4 && j18 != null && A0 == 0) {
                    j18 = c01.w9.u(j18);
                }
                int i17 = ot0.q.v(j18).f348666i;
                if (i17 == 3) {
                    return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, 16L);
                }
                if (i17 == 4) {
                    return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, 8L);
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean T7() {
        return !gm0.j1.b().n() || gm0.m.r();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public android.os.Bundle U6(int i17, android.os.Bundle bundle) {
        j75.f Ai;
        com.tencent.mm.plugin.websearch.q0 q0Var = (com.tencent.mm.plugin.websearch.q0) com.tencent.mm.plugin.webview.modeltools.z.Ri();
        q0Var.getClass();
        if (i17 == 1) {
            int i18 = bundle.getInt("webview_id");
            q0Var.f181591d.remove(java.lang.Integer.valueOf(i18));
            su4.q0 q0Var2 = q0Var.f181598n;
            if ((!q0Var2.f413040a) && !com.tencent.mm.sdk.platformtools.t8.K0(q0Var2.f413041b)) {
                tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
                int i19 = q0Var2.f413045f;
                java.lang.String str = q0Var2.f413041b;
                boolean z17 = q0Var2.f413043d;
                boolean z18 = q0Var2.f413042c;
                int i27 = q0Var2.f413044e;
                ((sg0.q3) v1Var).getClass();
                int i28 = z17 ? 3 : z18 ? 2 : 1;
                jx3.f fVar = jx3.f.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = java.lang.Integer.valueOf(i19);
                objArr[1] = 1;
                objArr[2] = java.lang.Integer.valueOf(i28);
                objArr[3] = java.lang.Integer.valueOf(i27);
                if (str == null) {
                    str = "";
                }
                objArr[4] = str.replace(",", " ");
                fVar.d(12042, objArr);
                q0Var2.f413040a = true;
            }
            ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
            if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
                Ai.B3(new sa0.j());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "activity destroy %d", java.lang.Integer.valueOf(i18));
        } else if (i17 == 5) {
            java.lang.String string = bundle.getString("history");
            com.tencent.mm.plugin.fts.d0 d0Var = (com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class));
            if (d0Var.mj()) {
                android.util.SparseArray sparseArray = d0Var.f137398z;
                if (sparseArray.indexOfKey(8) >= 0) {
                    ((o13.w) sparseArray.get(8)).e(string);
                }
            }
        } else if (i17 == 6) {
            ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Bi(bundle.getString("reportString"));
        } else {
            if (i17 == 7) {
                com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent = new com.tencent.mm.autogen.events.FTSEmojiDownloadedEvent();
                am.n9 n9Var = fTSEmojiDownloadedEvent.f54231g;
                n9Var.f7406a = 3;
                n9Var.f7412g = bundle.getString("md5");
                n9Var.f7407b = bundle.getString("designerId");
                n9Var.f7410e = bundle.getString("aeskey");
                n9Var.f7411f = bundle.getString("encryptUrl");
                n9Var.f7413h = bundle.getString("productId");
                n9Var.f7409d = bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                n9Var.f7408c = bundle.getString("thumbUrl");
                fTSEmojiDownloadedEvent.e();
                am.o9 o9Var = fTSEmojiDownloadedEvent.f54232h;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "GENERATE_EMOJI_PATH %s", o9Var.f7518a);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("emojiPath", o9Var.f7518a);
                return bundle2;
            }
            if (i17 == 8) {
                r45.lq5 lq5Var = new r45.lq5();
                lq5Var.f379756t = bundle.getString("reportString");
                gm0.j1.d().g(new su4.a2(lq5Var));
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean Ua(java.lang.String str, boolean z17, android.os.Bundle bundle) {
        return ((com.tencent.mm.app.plugin.j) o25.z1.a()).b(this.f183566d, str, z17, null, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void Ui(int i17, int i18) {
        this.f183566d.f183488n.post(new com.tencent.mm.plugin.webview.stub.w(this, i17, i18));
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.util.List V3() {
        java.util.List<java.lang.String> p17 = r01.q3.cj().p1(128);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : p17) {
            if (!r01.z.k(str)) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void X9(java.lang.String str, int i17, android.os.Bundle bundle) {
        if (!com.tencent.mm.sdk.platformtools.y1.c(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            e(intent, bundle);
            intent.addFlags(268435456);
            g(intent, i17);
            return;
        }
        com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(com.tencent.mm.vfs.w6.p(str));
        if (Ni == null || !((com.tencent.mm.storage.emotion.EmojiInfo) Ni).E0()) {
            Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, str));
        }
        int k17 = Ni == null ? 0 : (int) com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) Ni).N0());
        if (Ni != null) {
            str = ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).N0();
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.tencent.mm.sdk.platformtools.x.J(str, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(this.f183566d.getString(com.tencent.mm.R.string.f493407k21));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", Ni == null ? "" : ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).getMd5());
        intent2.putExtra("Retr_Msg_Type", 5);
        intent2.putExtra("Retr_MsgImgScene", 1);
        e(intent2, bundle);
        intent2.addFlags(268435456);
        g(intent2, i17);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void Y2() {
        if ((c01.z1.n() & 32768) == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Vi(com.tencent.mm.sdk.platformtools.x2.f193071a, intent);
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String Yb(java.lang.String str) {
        boolean a17 = gm0.j1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "getDynamicConfigValue, accHasReady = " + a17);
        return !a17 ? (java.lang.String) new com.tencent.mm.plugin.webview.stub.x(this, 1000L, null, str).a(this.f183566d.f183488n) : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean Yh() {
        int i17;
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableWebviewScanQRCode"), 1);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "getIntValFromDynamicConfig parseInt failed, val: EnableWebviewScanQRCode");
            i17 = 1;
        }
        return i17 == 1;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean Zi() {
        return r01.z.e();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void af(android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(this.f183566d, (java.lang.Class<?>) com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI.class);
        intent2.putExtra("proxyui_action_code_key", 9);
        intent2.putExtra("proxyui_next_intent_key", intent);
        intent2.setFlags(268435456);
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(webViewStubService, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSimpleLoginUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        webViewStubService.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(webViewStubService, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSimpleLoginUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void b6(java.lang.String str) {
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        java.util.Map map = webViewStubService.f183483f;
        if (map == null || !map.containsKey(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "%s is not recognizing", str);
            return;
        }
        com.tencent.mm.autogen.events.CancelRecogImageFileEvent cancelRecogImageFileEvent = new com.tencent.mm.autogen.events.CancelRecogImageFileEvent();
        cancelRecogImageFileEvent.f54026g.getClass();
        cancelRecogImageFileEvent.e();
        webViewStubService.f183483f.remove(str);
        com.tencent.mm.vfs.w6.h(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r0.moveToFirst() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r3 = r0.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r3) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (r0.moveToNext() != false) goto L23;
     */
    @Override // com.tencent.mm.plugin.webview.stub.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List bc() {
        /*
            r14 = this;
            boolean r0 = gm0.j1.a()
            if (r0 == 0) goto Le
            com.tencent.mm.plugin.webview.modeltools.z.Ai()
            com.tencent.mm.plugin.webview.modeltools.j1 r0 = com.tencent.mm.plugin.webview.modeltools.z.cj()
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L17
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L17:
            java.util.ArrayList r1 = new java.util.ArrayList
            long r2 = com.tencent.mm.sdk.platformtools.t8.i1()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "delete from WebViewHostsFilter where expireTime < "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "WebViewHostsFilter"
            boolean r2 = r0.execSQL(r3, r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "MicroMsg.WebViewStorage"
            java.lang.String r4 = "delete expired items request  : [%b]"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            l75.k0 r5 = r0.f183302d
            java.lang.String r6 = r0.getTableName()
            java.lang.String r0 = "host"
            java.lang.String[] r7 = new java.lang.String[]{r0}
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2
            android.database.Cursor r0 = r5.D(r6, r7, r8, r9, r10, r11, r12, r13)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            if (r0 == 0) goto L77
            boolean r3 = r0.moveToFirst()
            if (r3 == 0) goto L77
        L63:
            r3 = 0
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r4 != 0) goto L71
            r2.add(r3)
        L71:
            boolean r3 = r0.moveToNext()
            if (r3 != 0) goto L63
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.stub.s.bc():java.util.List");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void c9(java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "addInvokedJsApiFromMenu, functionName = %s, clear isBusy state", str);
        a17.f184993v = false;
        a17.f184983n.add(str);
        if (z17) {
            a17.f184982m.add(str);
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void cc(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "clearSession");
        if (com.tencent.mm.plugin.webview.ui.tools.media.k1.f185795d == null) {
            synchronized (com.tencent.mm.plugin.webview.ui.tools.media.k1.class) {
                if (com.tencent.mm.plugin.webview.ui.tools.media.k1.f185795d == null) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.webview.ui.tools.media.k1.f185795d = new com.tencent.mm.plugin.webview.ui.tools.media.k1(context, null);
                }
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.media.k1.f185795d.c(a17.f185000y1);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public int dg(int i17, int i18) {
        return com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(i17, null), i18);
    }

    public final void e(android.content.Intent intent, android.os.Bundle bundle) {
        if (bundle != null) {
            intent.putExtra("serverMsgID", bundle.getString("serverMsgID"));
            intent.putExtra("geta8key_username", bundle.getString("geta8key_username"));
            intent.putExtra("KPublisherReqId", bundle.getString("KPublisherReqId"));
            intent.putExtra("sns_local_id", bundle.getString("sns_local_id"));
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String f3(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j17 == null) {
            return null;
        }
        return j17.field_packageName;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void favEditTag() {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        favoriteOperationEvent.f54243g.f8528a = 35;
        favoriteOperationEvent.e();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public int fd() {
        return com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(12304, null));
    }

    public final void g(android.content.Intent intent, int i17) {
        com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate;
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        try {
            java.util.Iterator it = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
            com.tencent.mm.plugin.webview.stub.z0 z0Var = null;
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                if (webViewStubCallbackWrapper != null && webViewStubCallbackWrapper.f183796e == i17) {
                    z0Var = webViewStubCallbackWrapper.f183795d;
                }
            }
            android.os.Bundle i18 = z0Var.i(302, android.os.Bundle.EMPTY);
            i18.setClassLoader(com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate.class.getClassLoader());
            activityStarterIpcDelegate = (com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate) i18.getParcelable("delegate");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "startMsgRetransmitUI, try get startActivityIpcDelegate e=%s", e17);
            activityStarterIpcDelegate = null;
        }
        if (activityStarterIpcDelegate == null) {
            ((com.tencent.mm.app.y7) dw4.a.f244297a).v(intent, webViewStubService);
            return;
        }
        intent.setClassName(webViewStubService, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityStarterIpcDelegate, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "startMsgRetransmitUI", "(Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityStarterIpcDelegate.b((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityStarterIpcDelegate, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "startMsgRetransmitUI", "(Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String getDisplayName(java.lang.String str) {
        return ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).f2();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String getLanguage() {
        return com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void hj(int i17, java.util.List list) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.l(i17, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0570  */
    @Override // com.tencent.mm.plugin.webview.stub.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle i(int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 2238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.stub.s.i(int, android.os.Bundle):android.os.Bundle");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public int ia() {
        return h45.g0.f278945a;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean isSDCardAvailable() {
        return gm0.j1.u().l();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void j7(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.emojistore.b Bi = com.tencent.mm.plugin.webview.modeltools.z.Bi();
        Bi.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : bundle.keySet()) {
            hashMap.put(str, bundle.get(str));
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiStoreWebViewLogic", "unknow action:%d", java.lang.Integer.valueOf(i17));
        } else {
            Bi.c(hashMap);
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean j8(java.lang.String str) {
        boolean a17 = gm0.j1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "isBizContact, accHasReady = " + a17);
        if (a17) {
            return c01.e2.G(str);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean ja(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        boolean z17 = a17.f184993v;
        boolean z18 = o45.wf.f343033k;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewStubService", "isBusy(%d), doingFunction = %s", java.lang.Integer.valueOf(i17), a17.f184994w);
        } else if (z18 && a17.f184995x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "isBusy(%d), awaiting proxyUI", java.lang.Integer.valueOf(i17));
            return true;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public com.tencent.mm.plugin.webview.stub.e jg(android.os.Bundle bundle) {
        boolean z17;
        com.tencent.mm.plugin.webview.stub.m0 m0Var = new com.tencent.mm.plugin.webview.stub.m0(null);
        long j17 = bundle.getLong("msg_id", Long.MIN_VALUE);
        java.lang.String string = bundle.getString("msg_talker");
        java.lang.String string2 = bundle.getString("sns_local_id");
        int i17 = bundle.getInt("news_svr_id", 0);
        java.lang.String string3 = bundle.getString("news_svr_tweetid");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (Long.MIN_VALUE != j17) {
            c4Var.f6321g = bundle.getInt("message_index", 0);
            ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            z17 = com.tencent.mm.pluginsdk.model.a2.i(doFavoriteEvent, j17, string);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mm.autogen.events.SnsfillEventInfoEvent snsfillEventInfoEvent = new com.tencent.mm.autogen.events.SnsfillEventInfoEvent();
            am.kx kxVar = snsfillEventInfoEvent.f54854g;
            kxVar.f7188b = string2;
            kxVar.f7189c = doFavoriteEvent;
            kxVar.f7187a = bundle.getString("rawUrl");
            kxVar.getClass();
            snsfillEventInfoEvent.e();
            z17 = snsfillEventInfoEvent.f54855h.f7277a;
        } else {
            if (i17 == 0) {
                m0Var.f183545e = true;
                return m0Var;
            }
            com.tencent.mm.autogen.events.ReaderAppOperationEvent readerAppOperationEvent = new com.tencent.mm.autogen.events.ReaderAppOperationEvent();
            am.np npVar = readerAppOperationEvent.f54646g;
            npVar.f7441a = 3;
            npVar.f7442b = doFavoriteEvent;
            npVar.f7443c = i17;
            npVar.f7444d = string3;
            readerAppOperationEvent.e();
            z17 = readerAppOperationEvent.f54647h.f7571a;
        }
        if (z17) {
            java.lang.String string4 = bundle.getString("prePublishId");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string4 == null) {
                string4 = "";
            }
            java.lang.String a17 = c01.n2.a(string4);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("sendAppMsgScene", 2);
            c17.i("preChatName", bundle.getString("preChatName"));
            c17.i("preMsgIndex", java.lang.Integer.valueOf(bundle.getInt("preMsgIndex")));
            c17.i("prePublishId", string4);
            c17.i("preUsername", bundle.getString("preUsername"));
            c17.i("getA8KeyScene", bundle.getString("getA8KeyScene"));
            c17.i("referUrl", bundle.getString("referUrl"));
            android.os.Bundle bundle2 = bundle.getBundle("jsapiargs");
            if (bundle2 != null) {
                c17.i("adExtStr", bundle2.getString("key_snsad_statextstr"));
            }
            c4Var.f6322h = a17;
            doFavoriteEvent.e();
        } else {
            if (c4Var.f6326l == 0) {
                c4Var.f6326l = com.tencent.mm.R.string.cak;
            }
            doFavoriteEvent.e();
        }
        m0Var.f183546f = doFavoriteEvent.f54091h.f6433a;
        return m0Var;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean lb() {
        return gm0.j1.a();
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void m(java.lang.String str, boolean z17) {
        ((com.tencent.mm.app.plugin.j) o25.z1.a()).c(this.f183566d, str, z17, null);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String m3() {
        com.tencent.mm.autogen.events.GetJDUrlEvent getJDUrlEvent = new com.tencent.mm.autogen.events.GetJDUrlEvent();
        getJDUrlEvent.e();
        return getJDUrlEvent.f54402g.f6450a;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void ng(int i17, android.os.Bundle bundle, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "edw, invoke, actionCode = %d, binderID = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f183566d.f183488n.post(new com.tencent.mm.plugin.webview.stub.t(this, i17, bundle, i18));
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void pb(android.os.Bundle bundle, int i17) {
        this.f183566d.f183481d.put(i17, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void pc(int i17) {
        android.os.Parcelable parcelable;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        a17.f184992u = false;
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.pluginsdk.ui.tools.r8.f191881a).iterator();
        while (it.hasNext()) {
            com.tencent.mm.pluginsdk.ui.tools.q8 q8Var = (com.tencent.mm.pluginsdk.ui.tools.q8) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onWebViewUIResume, resume plugin = " + q8Var.getName());
            q8Var.a(this.f183566d);
        }
        a17.C = false;
        android.os.Bundle bundle = a17.f184984o;
        if (bundle == null || (parcelable = bundle.getParcelable("KSnsAdTag")) == null || !(parcelable instanceof com.tencent.mm.modelsns.SnsAdClick)) {
            return;
        }
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) parcelable;
        long j17 = snsAdClick.f71474o;
        if (j17 <= 0) {
            return;
        }
        long j18 = snsAdClick.f71475p;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        snsAdClick.f71475p = j18 + (android.os.SystemClock.elapsedRealtime() - j17);
        snsAdClick.f71474o = 0L;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void q7(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17).r6().putString(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean r6(java.lang.String str) {
        ((com.tencent.mm.app.plugin.n) ((o25.x1) i95.n0.c(o25.x1.class))).getClass();
        return (str == null || str.length() == 0 || (!str.endsWith("@mailto@") && !str.endsWith("@tel@"))) ? false : true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void rg(com.tencent.mm.plugin.webview.stub.z0 z0Var, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(z0Var == null ? -1 : z0Var.hashCode());
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "addCallback, cb.hash = %d, id = %d", objArr);
        com.tencent.mm.plugin.webview.stub.WebViewStubService webViewStubService = this.f183566d;
        ((java.util.ArrayList) webViewStubService.f183486i).add(new com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper(z0Var, i17));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) webViewStubService.f183486i).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
                if (com.tencent.mm.plugin.webview.stub.WebViewStubService.b(webViewStubService, webViewStubCallbackWrapper)) {
                    int i18 = webViewStubCallbackWrapper.f183796e;
                } else {
                    arrayList.add(webViewStubCallbackWrapper);
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubService", "removeDeadCallBacker %d is dead, may be crash before, just remove it.", java.lang.Integer.valueOf(webViewStubCallbackWrapper.f183796e));
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                return;
            }
            ((java.util.ArrayList) webViewStubService.f183486i).remove(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "removeDeadCallBacker ex:%s", e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public android.os.Bundle tb(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.websearch.q0 q0Var = (com.tencent.mm.plugin.websearch.q0) com.tencent.mm.plugin.webview.modeltools.z.Ri();
        q0Var.getClass();
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (i17 != 2) {
            if (i17 == 4) {
                java.util.HashMap hashMap = (java.util.HashMap) su4.r2.b(bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), bundle.getBoolean("isHomePage"), bundle.getInt("type"));
                bundle2.putString("type", (java.lang.String) hashMap.get("type"));
                bundle2.putString("isMostSearchBiz", (java.lang.String) hashMap.get("isMostSearchBiz"));
                bundle2.putString("isLocalSug", (java.lang.String) hashMap.get("isLocalSug"));
                bundle2.putString("isSug", (java.lang.String) hashMap.get("isSug"));
                bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, (java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            } else if (i17 == 6) {
                bundle2.putString("result", su4.o2.e(bundle.getString("key")));
            } else if (i17 == 7) {
                bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, q0Var.c(20, 0, true));
            } else if (i17 == 8) {
                java.util.HashMap hashMap2 = (java.util.HashMap) ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).Zi()).i(bundle.getString("reqId"));
                bundle2.putInt("requestType", com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap2.get("requestType"), 0));
                bundle2.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, (java.lang.String) hashMap2.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            }
            return bundle2;
        }
        java.lang.String string = bundle.getString("key");
        bundle2.putString("result", su4.o2.d(string).toString());
        if ("educationTab".equals(string)) {
            org.json.JSONObject d17 = su4.o2.d("discoverSearchGuide");
            if (d17.optJSONArray("items").length() > 0) {
                bundle2.putString("result_1", d17.toString());
            }
        }
        return bundle2;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void u1(java.lang.String str, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("proxyui_phone", str);
        com.tencent.mm.plugin.webview.stub.WebViewStubService.a(this.f183566d, 8, bundle, i17);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String u2(java.lang.String str, int i17) {
        if (i17 == 1) {
            return com.tencent.mm.plugin.webview.model.o5.e(str);
        }
        if (i17 != 2) {
            return null;
        }
        return com.tencent.mm.plugin.webview.model.o5.d(str);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public java.lang.String ua() {
        return (java.lang.String) gm0.j1.u().c().l(-1535680990, null);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean uf(android.os.Bundle bundle) {
        com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = new com.tencent.mm.autogen.events.DeleteFavoriteEvent();
        long j17 = bundle.getLong("fav_local_id", -1L);
        am.w3 w3Var = deleteFavoriteEvent.f54084g;
        w3Var.f8258a = j17;
        w3Var.f8260c = 12;
        deleteFavoriteEvent.e();
        java.lang.Long valueOf = java.lang.Long.valueOf(w3Var.f8258a);
        am.x3 x3Var = deleteFavoriteEvent.f54085h;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubService", "do del fav web url, local id %d, result %B", valueOf, java.lang.Boolean.valueOf(x3Var.f8343a));
        return x3Var.f8343a;
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public boolean wc(java.lang.String str) {
        return c01.e2.D(str);
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void x7(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a17 = com.tencent.mm.plugin.webview.model.m4.a(i17, str, str2);
        a17.f182749u = false;
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(a17);
        com.tencent.mm.plugin.webview.modeltools.z.bj().c(null, a17.f182736e, 5, 0, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cd  */
    @Override // com.tencent.mm.plugin.webview.stub.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x8(java.lang.String r17, java.lang.String r18, java.lang.String r19, android.os.Bundle r20, android.os.Bundle r21, int r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.stub.s.x8(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, android.os.Bundle, int):boolean");
    }

    @Override // com.tencent.mm.plugin.webview.stub.v0
    public void yf(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, android.os.Bundle bundle) {
        if (str == null) {
            return;
        }
        final android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity.class);
        intent.setFlags(872415232);
        intent.putExtra("key_string_for_scan", str);
        intent.putExtra("key_string_for_url", str2);
        intent.putExtra("key_string_for_image_url", str3);
        intent.putExtra("key_codetype_for_scan", i18);
        intent.putExtra("key_codeversion_for_scan", i19);
        if (bundle != null) {
            java.lang.String string = bundle.getString("preUsername");
            java.lang.String string2 = bundle.getString("preChatName");
            java.lang.String string3 = bundle.getString("rawUrl");
            intent.putExtra("geta8key_init_request_id", bundle.getInt("geta8key_init_request_id", 0));
            java.lang.String a17 = c01.n2.a("WebviewQrCode");
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("preUsername", string);
            c17.i("preChatName", string2);
            c17.i("url", str2);
            c17.i("Contact_Sub_Scene", java.lang.Integer.valueOf(!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(str2) ? 6 : 1));
            c17.i("Contact_Scene_Note", str2);
            c17.i("rawUrl", string3);
            intent.putExtra("img_gallery_session_id", a17);
            java.lang.String string4 = bundle.getString("pre_username");
            if (string4 != null && c01.e2.G(string4)) {
                intent.putExtra("key_string_for_from_username", string4);
            }
            intent.putExtra("key_file_path_for_scan", bundle.getString(com.tencent.mm.ui.w2.f211204q));
            intent.putExtra("key_delete_file_after_deal", true);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f183566d.f183486i).iterator();
        com.tencent.mm.plugin.webview.stub.z0 z0Var = null;
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper webViewStubCallbackWrapper = (com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper) it.next();
            if (webViewStubCallbackWrapper != null && webViewStubCallbackWrapper.f183796e == i17) {
                z0Var = webViewStubCallbackWrapper.f183795d;
            }
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.stub.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "lambda$reqDealQBarResult$0", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "lambda$reqDealQBarResult$0", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        };
        if (z0Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.a1.e(intent.getExtras(), "webview", ".stub.WebviewScanImageActivity", z0Var, runnable);
        } else {
            runnable.run();
        }
    }
}
