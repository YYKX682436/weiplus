package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class i4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f182938e = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f182937d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public final dn.k f182939f = new com.tencent.mm.plugin.webview.model.j4(this);

    public boolean a(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.model.n0 n0Var) {
        com.tencent.mm.plugin.webview.model.l4 Zi = com.tencent.mm.plugin.webview.modeltools.z.Zi();
        Zi.getClass();
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByServerId error, media id is null or nil");
        } else {
            java.util.Iterator it = Zi.f183003a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem2 = (com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem) it.next();
                java.lang.String str3 = webViewJSSDKFileItem2.f182739h;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.equals(str2)) {
                    webViewJSSDKFileItem = webViewJSSDKFileItem2;
                    break;
                }
            }
        }
        if (webViewJSSDKFileItem != null) {
            webViewJSSDKFileItem.f182735d = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "the file item has alreay in local : appid : %s, serverId : %s, localId : %s", str, str2, webViewJSSDKFileItem.f182736e);
            n0Var.a(true, 0, webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem.f182739h, null, null);
            return true;
        }
        gm0.j1.d().a(1035, this);
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.b1(str, str2));
        if (n0Var != null) {
            this.f182937d.add(n0Var);
        }
        return true;
    }

    public void b(com.tencent.mm.plugin.webview.model.m0 m0Var) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f182938e;
        if (copyOnWriteArraySet == null || m0Var == null || copyOnWriteArraySet.contains(m0Var)) {
            return;
        }
        copyOnWriteArraySet.add(m0Var);
    }

    public boolean c(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, com.tencent.mm.plugin.webview.model.n0 n0Var) {
        return d(str, str2, i17, i18, i19, 0, n0Var);
    }

    public final boolean d(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, com.tencent.mm.plugin.webview.model.n0 n0Var) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str2);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", str2);
            return false;
        }
        b17.f182735d = str;
        if (n0Var != null) {
            this.f182937d.add(n0Var);
        }
        if (i18 == 202 || i18 == 214 || i18 == 215 || i18 == 366 || i27 == 8) {
            b17.f182749u = false;
        }
        b17.f182747s = true;
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_WebViewJSSDKCdnService_2";
        mVar.f241787f = this.f182939f;
        mVar.f241786e = true;
        mVar.field_mediaId = b17.f182740i;
        mVar.field_fullpath = b17.f182738g;
        mVar.field_fileType = i17;
        mVar.field_talker = "weixin";
        mVar.field_priority = 2;
        if (i17 == 10011 || i18 == 214) {
            mVar.field_needStorage = true;
        } else {
            mVar.field_needStorage = false;
        }
        mVar.field_isStreamMedia = false;
        mVar.field_appType = i18;
        mVar.field_bzScene = i19;
        mVar.f241789h = i27;
        mVar.field_force_aeskeycdn = true;
        mVar.field_trysafecdn = false;
        mVar.field_thumbpath = b17.f182737f;
        boolean Bi = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", java.lang.Boolean.valueOf(Bi), java.lang.Boolean.valueOf(mVar.field_force_aeskeycdn), java.lang.Boolean.valueOf(mVar.field_trysafecdn), str2);
        return Bi;
    }

    public boolean e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "cancelDownloadTask get webview file chooser item  by local id : %s", str);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(str);
        return true;
    }

    public boolean f(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", str);
            return false;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(b17.f182740i);
        return true;
    }

    public final synchronized void g(final boolean z17, final int i17, final int i18, final java.lang.String str, final java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f182938e;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.size() > 0) {
            java.util.Iterator it = this.f182938e.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.model.m0) it.next()).a(z17, i17, i18, str, str2);
            }
        }
        fs.g.b(com.tencent.mm.plugin.webview.model.o0.class, new fs.o() { // from class: com.tencent.mm.plugin.webview.model.i4$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                ((com.tencent.mm.plugin.webview.luggage.a) ((com.tencent.mm.plugin.webview.model.o0) nVar)).getClass();
                boolean z18 = z17;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                int i19 = i18;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
                java.lang.String str3 = str;
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", valueOf, valueOf2, valueOf3, str3, str2);
                if (!z18) {
                    return false;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(dm.i4.COL_LOCALID, str3);
                    jSONObject.put("percent", i19);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "onMediaFileUploadProgress");
                    bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject.toString());
                    ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
                    com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.a(bundle, tw4.a.class, null);
                    return false;
                } catch (org.json.JSONException unused) {
                    return false;
                }
            }
        });
    }

    public final synchronized void h(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f182937d;
        if (copyOnWriteArraySet != null && copyOnWriteArraySet.size() > 0) {
            java.util.Iterator it = this.f182937d.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.model.n0) it.next()).a(z17, i17, str, str2, str3, str4);
            }
        }
    }

    public void i(com.tencent.mm.plugin.webview.model.n0 n0Var) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f182937d;
        if (copyOnWriteArraySet == null || n0Var == null) {
            return;
        }
        copyOnWriteArraySet.remove(n0Var);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "onSceneEnd, errType = %d, errCode = %d, funcType = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.getType()));
        int type = m1Var.getType();
        if (type == 1034) {
            gm0.j1.d().q(1034, this);
            com.tencent.mm.plugin.webview.model.t1 t1Var = (com.tencent.mm.plugin.webview.model.t1) m1Var;
            java.lang.String str2 = ((r45.xe4) t1Var.f183114d.f70711b.f70700a).f390013d;
            com.tencent.mm.plugin.webview.model.l4 Zi = com.tencent.mm.plugin.webview.modeltools.z.Zi();
            java.lang.String str3 = t1Var.f183117g;
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = Zi.b(str3);
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str2;
            java.lang.String str4 = t1Var.f183116f;
            objArr[1] = str4;
            objArr[2] = str3;
            objArr[3] = java.lang.Boolean.valueOf(b17 == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "get server server id : %s from server for appid : %s, localId = %s, item == null ? %b", objArr);
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "upload cdn info failed");
                if (b17 != null) {
                    h(false, 0, b17.f182736e, b17.f182740i, null, null);
                    return;
                }
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || b17 == null) {
                return;
            }
            b17.f182739h = str2;
            g(true, b17.f182742n, 100, b17.f182736e, str2);
            h(true, 0, b17.f182736e, b17.f182739h, b17.f182746r.field_fileUrl, null);
            return;
        }
        if (type != 1035) {
            return;
        }
        gm0.j1.d().q(1035, this);
        com.tencent.mm.plugin.webview.model.b1 b1Var = (com.tencent.mm.plugin.webview.model.b1) m1Var;
        java.lang.String str5 = b1Var.f182786g;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewFileChooserCdnService", "download cdn info failed");
            h(false, 0, null, str5, null, null);
            return;
        }
        r45.re4 re4Var = ((r45.te4) b1Var.f182783d.f70711b.f70700a).f386352d;
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        java.lang.String str6 = b1Var.f182785f;
        objArr2[0] = str6;
        objArr2[1] = str5;
        objArr2[2] = java.lang.Boolean.valueOf(re4Var == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "appid = %s, serverId = %s, cdninfo == null ? %b", objArr2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str6) || com.tencent.mm.sdk.platformtools.t8.K0(str5) || re4Var == null) {
            return;
        }
        java.lang.String str7 = re4Var.f384765f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "cdn info type = %s", str7);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            return;
        }
        if (str7.toLowerCase().equals("voice")) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.webview.model.o5.f183050a;
            d17 = com.tencent.mm.plugin.webview.model.m4.c("_USER_FOR_WEBVIEW_JSAPI" + c01.y1.a(str6, java.lang.System.currentTimeMillis()));
        } else if (str7.toLowerCase().equals("video")) {
            d17 = com.tencent.mm.plugin.webview.model.m4.b(com.tencent.mm.plugin.webview.model.o5.c(java.lang.System.currentTimeMillis() + ""));
        } else {
            d17 = com.tencent.mm.plugin.webview.model.m4.d(com.tencent.mm.plugin.webview.model.o5.c(java.lang.System.currentTimeMillis() + ""));
        }
        d17.f182747s = false;
        d17.f182735d = str6;
        d17.f182739h = str5;
        if (d17.f182746r == null) {
            d17.f182746r = new com.tencent.mm.plugin.webview.model.k4();
        }
        com.tencent.mm.plugin.webview.model.k4 k4Var = d17.f182746r;
        k4Var.field_aesKey = re4Var.f384764e;
        k4Var.field_fileId = re4Var.f384763d;
        k4Var.field_fileLength = re4Var.f384766g;
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_WebViewJSSDKCdnService_1";
        mVar.f241787f = this.f182939f;
        mVar.f241786e = false;
        mVar.field_mediaId = d17.f182740i;
        mVar.field_fullpath = d17.f182738g;
        com.tencent.mm.plugin.webview.model.k4 k4Var2 = d17.f182746r;
        mVar.field_totalLen = k4Var2.field_fileLength;
        mVar.field_fileType = 5;
        mVar.field_fileId = k4Var2.field_fileId;
        mVar.field_aesKey = k4Var2.field_aesKey;
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewFileChooserCdnService", "add download cdn task : %b, localid : %s", java.lang.Boolean.valueOf(wi6), d17.f182739h);
        if (wi6) {
            return;
        }
        h(false, 0, null, null, null, null);
    }
}
