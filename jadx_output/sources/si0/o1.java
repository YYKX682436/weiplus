package si0;

/* loaded from: classes11.dex */
public final class o1 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformProfileApi, com.tencent.pigeon.status.StatusPublishPlatformApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f408146d;

    @Override // com.tencent.pigeon.status.StatusPublishPlatformApi
    public void closeFromPlatform() {
    }

    @Override // com.tencent.pigeon.sns.PlatformProfileApi
    public void getOpenImLabel(java.lang.String userName, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String a17 = t41.g.a(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(userName));
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (a17 == null) {
            a17 = "";
        }
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(a17)));
    }

    @Override // com.tencent.pigeon.sns.PlatformProfileApi
    public boolean jumpToProfile(java.lang.String userName, java.lang.String scene) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(scene, "scene");
        android.app.Activity activity = this.f408146d;
        if (activity == null) {
            return false;
        }
        com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(userName);
        if (q17 == null || r26.i0.n(userName, "@stranger", false)) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = ri0.a.f396021a;
            intent = userName.length() > 0 ? (android.content.Intent) ((java.util.LinkedHashMap) ri0.a.f396022b).get(userName) : null;
            if (intent == null) {
                intent = new android.content.Intent();
            }
        } else {
            intent = new android.content.Intent();
        }
        intent.putExtra("Contact_User", userName);
        if (q17 != null && q17.k2()) {
            intent.putExtra("Contact_Scene", 37);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, activity);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408146d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformProfileApi.Companion companion = com.tencent.pigeon.sns.PlatformProfileApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformProfileApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion companion2 = com.tencent.pigeon.status.StatusPublishPlatformApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion.setUp$default(companion2, binaryMessenger2, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f408146d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f408146d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformProfileApi.Companion companion = com.tencent.pigeon.sns.PlatformProfileApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformProfileApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion companion2 = com.tencent.pigeon.status.StatusPublishPlatformApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.status.StatusPublishPlatformApi.Companion.setUp$default(companion2, binaryMessenger2, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408146d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.status.StatusPublishPlatformApi
    public void openStatusCardFloatView(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        android.app.Activity activity = this.f408146d;
        if (activity == null) {
            return;
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).sj(activity, new bi4.h1(username, 16, 154L, false, false, null, new bi4.i1(0.0f, 0, 3, null), null));
    }

    @Override // com.tencent.pigeon.status.StatusPublishPlatformApi
    public void showPrivacySettings(com.tencent.pigeon.status.StatusPrivacyRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
    }
}
