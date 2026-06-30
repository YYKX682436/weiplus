package io.flutter.plugin.platform;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J<\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&J2\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J*\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&J\"\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lio/flutter/plugin/platform/ISkylineTextureHandler;", "", "", "engineId", "", "type", dm.i4.COL_ID, "Landroid/graphics/SurfaceTexture;", "onCreateTexture", "surfaceTexture", "width", "height", "Ljz5/f0;", "onTextureReady", "onTextureUpdate", "onTextureDestroy", "Landroid/view/MotionEvent;", "motionEvent", "onTextureTouch", "", "onDestroyTexture", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public interface ISkylineTextureHandler {
    android.graphics.SurfaceTexture onCreateTexture(int engineId, java.lang.String type, int id6);

    boolean onDestroyTexture(int engineId, java.lang.String type, int id6);

    void onTextureDestroy(int i17, java.lang.String str, int i18);

    void onTextureReady(int i17, java.lang.String str, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27);

    void onTextureTouch(int i17, java.lang.String str, int i18, android.view.MotionEvent motionEvent);

    void onTextureUpdate(int i17, java.lang.String str, int i18, int i19, int i27);
}
