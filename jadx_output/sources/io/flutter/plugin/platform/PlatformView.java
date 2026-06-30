package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public interface PlatformView {
    void dispose();

    android.view.View getView();

    default void onFlutterViewAttached(android.view.View view) {
    }

    default void onFlutterViewDetached() {
    }

    default void onInputConnectionLocked() {
    }

    default void onInputConnectionUnlocked() {
    }
}
