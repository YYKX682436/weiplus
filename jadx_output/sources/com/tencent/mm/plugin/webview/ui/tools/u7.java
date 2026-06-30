package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class u7 extends com.tencent.mm.plugin.webview.stub.x0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f186929e;

    public u7(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f186929e = new java.lang.ref.WeakReference(webViewUI);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void Ae(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "setCustomMenu");
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("keys");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("titles");
        int size = stringArrayList.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(new ip.g(stringArrayList.get(i17), stringArrayList2.get(i17)));
        }
        if (stringArrayList.size() > 0) {
            java.lang.String url = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183815f.getUrl();
            if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).P1.containsKey(url)) {
                ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).P1.remove(url);
            }
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).P1.put(url, arrayList);
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean Cg(com.tencent.mm.plugin.webview.stub.h hVar) {
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void D3(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.g9(this, str));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String E6() {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).F7();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle H6(java.lang.String str, java.lang.String str2) {
        return o45.vf.a(false, null);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void Ic(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.z9(this, str, str2));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String Ni() {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).L1.E;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void V1() {
        nw4.n nVar;
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing() || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183844p0 == null || (n3Var = (nVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183844p0).f340892f) == null) {
            return;
        }
        n3Var.post(new nw4.s0(nVar));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void W1(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return;
        }
        int i17 = 0;
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb, ex = " + e17.getMessage());
        }
        if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183815f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb fail, viewWV is null");
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.d9(this, i17));
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public int X1() {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        com.tencent.mm.plugin.webview.core.e3 e3Var = weakReference.get() != null ? ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).L1 : null;
        if (e3Var != null) {
            return e3Var.O().f183383c;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "GetA8keyScene, controller is nil");
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing() || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183844p0 == null) {
            return false;
        }
        com.tencent.mm.plugin.webview.ui.tools.y8 y8Var = new com.tencent.mm.plugin.webview.ui.tools.y8(this, str, str2, bundle, z17);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            y8Var.run();
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(y8Var);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        if (this.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "IUIController, closeWindow");
        if (bundle != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("result_data", bundle);
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).setResult(-1, intent);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.c9(this));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "callback, actionCode = " + i17);
        final com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get();
        int i19 = 0;
        if (webViewUI == null || webViewUI.isFinishing()) {
            return false;
        }
        final nw4.n nVar = webViewUI.f183844p0;
        com.tencent.mm.plugin.webview.permission.w wVar = webViewUI.f183876z1;
        if (i17 == 13) {
            if (bundle == null) {
                return true;
            }
            bundle.putString("application_language", webViewUI.K1.getLanguage());
            webViewUI.R1 = new com.tencent.mm.plugin.webview.ui.tools.jc(bundle);
            return true;
        }
        if (i17 == 90) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.n8(this, webViewUI, nVar, bundle.getString("webview_network_type")));
            return true;
        }
        if (i17 == 2100) {
            final java.lang.String string = bundle.getString("background_audio_state_player_state");
            final java.lang.String string2 = bundle.getString("background_audio_state_event");
            final float f17 = bundle.getFloat("background_audio_state_player_duration");
            final java.lang.String string3 = bundle.getString("background_audio_state_player_src");
            final int i27 = bundle.getInt("background_audio_state_player_err_code");
            final java.lang.String string4 = bundle.getString("background_audio_state_player_err_msg");
            final java.lang.String string5 = bundle.getString("background_audio_state_player_src_id");
            final java.lang.String string6 = bundle.getString("background_audio_state_player_audio_id", "");
            final float f18 = bundle.getFloat("background_audio_state_current_time");
            final java.lang.String string7 = bundle.getString("background_audio_state_listen_item", "");
            final float f19 = bundle.getFloat("background_audio_state_buffered");
            final java.lang.String string8 = bundle.getString("background_audio_state_category_id", "");
            final boolean z17 = bundle.getBoolean("background_audio_state_is_ting", false);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.u7$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = com.tencent.mm.plugin.webview.ui.tools.WebViewUI.this;
                    final nw4.n nVar2 = nVar;
                    boolean z18 = z17;
                    java.lang.String str = string;
                    java.lang.String str2 = string2;
                    float f27 = f17;
                    int i28 = i27;
                    java.lang.String str3 = string4;
                    float f28 = f18;
                    java.lang.String str4 = string7;
                    java.lang.String str5 = string8;
                    float f29 = f19;
                    java.lang.String str6 = string3;
                    java.lang.String str7 = string5;
                    java.lang.String str8 = string6;
                    if (webViewUI2 == null || webViewUI2.isFinishing() || nVar2 == null) {
                        return;
                    }
                    if (!z18) {
                        int i29 = (int) f27;
                        if (!nVar2.f340895i) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange fail, not ready");
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange, state : %s, duration : %d, src:%s, errCode:%d, errMsg:%s, srcId:%s", str, java.lang.Integer.valueOf(i29), str6, java.lang.Integer.valueOf(i28), str3, str7);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("state", str);
                        hashMap.put("duration", java.lang.Integer.valueOf(i29));
                        hashMap.put("src", str6);
                        hashMap.put("errCode", java.lang.Integer.valueOf(i28));
                        hashMap.put("errMsg", str3);
                        hashMap.put("srcId", str7);
                        hashMap.put("audioId", str8);
                        com.tencent.mm.sdk.platformtools.u3.h(new nw4.h0(nVar2, nw4.x2.c("onBackgroundAudioStateChange", hashMap, nVar2.f340903q, nVar2.f340904r)));
                        return;
                    }
                    if (!nVar2.f340895i) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onTingAudioStateChanged fail, not ready");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onTingAudioStateChanged, state : %s, event: %s, duration : %s, errCode:%d, errMsg:%s, currentTime:%s, categoryId:%s", str, str2, java.lang.Float.valueOf(f27), java.lang.Integer.valueOf(i28), str3, java.lang.Float.valueOf(f28), str5);
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("status", str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        hashMap2.put("event", str2);
                    }
                    hashMap2.put("duration", java.lang.Float.valueOf(f27));
                    hashMap2.put("buffered", java.lang.Float.valueOf(f29));
                    hashMap2.put("err_code", java.lang.Integer.valueOf(i28));
                    hashMap2.put("err_msg", str3);
                    try {
                        hashMap2.put("item", new org.json.JSONObject(str4));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "onTingAudioStateChanged exception", new java.lang.Object[0]);
                        hashMap2.put("item", str4);
                    }
                    hashMap2.put("categoryId", str5);
                    hashMap2.put("currentTime", java.lang.Float.valueOf(f28));
                    final java.lang.String c17 = nw4.x2.c("onTingAudioStateChanged", hashMap2, nVar2.f340903q, nVar2.f340904r);
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: nw4.n$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str9 = c17;
                            nw4.n nVar3 = nw4.n.this;
                            nVar3.getClass();
                            try {
                                nVar3.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str9 + ")", new nw4.i0(nVar3));
                            } catch (java.lang.Exception e18) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onTingAudioStateChanged fail, ex = %s", e18.getMessage());
                            }
                        }
                    });
                }
            });
            return true;
        }
        if (i17 == 4007) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.b8(this, webViewUI, nVar, bundle.getInt("nfc_key_on_touch_errcode", 0)));
            return true;
        }
        switch (i17) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
            case 44:
            case 45:
            case 46:
                return true;
            case 47:
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.l8(this, webViewUI, nVar, bundle.getBoolean("exdevice_lan_state")));
                return true;
            case 48:
                java.lang.String[] stringArray = bundle.getStringArray("msgIds");
                java.lang.String[] stringArray2 = bundle.getStringArray("contents");
                java.lang.String[] stringArray3 = bundle.getStringArray("senders");
                int[] intArray = bundle.getIntArray("msgTypes");
                int[] intArray2 = bundle.getIntArray("msgTimes");
                java.lang.String[] stringArray4 = bundle.getStringArray("msgSignature");
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                int length = stringArray == null ? 0 : stringArray.length;
                while (i19 < length) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        i18 = length;
                        try {
                            jSONObject.put("newMsgId", stringArray[i19]);
                            jSONObject.put("content", stringArray2[i19]);
                            jSONObject.put("sender", stringArray3[i19]);
                            jSONObject.put("msgType", intArray[i19]);
                            jSONObject.put("msgTime", intArray2[i19]);
                            jSONObject.put("msgSignature", stringArray4[i19]);
                            jSONArray.put(jSONObject);
                        } catch (org.json.JSONException e17) {
                            e = e17;
                            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "GetMsgProofItems exception " + e.getMessage());
                            i19++;
                            length = i18;
                        }
                    } catch (org.json.JSONException e18) {
                        e = e18;
                        i18 = length;
                    }
                    i19++;
                    length = i18;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.m8(this, webViewUI, nVar, jSONArray));
                return true;
            default:
                switch (i17) {
                    case 1001:
                        if (webViewUI.isFinishing()) {
                            return true;
                        }
                        webViewUI.finish();
                        return true;
                    case 1002:
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.f8(this, webViewUI, nVar, wVar, bundle));
                        return true;
                    case 1003:
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.q8(this, webViewUI, nVar, wVar, bundle));
                        return true;
                    case 1004:
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.ca(this, webViewUI, nVar, wVar, bundle.getString("exdevice_device_id"), bundle.getInt("exdevice_on_state_change_state"), java.lang.Boolean.valueOf(bundle.getBoolean("exdevice_inner_call"))));
                        return true;
                    default:
                        switch (i17) {
                            case 1006:
                                if (nVar == null) {
                                    return true;
                                }
                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.g8(this, webViewUI, bundle, wVar, nVar));
                                return true;
                            case 1007:
                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.ba(this, webViewUI, nVar, wVar, bundle.getString("download_manager_appid", ""), bundle.getLong("download_manager_downloadid"), bundle.getInt("download_manager_progress"), bundle.getFloat("download_manager_progress_float")));
                                return true;
                            case 1008:
                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.b9(this, webViewUI, nVar, wVar, bundle));
                                return true;
                            default:
                                switch (i17) {
                                    case 1010:
                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.m9(this, webViewUI, nVar, wVar, bundle));
                                        return true;
                                    case 1011:
                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.x9(this, webViewUI, nVar, wVar, bundle));
                                        return true;
                                    case 1012:
                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.aa(this, webViewUI, nVar, wVar, bundle));
                                        return true;
                                    case 1013:
                                        if (nVar == null) {
                                            return true;
                                        }
                                        try {
                                            java.util.LinkedList linkedList = new java.util.LinkedList();
                                            java.lang.String string9 = bundle.getString("__appId");
                                            java.lang.String string10 = bundle.getString("__url");
                                            if (bundle.containsKey("__webComptList")) {
                                                java.util.Iterator<java.lang.String> it = bundle.getStringArrayList("__webComptList").iterator();
                                                while (it.hasNext()) {
                                                    java.lang.String next = it.next();
                                                    r45.d24 d24Var = new r45.d24();
                                                    d24Var.parseFrom(bundle.getByteArray(next));
                                                    linkedList.add(d24Var);
                                                }
                                            }
                                            if (nVar.y() == null) {
                                                return true;
                                            }
                                            nVar.y().b(string9, string10, linkedList);
                                            return true;
                                        } catch (java.io.IOException e19) {
                                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewStubCallbackAIDLStub", e19, "parse webCompt", new java.lang.Object[0]);
                                            return true;
                                        }
                                    default:
                                        switch (i17) {
                                            case 2002:
                                                java.util.HashMap hashMap = new java.util.HashMap();
                                                hashMap.put("err_msg", bundle.getString("playResult"));
                                                hashMap.put(dm.i4.COL_LOCALID, bundle.getString(dm.i4.COL_LOCALID));
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.a8(this, webViewUI, nVar, hashMap));
                                                return true;
                                            case 2003:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.v7(this, webViewUI, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case 2004:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.w7(this, webViewUI, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS /* 2005 */:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.x7(this, webViewUI, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END /* 2006 */:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.y7(this, webViewUI, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING /* 2007 */:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.c8(this, webViewUI));
                                                return true;
                                            case 2008:
                                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                                hashMap2.put(dm.i4.COL_LOCALID, bundle.getString(dm.i4.COL_LOCALID));
                                                hashMap2.put("err_msg", bundle.getString("recordResult"));
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.d8(this, webViewUI, nVar, hashMap2));
                                                return true;
                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_RESOLUTION /* 2009 */:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.e8(this, webViewUI));
                                                return true;
                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC /* 2010 */:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.z7(this, webViewUI, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION /* 2011 */:
                                                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.da(this, webViewUI, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            default:
                                                switch (i17) {
                                                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION /* 80001 */:
                                                    case 80002:
                                                        webViewUI.Q7(i17, bundle);
                                                        return true;
                                                    default:
                                                        switch (i17) {
                                                            case 100001:
                                                            case 100002:
                                                                break;
                                                            default:
                                                                switch (i17) {
                                                                    case 121000:
                                                                        if (((km0.c) gm0.j1.p().a()).a()) {
                                                                            return true;
                                                                        }
                                                                        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.t8(this, webViewUI, bundle));
                                                                        return true;
                                                                    case 121001:
                                                                        if (((km0.c) gm0.j1.p().a()).a()) {
                                                                            return true;
                                                                        }
                                                                        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.u8(this, webViewUI, bundle));
                                                                        return true;
                                                                    case 121002:
                                                                        if (((km0.c) gm0.j1.p().a()).a()) {
                                                                            return true;
                                                                        }
                                                                        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.v8(this, webViewUI, bundle));
                                                                        return true;
                                                                    case 121003:
                                                                        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.w8(this, webViewUI, bundle));
                                                                        return true;
                                                                    default:
                                                                        switch (i17) {
                                                                            case 200000:
                                                                            case 200001:
                                                                            case 200002:
                                                                            case 200003:
                                                                                break;
                                                                            default:
                                                                                switch (i17) {
                                                                                    case 15:
                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.h8(this, webViewUI, nVar, bundle.getString("exdevice_device_id"), bundle.getByteArray("exdevice_broadcast_data"), bundle.getBoolean("exdevice_is_complete"), bundle.getBoolean("exdevice_is_lan_device"), wVar));
                                                                                        return true;
                                                                                    case 16:
                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.i8(this, webViewUI, nVar, bundle.getString("exdevice_device_id"), bundle.getByteArray("exdevice_data"), bundle.getString("exdevice_brand_name")));
                                                                                        return true;
                                                                                    case 17:
                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.j8(this, webViewUI, nVar, bundle.getString("exdevice_device_id"), bundle.getBoolean("exdevice_is_bound")));
                                                                                        return true;
                                                                                    case 18:
                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.k8(this, webViewUI, nVar, bundle.getBoolean("exdevice_bt_state")));
                                                                                        return true;
                                                                                    default:
                                                                                        switch (i17) {
                                                                                            case 60:
                                                                                            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                                                                                            case 62:
                                                                                                break;
                                                                                            default:
                                                                                                switch (i17) {
                                                                                                    case 70:
                                                                                                        java.lang.String string11 = bundle.getString("service_click_tid");
                                                                                                        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "on service click, update tid = %s", string11);
                                                                                                        webViewUI.f183858t2 = string11;
                                                                                                        webViewUI.f183861u2 = java.lang.System.currentTimeMillis();
                                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.p8(this, webViewUI));
                                                                                                        return true;
                                                                                                    case 71:
                                                                                                    case 72:
                                                                                                        com.tencent.mm.plugin.webview.ui.tools.o8 o8Var = new com.tencent.mm.plugin.webview.ui.tools.o8(this, webViewUI, bundle);
                                                                                                        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                                                                                                            o8Var.run();
                                                                                                            return true;
                                                                                                        }
                                                                                                        ((ku5.t0) ku5.t0.f312615d).g(o8Var);
                                                                                                        return true;
                                                                                                    default:
                                                                                                        switch (i17) {
                                                                                                            case 119:
                                                                                                            case 120:
                                                                                                            case 121:
                                                                                                            case 122:
                                                                                                            case 123:
                                                                                                            case 124:
                                                                                                            case 125:
                                                                                                            case 126:
                                                                                                            case 127:
                                                                                                            case 128:
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (i17) {
                                                                                                                    case 133:
                                                                                                                    case 134:
                                                                                                                    case 135:
                                                                                                                    case 136:
                                                                                                                    case 137:
                                                                                                                    case 138:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (i17) {
                                                                                                                            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                                                                                                            case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                                                                                                            case 144:
                                                                                                                            case 145:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                switch (i17) {
                                                                                                                                    case 147:
                                                                                                                                    case 148:
                                                                                                                                    case com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX /* 149 */:
                                                                                                                                    case 150:
                                                                                                                                    case 151:
                                                                                                                                    case 152:
                                                                                                                                    case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS /* 153 */:
                                                                                                                                    case 154:
                                                                                                                                    case 155:
                                                                                                                                    case 156:
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i17) {
                                                                                                                                            case 161:
                                                                                                                                            case 162:
                                                                                                                                            case 163:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i17) {
                                                                                                                                                    case 254:
                                                                                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.r8(this, webViewUI, nVar, bundle.getString("game_haowan_publish_post_id"), bundle.getInt("game_haowan_publish_retcode")));
                                                                                                                                                        return true;
                                                                                                                                                    case 255:
                                                                                                                                                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.s8(this, webViewUI, nVar, bundle.getString("game_haowan_publish_post_id"), bundle.getFloat("game_haowan_publish_progress")));
                                                                                                                                                        return true;
                                                                                                                                                    case 256:
                                                                                                                                                        if (this.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).L1 == null) {
                                                                                                                                                            return true;
                                                                                                                                                        }
                                                                                                                                                        java.util.Iterator it6 = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).L1.X.iterator();
                                                                                                                                                        while (it6.hasNext() && !((com.tencent.mm.plugin.webview.core.i3) it6.next()).i()) {
                                                                                                                                                        }
                                                                                                                                                        return true;
                                                                                                                                                    default:
                                                                                                                                                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "undefine action code!!!");
                                                                                                                                                        return true;
                                                                                                                                                }
                                                                                                                                        }
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                        if (webViewUI.isFinishing()) {
                                                            return true;
                                                        }
                                                        webViewUI.R7(i17, bundle);
                                                        return true;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void d5(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).h7(z17);
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void da(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return;
        }
        boolean booleanExtra = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).getIntent().getBooleanExtra("forceHideShare", false);
        java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.z8(this, booleanExtra, z17));
    }

    public final float e() {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183815f != null ? ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183815f.getMMDensity() : j65.f.f();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void ec() {
        java.util.LinkedList linkedList;
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing() || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183844p0 == null || (linkedList = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183844p0.f340891e) == null) {
            return;
        }
        linkedList.clear();
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).x7();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0087. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0906  */
    @Override // com.tencent.mm.plugin.webview.stub.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle i(int r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 5892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.u7.i(int, android.os.Bundle):android.os.Bundle");
    }

    public final android.content.Intent j() {
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).getIntent();
    }

    public final int k(java.lang.String str) {
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).L1.k0(str);
    }

    public final void l(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.e eVar;
        if (bundle == null || this.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).L1 == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.x xVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f186929e.get()).L1.Y0;
        com.tencent.mm.plugin.webview.ui.tools.floatball.e eVar2 = new com.tencent.mm.plugin.webview.ui.tools.floatball.e(i17, bundle);
        synchronized (xVar) {
            if (xVar.f184236a) {
                java.util.Iterator it = xVar.f184238c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    } else {
                        eVar = (com.tencent.mm.plugin.webview.ui.tools.floatball.e) it.next();
                        if (eVar.f184194a == eVar2.f184194a) {
                            break;
                        }
                    }
                }
                if (eVar != null) {
                    xVar.f184238c.remove(eVar);
                }
                xVar.f184238c.add(eVar2);
            }
        }
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing() || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183846p2.f183937e == null || str == null || !str.equals(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183846p2.f183937e.f286196c)) {
            return;
        }
        if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183846p2.f183937e != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183846p2.f183937e.b();
        }
        if (str2 == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183846p2 == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.e9(this, str2, i17, i18));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void te(int i17, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.f9(this, i17, bundle));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public boolean v3(int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.x8(this, i17));
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public void w8(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.a9(this, z17));
    }

    @Override // com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String za() {
        java.lang.ref.WeakReference weakReference = this.f186929e;
        if (weakReference.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).getIntent().getStringExtra("srcUsername");
    }
}
