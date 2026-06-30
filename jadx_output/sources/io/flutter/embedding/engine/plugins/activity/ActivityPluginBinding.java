package io.flutter.embedding.engine.plugins.activity;

/* loaded from: classes15.dex */
public interface ActivityPluginBinding {

    /* loaded from: classes15.dex */
    public interface OnSaveInstanceStateListener {
        void onRestoreInstanceState(android.os.Bundle bundle);

        void onSaveInstanceState(android.os.Bundle bundle);
    }

    void addActivityResultListener(io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener);

    void addOnNewIntentListener(io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener);

    void addOnSaveStateListener(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener);

    void addOnUserLeaveHintListener(io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener);

    void addOnWindowFocusChangedListener(io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener);

    void addRequestPermissionsResultListener(io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);

    android.app.Activity getActivity();

    java.lang.Object getLifecycle();

    void removeActivityResultListener(io.flutter.plugin.common.PluginRegistry.ActivityResultListener activityResultListener);

    void removeOnNewIntentListener(io.flutter.plugin.common.PluginRegistry.NewIntentListener newIntentListener);

    void removeOnSaveStateListener(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding.OnSaveInstanceStateListener onSaveInstanceStateListener);

    void removeOnUserLeaveHintListener(io.flutter.plugin.common.PluginRegistry.UserLeaveHintListener userLeaveHintListener);

    void removeOnWindowFocusChangedListener(io.flutter.plugin.common.PluginRegistry.WindowFocusChangedListener windowFocusChangedListener);

    void removeRequestPermissionsResultListener(io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener requestPermissionsResultListener);
}
