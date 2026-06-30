package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class WebChromeClient {
    public android.graphics.Bitmap getDefaultVideoPoster() {
        return null;
    }

    public android.view.View getVideoLoadingProgressView() {
        return null;
    }

    public void getVisitedHistory(android.webkit.ValueCallback<java.lang.String[]> valueCallback) {
    }

    public void onCloseWindow(com.tencent.xweb.pinus.sdk.WebView webView) {
    }

    public boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return false;
    }

    public boolean onCreateWindow(com.tencent.xweb.pinus.sdk.WebView webView, boolean z17, boolean z18, android.os.Message message) {
        return false;
    }

    public void onExitFullscreenVideo(android.graphics.Bitmap bitmap) {
    }

    public void onGeolocationPermissionsHidePrompt() {
    }

    public void onGeolocationPermissionsShowPrompt(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
    }

    public void onGetSampleString(com.tencent.xweb.pinus.sdk.WebView webView, java.util.Map<java.lang.String, java.lang.String> map) {
    }

    public void onGetTranslateString(com.tencent.xweb.pinus.sdk.WebView webView, java.util.Map<java.lang.String, java.lang.String> map) {
    }

    public void onHideCustomView() {
    }

    public boolean onJsAlert(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.pinus.sdk.i iVar) {
        return false;
    }

    public boolean onJsAlertInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return false;
    }

    public boolean onJsBeforeUnload(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.pinus.sdk.i iVar) {
        return false;
    }

    public boolean onJsBeforeUnloadInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return false;
    }

    public boolean onJsConfirm(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.pinus.sdk.i iVar) {
        return false;
    }

    public boolean onJsConfirmInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        return false;
    }

    public boolean onJsPrompt(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.pinus.sdk.i iVar) {
        return false;
    }

    public boolean onJsPromptInner(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj) {
        return false;
    }

    public void onPermissionRequest(android.webkit.PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    public void onPermissionRequestCanceled(android.webkit.PermissionRequest permissionRequest) {
    }

    public void onProgressChanged(com.tencent.xweb.pinus.sdk.WebView webView, int i17) {
    }

    public void onReceivedIcon(com.tencent.xweb.pinus.sdk.WebView webView, android.graphics.Bitmap bitmap) {
    }

    public void onReceivedTitle(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str) {
    }

    public void onReceivedTouchIconUrl(com.tencent.xweb.pinus.sdk.WebView webView, java.lang.String str, boolean z17) {
    }

    public void onRequestFocus(com.tencent.xweb.pinus.sdk.WebView webView) {
    }

    public void onShowCustomView(android.view.View view, android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public boolean onShowFileChooser(com.tencent.xweb.pinus.sdk.WebView webView, android.webkit.ValueCallback<android.net.Uri[]> valueCallback, android.webkit.WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
