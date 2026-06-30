package io.flutter.embedding.engine;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class FlutterEngineConnectionRegistry implements io.flutter.embedding.engine.plugins.PluginRegistry, io.flutter.embedding.engine.plugins.activity.ActivityControlSurface, io.flutter.embedding.engine.plugins.service.ServiceControlSurface, io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface, io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface {
    private static final java.lang.String TAG = "FlutterEngineCxnRegstry";
    private io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineActivityPluginBinding activityPluginBinding;
    private android.content.BroadcastReceiver broadcastReceiver;
    private io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineBroadcastReceiverPluginBinding broadcastReceiverPluginBinding;
    private android.content.ContentProvider contentProvider;
    private io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineContentProviderPluginBinding contentProviderPluginBinding;
    private io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> exclusiveActivity;
    private final io.flutter.embedding.engine.FlutterEngine flutterEngine;
    private final io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding pluginBinding;
    private android.app.Service service;
    private io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineServicePluginBinding servicePluginBinding;
    private final java.util.Map<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>, io.flutter.embedding.engine.plugins.FlutterPlugin> plugins = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>, io.flutter.embedding.engine.plugins.activity.ActivityAware> activityAwarePlugins = new java.util.HashMap();
    private boolean isWaitingForActivityReattachment = false;
    private final java.util.Map<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>, io.flutter.embedding.engine.plugins.service.ServiceAware> serviceAwarePlugins = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>, io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware> broadcastReceiverAwarePlugins = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>, io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware> contentProviderAwarePlugins = new java.util.HashMap();

    /* loaded from: classes13.dex */
    public static class DefaultFlutterAssets implements io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets {
        final io.flutter.embedding.engine.loader.FlutterLoader flutterLoader;

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public java.lang.String getAssetFilePathByName(java.lang.String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public java.lang.String getAssetFilePathBySubpath(java.lang.String str) {
            return this.flutterLoader.getLookupKeyForAsset(str);
        }

        private DefaultFlutterAssets(io.flutter.embedding.engine.loader.FlutterLoader flutterLoader) {
            this.flutterLoader = flutterLoader;
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public java.lang.String getAssetFilePathByName(java.lang.String str, java.lang.String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }

        @Override // io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterAssets
        public java.lang.String getAssetFilePathBySubpath(java.lang.String str, java.lang.String str2) {
            return this.flutterLoader.getLookupKeyForAsset(str, str2);
        }
    }

    /* loaded from: classes15.dex */
    public static class FlutterEngineActivityPluginBinding implements io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding {
        private final android.app.Activity activity;
        private final io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference hiddenLifecycleReference;
        private final java.util.Set<io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener> onRequestPermissionsResultListeners = new java.util.HashSet();
        private final java.util.Set<io.flutter.plugin.common.PluginRegistry.ActivityResultListener> onActivityResultListeners = new java.util.HashSet();
        private final java.util.Set<io.flutter.plugin.common.PluginRegistry.NewIntentListener> onNewIntentListeners = new java.util.HashSet();
        private final java.util.Set<io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener> onUserLeaveHintListeners = new java.util.HashSet();
        private final java.util.Set<io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener> onWindowFocusChangedListeners = new java.util.HashSet();
        private final java.util.Set<io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener> onSaveInstanceStateListeners = new java.util.HashSet();

        public FlutterEngineActivityPluginBinding(android.app.Activity activity, androidx.lifecycle.o oVar) {
            this.activity = activity;
            this.hiddenLifecycleReference = new io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference(oVar);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addActivityResultListener(io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.add(activityResultListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnNewIntentListener(io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.add(newIntentListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnSaveStateListener(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.add(onSaveInstanceStateListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnUserLeaveHintListener(io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.add(userLeaveHintListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addOnWindowFocusChangedListener(io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
            this.onWindowFocusChangedListeners.add(windowFocusChangedListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void addRequestPermissionsResultListener(io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.add(requestPermissionsResultListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public android.app.Activity getActivity() {
            return this.activity;
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public java.lang.Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
            java.util.Iterator it = new java.util.HashSet(this.onActivityResultListeners).iterator();
            while (true) {
                boolean z17 = false;
                while (it.hasNext()) {
                    if (((io.flutter.plugin.common.PluginRegistry.ActivityResultListener) it.next()).onActivityResult(i17, i18, intent) || z17) {
                        z17 = true;
                    }
                }
                return z17;
            }
        }

        public void onNewIntent(android.content.Intent intent) {
            java.util.Iterator<io.flutter.plugin.common.PluginRegistry.NewIntentListener> it = this.onNewIntentListeners.iterator();
            while (it.hasNext()) {
                it.next().onNewIntent(intent);
            }
        }

        public boolean onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
            java.util.Iterator<io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener> it = this.onRequestPermissionsResultListeners.iterator();
            while (true) {
                boolean z17 = false;
                while (it.hasNext()) {
                    if (it.next().onRequestPermissionsResult(i17, strArr, iArr) || z17) {
                        z17 = true;
                    }
                }
                return z17;
            }
        }

        public void onRestoreInstanceState(android.os.Bundle bundle) {
            java.util.Iterator<io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onRestoreInstanceState(bundle);
            }
        }

        public void onSaveInstanceState(android.os.Bundle bundle) {
            java.util.Iterator<io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener> it = this.onSaveInstanceStateListeners.iterator();
            while (it.hasNext()) {
                it.next().onSaveInstanceState(bundle);
            }
        }

        public void onUserLeaveHint() {
            java.util.Iterator<io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener> it = this.onUserLeaveHintListeners.iterator();
            while (it.hasNext()) {
                it.next().onUserLeaveHint();
            }
        }

        public void onWindowFocusChanged(boolean z17) {
            java.util.Iterator<io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener> it = this.onWindowFocusChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().onWindowFocusChanged(z17);
            }
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeActivityResultListener(io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener) {
            this.onActivityResultListeners.remove(activityResultListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnNewIntentListener(io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener) {
            this.onNewIntentListeners.remove(newIntentListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnSaveStateListener(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener) {
            this.onSaveInstanceStateListeners.remove(onSaveInstanceStateListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnUserLeaveHintListener(io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener) {
            this.onUserLeaveHintListeners.remove(userLeaveHintListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeOnWindowFocusChangedListener(io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener) {
            this.onWindowFocusChangedListeners.remove(windowFocusChangedListener);
        }

        @Override // io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
        public void removeRequestPermissionsResultListener(io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener) {
            this.onRequestPermissionsResultListeners.remove(requestPermissionsResultListener);
        }
    }

    /* loaded from: classes15.dex */
    public static class FlutterEngineBroadcastReceiverPluginBinding implements io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding {
        private final android.content.BroadcastReceiver broadcastReceiver;

        public FlutterEngineBroadcastReceiverPluginBinding(android.content.BroadcastReceiver broadcastReceiver) {
            this.broadcastReceiver = broadcastReceiver;
        }

        @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding
        public android.content.BroadcastReceiver getBroadcastReceiver() {
            return this.broadcastReceiver;
        }
    }

    /* loaded from: classes15.dex */
    public static class FlutterEngineContentProviderPluginBinding implements io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding {
        private final android.content.ContentProvider contentProvider;

        public FlutterEngineContentProviderPluginBinding(android.content.ContentProvider contentProvider) {
            this.contentProvider = contentProvider;
        }

        @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding
        public android.content.ContentProvider getContentProvider() {
            return this.contentProvider;
        }
    }

    /* loaded from: classes15.dex */
    public static class FlutterEngineServicePluginBinding implements io.flutter.embedding.engine.plugins.service.ServicePluginBinding {
        private final io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference hiddenLifecycleReference;
        private final java.util.Set<io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener> onModeChangeListeners = new java.util.HashSet();
        private final android.app.Service service;

        public FlutterEngineServicePluginBinding(android.app.Service service, androidx.lifecycle.o oVar) {
            this.service = service;
            this.hiddenLifecycleReference = oVar != null ? new io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference(oVar) : null;
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public void addOnModeChangeListener(io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.add(onModeChangeListener);
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public java.lang.Object getLifecycle() {
            return this.hiddenLifecycleReference;
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public android.app.Service getService() {
            return this.service;
        }

        public void onMoveToBackground() {
            java.util.Iterator<io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onMoveToBackground();
            }
        }

        public void onMoveToForeground() {
            java.util.Iterator<io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener> it = this.onModeChangeListeners.iterator();
            while (it.hasNext()) {
                it.next().onMoveToForeground();
            }
        }

        @Override // io.flutter.embedding.engine.plugins.service.ServicePluginBinding
        public void removeOnModeChangeListener(io.flutter.embedding.engine.plugins.service.ServiceAware.OnModeChangeListener onModeChangeListener) {
            this.onModeChangeListeners.remove(onModeChangeListener);
        }
    }

    public FlutterEngineConnectionRegistry(android.content.Context context, io.flutter.embedding.engine.FlutterEngine flutterEngine, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup) {
        this.flutterEngine = flutterEngine;
        this.pluginBinding = new io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding(context, flutterEngine, flutterEngine.getDartExecutor(), flutterEngine.getRenderer(), flutterEngine.getPlatformViewsController().getRegistry(), new io.flutter.embedding.engine.FlutterEngineConnectionRegistry.DefaultFlutterAssets(flutterLoader), flutterEngineGroup);
    }

    private void attachToActivityInternal(android.app.Activity activity, androidx.lifecycle.o oVar) {
        this.activityPluginBinding = new io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineActivityPluginBinding(activity, oVar);
        this.flutterEngine.getPlatformViewsController().setSoftwareRendering(activity.getIntent() != null ? activity.getIntent().getBooleanExtra(io.flutter.embedding.engine.FlutterShellArgs.ARG_KEY_ENABLE_SOFTWARE_RENDERING, false) : false);
        this.flutterEngine.getPlatformViewsController().attach(activity, this.flutterEngine.getRenderer(), this.flutterEngine.getDartExecutor());
        this.flutterEngine.getPlatformViewsController2().attach(activity, this.flutterEngine.getDartExecutor());
        for (io.flutter.embedding.engine.plugins.activity.ActivityAware activityAware : this.activityAwarePlugins.values()) {
            if (this.isWaitingForActivityReattachment) {
                activityAware.onReattachedToActivityForConfigChanges(this.activityPluginBinding);
            } else {
                activityAware.onAttachedToActivity(this.activityPluginBinding);
            }
        }
        this.isWaitingForActivityReattachment = false;
    }

    private android.app.Activity attachedActivity() {
        io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> exclusiveAppComponent = this.exclusiveActivity;
        if (exclusiveAppComponent != null) {
            return exclusiveAppComponent.getAppComponent();
        }
        return null;
    }

    private void detachFromActivityInternal() {
        this.flutterEngine.getPlatformViewsController().detach();
        this.flutterEngine.getPlatformViewsController2().detach();
        this.exclusiveActivity = null;
        this.activityPluginBinding = null;
    }

    private void detachFromAppComponent() {
        if (isAttachedToActivity()) {
            detachFromActivity();
            return;
        }
        if (isAttachedToService()) {
            detachFromService();
        } else if (isAttachedToBroadcastReceiver()) {
            detachFromBroadcastReceiver();
        } else if (isAttachedToContentProvider()) {
            detachFromContentProvider();
        }
    }

    private boolean isAttachedToActivity() {
        return this.exclusiveActivity != null;
    }

    private boolean isAttachedToBroadcastReceiver() {
        return this.broadcastReceiver != null;
    }

    private boolean isAttachedToContentProvider() {
        return this.contentProvider != null;
    }

    private boolean isAttachedToService() {
        return this.service != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void add(io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin) {
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#add ".concat(flutterPlugin.getClass().getSimpleName()));
        try {
            if (has(flutterPlugin.getClass())) {
                io.flutter.Log.w(TAG, "Attempted to register plugin (" + flutterPlugin + ") but it was already registered with this FlutterEngine (" + this.flutterEngine + ").");
                if (scoped != null) {
                    scoped.close();
                    return;
                }
                return;
            }
            io.flutter.Log.v(TAG, "Adding plugin: " + flutterPlugin);
            this.plugins.put(flutterPlugin.getClass(), flutterPlugin);
            flutterPlugin.onAttachedToEngine(this.pluginBinding);
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.activity.ActivityAware) {
                io.flutter.embedding.engine.plugins.activity.ActivityAware activityAware = (io.flutter.embedding.engine.plugins.activity.ActivityAware) flutterPlugin;
                this.activityAwarePlugins.put(flutterPlugin.getClass(), activityAware);
                if (isAttachedToActivity()) {
                    activityAware.onAttachedToActivity(this.activityPluginBinding);
                }
            }
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.service.ServiceAware) {
                io.flutter.embedding.engine.plugins.service.ServiceAware serviceAware = (io.flutter.embedding.engine.plugins.service.ServiceAware) flutterPlugin;
                this.serviceAwarePlugins.put(flutterPlugin.getClass(), serviceAware);
                if (isAttachedToService()) {
                    serviceAware.onAttachedToService(this.servicePluginBinding);
                }
            }
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware) {
                io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware broadcastReceiverAware = (io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware) flutterPlugin;
                this.broadcastReceiverAwarePlugins.put(flutterPlugin.getClass(), broadcastReceiverAware);
                if (isAttachedToBroadcastReceiver()) {
                    broadcastReceiverAware.onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
                }
            }
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware) {
                io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware contentProviderAware = (io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware) flutterPlugin;
                this.contentProviderAwarePlugins.put(flutterPlugin.getClass(), contentProviderAware);
                if (isAttachedToContentProvider()) {
                    contentProviderAware.onAttachedToContentProvider(this.contentProviderPluginBinding);
                }
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void attachToActivity(io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> exclusiveAppComponent, androidx.lifecycle.o oVar) {
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.ExclusiveAppComponent<android.app.Activity> exclusiveAppComponent2 = this.exclusiveActivity;
            if (exclusiveAppComponent2 != null) {
                exclusiveAppComponent2.detachFromFlutterEngine();
            }
            detachFromAppComponent();
            this.exclusiveActivity = exclusiveAppComponent;
            attachToActivityInternal(exclusiveAppComponent.getAppComponent(), oVar);
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
    public void attachToBroadcastReceiver(android.content.BroadcastReceiver broadcastReceiver, androidx.lifecycle.o oVar) {
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#attachToBroadcastReceiver");
        try {
            detachFromAppComponent();
            this.broadcastReceiver = broadcastReceiver;
            this.broadcastReceiverPluginBinding = new io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineBroadcastReceiverPluginBinding(broadcastReceiver);
            java.util.Iterator<io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToBroadcastReceiver(this.broadcastReceiverPluginBinding);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
    public void attachToContentProvider(android.content.ContentProvider contentProvider, androidx.lifecycle.o oVar) {
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#attachToContentProvider");
        try {
            detachFromAppComponent();
            this.contentProvider = contentProvider;
            this.contentProviderPluginBinding = new io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineContentProviderPluginBinding(contentProvider);
            java.util.Iterator<io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToContentProvider(this.contentProviderPluginBinding);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void attachToService(android.app.Service service, androidx.lifecycle.o oVar, boolean z17) {
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#attachToService");
        try {
            detachFromAppComponent();
            this.service = service;
            this.servicePluginBinding = new io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineServicePluginBinding(service, oVar);
            java.util.Iterator<io.flutter.embedding.engine.plugins.service.ServiceAware> it = this.serviceAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onAttachedToService(this.servicePluginBinding);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public void destroy() {
        io.flutter.Log.v(TAG, "Destroying.");
        detachFromAppComponent();
        removeAll();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void detachFromActivity() {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            java.util.Iterator<io.flutter.embedding.engine.plugins.activity.ActivityAware> it = this.activityAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivity();
            }
            detachFromActivityInternal();
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void detachFromActivityForConfigChanges() {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.isWaitingForActivityReattachment = true;
            java.util.Iterator<io.flutter.embedding.engine.plugins.activity.ActivityAware> it = this.activityAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromActivityForConfigChanges();
            }
            detachFromActivityInternal();
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface
    public void detachFromBroadcastReceiver() {
        if (!isAttachedToBroadcastReceiver()) {
            io.flutter.Log.e(TAG, "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            java.util.Iterator<io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware> it = this.broadcastReceiverAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromBroadcastReceiver();
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface
    public void detachFromContentProvider() {
        if (!isAttachedToContentProvider()) {
            io.flutter.Log.e(TAG, "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            java.util.Iterator<io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware> it = this.contentProviderAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromContentProvider();
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void detachFromService() {
        if (!isAttachedToService()) {
            io.flutter.Log.e(TAG, "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#detachFromService");
        try {
            java.util.Iterator<io.flutter.embedding.engine.plugins.service.ServiceAware> it = this.serviceAwarePlugins.values().iterator();
            while (it.hasNext()) {
                it.next().onDetachedFromService();
            }
            this.service = null;
            this.servicePluginBinding = null;
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public io.flutter.embedding.engine.plugins.FlutterPlugin get(java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin> cls) {
        return this.plugins.get(cls);
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public boolean has(java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin> cls) {
        return this.plugins.containsKey(cls);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean onActivityResult = this.activityPluginBinding.onActivityResult(i17, i18, intent);
            if (scoped != null) {
                scoped.close();
            }
            return onActivityResult;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void onMoveToBackground() {
        if (isAttachedToService()) {
            io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onMoveToBackground");
            try {
                this.servicePluginBinding.onMoveToBackground();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (java.lang.Throwable th6) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.service.ServiceControlSurface
    public void onMoveToForeground() {
        if (isAttachedToService()) {
            io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onMoveToForeground");
            try {
                this.servicePluginBinding.onMoveToForeground();
                if (scoped != null) {
                    scoped.close();
                }
            } catch (java.lang.Throwable th6) {
                if (scoped != null) {
                    try {
                        scoped.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onNewIntent(android.content.Intent intent) {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.activityPluginBinding.onNewIntent(intent);
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public boolean onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean onRequestPermissionsResult = this.activityPluginBinding.onRequestPermissionsResult(i17, strArr, iArr);
            if (scoped != null) {
                scoped.close();
            }
            return onRequestPermissionsResult;
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.activityPluginBinding.onRestoreInstanceState(bundle);
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.activityPluginBinding.onSaveInstanceState(bundle);
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityControlSurface
    public void onUserLeaveHint() {
        if (!isAttachedToActivity()) {
            io.flutter.Log.e(TAG, "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.activityPluginBinding.onUserLeaveHint();
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void remove(java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin> cls) {
        io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin = this.plugins.get(cls);
        if (flutterPlugin == null) {
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
        try {
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.activity.ActivityAware) {
                if (isAttachedToActivity()) {
                    ((io.flutter.embedding.engine.plugins.activity.ActivityAware) flutterPlugin).onDetachedFromActivity();
                }
                this.activityAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.service.ServiceAware) {
                if (isAttachedToService()) {
                    ((io.flutter.embedding.engine.plugins.service.ServiceAware) flutterPlugin).onDetachedFromService();
                }
                this.serviceAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware) {
                if (isAttachedToBroadcastReceiver()) {
                    ((io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware) flutterPlugin).onDetachedFromBroadcastReceiver();
                }
                this.broadcastReceiverAwarePlugins.remove(cls);
            }
            if (flutterPlugin instanceof io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware) {
                if (isAttachedToContentProvider()) {
                    ((io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware) flutterPlugin).onDetachedFromContentProvider();
                }
                this.contentProviderAwarePlugins.remove(cls);
            }
            flutterPlugin.onDetachedFromEngine(this.pluginBinding);
            this.plugins.remove(cls);
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void removeAll() {
        remove(new java.util.HashSet(this.plugins.keySet()));
        this.plugins.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void remove(java.util.Set<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>> set) {
        java.util.Iterator<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>> it = set.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.PluginRegistry
    public void add(java.util.Set<io.flutter.embedding.engine.plugins.FlutterPlugin> set) {
        java.util.Iterator<io.flutter.embedding.engine.plugins.FlutterPlugin> it = set.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
