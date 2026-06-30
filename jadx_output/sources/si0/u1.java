package si0;

/* loaded from: classes8.dex */
public final class u1 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformWeAppApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f408177d = new java.lang.ref.WeakReference(null);

    @Override // com.tencent.pigeon.sns.PlatformWeAppApi
    public void getWeAppNickName(java.lang.String userName, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (userName.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWeAppPlugin", "getWeAppNickName: userName is empty");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "getWeAppNickName: userName=".concat(userName));
        try {
            java.lang.String e17 = ((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.e(userName) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "getWeAppNickName: nickName=" + e17);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (e17 == null) {
                e17 = "";
            }
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(e17)));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWeAppPlugin", "getWeAppNickName error: " + e18.getMessage());
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
        }
    }

    @Override // com.tencent.pigeon.sns.PlatformWeAppApi
    public void jumpToWeApp(java.lang.String userName, java.lang.String pagePath, long j17, com.tencent.pigeon.sns.PlatformWeAppJumpScene scene, java.lang.String messageExtraData) {
        int i17;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(pagePath, "pagePath");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(messageExtraData, "messageExtraData");
        android.content.Context context = (android.content.Context) this.f408177d.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: context is null");
            return;
        }
        if (userName.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: userName is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: userName=" + userName + ", pagePath=" + pagePath + ", version=" + j17 + ", scene=" + scene + ", messageExtraData=" + messageExtraData);
        try {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            am.ox oxVar = startAppBrandUIFromOuterEvent.f54858h;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7471f = context;
            nxVar.f7466a = userName;
            nxVar.f7467b = pagePath;
            nxVar.f7474i = j17 > 0 ? (int) j17 : 0;
            int i18 = si0.t1.f408175a[scene.ordinal()];
            if (i18 == 1) {
                i17 = 1045;
            } else if (i18 != 2) {
                if (i18 != 3 && i18 != 4) {
                    throw new jz5.j();
                }
                i17 = 1009;
            } else {
                i17 = 1046;
            }
            nxVar.f7469d = i17;
            nxVar.f7480o.f70417f = messageExtraData;
            startAppBrandUIFromOuterEvent.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "jumpToWeApp: openOk=" + oxVar.f7581a + ", returnMsg=" + oxVar.f7582b);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWeAppPlugin", "jumpToWeApp error: " + e17.getMessage());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onAttachedToActivity");
        this.f408177d = new java.lang.ref.WeakReference(binding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onAttachedToEngine");
        com.tencent.pigeon.sns.PlatformWeAppApi.Companion companion = com.tencent.pigeon.sns.PlatformWeAppApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformWeAppApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onDetachedFromActivity");
        this.f408177d.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWeAppPlugin", "[" + hashCode() + "]onDetachedFromEngine");
        com.tencent.pigeon.sns.PlatformWeAppApi.Companion companion = com.tencent.pigeon.sns.PlatformWeAppApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformWeAppApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        onAttachedToActivity(binding);
    }
}
