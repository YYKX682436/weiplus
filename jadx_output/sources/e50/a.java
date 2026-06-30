package e50;

@j95.b
/* loaded from: classes11.dex */
public final class a extends i95.w implements f50.x {
    public void wi(java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        b03.u uVar = b03.u.f16864a;
        io.flutter.embedding.engine.FlutterEngine flutterEngine = io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(engineId);
        io.flutter.embedding.engine.FlutterEngineCache.getInstance().remove(engineId);
        com.tencent.mars.xlog.Log.i("MicroMsg.CachedFlutterEngines", "clear: engineId=" + engineId + ", engine=" + flutterEngine);
        if (flutterEngine != null) {
            flutterEngine.destroy();
        }
    }
}
