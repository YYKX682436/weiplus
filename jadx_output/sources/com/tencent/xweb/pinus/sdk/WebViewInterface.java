package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public interface WebViewInterface {
    int addDocumentStartJavaScript(java.lang.String str, java.lang.String[] strArr);

    void addJavascriptInterface(java.lang.Object obj, java.lang.String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i17);

    boolean canGoForward();

    void captureLongScreenshot(android.graphics.Rect rect, android.webkit.ValueCallback<java.lang.Object> valueCallback);

    void clearCache(boolean z17);

    void clearFormData();

    void clearHistory();

    void clearHistory(int i17, int i18);

    void clearMatches();

    void clearSslPreferences();

    void clearView();

    android.webkit.WebBackForwardList copyBackForwardList();

    android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String str);

    void destroy();

    boolean dispatchKeyEvent(android.view.KeyEvent keyEvent);

    void documentHasImages(android.os.Message message);

    void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback);

    void findAllAsync(java.lang.String str);

    void findNext(boolean z17);

    void flingScroll(int i17, int i18);

    android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider();

    android.net.http.SslCertificate getCertificate();

    int getContentHeight();

    android.view.ViewGroup getContentView();

    android.graphics.Bitmap getFavicon();

    java.lang.Object getHitTestResultInner();

    boolean getImageBitmapToFile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj);

    void getImageFromDiskCache(java.lang.String str, android.webkit.ValueCallback<java.lang.Object> valueCallback);

    java.lang.String getOriginalUrl();

    int getProgress();

    float getScale();

    java.lang.Object getSettingsInner();

    boolean getSnapshotFromBrowser(android.webkit.ValueCallback<android.graphics.Bitmap> valueCallback);

    java.lang.String getTitle();

    void getTranslateSampleString(int i17);

    java.lang.String getUrl();

    java.lang.Object getXWebVirtualTextureContentView();

    void goBack();

    void goBackOrForward(int i17);

    void goForward();

    void invokeZoomPicker();

    boolean isPrivateBrowsingEnabled();

    void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    void loadUrl(java.lang.String str);

    void loadUrl(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    boolean onCheckIsTextEditor();

    void onExtendInputKeyboardHeightChanged(boolean z17, int i17, boolean z18);

    void onExtendTextAreaKeyboardHeightChanged(boolean z17, int i17, boolean z18);

    void onHide();

    void onPause();

    void onResume();

    void onShow();

    boolean onTouchEvent(android.view.MotionEvent motionEvent);

    boolean pageDown(boolean z17);

    boolean pageUp(boolean z17);

    void pauseTimers();

    void postUrl(java.lang.String str, byte[] bArr);

    void reload();

    void removeDocumentStartJavaScript(int i17);

    void removeJavascriptInterface(java.lang.String str);

    void replaceTranslatedString(java.util.Map<java.lang.String, java.lang.String> map);

    void requestFocusNodeHref(android.os.Message message);

    void requestImageRef(android.os.Message message);

    void requestXWebSafeAreaUpdate();

    android.webkit.WebBackForwardList restoreState(android.os.Bundle bundle);

    void resumeTimers();

    boolean savePage(java.lang.String str, java.lang.String str2, int i17);

    android.webkit.WebBackForwardList saveState(android.os.Bundle bundle);

    void saveWebArchive(java.lang.String str);

    void saveWebArchive(java.lang.String str, boolean z17, android.webkit.ValueCallback<java.lang.String> valueCallback);

    void setAudioMuted(boolean z17);

    void setBackgroundColor(int i17);

    void setBottomHeight(int i17);

    void setDownloadListener(android.webkit.DownloadListener downloadListener);

    void setExtendInputClient(java.lang.Object obj);

    void setExtendPluginClient(java.lang.Object obj);

    void setExtendTextAreaClient(java.lang.Object obj);

    void setFindListener(android.webkit.WebView.FindListener findListener);

    void setHorizontalScrollBarEnable(boolean z17);

    void setInitialScale(int i17);

    void setInputOutOfKeyboardEnable(boolean z17);

    void setNativeDownloadClient(java.lang.Object obj);

    void setNetworkAvailable(boolean z17);

    void setOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setPluginTextureScale(java.lang.String str, int i17, float f17, float f18);

    void setProxyWebViewClientExtension(java.lang.Object obj);

    void setTranslateMode(boolean z17);

    void setVerticalScrollBarEnable(boolean z17);

    void setWebChromeClient(java.lang.Object obj);

    void setWebContentsDebuggingEnabled(boolean z17);

    void setWebContentsSize(int i17, int i18);

    void setWebViewClient(java.lang.Object obj);

    void setWithoutViewMode(boolean z17);

    void setXWebSafeAreaProvider(java.lang.Object obj);

    void smoothScroll(int i17, int i18, long j17);

    void stopLoading();

    void takePluginScreenshot(java.lang.String str, int i17);

    int view_computeHorizontalScrollOffset();

    int view_computeHorizontalScrollRange();

    int view_computeVerticalScrollExtent();

    int view_computeVerticalScrollOffset();

    int view_computeVerticalScrollRange();

    void view_scrollBy(int i17, int i18);

    void view_scrollTo(int i17, int i18);

    void zoomBy(float f17);

    boolean zoomIn();

    boolean zoomOut();
}
