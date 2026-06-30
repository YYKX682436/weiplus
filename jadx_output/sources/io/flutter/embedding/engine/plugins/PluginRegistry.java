package io.flutter.embedding.engine.plugins;

/* loaded from: classes11.dex */
public interface PluginRegistry {
    void add(io.flutter.embedding.engine.plugins.FlutterPlugin flutterPlugin);

    void add(java.util.Set<io.flutter.embedding.engine.plugins.FlutterPlugin> set);

    io.flutter.embedding.engine.plugins.FlutterPlugin get(java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin> cls);

    boolean has(java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin> cls);

    void remove(java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin> cls);

    void remove(java.util.Set<java.lang.Class<? extends io.flutter.embedding.engine.plugins.FlutterPlugin>> set);

    void removeAll();
}
