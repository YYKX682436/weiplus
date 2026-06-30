package zc;

/* loaded from: classes11.dex */
public final class b0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f471328d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471329e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.FlutterEngine f471330f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f471331g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.common.BinaryMessenger f471332h;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.PluginRegistry f471333i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi f471334m;

    /* renamed from: n, reason: collision with root package name */
    public final kotlinx.coroutines.z f471335n = kotlinx.coroutines.b0.a(null, 1, null);

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f471336o = new java.util.LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Long f471337p;

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void checkAndGetLiteAppPath(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage msg, yz5.l callback) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.lite.LiteAppCenter.checkAndGetLiteAppPath(msg.getAppId(), msg.getCheckUpdate(), msg.getSyncCheckUpdate(), new zc.z(callback));
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void createStore(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String appId = msg.getAppId();
        long aliveSeconds = msg.getAliveSeconds();
        com.tencent.mm.plugin.lite.LiteAppCenter.createStoreForLiteAppWidget(appId, (int) aliveSeconds, msg.getWaitDownload(), (int) msg.getDownloadTimeout());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void createStoreWithPkgPath(com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.createStoreWithPkgPathForLiteAppWidget(msg.getAppId(), (int) msg.getAliveSeconds(), msg.getPkgPath());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void destroyLiteAppView(com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        long appUuid = msg.getAppUuid();
        java.util.Map map = this.f471336o;
        int i17 = (int) appUuid;
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = (com.tencent.liteapp.WxaLiteAppWidgetAdapter) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (wxaLiteAppWidgetAdapter != null) {
            wxaLiteAppWidgetAdapter.a();
        }
        map.remove(java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public long dispatchStore(com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return com.tencent.mm.plugin.lite.LiteAppCenter.dispatchStoreForLiteAppWidget(msg.getAppId(), msg.getActionName(), msg.getParams());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void genLiteAppUuidAndSessionId(com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidMessage msg, yz5.l callback) {
        long genAppUuid;
        java.lang.String sessionId;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo queryPreloadAppInfo = com.tencent.mm.plugin.lite.LiteAppCenter.queryPreloadAppInfo(msg.getAppId(), msg.getPage(), msg.getPath());
        if (queryPreloadAppInfo != null) {
            genAppUuid = queryPreloadAppInfo.appUuid;
            if (genAppUuid != 0) {
                sessionId = queryPreloadAppInfo.sessionId;
                kotlin.jvm.internal.o.f(sessionId, "sessionId");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(genAppUuid, sessionId))));
            }
        }
        genAppUuid = com.tencent.mm.plugin.lite.LiteAppCenter.genAppUuid();
        sessionId = com.tencent.mm.plugin.lite.LiteAppCenter.genLiteAppSessionId();
        kotlin.jvm.internal.o.f(sessionId, "genLiteAppSessionId(...)");
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage(genAppUuid, sessionId))));
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public long getLiteAppEngineId() {
        if (this.f471337p == null) {
            this.f471337p = java.lang.Long.valueOf(zc.y.f471378a);
            zc.y.f471378a++;
        }
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "WxaLiteAppWidgetPlugin hash: " + hashCode() + ", getLiteAppEngineId: " + this.f471337p, new java.lang.Object[0]);
        java.lang.Long l17 = this.f471337p;
        kotlin.jvm.internal.o.d(l17);
        return l17.longValue();
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void init() {
        com.tencent.mm.plugin.lite.LiteAppCenter.IWxaLiteAppCallback iWxaLiteAppCallback = com.tencent.mm.plugin.lite.LiteAppCenter.mCallback;
        if (iWxaLiteAppCallback != null) {
            iWxaLiteAppCallback.onLiteAppWidgetPrepared();
        }
        kx5.n.h().i(this.f471330f);
        kx5.n h17 = kx5.n.h();
        int hashCode = hashCode();
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f471330f;
        if (flutterEngine != null) {
            h17.f313317g.put(hashCode, flutterEngine);
        } else {
            h17.getClass();
            nx5.c.e("WxaRouter.WxaRouter", "engine is null.", new java.lang.Object[0]);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onAttachedToActivity " + binding.getActivity() + ' ' + binding.getLifecycle(), new java.lang.Object[0]);
        this.f471328d = binding.getActivity();
        this.f471329e = binding.getLifecycle();
        ((kotlinx.coroutines.a0) this.f471335n).U(jz5.f0.f302826a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onAttachedToEngine " + flutterPluginBinding.getApplicationContext(), new java.lang.Object[0]);
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi.Companion companion = com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, this);
        this.f471330f = flutterPluginBinding.getFlutterEngine();
        this.f471331g = flutterPluginBinding.getApplicationContext();
        this.f471332h = flutterPluginBinding.getBinaryMessenger();
        this.f471333i = flutterPluginBinding.getFlutterEngine().getPlugins();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = this.f471332h;
        kotlin.jvm.internal.o.d(binaryMessenger2);
        this.f471334m = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi(binaryMessenger2);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onDetachedFromActivity", new java.lang.Object[0]);
        this.f471328d = null;
        this.f471329e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onDetachedFromActivityForConfigChanges", new java.lang.Object[0]);
        this.f471328d = null;
        this.f471329e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onDetachedFromEngine", new java.lang.Object[0]);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f471336o;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.liteapp.WxaLiteAppWidgetAdapter) ((java.util.Map.Entry) it.next()).getValue()).a();
        }
        linkedHashMap.clear();
        kx5.n h17 = kx5.n.h();
        h17.f313317g.remove(hashCode());
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi.Companion companion = com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        companion.setUp(binaryMessenger, null);
        this.f471331g = null;
        this.f471332h = null;
        this.f471330f = null;
        this.f471337p = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "onReattachedToActivityForConfigChanges " + binding.getActivity() + ' ' + binding.getLifecycle(), new java.lang.Object[0]);
        this.f471328d = binding.getActivity();
        this.f471329e = binding.getLifecycle();
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void publishEventToTopPage(com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        long appUuid = msg.getAppUuid();
        com.tencent.mm.plugin.lite.LiteAppCenter.publishEventToTopPageForLiteAppWidget((int) appUuid, (int) msg.getNodeId(), msg.getEventName(), msg.getData());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void publishGlobalEvent(com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        long appUuid = msg.getAppUuid();
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventForLiteAppWidget((int) appUuid, (int) msg.getPageId(), msg.getEventName(), msg.getData());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void publishGlobalEventToAll(com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToAllForLiteAppWidget(msg.getEventName(), msg.getData());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void publishGlobalEventToAllByAppId(com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllByAppIdMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToAllByAppIdForLiteAppWidget(msg.getAppId(), msg.getEventName(), msg.getData());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void publishGlobalEventToTopPage(com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToTopPageMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPageForLiteAppWidget((int) msg.getAppUuid(), msg.getEventName(), msg.getData());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void releaseStore(com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.releaseStoreForLiteAppWidget(msg.getAppId());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void showLiteAppView(com.tencent.pigeon.liteapp.WxaLiteAppWidgetShowViewMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.y0 a18 = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        kd.c.c("LiteApp.WxaLiteAppWidgetPlugin", "showLiteAppView appId: " + msg.getAppId() + " appUuid: " + msg.getAppUuid(), new java.lang.Object[0]);
        java.lang.String appId = msg.getAppId();
        java.lang.String page = msg.getPage();
        java.lang.String query = msg.getQuery();
        java.lang.String sessionId = msg.getSessionId();
        java.lang.String path = msg.getPath();
        java.lang.String signatureKey = msg.getSignatureKey();
        msg.isTransparent();
        kotlinx.coroutines.l.d(a18, null, null, new zc.a0(this, msg.getAppUuid(), appId, page, query, sessionId, path, signatureKey, com.tencent.mm.plugin.lite.LiteAppCenter.liteAppWidgetGetStartReport(appId), null), 3, null);
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public boolean storeIsAlive(com.tencent.pigeon.liteapp.WxaLiteAppWidgetStoreIsAliveMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return com.tencent.mm.plugin.lite.LiteAppCenter.storeIsAliveForLiteAppWidget(msg.getAppId());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void subscribeStore(com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.subscribeStoreForLiteAppWidget(msg.getAppId(), msg.getPointers());
    }

    @Override // com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApi
    public void unsubscribeStore(com.tencent.pigeon.liteapp.WxaLiteAppWidgetUnsubscribeStoreMessage msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.lite.LiteAppCenter.unsubscribeStoreForLiteAppWidget(msg.getAppId(), msg.getPointers());
    }
}
