package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class PlatformViewRegistryImpl implements io.flutter.plugin.platform.PlatformViewRegistry {
    private final java.util.Map<java.lang.String, io.flutter.plugin.platform.PlatformViewFactory> viewFactories = new java.util.HashMap();

    public io.flutter.plugin.platform.PlatformViewFactory getFactory(java.lang.String str) {
        return this.viewFactories.get(str);
    }

    @Override // io.flutter.plugin.platform.PlatformViewRegistry
    public boolean registerViewFactory(java.lang.String str, io.flutter.plugin.platform.PlatformViewFactory platformViewFactory) {
        if (this.viewFactories.containsKey(str)) {
            return false;
        }
        this.viewFactories.put(str, platformViewFactory);
        return true;
    }
}
