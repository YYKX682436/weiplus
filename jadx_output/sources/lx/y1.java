package lx;

/* loaded from: classes11.dex */
public final class y1 implements com.tencent.pigeon.biz.BizMeTabApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f322014d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizMeTabNativeToFlutterApi f322015e;

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void addToGeneralPreload(java.lang.String url, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).b(url, 0, 0, (int) j17, new java.lang.Object[0]);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void addToPreload(java.lang.String url, long j17, long j18, java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f322014d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizMeTabApi.Companion companion = com.tencent.pigeon.biz.BizMeTabApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizMeTabApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f322015e = new com.tencent.pigeon.biz.BizMeTabNativeToFlutterApi(binaryMessenger2, null, 2, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f322014d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f322014d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizMeTabApi.Companion companion = com.tencent.pigeon.biz.BizMeTabApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizMeTabApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f322015e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f322014d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openBusinessProfilePage(java.lang.String userName, long j17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (userName.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openBusinessProfilePage: userName empty");
            return;
        }
        i95.m c17 = i95.n0.c(r01.l1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r01.l1 l1Var = (r01.l1) c17;
        android.content.Context context = this.f322014d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        r01.l1.Zi(l1Var, context, userName, (int) j17, false, 8, null);
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openCommonUrl(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        android.content.Context context = this.f322014d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openEditorFromMeTab(com.tencent.pigeon.biz.MeTabWeAppJumpInfo jumpInfo) {
        int i17;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openEditorFromMeTab: " + jumpInfo);
        if (this.f322014d == null) {
            return;
        }
        java.lang.Long bizType = jumpInfo.getBizType();
        if (bizType != null) {
            i17 = (int) bizType.longValue();
        } else {
            tk.s[] sVarArr = tk.s.f419870d;
            i17 = 1;
        }
        if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            tk.s[] sVarArr2 = tk.s.f419870d;
            if (i17 == 2) {
                android.app.Activity activity = this.f322014d;
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.d(com.tencent.mm.R.string.paj);
                e4Var.f211779f = false;
                e4Var.c();
                com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMeTabPlugin", "openEditorFromMeTab: can not create biz photo, return   ");
                return;
            }
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f322015e);
        java.lang.Long isInit = jumpInfo.isInit();
        boolean z17 = (isInit != null ? (int) isInit.longValue() : 0) == 1;
        java.lang.Long draftType = jumpInfo.getDraftType();
        tk.u uVar = (draftType != null ? (int) draftType.longValue() : 0) == 1 ? tk.u.f419873g : tk.u.f419872f;
        tk.s[] sVarArr3 = tk.s.f419870d;
        int i19 = i17 == 1 ? 1396 : 1415;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("draftScene", "personalCenter");
        jSONObject.put("draftType", jumpInfo.getDraftType());
        jSONObject.put("publishScene", "mineTab");
        jSONObject.put("mpPublishAction", uVar.f419877d);
        jSONObject.put("bizType", i17);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i19);
        jSONObject.put("weAppParam", jSONObject2);
        tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
        android.app.Activity activity2 = this.f322014d;
        kotlin.jvm.internal.o.d(activity2);
        ((ox.o) qVar).Ai(activity2, jSONObject, new lx.v1(z17, weakReference));
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openFansMsg() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("serviceType", 5);
        android.content.Context context = this.f322014d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "brandservice", ".conversation.ui.BizFansConversationListUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openLiteApp(long j17) {
        jz5.f0 f0Var;
        if (this.f322014d != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("show_packet_name", "com.tencent.wetype");
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, (int) j17);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("packet_name", "com.tencent.wetype");
            jSONObject2.put("check_type", jSONObject3);
            jSONObject2.put("swiperId", "voice");
            jSONArray.put(jSONObject2);
            jSONObject.put("items", jSONArray);
            java.lang.String jSONObject4 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalitebf3a88de4da873052ba340892dc97559");
            bundle.putString("query", jSONObject4);
            bundle.putString("minVersion", "1.1.10");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this.f322014d, bundle, true, false, new lx.w1());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMeTabPlugin", "openLiteApp: activity is null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openRedDot() {
        com.tencent.mm.protocal.protobuf.Html5Info html5_info;
        com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info;
        android.content.Context context = this.f322014d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.pigeon.biz.BizMeTabNativeToFlutterApi bizMeTabNativeToFlutterApi = this.f322015e;
        if (bizMeTabNativeToFlutterApi != null) {
            bizMeTabNativeToFlutterApi.clearRedDotInfo(lx.x1.f322003d);
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("MyTabPhotoProfile");
        r2 = null;
        java.lang.String str = null;
        r45.vs2 vs2Var = L0 != null ? L0.field_ctrInfo : null;
        if (vs2Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openRedDot: ctrlInfo is null");
            return;
        }
        r45.xs2 xs2Var = new r45.xs2();
        com.tencent.mm.protobuf.g gVar = vs2Var.f388488f;
        com.tencent.mm.protobuf.f fromProtobuf = xs2Var.fromProtobuf(gVar != null ? gVar.g() : null);
        r45.xs2 xs2Var2 = fromProtobuf instanceof r45.xs2 ? (r45.xs2) fromProtobuf : null;
        if (xs2Var2 != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
            boolean z17 = true;
            if ((finderJumpInfo != null && finderJumpInfo.getJumpinfo_type() == 1) == true) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                if (finderJumpInfo2 != null && (mini_app_info = finderJumpInfo2.getMini_app_info()) != null) {
                    android.content.Context context2 = this.f322014d;
                    if (context2 == null) {
                        context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    }
                    java.lang.String app_id = mini_app_info.getApp_id();
                    if (app_id == null) {
                        app_id = "";
                    }
                    java.lang.String appusername = mini_app_info.getAppusername();
                    java.lang.String path = mini_app_info.getPath();
                    if (path == null) {
                        path = "";
                    }
                    int scene = mini_app_info.getScene();
                    java.lang.String scene_note = mini_app_info.getScene_note();
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317014b = app_id;
                    b1Var.f317012a = appusername;
                    b1Var.f317022f = path;
                    b1Var.f317032k = scene;
                    b1Var.f317034l = scene_note;
                    android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                    java.lang.String transit_common_ux_info = mini_app_info.getTransit_common_ux_info();
                    persistableBundle.putString("commonUxInfo", transit_common_ux_info != null ? transit_common_ux_info : "");
                    b1Var.f317030j = persistableBundle;
                    b1Var.f317028i = new lx.t1(mini_app_info);
                    b1Var.L = new lx.s1(this);
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(context2, b1Var);
                }
            } else {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                if ((finderJumpInfo3 != null && finderJumpInfo3.getJumpinfo_type() == 2) == true) {
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo4 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                    if (finderJumpInfo4 != null && (html5_info = finderJumpInfo4.getHtml5_info()) != null) {
                        str = html5_info.getUrl();
                    }
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMeTabPlugin", "jumpInfo url is null");
                    } else {
                        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
                        kotlin.jvm.internal.o.d(context);
                        ((ox.g) oVar).tj(context, str);
                    }
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parse jumpInfo error, type: ");
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo5 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xs2Var2.getCustom(20);
                    sb6.append(finderJumpInfo5 != null ? java.lang.Integer.valueOf(finderJumpInfo5.getJumpinfo_type()) : null);
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMeTabPlugin", sb6.toString());
                }
            }
        }
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).Ai(0);
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void openUrl(com.tencent.pigeon.biz.MeTabBizArticleInfo articleInfo) {
        kotlin.jvm.internal.o.g(articleInfo, "articleInfo");
        com.tencent.pigeon.biz_base.BizArticleInfo bizArticleInfo = new com.tencent.pigeon.biz_base.BizArticleInfo(articleInfo.getMsgId(), null, null, null, articleInfo.getOpenScene(), articleInfo.getSubScene(), articleInfo.getUrl(), articleInfo.getItemShowType(), articleInfo.getUserName(), articleInfo.getNickName(), articleInfo.getTitle(), articleInfo.getCoverUrl(), null, null, null, articleInfo.getBizSessionId(), articleInfo.getJumpPaths(), articleInfo.getHideShareMenu(), 28686, null);
        yw.h1 h1Var = yw.h1.f466332a;
        android.content.Context context = this.f322014d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        h1Var.s(bizArticleInfo, context);
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void preloadEnvForPluginApp() {
        ((r01.l1) i95.n0.c(r01.l1.class)).bj();
    }

    @Override // com.tencent.pigeon.biz.BizMeTabApi
    public void triggerPreDownloadForPath(java.lang.String appId, java.lang.String path, long j17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        ((r01.l1) i95.n0.c(r01.l1.class)).fj(appId, path, (int) j17);
    }
}
