package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public interface PluginRegistry {

    /* loaded from: classes10.dex */
    public interface ActivityResultListener {
        boolean onActivityResult(int i17, int i18, android.content.Intent intent);
    }

    /* loaded from: classes15.dex */
    public interface NewIntentListener {
        boolean onNewIntent(android.content.Intent intent);
    }

    /* loaded from: classes10.dex */
    public interface RequestPermissionsResultListener {
        boolean onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr);
    }

    /* loaded from: classes15.dex */
    public interface UserLeaveHintListener {
        void onUserLeaveHint();
    }

    /* loaded from: classes15.dex */
    public interface WindowFocusChangedListener {
        void onWindowFocusChanged(boolean z17);
    }
}
