package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class WebView extends android.widget.FrameLayout implements com.tencent.xweb.pinus.sdk.WebViewInterface, com.tencent.xweb.i2 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "Pinus.WebView";
    private final java.util.ArrayList<java.lang.Object> constructorParams;
    private final java.util.ArrayList<java.lang.Object> constructorTypes;
    private com.tencent.xweb.pinus.PSCoreWrapper coreWrapper;
    private java.lang.Object inner;
    private com.tencent.xweb.pinus.sdk.a0 mOverScrolledListener;
    private com.tencent.xweb.pinus.sdk.b0 mScrollChangedListener;
    private com.tencent.xweb.pinus.sdk.WebViewInterface reflectInterface;
    private com.tencent.xweb.pinus.sdk.u webSettings;

    public WebView(android.content.Context context) {
        super(context, null);
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.constructorTypes = arrayList;
        arrayList.add(android.content.Context.class);
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>();
        this.constructorParams = arrayList2;
        arrayList2.add(context);
        init();
    }

    private void init() {
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        this.coreWrapper = pSCoreWrapper;
        if (pSCoreWrapper == null) {
            return;
        }
        int size = this.constructorTypes.size();
        java.lang.Class[] clsArr = new java.lang.Class[size + 1];
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = this.constructorTypes.get(i17);
            if (obj instanceof java.lang.String) {
                clsArr[i17] = this.coreWrapper.getBridgeClass((java.lang.String) obj);
                java.util.ArrayList<java.lang.Object> arrayList = this.constructorParams;
                arrayList.set(i17, this.coreWrapper.getBridgeObject(arrayList.get(i17)));
            } else if (obj instanceof java.lang.Class) {
                clsArr[i17] = (java.lang.Class) obj;
            }
        }
        clsArr[size] = java.lang.Object.class;
        this.constructorParams.add(this);
        try {
            java.lang.Object a17 = new by5.h0(this.coreWrapper.getBridgeClass("PSWebview"), clsArr).a(this.constructorParams.toArray());
            this.inner = a17;
            addView((android.widget.FrameLayout) a17, new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.tencent.xweb.pinus.sdk.d0 d0Var = new com.tencent.xweb.pinus.sdk.d0(this.inner);
            this.reflectInterface = d0Var;
            this.webSettings = new com.tencent.xweb.pinus.sdk.v(d0Var.getSettingsInner());
        } catch (java.lang.Throwable th6) {
            by5.c4.d(TAG, "init, error", th6);
        }
    }

    private boolean performLongClickDelegate() {
        return performLongClick();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int addDocumentStartJavaScript(java.lang.String str, java.lang.String[] strArr) {
        return this.reflectInterface.addDocumentStartJavaScript(str, strArr);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.reflectInterface.addJavascriptInterface(obj, str);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean canGoBack() {
        return this.reflectInterface.canGoBack();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean canGoBackOrForward(int i17) {
        return this.reflectInterface.canGoBackOrForward(i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean canGoForward() {
        return this.reflectInterface.canGoForward();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void captureLongScreenshot(android.graphics.Rect rect, android.webkit.ValueCallback<java.lang.Object> valueCallback) {
        this.reflectInterface.captureLongScreenshot(rect, valueCallback);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearCache(boolean z17) {
        this.reflectInterface.clearCache(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearFormData() {
        this.reflectInterface.clearFormData();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearHistory() {
        this.reflectInterface.clearHistory();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearMatches() {
        this.reflectInterface.clearMatches();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearSslPreferences() {
        this.reflectInterface.clearSslPreferences();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearView() {
        this.reflectInterface.clearView();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return view_computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return view_computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return view_computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return view_computeVerticalScrollOffset();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        return view_computeVerticalScrollRange();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.webkit.WebBackForwardList copyBackForwardList() {
        return this.reflectInterface.copyBackForwardList();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String str) {
        return this.reflectInterface.createPrintDocumentAdapter(str);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void destroy() {
        this.reflectInterface.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.reflectInterface.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void documentHasImages(android.os.Message message) {
        this.reflectInterface.documentHasImages(message);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        this.reflectInterface.evaluateJavascript(str, valueCallback);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void findAllAsync(java.lang.String str) {
        this.reflectInterface.findAllAsync(str);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void findNext(boolean z17) {
        this.reflectInterface.findNext(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void flingScroll(int i17, int i18) {
        this.reflectInterface.flingScroll(i17, i18);
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return this.reflectInterface.getAccessibilityNodeProvider();
    }

    public java.lang.Object getBridge() {
        return this.inner;
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.net.http.SslCertificate getCertificate() {
        return this.reflectInterface.getCertificate();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int getContentHeight() {
        return this.reflectInterface.getContentHeight();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.view.ViewGroup getContentView() {
        return this.reflectInterface.getContentView();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.graphics.Bitmap getFavicon() {
        return this.reflectInterface.getFavicon();
    }

    public com.tencent.xweb.pinus.sdk.e getHitTestResult() {
        return new com.tencent.xweb.pinus.sdk.f(this.reflectInterface.getHitTestResultInner());
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public java.lang.Object getHitTestResultInner() {
        return this.reflectInterface.getHitTestResultInner();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean getImageBitmapToFile(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        return this.reflectInterface.getImageBitmapToFile(str, str2, str3, obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void getImageFromDiskCache(java.lang.String str, android.webkit.ValueCallback<java.lang.Object> valueCallback) {
        this.reflectInterface.getImageFromDiskCache(str, valueCallback);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public java.lang.String getOriginalUrl() {
        return this.reflectInterface.getOriginalUrl();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int getProgress() {
        return this.reflectInterface.getProgress();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public float getScale() {
        return this.reflectInterface.getScale();
    }

    public com.tencent.xweb.pinus.sdk.u getSettings() {
        return this.webSettings;
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public java.lang.Object getSettingsInner() {
        return this.reflectInterface.getSettingsInner();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean getSnapshotFromBrowser(android.webkit.ValueCallback<android.graphics.Bitmap> valueCallback) {
        return this.reflectInterface.getSnapshotFromBrowser(valueCallback);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public java.lang.String getTitle() {
        return this.reflectInterface.getTitle();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void getTranslateSampleString(int i17) {
        this.reflectInterface.getTranslateSampleString(i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public java.lang.String getUrl() {
        return this.reflectInterface.getUrl();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void goBack() {
        this.reflectInterface.goBack();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void goBackOrForward(int i17) {
        this.reflectInterface.goBackOrForward(i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void goForward() {
        this.reflectInterface.goForward();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void invokeZoomPicker() {
        this.reflectInterface.invokeZoomPicker();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean isPrivateBrowsingEnabled() {
        return this.reflectInterface.isPrivateBrowsingEnabled();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.reflectInterface.loadData(str, str2, str3);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.reflectInterface.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadUrl(java.lang.String str) {
        this.reflectInterface.loadUrl(str);
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean onCheckIsTextEditor() {
        return this.reflectInterface.onCheckIsTextEditor();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onExtendInputKeyboardHeightChanged(boolean z17, int i17, boolean z18) {
        this.reflectInterface.onExtendInputKeyboardHeightChanged(z17, i17, z18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onExtendTextAreaKeyboardHeightChanged(boolean z17, int i17, boolean z18) {
        this.reflectInterface.onExtendTextAreaKeyboardHeightChanged(z17, i17, z18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onHide() {
        this.reflectInterface.onHide();
    }

    public void onOverScrolledDelegate(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.tencent.xweb.g1 g1Var;
        com.tencent.xweb.pinus.sdk.a0 a0Var = this.mOverScrolledListener;
        if (a0Var == null || (g1Var = ((vx5.z) a0Var).f441398a.f441359m) == null) {
            return;
        }
        g1Var.e(i17, i18, z17, z18, view);
    }

    public void onOverscrollRefresh(boolean z17) {
        com.tencent.xweb.pinus.sdk.a0 a0Var = this.mOverScrolledListener;
        if (a0Var != null) {
            ((vx5.z) a0Var).f441398a.f441363q = z17;
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onPause() {
        this.reflectInterface.onPause();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onResume() {
        this.reflectInterface.onResume();
    }

    public void onScrollChangedDelegate(int i17, int i18, int i19, int i27) {
        onScrollChanged(i17, i18, i19, i27);
        com.tencent.xweb.pinus.sdk.b0 b0Var = this.mScrollChangedListener;
        if (b0Var != null) {
            vx5.i0 i0Var = ((vx5.y) b0Var).f441397a;
            i0Var.f441356g.scrollTo(i17, i18);
            com.tencent.xweb.g1 g1Var = i0Var.f441359m;
            if (g1Var != null) {
                g1Var.d(i17, i18, i19, i27, i0Var.f441355f);
            }
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void onShow() {
        this.reflectInterface.onShow();
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.reflectInterface.onTouchEvent(motionEvent);
    }

    public boolean overScrollByDelegate(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.tencent.xweb.g1 g1Var;
        com.tencent.xweb.pinus.sdk.a0 a0Var = this.mOverScrolledListener;
        if (a0Var == null || (g1Var = ((vx5.z) a0Var).f441398a.f441359m) == null) {
            return false;
        }
        return g1Var.a(i17, i18, i19, i27, i28, i29, i37, i38, z17, view);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean pageDown(boolean z17) {
        return this.reflectInterface.pageDown(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean pageUp(boolean z17) {
        return this.reflectInterface.pageUp(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void pauseTimers() {
        this.reflectInterface.pauseTimers();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void postUrl(java.lang.String str, byte[] bArr) {
        this.reflectInterface.postUrl(str, bArr);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void reload() {
        this.reflectInterface.reload();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void removeDocumentStartJavaScript(int i17) {
        this.reflectInterface.removeDocumentStartJavaScript(i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void removeJavascriptInterface(java.lang.String str) {
        this.reflectInterface.removeJavascriptInterface(str);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void replaceTranslatedString(java.util.Map<java.lang.String, java.lang.String> map) {
        this.reflectInterface.replaceTranslatedString(map);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void requestFocusNodeHref(android.os.Message message) {
        this.reflectInterface.requestFocusNodeHref(message);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void requestImageRef(android.os.Message message) {
        this.reflectInterface.requestImageRef(message);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface, com.tencent.xweb.i2
    public void requestXWebSafeAreaUpdate() {
        by5.c4.f(TAG, "requestXWebSafeAreaUpdate called");
        this.reflectInterface.requestXWebSafeAreaUpdate();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.webkit.WebBackForwardList restoreState(android.os.Bundle bundle) {
        return this.reflectInterface.restoreState(bundle);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void resumeTimers() {
        this.reflectInterface.resumeTimers();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean savePage(java.lang.String str, java.lang.String str2, int i17) {
        return this.reflectInterface.savePage(str, str2, i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public android.webkit.WebBackForwardList saveState(android.os.Bundle bundle) {
        return this.reflectInterface.saveState(bundle);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void saveWebArchive(java.lang.String str) {
        this.reflectInterface.saveWebArchive(str);
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        view_scrollBy(i17, i18);
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
        view_scrollTo(i17, i18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setAudioMuted(boolean z17) {
        this.reflectInterface.setAudioMuted(z17);
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setBackgroundColor(int i17) {
        this.reflectInterface.setBackgroundColor(i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setBottomHeight(int i17) {
        this.reflectInterface.setBottomHeight(i17);
    }

    public void setCustomOnOverScrolledListener(com.tencent.xweb.pinus.sdk.a0 a0Var) {
        this.mOverScrolledListener = a0Var;
    }

    public void setCustomOnScrollChangedListener(com.tencent.xweb.pinus.sdk.b0 b0Var) {
        this.mScrollChangedListener = b0Var;
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setDownloadListener(android.webkit.DownloadListener downloadListener) {
        this.reflectInterface.setDownloadListener(downloadListener);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setExtendInputClient(java.lang.Object obj) {
        this.reflectInterface.setExtendInputClient(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setExtendPluginClient(java.lang.Object obj) {
        this.reflectInterface.setExtendPluginClient(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setExtendTextAreaClient(java.lang.Object obj) {
        this.reflectInterface.setExtendTextAreaClient(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setFindListener(android.webkit.WebView.FindListener findListener) {
        this.reflectInterface.setFindListener(findListener);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setHorizontalScrollBarEnable(boolean z17) {
        this.reflectInterface.setHorizontalScrollBarEnable(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setInitialScale(int i17) {
        this.reflectInterface.setInitialScale(i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setInputOutOfKeyboardEnable(boolean z17) {
        this.reflectInterface.setInputOutOfKeyboardEnable(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setNativeDownloadClient(java.lang.Object obj) {
        this.reflectInterface.setNativeDownloadClient(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setNetworkAvailable(boolean z17) {
        this.reflectInterface.setNetworkAvailable(z17);
    }

    @Override // android.view.View, com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.reflectInterface.setOnTouchListener(onTouchListener);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setPluginTextureScale(java.lang.String str, int i17, float f17, float f18) {
        this.reflectInterface.setPluginTextureScale(str, i17, f17, f18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setProxyWebViewClientExtension(java.lang.Object obj) {
        this.reflectInterface.setProxyWebViewClientExtension(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setTranslateMode(boolean z17) {
        this.reflectInterface.setTranslateMode(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setVerticalScrollBarEnable(boolean z17) {
        this.reflectInterface.setVerticalScrollBarEnable(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebChromeClient(java.lang.Object obj) {
        this.reflectInterface.setWebChromeClient(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebContentsDebuggingEnabled(boolean z17) {
        this.reflectInterface.setWebContentsDebuggingEnabled(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebContentsSize(int i17, int i18) {
        this.reflectInterface.setWebContentsSize(i17, i18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWebViewClient(java.lang.Object obj) {
        this.reflectInterface.setWebViewClient(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setWithoutViewMode(boolean z17) {
        this.reflectInterface.setWithoutViewMode(z17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void setXWebSafeAreaProvider(java.lang.Object obj) {
        by5.c4.f(TAG, "setXWebSafeAreaProvider(Object): provider=" + obj);
        this.reflectInterface.setXWebSafeAreaProvider(obj);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void smoothScroll(int i17, int i18, long j17) {
        this.reflectInterface.smoothScroll(i17, i18, j17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void stopLoading() {
        this.reflectInterface.stopLoading();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void takePluginScreenshot(java.lang.String str, int i17) {
        this.reflectInterface.takePluginScreenshot(str, i17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeHorizontalScrollOffset() {
        return this.reflectInterface.view_computeHorizontalScrollOffset();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeHorizontalScrollRange() {
        return this.reflectInterface.view_computeHorizontalScrollRange();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeVerticalScrollExtent() {
        return this.reflectInterface.view_computeVerticalScrollExtent();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeVerticalScrollOffset() {
        return this.reflectInterface.view_computeVerticalScrollOffset();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public int view_computeVerticalScrollRange() {
        return this.reflectInterface.view_computeVerticalScrollRange();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void view_scrollBy(int i17, int i18) {
        this.reflectInterface.view_scrollBy(i17, i18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void view_scrollTo(int i17, int i18) {
        this.reflectInterface.view_scrollTo(i17, i18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void zoomBy(float f17) {
        this.reflectInterface.zoomBy(f17);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean zoomIn() {
        return this.reflectInterface.zoomIn();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public boolean zoomOut() {
        return this.reflectInterface.zoomOut();
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void clearHistory(int i17, int i18) {
        this.reflectInterface.clearHistory(i17, i18);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public com.tencent.xweb.e3 getXWebVirtualTextureContentView() {
        return new com.tencent.xweb.f3(this.reflectInterface.getXWebVirtualTextureContentView());
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void loadUrl(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.reflectInterface.loadUrl(str, map);
    }

    @Override // com.tencent.xweb.pinus.sdk.WebViewInterface
    public void saveWebArchive(java.lang.String str, boolean z17, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        this.reflectInterface.saveWebArchive(str, z17, valueCallback);
    }

    @Override // com.tencent.xweb.i2
    public void setExtendInputClient(com.tencent.xweb.XWebExtendInputClient xWebExtendInputClient) {
        setExtendInputClient((java.lang.Object) xWebExtendInputClient);
    }

    @Override // com.tencent.xweb.i2
    public void setExtendPluginClient(com.tencent.xweb.XWebExtendPluginClient xWebExtendPluginClient) {
        setExtendPluginClient((java.lang.Object) xWebExtendPluginClient);
    }

    @Override // com.tencent.xweb.i2
    public void setExtendTextAreaClient(com.tencent.xweb.XWebExtendTextAreaClient xWebExtendTextAreaClient) {
        setExtendTextAreaClient((java.lang.Object) xWebExtendTextAreaClient);
    }

    @Override // com.tencent.xweb.i2
    public void setXWebSafeAreaProvider(com.tencent.xweb.XWebSafeAreaProvider xWebSafeAreaProvider) {
        by5.c4.f(TAG, "setXWebSafeAreaProvider(XWebSafeAreaProvider): provider=" + xWebSafeAreaProvider);
        setXWebSafeAreaProvider((java.lang.Object) xWebSafeAreaProvider);
    }

    public WebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, null);
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.constructorTypes = arrayList;
        arrayList.add(android.content.Context.class);
        arrayList.add(android.util.AttributeSet.class);
        java.util.ArrayList<java.lang.Object> arrayList2 = new java.util.ArrayList<>();
        this.constructorParams = arrayList2;
        arrayList2.add(context);
        arrayList2.add(attributeSet);
        init();
    }
}
