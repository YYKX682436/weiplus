package yy5;

/* loaded from: classes8.dex */
public class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f468483d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f468484e;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        this.f468484e = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "github.com/clovisnicolas/flutter_screen");
        this.f468483d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f468484e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f468484e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f468483d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (this.f468484e == null) {
            return;
        }
        java.lang.String str = methodCall.method;
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case -1135253436:
                if (str.equals("keepOn")) {
                    c17 = 0;
                    break;
                }
                break;
            case -460887769:
                if (str.equals("isKeptOn")) {
                    c17 = 1;
                    break;
                }
                break;
            case 648162385:
                if (str.equals("brightness")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1124545107:
                if (str.equals("setBrightness")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                if (((java.lang.Boolean) methodCall.argument("on")).booleanValue()) {
                    java.lang.System.out.println("Keeping screen on ");
                    this.f468484e.getWindow().addFlags(128);
                } else {
                    java.lang.System.out.println("Not keeping screen on");
                    this.f468484e.getWindow().clearFlags(128);
                }
                result.success(null);
                return;
            case 1:
                result.success(java.lang.Boolean.valueOf((this.f468484e.getWindow().getAttributes().flags & 128) != 0));
                return;
            case 2:
                android.app.Activity activity = this.f468484e;
                float f17 = 0.0f;
                if (activity != null) {
                    float f18 = activity.getWindow().getAttributes().screenBrightness;
                    if (f18 < 0.0f) {
                        try {
                            f18 = android.provider.Settings.System.getInt(this.f468484e.getContentResolver(), "screen_brightness") / 255.0f;
                        } catch (android.provider.Settings.SettingNotFoundException unused) {
                            f18 = 1.0f;
                        }
                    }
                    f17 = f18;
                }
                result.success(java.lang.Float.valueOf(f17));
                return;
            case 3:
                double doubleValue = ((java.lang.Double) methodCall.argument("brightness")).doubleValue();
                android.view.WindowManager.LayoutParams attributes = this.f468484e.getWindow().getAttributes();
                attributes.screenBrightness = (float) doubleValue;
                this.f468484e.getWindow().setAttributes(attributes);
                result.success(null);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        this.f468484e = activityPluginBinding.getActivity();
    }
}
