package defpackage;

/* loaded from: classes4.dex */
public final class v implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f432185d;

    @Override // com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi
    public void navigateToPermissionRangeSettings() {
        android.app.Activity activity = this.f432185d;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enter_scene", 2);
        j45.l.j(activity, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14098, 8);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f432185d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi.Companion companion = com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f432185d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f432185d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi.Companion companion = com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f432185d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.sns.PlatformSnsPermissionSettingsApi
    public long snsPrivacyRecentRangeHours() {
        if (((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(c01.z1.r()) == null) {
            return 0L;
        }
        return r0.f371432h;
    }
}
