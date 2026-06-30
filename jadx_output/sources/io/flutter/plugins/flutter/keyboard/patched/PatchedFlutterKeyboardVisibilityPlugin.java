package io.flutter.plugins.flutter.keyboard.patched;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001c\u0010\u001b\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lio/flutter/plugins/flutter/keyboard/patched/PatchedFlutterKeyboardVisibilityPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lio/flutter/plugin/common/BinaryMessenger;", "messenger", "Ljz5/f0;", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "listenForKeyboard", "unregisterListener", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "flutterPluginBinding", "onAttachedToEngine", "binding", "onDetachedFromEngine", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "", "o", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventSink", "onListen", "onCancel", "onGlobalLayout", "Lio/flutter/plugin/common/EventChannel$EventSink;", "Landroid/view/View;", "mainView", "Landroid/view/View;", "", "isVisible", "Z", "<init>", "()V", "flutter-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PatchedFlutterKeyboardVisibilityPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.EventChannel.StreamHandler, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private io.flutter.plugin.common.EventChannel.EventSink eventSink;
    private boolean isVisible;
    private android.view.View mainView;

    private final void init(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        new io.flutter.plugin.common.EventChannel(binaryMessenger, "flutter_keyboard_visibility").setStreamHandler(this);
    }

    private final void listenForKeyboard(android.app.Activity activity) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        this.mainView = findViewById;
        if (findViewById == null || (viewTreeObserver = findViewById.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    private final void unregisterListener() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = this.mainView;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        this.mainView = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.f(activity, "getActivity(...)");
        listenForKeyboard(activity);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        init(binaryMessenger);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.eventSink = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        unregisterListener();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        unregisterListener();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        unregisterListener();
    }

    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.mainView != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.View view = this.mainView;
            kotlin.jvm.internal.o.d(view);
            view.getWindowVisibleDisplayFrame(rect);
            double height = rect.height();
            android.view.View view2 = this.mainView;
            kotlin.jvm.internal.o.d(view2);
            ?? r07 = height / ((double) view2.getRootView().getHeight()) < 0.85d ? 1 : 0;
            if (r07 != this.isVisible) {
                this.isVisible = r07;
                io.flutter.plugin.common.EventChannel.EventSink eventSink = this.eventSink;
                if (eventSink != null) {
                    eventSink.success(java.lang.Integer.valueOf((int) r07));
                }
            }
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        this.eventSink = eventSink;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        android.app.Activity activity = binding.getActivity();
        kotlin.jvm.internal.o.f(activity, "getActivity(...)");
        listenForKeyboard(activity);
    }
}
