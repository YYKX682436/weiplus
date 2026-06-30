package io.flutter.embedding.engine;

/* loaded from: classes11.dex */
public class FlutterEngineGroupCache {
    private static volatile io.flutter.embedding.engine.FlutterEngineGroupCache instance;
    private final java.util.Map<java.lang.String, io.flutter.embedding.engine.FlutterEngineGroup> cachedEngineGroups = new java.util.HashMap();

    public static io.flutter.embedding.engine.FlutterEngineGroupCache getInstance() {
        if (instance == null) {
            synchronized (io.flutter.embedding.engine.FlutterEngineGroupCache.class) {
                if (instance == null) {
                    instance = new io.flutter.embedding.engine.FlutterEngineGroupCache();
                }
            }
        }
        return instance;
    }

    public void clear() {
        this.cachedEngineGroups.clear();
    }

    public boolean contains(java.lang.String str) {
        return this.cachedEngineGroups.containsKey(str);
    }

    public io.flutter.embedding.engine.FlutterEngineGroup get(java.lang.String str) {
        return this.cachedEngineGroups.get(str);
    }

    public void put(java.lang.String str, io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup) {
        if (flutterEngineGroup != null) {
            this.cachedEngineGroups.put(str, flutterEngineGroup);
        } else {
            this.cachedEngineGroups.remove(str);
        }
    }

    public void remove(java.lang.String str) {
        put(str, null);
    }
}
