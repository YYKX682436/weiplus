package pi0;

/* loaded from: classes11.dex */
public final class b0 {
    public b0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        io.flutter.embedding.engine.FlutterEngine flutterEngine = io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(engineId);
        return flutterEngine != null && pi0.g0.f354574g && flutterEngine.canPreRender();
    }

    public final pi0.g0 b(java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        return (pi0.g0) pi0.g0.f354573f.get(engineId);
    }
}
