package e50;

/* loaded from: classes11.dex */
public final class b0 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "onEnterActivityForeground: ");
        io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FOREGROUND);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        boolean hasOverlayWindow = com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.INSTANCE.hasOverlayWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "onExitActivityForeground: hasOverlay=" + hasOverlayWindow);
        if (hasOverlayWindow) {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FLOAT_WINDOW_FOREGROUND);
        } else {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.BACKGROUND);
        }
    }
}
