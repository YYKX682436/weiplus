package io.flutter.embedding.engine;

/* loaded from: classes11.dex */
public class FlutterEngineCache {
    private static io.flutter.embedding.engine.FlutterEngineCache instance;
    private final java.util.Map<java.lang.String, io.flutter.embedding.engine.FlutterEngine> cachedEngines = new java.util.HashMap();

    public static io.flutter.embedding.engine.FlutterEngineCache getInstance() {
        if (instance == null) {
            instance = new io.flutter.embedding.engine.FlutterEngineCache();
        }
        return instance;
    }

    public void clear() {
        this.cachedEngines.clear();
    }

    public boolean contains(java.lang.String str) {
        return this.cachedEngines.containsKey(str);
    }

    public io.flutter.embedding.engine.FlutterEngine get(java.lang.String str) {
        return this.cachedEngines.get(str);
    }

    public void put(java.lang.String str, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (flutterEngine != null) {
            this.cachedEngines.put(str, flutterEngine);
        } else {
            this.cachedEngines.remove(str);
        }
    }

    public void remove(java.lang.String str) {
        put(str, null);
    }
}
