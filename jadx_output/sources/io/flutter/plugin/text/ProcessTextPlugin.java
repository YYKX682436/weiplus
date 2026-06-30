package io.flutter.plugin.text;

/* loaded from: classes8.dex */
public class ProcessTextPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener, io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler {
    private static final java.lang.String TAG = "ProcessTextPlugin";
    private io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityBinding;
    private final android.content.pm.PackageManager packageManager;
    private final io.flutter.embedding.engine.systemchannels.ProcessTextChannel processTextChannel;
    private java.util.Map<java.lang.Integer, io.flutter.plugin.common.MethodChannel.Result> requestsByCode = new java.util.HashMap();
    private java.util.Map<java.lang.String, android.content.pm.ResolveInfo> resolveInfosById;

    public ProcessTextPlugin(io.flutter.embedding.engine.systemchannels.ProcessTextChannel processTextChannel) {
        this.processTextChannel = processTextChannel;
        this.packageManager = processTextChannel.packageManager;
    }

    private void cacheResolveInfos() {
        this.resolveInfosById = new java.util.HashMap();
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.content.Intent type = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        for (android.content.pm.ResolveInfo resolveInfo : i17 >= 33 ? this.packageManager.queryIntentActivities(type, android.content.pm.PackageManager.ResolveInfoFlags.of(0L)) : this.packageManager.queryIntentActivities(type, 0)) {
            java.lang.String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.packageManager).toString();
            this.resolveInfosById.put(str, resolveInfo);
        }
    }

    public void destroy() {
        this.processTextChannel.setMethodHandler(null);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (!this.requestsByCode.containsKey(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        this.requestsByCode.remove(java.lang.Integer.valueOf(i17)).success(i18 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public void processTextAction(java.lang.String str, java.lang.String str2, boolean z17, io.flutter.plugin.common.MethodChannel.Result result) {
        if (this.activityBinding == null) {
            result.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        java.util.Map<java.lang.String, android.content.pm.ResolveInfo> map = this.resolveInfosById;
        if (map == null) {
            result.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        android.content.pm.ResolveInfo resolveInfo = map.get(str);
        if (resolveInfo == null) {
            result.error("error", "Text processing activity not found", null);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(result.hashCode());
        this.requestsByCode.put(valueOf, result);
        android.content.Intent intent = new android.content.Intent();
        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z17);
        android.app.Activity activity = this.activityBinding.getActivity();
        int intValue = valueOf.intValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "io/flutter/plugin/text/ProcessTextPlugin", "processTextAction", "(Ljava/lang/String;Ljava/lang/String;ZLio/flutter/plugin/common/MethodChannel$Result;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // io.flutter.embedding.engine.systemchannels.ProcessTextChannel.ProcessTextMethodHandler
    public java.util.Map<java.lang.String, java.lang.String> queryTextActions() {
        if (this.resolveInfosById == null) {
            cacheResolveInfos();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : this.resolveInfosById.keySet()) {
            hashMap.put(str, this.resolveInfosById.get(str).loadLabel(this.packageManager).toString());
        }
        return hashMap;
    }
}
