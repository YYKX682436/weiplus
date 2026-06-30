package lx;

/* loaded from: classes11.dex */
public final class m5 implements com.tencent.pigeon.biz.BizPublishApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321868d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding f321869e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f321870f;

    /* renamed from: g, reason: collision with root package name */
    public final io.flutter.plugin.common.PluginRegistry.ActivityResultListener f321871g = new lx.c5(this);

    public static final /* synthetic */ java.lang.String a(lx.m5 m5Var) {
        m5Var.getClass();
        return "MicroMsg.FlutterBizPublishPlugin";
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void bindPhone(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f321868d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPublishPlugin", "bindPhone: activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        } else if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "bindPhone: already bound");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        } else {
            this.f321870f = callback;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("back_to_status", false);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.h(activity, intent, 2001);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "bindPhone: startBindMcontactWizard");
        }
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void checkWCPayIsReg(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "checkWCPayIsReg");
        gm0.j1.d().a(385, new lx.d5(this, callback));
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ui(0);
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void compressPublishImage(java.lang.String dstPath, java.lang.String origPath, long j17, long j18, long j19, yz5.l callback) {
        kotlin.jvm.internal.o.g(dstPath, "dstPath");
        kotlin.jvm.internal.o.g(origPath, "origPath");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).h(new lx.e5(this, dstPath, origPath, j17, j18, j19, callback), "compressPublishImage");
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public java.lang.String getBizPublishCacheDirectory() {
        return "";
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public boolean isUserBindOpMobile() {
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "isUserBindOpMobile: " + c17);
        return c17;
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void launchMapMiniProgramWithCallback(com.tencent.pigeon.biz.MiniProgramLaunchInfo launchInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(launchInfo, "launchInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String appid = launchInfo.getAppid();
        java.lang.String str = appid == null ? "" : appid;
        java.lang.String username = launchInfo.getUsername();
        if (username == null) {
            username = "";
        }
        java.lang.String path = launchInfo.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.Long scene = launchInfo.getScene();
        int longValue = scene != null ? (int) scene.longValue() : 0;
        java.lang.String scene_note = launchInfo.getScene_note();
        if (scene_note == null) {
            scene_note = "";
        }
        java.lang.String extra_data = launchInfo.getExtra_data();
        if (extra_data == null) {
            extra_data = "";
        }
        java.lang.String referrer_info_extra_data = launchInfo.getReferrer_info_extra_data();
        java.lang.String str2 = referrer_info_extra_data != null ? referrer_info_extra_data : "";
        java.lang.Long app_version = launchInfo.getApp_version();
        int longValue2 = app_version != null ? (int) app_version.longValue() : 0;
        java.lang.Long versionType = launchInfo.getVersionType();
        int longValue3 = versionType != null ? (int) versionType.longValue() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback: appid=" + str + ", username=" + username + ", path=" + path + ", scene=" + longValue + ", appVersion=" + longValue2 + ", versionType=" + longValue3);
        android.app.Activity activity = this.f321868d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback: activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("activity is null")))));
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        b1Var.f317012a = username;
        b1Var.f317022f = path;
        b1Var.f317032k = longValue;
        b1Var.f317034l = scene_note;
        b1Var.f317028i = new lx.f5(extra_data);
        b1Var.f317016c = longValue3;
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77323e = str;
        appBrandLaunchReferrer.f77324f = str2;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(activity, b1Var);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        lx.h5 h5Var = new lx.h5(c0Var, callback);
        lx.i5 i5Var = new lx.i5(this, str, h5Var);
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).wi(str, i5Var);
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new lx.g5(c0Var, this, str, i5Var, h5Var), 300000L);
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void notifyBizPublishResult(com.tencent.pigeon.biz.BizPublishResultPiegonInfo result, yz5.l callback) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "notifyBizPublishResult, " + result);
        rv.e3 e3Var = yw.x1.f466507a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (e3Var != null) {
            ox.z zVar = (ox.z) ((tk.r) i95.n0.c(tk.r.class));
            zVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Boolean success = result.getSuccess();
            if (success != null) {
                boolean booleanValue = success.booleanValue();
                java.lang.Object obj = ya.b.SUCCESS;
                jSONObject.put(ya.b.SUCCESS, booleanValue);
                if (!booleanValue) {
                    obj = "fail";
                }
                jSONObject.put("status", obj);
            }
            java.lang.Object reason = result.getReason();
            if (reason != null) {
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, reason);
            }
            java.lang.Boolean successInit = result.getSuccessInit();
            if (successInit != null) {
                jSONObject.put("initSuccess", successInit.booleanValue());
            }
            java.lang.Object title = result.getTitle();
            if (title != null) {
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
            }
            java.lang.Object nickname = result.getNickname();
            if (nickname != null) {
                jSONObject.put("nickname", nickname);
            }
            java.lang.Object avatar = result.getAvatar();
            if (avatar != null) {
                jSONObject.put("avatar", avatar);
            }
            java.lang.Object url = result.getUrl();
            if (url != null) {
                jSONObject.put("url", url);
            }
            java.util.List<com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo> imagesInfo = result.getImagesInfo();
            if (imagesInfo != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo bizPublishResultImagePiegonInfo : imagesInfo) {
                    if (bizPublishResultImagePiegonInfo != null) {
                        jSONArray.put(zVar.aj(bizPublishResultImagePiegonInfo, "cdnUrl"));
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("imagesInfo", jSONArray);
                }
            }
            com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo coverInfo = result.getCoverInfo();
            if (coverInfo != null) {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                jSONArray2.put(zVar.aj(coverInfo, "cdn_url"));
                jSONObject.put("coverInfo", jSONArray2);
            }
            com.tencent.pigeon.biz.BizPublishLaunchPoiPiegonInfo poiInfo = result.getPoiInfo();
            if (poiInfo != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.lang.String name = poiInfo.getName();
                if (name != null) {
                    jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name);
                }
                java.lang.String address = poiInfo.getAddress();
                if (address != null) {
                    jSONObject2.put("address", address);
                }
                java.lang.String districtId = poiInfo.getDistrictId();
                if (districtId != null) {
                    jSONObject2.put("districtid", districtId);
                }
                java.lang.Double latitude = poiInfo.getLatitude();
                if (latitude != null) {
                    jSONObject2.put("latitude", latitude.doubleValue());
                }
                java.lang.Double longitude = poiInfo.getLongitude();
                if (longitude != null) {
                    jSONObject2.put("longitude", longitude.doubleValue());
                }
                java.lang.String poiId = poiInfo.getPoiId();
                if (poiId != null) {
                    jSONObject2.put("poiid", poiId);
                }
                jSONObject.put("poiInfo", jSONObject2);
            }
            com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonInfo appMsgData = result.getAppMsgData();
            if (appMsgData != null) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                java.lang.String title2 = appMsgData.getTitle();
                if (title2 != null) {
                    jSONObject3.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title2);
                }
                java.lang.String jumpUrl = appMsgData.getJumpUrl();
                if (jumpUrl != null) {
                    jSONObject3.put("jump_url", jumpUrl);
                }
                com.tencent.pigeon.biz.BizPublishResultImagePiegonInfo pictureInfo = appMsgData.getPictureInfo();
                if (pictureInfo != null) {
                    jSONObject3.put("picture_info", zVar.aj(pictureInfo, "cdn_url"));
                }
                com.tencent.pigeon.biz.BizPublishAppMsgDataResultPigeonBizInfo bizInfo = appMsgData.getBizInfo();
                if (bizInfo != null) {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    java.lang.String nickname2 = bizInfo.getNickname();
                    if (nickname2 != null) {
                        jSONObject4.put("nick_name", nickname2);
                    }
                    java.lang.String headImgUrl = bizInfo.getHeadImgUrl();
                    if (headImgUrl != null) {
                        jSONObject4.put("headimgurl", headImgUrl);
                    }
                    java.lang.String username = bizInfo.getUsername();
                    if (username != null) {
                        jSONObject4.put("user_name", username);
                    }
                    java.lang.String bizUin = bizInfo.getBizUin();
                    if (bizUin != null) {
                        jSONObject4.put("bizuin", bizUin);
                    }
                    java.lang.String appMsgId = bizInfo.getAppMsgId();
                    if (appMsgId != null) {
                        jSONObject4.put("appmsgid", appMsgId);
                    }
                    java.lang.Long idx = bizInfo.getIdx();
                    if (idx != null) {
                        jSONObject4.put("idx", idx.longValue());
                    }
                    jSONObject3.put("biz_info", jSONObject4);
                }
                jSONObject.put("appMsgData", jSONObject3);
            }
            e3Var.a(result, jSONObject);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterPublishHelper", "mCallback is null, ignore notifyBizPublishResult");
        }
        yw.x1.f466507a = null;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(f0Var2)));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321868d = binding.getActivity();
        this.f321869e = binding;
        binding.addActivityResultListener(this.f321871g);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizPublishApi.Companion companion = com.tencent.pigeon.biz.BizPublishApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizPublishApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding = this.f321869e;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f321871g);
        }
        this.f321869e = null;
        this.f321868d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding = this.f321869e;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.f321871g);
        }
        this.f321869e = null;
        this.f321868d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizPublishApi.Companion companion = com.tencent.pigeon.biz.BizPublishApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizPublishApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321868d = binding.getActivity();
        this.f321869e = binding;
        binding.addActivityResultListener(this.f321871g);
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void openRedPacketCoverLiteApp(java.lang.String appId, java.lang.String page, java.util.Map query, yz5.l callback) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: appId=" + appId + ", page=" + page + ", query=" + query);
        android.app.Activity activity = this.f321868d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("activity is null")))));
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = query.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (((java.lang.String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            java.lang.Object key = entry2.getKey();
            kotlin.jvm.internal.o.d(key);
            linkedHashMap2.put((java.lang.String) key, entry2.getValue());
        }
        java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap2).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        final lx.k5 k5Var = new lx.k5(new kotlin.jvm.internal.c0(), callback);
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
        liteAppHalfScreenConfig.f143411e = 0.75d;
        liteAppHalfScreenConfig.f143414h = true;
        liteAppHalfScreenConfig.f143416m = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener() { // from class: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPublishPlugin$openRedPacketCoverLiteApp$halfScreenConfig$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(java.lang.Boolean.FALSE);
            }

            @Override // com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener
            public void d() {
                lx.m5.a(lx.m5.this);
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp: halfScreen onDestroy");
                k5Var.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
            }
        };
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", appId);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, page);
        bundle.putString("query", jSONObject);
        bundle.putBoolean("isHalfScreen", true);
        bundle.putParcelable("halfScreenConfig", liteAppHalfScreenConfig);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new lx.l5(this, k5Var);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(activity, bundle, true, false, sVar, new lx.j5(this, k5Var));
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void openUrl(com.tencent.pigeon.biz.BizPublishArticleInfo articleInfo, boolean z17) {
        kotlin.jvm.internal.o.g(articleInfo, "articleInfo");
        com.tencent.pigeon.biz_base.BizArticleInfo bizArticleInfo = new com.tencent.pigeon.biz_base.BizArticleInfo(articleInfo.getMsgId(), null, null, null, articleInfo.getOpenScene(), articleInfo.getSubScene(), articleInfo.getUrl(), articleInfo.getItemShowType(), articleInfo.getUserName(), articleInfo.getNickName(), articleInfo.getTitle(), articleInfo.getCoverUrl(), null, null, null, articleInfo.getBizSessionId(), articleInfo.getJumpPaths(), articleInfo.getHideShareMenu(), 28686, null);
        yw.h1 h1Var = yw.h1.f466332a;
        android.content.Context context = this.f321868d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        h1Var.s(bizArticleInfo, context);
        if (z17) {
            android.app.Activity activity = this.f321868d;
            if (activity != null) {
                activity.finish();
            }
            android.app.Activity activity2 = this.f321868d;
            if (activity2 != null) {
                activity2.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public boolean requestPublishPicLocationPermission() {
        return false;
    }

    @Override // com.tencent.pigeon.biz.BizPublishApi
    public void setNativeEditorDebugMode(long j17) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        int i17 = (int) j17;
        ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).getClass();
        ox.z.f349541h = i17;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            try {
                java.util.Set set = ox.z.f349538e;
                try {
                    o4Var = com.tencent.mm.sdk.platformtools.o4.R("biz_publish_debug");
                } catch (java.lang.Throwable unused) {
                    o4Var = null;
                }
                if (o4Var != null) {
                    o4Var.putInt("k_native_editor_debug_mode", i17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizPublishRichEditorService", "setDebugNativeEditorMode persist error: " + th6);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishRichEditorService", "setDebugNativeEditorMode: " + i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "setNativeEditorDebugMode via pigeon: " + i17);
    }
}
