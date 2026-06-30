package e50;

/* loaded from: classes11.dex */
public final class u0 implements com.tencent.matrix.lifecycle.k {
    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        boolean isForeground = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "onExitOverlayForeground: hasUI=" + isForeground);
        if (isForeground) {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FOREGROUND);
        } else {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.BACKGROUND);
        }
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        boolean isForeground = com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "onExitOverlayForeground: hasUI=" + isForeground);
        if (isForeground) {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FOREGROUND);
        } else {
            io.flutter.embedding.engine.FlutterJNI.updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState.FLOAT_WINDOW_FOREGROUND);
        }
    }
}
