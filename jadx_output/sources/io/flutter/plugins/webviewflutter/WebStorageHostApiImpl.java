package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class WebStorageHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.WebStorageHostApiImpl.WebStorageCreator webStorageCreator;

    /* loaded from: classes13.dex */
    public static class WebStorageCreator {
        public android.webkit.WebStorage createWebStorage() {
            return android.webkit.WebStorage.getInstance();
        }
    }

    public WebStorageHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.WebStorageHostApiImpl.WebStorageCreator webStorageCreator) {
        this.instanceManager = instanceManager;
        this.webStorageCreator = webStorageCreator;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi
    public void create(java.lang.Long l17) {
        this.instanceManager.addDartCreatedInstance(this.webStorageCreator.createWebStorage(), l17.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi
    public void deleteAllData(java.lang.Long l17) {
        android.webkit.WebStorage webStorage = (android.webkit.WebStorage) this.instanceManager.getInstance(l17.longValue());
        java.util.Objects.requireNonNull(webStorage);
        webStorage.deleteAllData();
    }
}
