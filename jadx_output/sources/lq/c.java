package lq;

/* loaded from: classes8.dex */
public interface c extends lq.b {
    android.graphics.Point getDisplayRealSize(android.content.Context context);

    float getSleepTimeInMsPerFrame();

    boolean isEnableNativeDynamicBackground();

    void loadDynamicBgLibrary();

    void setEnableNativeDynamicBackground(boolean z17);
}
