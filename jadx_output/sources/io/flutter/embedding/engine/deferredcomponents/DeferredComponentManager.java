package io.flutter.embedding.engine.deferredcomponents;

/* loaded from: classes13.dex */
public interface DeferredComponentManager {
    void destroy();

    java.lang.String getDeferredComponentInstallState(int i17, java.lang.String str);

    void installDeferredComponent(int i17, java.lang.String str);

    void loadAssets(int i17, java.lang.String str);

    void loadDartLibrary(int i17, java.lang.String str);

    void setDeferredComponentChannel(io.flutter.embedding.engine.systemchannels.DeferredComponentChannel deferredComponentChannel);

    void setJNI(io.flutter.embedding.engine.FlutterJNI flutterJNI);

    boolean uninstallDeferredComponent(int i17, java.lang.String str);
}
