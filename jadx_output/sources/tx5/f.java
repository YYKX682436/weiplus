package tx5;

/* loaded from: classes13.dex */
public interface f {
    boolean F();

    void S(boolean z17);

    boolean T();

    void addJavascriptInterface(java.lang.Object obj, java.lang.String str);

    boolean canGoBack();

    boolean canGoForward();

    void captureLongScreenshot(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback);

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    void clearView();

    void destroy();

    void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback);

    android.graphics.Bitmap f();

    void findAllAsync(java.lang.String str);

    void findNext(boolean z17);

    java.lang.String getAbstractInfo();

    android.net.http.SslCertificate getCertificate();

    int getContentHeight();

    android.graphics.Bitmap getFavicon();

    com.tencent.xweb.c1 getFullscreenVideoKind();

    com.tencent.xweb.d1 getHitTestResult();

    void getImageFromDiskCache(java.lang.String str, android.webkit.ValueCallback valueCallback);

    java.lang.String getOriginalUrl();

    int getProgress();

    float getScale();

    int getScrollHeight();

    com.tencent.xweb.z0 getSettings();

    android.view.textclassifier.TextClassifier getTextClassifier();

    java.lang.String getTitle();

    android.view.ViewGroup getTopView();

    java.lang.String getUrl();

    java.lang.String getVersionInfo();

    android.view.View getView();

    int getVisibleTitleHeight();

    com.tencent.xweb.s0 getWebChromeClient();

    int getWebScrollX();

    int getWebScrollY();

    com.tencent.xweb.g1 getWebViewCallbackClient();

    com.tencent.xweb.h1 getWebViewClient();

    android.os.Looper getWebViewLooper();

    com.tencent.xweb.m1 getWebViewRenderProcessClient();

    android.view.View getWebViewUI();

    void goBack();

    void goForward();

    void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    void loadUrl(java.lang.String str);

    void loadUrl(java.lang.String str, java.util.Map map);

    void m();

    com.tencent.xweb.o0 m0(com.tencent.xweb.VideoJsCallback videoJsCallback);

    boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback);

    void onHide();

    void onPause();

    void onResume();

    void onShow();

    void reload();

    void removeJavascriptInterface(java.lang.String str);

    boolean s();

    boolean savePage(java.lang.String str, java.lang.String str2, int i17);

    void setAudioMuted(boolean z17);

    void setBottomHeight(int i17);

    void setDownloadListener(android.webkit.DownloadListener downloadListener);

    void setFindListener(android.webkit.WebView.FindListener findListener);

    void setHorizontalScrollBarEnabled(boolean z17);

    void setHorizontalScrollbarOverlay(boolean z17);

    void setInitialScale(int i17);

    void setInputOutOfKeyboardEnable(boolean z17);

    void setJSExceptionListener(com.tencent.xweb.l1 l1Var);

    void setNativeDownloadClient(com.tencent.xweb.p2 p2Var);

    void setNetworkAvailable(boolean z17);

    void setPictureListener(android.webkit.WebView.PictureListener pictureListener);

    void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier);

    void setVerticalScrollBarEnabled(boolean z17);

    void setVerticalScrollbarOverlay(boolean z17);

    void setWebChromeClient(com.tencent.xweb.s0 s0Var);

    void setWebContentsSize(int i17, int i18);

    void setWebViewCallbackClient(com.tencent.xweb.g1 g1Var);

    void setWebViewClient(com.tencent.xweb.h1 h1Var);

    void setWebViewClientExtension(com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension);

    void setXWebKeyEventHandler(com.tencent.xweb.XWebKeyEventHandler xWebKeyEventHandler);

    void smoothScroll(int i17, int i18, long j17);

    void stopLoading();

    void t(java.util.concurrent.Executor executor, com.tencent.xweb.m1 m1Var);

    boolean u(int i17);

    boolean y();

    boolean zoomIn();

    boolean zoomOut();
}
