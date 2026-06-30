package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class DownloadListenerHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi {
    private final io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl.DownloadListenerCreator downloadListenerCreator;
    private final io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl flutterApi;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    /* loaded from: classes16.dex */
    public static class DownloadListenerCreator {
        public io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl.DownloadListenerImpl createDownloadListener(io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            return new io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl.DownloadListenerImpl(downloadListenerFlutterApiImpl);
        }
    }

    /* loaded from: classes16.dex */
    public static class DownloadListenerImpl implements android.webkit.DownloadListener {
        private final io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl flutterApi;

        public DownloadListenerImpl(io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            this.flutterApi = downloadListenerFlutterApiImpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDownloadStart$0(java.lang.Void r07) {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17) {
            this.flutterApi.onDownloadStart(this, str, str2, str3, str4, j17, new io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl$DownloadListenerImpl$$a());
        }
    }

    public DownloadListenerHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl.DownloadListenerCreator downloadListenerCreator, io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
        this.instanceManager = instanceManager;
        this.downloadListenerCreator = downloadListenerCreator;
        this.flutterApi = downloadListenerFlutterApiImpl;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi
    public void create(java.lang.Long l17) {
        this.instanceManager.addDartCreatedInstance(this.downloadListenerCreator.createDownloadListener(this.flutterApi), l17.longValue());
    }
}
