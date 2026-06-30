package tz2;

/* loaded from: classes14.dex */
public class e implements tz2.u, com.tencent.mm.modelbase.u0, dn.k {
    public i11.c A;
    public float B;
    public float C;
    public boolean D;
    public int E;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser f423262d;

    /* renamed from: e, reason: collision with root package name */
    public int f423263e;

    /* renamed from: f, reason: collision with root package name */
    public int f423264f;

    /* renamed from: g, reason: collision with root package name */
    public long f423265g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f423266h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f423267i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f423268m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f423269n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f423270o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.Activity f423271p;

    /* renamed from: t, reason: collision with root package name */
    public xz2.a f423275t;

    /* renamed from: z, reason: collision with root package name */
    public i11.e f423281z;

    /* renamed from: q, reason: collision with root package name */
    public int f423272q = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f423273r = true;

    /* renamed from: s, reason: collision with root package name */
    public long f423274s = -1;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f423276u = gm0.j1.b().n();

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f423277v = "";

    /* renamed from: w, reason: collision with root package name */
    public long f423278w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f423279x = 0;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f423280y = "";

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // tz2.u
    public void a(android.widget.TextView textView, java.lang.String str) {
        try {
            boolean z17 = true;
            if (!str.equals(com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_BLINK) && !str.equals(com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_OPEN_MOUTH) && !str.equals(com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SHAKE_HEAD) && !str.equals(com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_NOD_HEAD)) {
                if (java.lang.System.currentTimeMillis() - this.f423274s >= 1000) {
                    this.f423274s = java.lang.System.currentTimeMillis();
                } else {
                    z17 = false;
                }
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "onFrameworkEvent tips: unable to change text: %s", str);
                return;
            }
            java.lang.String c17 = wz2.a.c(textView.getContext(), str);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "updateTipText res:%s tip:%s", str, c17);
            if (android.text.TextUtils.isEmpty(c17)) {
                return;
            }
            wz2.a.j(textView, c17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // tz2.u
    public void b(android.widget.TextView textView) {
    }

    @Override // tz2.u
    public void c(android.content.Intent intent, android.app.Activity activity) {
        xz2.a gVar;
        this.f423271p = activity;
        int intExtra = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f423263e = intExtra;
        this.f423264f = intent.getIntExtra("face_cgi_scene", intExtra);
        this.f423266h = intent.getStringExtra("appId");
        this.f423267i = intent.getStringExtra("request_verify_pre_info");
        this.E = intent.getIntExtra("identify_type", 0);
        this.f423269n = intent.getBooleanExtra("needVideo", false);
        this.f423270o = intent.getStringExtra("feedbackUrl");
        this.f423273r = !intent.getBooleanExtra("face_flash_no_use_id_card", false);
        this.f423272q = android.provider.Settings.System.getInt(activity.getContentResolver(), "screen_brightness", 100);
        switch (this.f423263e) {
            case 0:
                gVar = new xz2.g();
                break;
            case 1:
                gVar = new xz2.f();
                break;
            case 2:
            case 5:
                gVar = new xz2.h();
                break;
            case 3:
                gVar = new xz2.i();
                break;
            case 4:
                gVar = new xz2.c();
                break;
            case 6:
                gVar = new xz2.e();
                break;
            default:
                gVar = new xz2.b();
                break;
        }
        this.f423275t = gVar;
        java.lang.String stringExtra = intent.getStringExtra("k_ticket");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "has prepared ticket. force set");
            c72.v.f39593f = stringExtra;
        }
        boolean z17 = this.f423276u;
        if (z17) {
            gm0.j1.d().a(com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION, this);
        } else {
            gm0.j1.d().a(733, this);
        }
        gm0.j1.d().a(this.f423275t.getType(), this);
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct b17 = vz2.c.b();
        b17.f56201z = b17.b("AppId", this.f423266h, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[%s]intent data, scene:%s ,mAppId:%s verifyInfo:%s currentLight %s enterBrightness: %s isLogin:%s", getClass().getSimpleName(), java.lang.Integer.valueOf(this.f423263e), this.f423266h, this.f423267i, java.lang.Float.valueOf(0.0f), java.lang.Integer.valueOf(this.f423272q), java.lang.Boolean.valueOf(z17));
    }

    public final void d() {
        if (android.text.TextUtils.isEmpty(this.f423280y)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "cancelSendTask media id:%s", this.f423280y);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f423280y);
        this.f423280y = "";
    }

    public int e() {
        return 8;
    }

    public org.json.JSONObject f(java.lang.String str, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("err_type", 1);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_feedback", this.f423270o);
            jSONObject.put("key_app_id", this.f423266h);
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("err_msg", str);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public int g() {
        return 3;
    }

    public int h() {
        return 4;
    }

    public void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "improveBrightness");
        if (this.f423271p == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new tz2.b(this));
    }

    public void j(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "initPrepareTip :%s", str);
        if (str.equals("1")) {
            this.f423277v = i65.a.r(this.f423271p, com.tencent.mm.R.string.fl_act_blink);
            return;
        }
        if (str.equals("2")) {
            this.f423277v = i65.a.r(this.f423271p, com.tencent.mm.R.string.fl_act_open_mouth);
            return;
        }
        if (str.equals("3")) {
            this.f423277v = i65.a.r(this.f423271p, com.tencent.mm.R.string.fl_act_nod_head);
        } else if (str.equals("4")) {
            this.f423277v = i65.a.r(this.f423271p, com.tencent.mm.R.string.fl_act_shake_head);
        } else if (str.equals("5")) {
            this.f423277v = i65.a.r(this.f423271p, com.tencent.mm.R.string.fl_act_silence);
        }
    }

    public void k(java.lang.String str, boolean z17) {
        vz2.c.b().f56186k = java.lang.System.currentTimeMillis() - this.f423279x;
        vz2.c.c().f56210l = java.lang.System.currentTimeMillis() - this.f423279x;
        java.lang.String m17 = m(str, z17);
        if (android.text.TextUtils.isEmpty(m17) || !com.tencent.mm.vfs.w6.j(m17)) {
            n(90034, i65.a.r(this.f423271p, com.tencent.mm.R.string.c77));
        } else {
            o(m17, z17);
        }
    }

    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "restoreBrightness %d", java.lang.Integer.valueOf(this.f423272q));
        if (this.f423272q > 0) {
            ((ku5.t0) ku5.t0.f312615d).B(new tz2.c(this));
        }
    }

    public java.lang.String m(java.lang.String str, boolean z17) {
        java.lang.String valueOf = java.lang.String.valueOf(this.f423265g);
        java.lang.String str2 = this.f423266h;
        int g17 = g();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            boolean z18 = tz2.t.f423325a;
            r45.mi miVar = new r45.mi();
            org.json.JSONObject e17 = tz2.s.e(valueOf, str2, "", "", g17, jSONObject);
            byte[] a17 = (z18 && z17) ? valueOf != null ? tz2.t.a(valueOf, e17.toString()) : new byte[0] : tz2.s.a(valueOf, e17.toString());
            miVar.f380533e = com.tencent.mm.protobuf.g.b(a17);
            miVar.f380532d = com.tencent.mm.protobuf.g.b(tz2.s.b(valueOf, a17, z18 && z17));
            java.lang.String concat = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/release_out.fd");
            com.tencent.mm.plugin.facedetect.model.s0.l(miVar.toByteArray(), concat);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashDataUtil", "save verify result to bioId:%s file:%s  fileSize:%s  fileMd5:%s useSM4:%s", valueOf, concat, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(concat)), com.tencent.mm.vfs.w6.o(concat), java.lang.Boolean.valueOf(z18));
            return concat;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "reflect get yt result data error", new java.lang.Object[0]);
            return "";
        }
    }

    public final void n(int i17, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("err_type", 4);
            jSONObject.put("err_code", i17);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i17);
            jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i17);
            jSONObject.put("err_msg", str);
            jSONObject.put("err_feedback", this.f423270o);
        } catch (org.json.JSONException unused) {
        }
        hashMap.put("response", jSONObject.toString());
        this.f423262d.onNetworkResponseEvent(hashMap, null);
    }

    public void o(java.lang.String str, boolean z17) {
        dn.m mVar = new dn.m();
        mVar.f241787f = this;
        mVar.field_mediaId = com.tencent.mm.plugin.facedetect.model.s0.f(str);
        mVar.field_fullpath = str;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 1;
        mVar.field_bzScene = 0;
        mVar.field_largesvideo = 0;
        mVar.f241789h = 5;
        if (z17 && tz2.t.f423325a) {
            mVar.Q = com.tencent.mars.cdn.proto.UploadRequest.newBuilder().setBizid(5).setApptype(1).setFilekey(mVar.field_mediaId).setBase(com.tencent.mars.cdn.proto.Base.newBuilder().setCipher(com.tencent.mars.cdn.proto.CipherContext.newBuilder().setMethod(com.tencent.mars.cdn.proto.CipherMethod.CIPHER_METHOD_SM4CBC).build()).build()).build();
        }
        this.f423280y = mVar.field_mediaId;
        vz2.c.j("reqCdn");
        this.f423278w = java.lang.System.currentTimeMillis();
        vz2.c.m(8);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerData", "hy: cdntra addSendTask failed. clientid:%s", mVar.field_mediaId);
        vz2.c.b().B = 5;
        vz2.c.c().f56217s = 5;
        vz2.c.j("cdnFailTask");
        n(90019, "face file add to cdn failed");
    }

    @Override // tz2.u
    public void onNetworkRequestEvent(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f423262d = iYtSDKKitNetResponseParser;
        if (!str.contains("wechat_face_config")) {
            if (!str.contains("wechat_face_verify")) {
                com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper.getInstance().sendNetworkRequest(str, str2, hashMap, new tz2.a(this, iYtSDKKitNetResponseParser));
                return;
            }
            vz2.c.b().f56196u = java.lang.System.currentTimeMillis();
            l();
            k(str2, false);
            vz2.b.e(e());
            return;
        }
        vz2.c.b().f56193r = java.lang.System.currentTimeMillis();
        vz2.c.j("reqCfg");
        i();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "requestConfig");
        vz2.c.m(2);
        try {
            java.lang.String string = new org.json.JSONObject(str2).getString("select_data");
            this.f423268m = string;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "getConfig selectData:%s", string);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "reflect get yt config data error", new java.lang.Object[0]);
        }
        r45.ua3 ua3Var = new r45.ua3();
        ua3Var.f387165d = this.E;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "requestConfig cgiScene:%d", java.lang.Integer.valueOf(this.f423264f));
        if (this.f423276u) {
            gm0.j1.d().g(new c72.a0(this.f423264f, e(), this.f423266h, this.f423267i, this.f423268m.getBytes(), ua3Var));
        } else {
            gm0.j1.d().g(new c72.b0(this.f423264f, e(), this.f423266h, this.f423267i, this.f423268m.getBytes(), ua3Var));
        }
        vz2.b.d(e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof c72.a0) || (m1Var instanceof c72.b0)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]NetSceneGetBioConfig errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            vz2.c.b().f56194s = java.lang.System.currentTimeMillis();
            vz2.c.k("rspCfg", java.lang.Integer.valueOf(i18));
            vz2.c.b().f56182g = i18;
            this.f423279x = java.lang.System.currentTimeMillis();
            if (i17 != 0 || i18 != 0) {
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    vz2.c.b().B = 3;
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90036);
                    jSONObject.put("err_feedback", this.f423270o);
                    jSONObject.put("err_msg", i65.a.r(this.f423271p, com.tencent.mm.R.string.net_fetch_failed));
                } catch (org.json.JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f423262d.onNetworkResponseEvent(hashMap, null);
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "get mBioId failed");
                return;
            }
            c72.b bVar = (c72.b) m1Var;
            this.f423265g = bVar.g();
            java.lang.String decrypt = com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface.decrypt(this.f423265g + "", bVar.c(), bVar.c().length);
            java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
                jSONObject2.put("err_msg", "OK");
                jSONObject2.put("type", 1);
                jSONObject2.put("smallface_ratio_threshold", bVar.b());
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "update smallface_ratio_threshold:%f", java.lang.Float.valueOf(bVar.b()));
                jSONObject3.put("smallface_ratio_threshold", bVar.b());
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().updateSDKSetting(jSONObject3);
                if (bVar.p() != null) {
                    try {
                        jSONObject2.put("select_data", new org.json.JSONObject(new java.lang.String(bVar.p())));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerData", e17, "parse selectJson error", new java.lang.Object[0]);
                    }
                }
                org.json.JSONArray optJSONArray = new org.json.JSONObject(decrypt).optJSONArray("face_action_seq");
                if (optJSONArray != null) {
                    for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                        if (optJSONObject != null) {
                            if (optJSONObject.optInt("action_id", 0) == 6) {
                                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, optJSONObject.optString("action_data"));
                                jSONObject2.put("color_data", optJSONObject.optString("action_data"));
                            }
                            if (optJSONObject.optInt("action_id", 0) == 7) {
                                java.lang.String optString = optJSONObject.optString("action_data", "0");
                                j(optString);
                                jSONObject2.put("action_data", optString);
                            }
                        }
                    }
                }
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "reflect get config error", new java.lang.Object[0]);
            }
            hashMap2.put("response", jSONObject2.toString());
            this.f423262d.onNetworkResponseEvent(hashMap2, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[sdk-info] mBioId:%s decryptConfig:%s retMap:%s", java.lang.Long.valueOf(this.f423265g), decrypt, hashMap2);
            return;
        }
        try {
            if (m1Var instanceof xz2.d) {
                vz2.c.b().f56198w = java.lang.System.currentTimeMillis();
                vz2.c.k("rspVerify", java.lang.Integer.valueOf(i18));
                vz2.c.b().f56184i = i18;
                if (i17 == 0 && i18 == 0) {
                    android.os.Bundle bundle = ((xz2.d) m1Var).f458208d;
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    for (java.lang.String str2 : bundle.keySet()) {
                        try {
                            jSONObject4.put(str2, bundle.get(str2));
                        } catch (org.json.JSONException unused2) {
                        }
                    }
                    try {
                        jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i18);
                        jSONObject4.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                        jSONObject4.put("err_msg", str);
                    } catch (org.json.JSONException unused3) {
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject4);
                    java.util.HashMap<java.lang.String, java.lang.String> hashMap3 = new java.util.HashMap<>();
                    hashMap3.put("response", jSONObject4.toString());
                    this.f423262d.onNetworkResponseEvent(hashMap3, null);
                    return;
                }
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i18);
                jSONObject5.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                jSONObject5.put("err_type", 3);
                jSONObject5.put("err_code", i18);
                jSONObject5.put("err_retry", true);
                jSONObject5.put("err_msg", i65.a.r(this.f423271p, com.tencent.mm.R.string.jio));
            } else {
                if (m1Var instanceof c72.q) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]NetSceneFacePicThirdVerifyFace errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    vz2.c.k("rspVerify", java.lang.Integer.valueOf(i18));
                    vz2.c.b().f56184i = i18;
                    vz2.c.b().f56198w = java.lang.System.currentTimeMillis();
                    org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                    try {
                        jSONObject6.put("err_type", i17);
                        jSONObject6.put("err_code", i18);
                        jSONObject6.put("err_tip", ((c72.q) m1Var).f39583g);
                        jSONObject6.put("verify_result", ((c72.q) m1Var).f39582f);
                        jSONObject6.put("err_retry", ((c72.c) m1Var).e());
                        if (i17 == 0 && i18 == 0) {
                            jSONObject6.put("err_msg", str);
                            jSONObject6.put("key_app_id", this.f423266h);
                            jSONObject6.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i18);
                            jSONObject6.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                            jSONObject6.put("err_msg", str);
                            if (this.E == 1) {
                                jSONObject6.put("selfHandle", true);
                            }
                            vz2.b.c(e());
                        } else {
                            vz2.c.b().B = 4;
                            jSONObject6.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i18);
                            jSONObject6.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                            jSONObject6.put("err_msg", i65.a.r(this.f423271p, com.tencent.mm.R.string.g6w));
                            jSONObject6.put("err_feedback", this.f423270o);
                            jSONObject6.put("err_msg", str);
                            vz2.b.a(e());
                        }
                    } catch (org.json.JSONException unused4) {
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject6);
                    java.util.HashMap<java.lang.String, java.lang.String> hashMap4 = new java.util.HashMap<>();
                    hashMap4.put("response", jSONObject6.toString());
                    this.f423262d.onNetworkResponseEvent(hashMap4, null);
                    return;
                }
                if (!(m1Var instanceof c72.c)) {
                    return;
                }
                vz2.c.b().f56198w = java.lang.System.currentTimeMillis();
                vz2.c.k("rspVerify", java.lang.Integer.valueOf(i18));
                vz2.c.b().f56184i = i18;
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                new android.os.Bundle().putString(this.f423275t.b(), ((c72.c) m1Var).n());
                jSONObject7.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i18);
                jSONObject7.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, i18);
                jSONObject7.put("err_type", 2);
                jSONObject7.put("err_code", i18);
                jSONObject7.put("err_msg", str);
                jSONObject7.put("err_retry", ((c72.c) m1Var).e());
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "[cgi-ret]retContent:%s", jSONObject7);
                java.util.HashMap<java.lang.String, java.lang.String> hashMap5 = new java.util.HashMap<>();
                hashMap5.put("response", jSONObject7.toString());
                this.f423262d.onNetworkResponseEvent(hashMap5, null);
            }
        } catch (org.json.JSONException unused5) {
        }
    }

    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        int i18 = hVar == null ? -1 : hVar.field_retCode;
        vz2.c.k("rspCdn", java.lang.Integer.valueOf(i18));
        vz2.c.b().f56183h = i18;
        vz2.c.b().f56185j = java.lang.System.currentTimeMillis() - this.f423278w;
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "hy: ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            return 0;
        }
        if (hVar == null || hVar.field_retCode != 0 || !this.f423280y.equals(str)) {
            if (i17 != 0 || (hVar != null && hVar.field_retCode != 0)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceFlashManagerData", "hy: cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                vz2.c.b().B = 5;
                java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90020);
                    java.lang.String r17 = i65.a.r(this.f423271p, com.tencent.mm.R.string.msg_net_error);
                    jSONObject.put("err_feedback", this.f423270o);
                    jSONObject.put("err_msg", r17);
                } catch (org.json.JSONException unused) {
                }
                hashMap.put("response", jSONObject.toString());
                this.f423262d.onNetworkResponseEvent(hashMap, null);
            }
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerData", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
        java.lang.String str2 = hVar.field_fileId;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_pic_cdn_id", str2);
        bundle.putString("key_cdn_aes_key", hVar.field_aesKey);
        vz2.c.j("reqVerify");
        vz2.c.m(9);
        vz2.c.b().f56197v = java.lang.System.currentTimeMillis();
        this.f423275t.a(this.f423263e, this.f423265g, str2, hVar.field_aesKey, this.f423266h, this.f423267i, h(), 0.0f, this.f423269n ? 1 : 0, this.f423273r, this.E, this);
        return 0;
    }

    @Override // tz2.u
    public void release() {
        d();
        l();
        gm0.j1.d().q(com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION, this);
        gm0.j1.d().q(this.f423275t.getType(), this);
        gm0.j1.d().q(733, this);
        i11.e eVar = this.f423281z;
        if (eVar != null) {
            ((i11.h) eVar).m(this.A);
        }
    }

    @Override // tz2.u
    public void reset() {
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct b17 = vz2.c.b();
        b17.f56201z = b17.b("AppId", this.f423266h, true);
        d();
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
