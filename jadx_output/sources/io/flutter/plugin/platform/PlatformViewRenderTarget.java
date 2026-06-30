package io.flutter.plugin.platform;

/* loaded from: classes8.dex */
public interface PlatformViewRenderTarget {
    int getHeight();

    long getId();

    android.view.Surface getSurface();

    int getWidth();

    boolean isReleased();

    void release();

    void resize(int i17, int i18);

    default void scheduleFrame() {
    }
}
