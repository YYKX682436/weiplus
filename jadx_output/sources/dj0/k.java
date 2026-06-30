package dj0;

/* loaded from: classes11.dex */
public class k implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.EventChannel.StreamHandler, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f232850d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f232851e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding f232852f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f232853g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f232854h;

    /* renamed from: i, reason: collision with root package name */
    public int f232855i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f232856m = new dj0.j(this);

    public final void a(android.app.Activity activity, io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        if (this.f232851e == null) {
            io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(binaryMessenger, "keyboard_util");
            this.f232851e = eventChannel;
            eventChannel.setStreamHandler(this);
        }
        if (activity == null) {
            return;
        }
        android.app.Activity activity2 = this.f232850d;
        if (activity2 == null || !activity2.equals(activity)) {
            android.view.View view = this.f232853g;
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f232856m;
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f232850d = activity;
            android.view.View findViewById = activity.findViewById(android.R.id.content);
            this.f232853g = findViewById;
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        if (this.f232852f != null) {
            a(activityPluginBinding.getActivity(), this.f232852f.getBinaryMessenger());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f232852f = flutterPluginBinding;
        a(null, flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f232850d = null;
        android.view.View view = this.f232853g;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f232856m);
            this.f232853g = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f232852f = null;
        io.flutter.plugin.common.EventChannel eventChannel = this.f232851e;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.f232851e = null;
        this.f232854h = null;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        this.f232854h = eventSink;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
