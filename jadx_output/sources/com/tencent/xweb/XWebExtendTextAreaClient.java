package com.tencent.xweb;

/* loaded from: classes7.dex */
public class XWebExtendTextAreaClient extends com.tencent.xweb.compatible.a {
    private static final java.lang.String TAG = "XWebExtendTextAreaClient";

    public XWebExtendTextAreaClient(com.tencent.xweb.i2 i2Var) {
        super.init(i2Var);
    }

    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        if (this.xwebType == 1) {
            this.psWebview.evaluateJavascript(str, valueCallback);
        }
    }

    public int getToolBarHeight(int i17) {
        return 0;
    }

    @Override // com.tencent.xweb.compatible.a
    public void initPSWebView(com.tencent.xweb.pinus.sdk.WebView webView) {
        super.initPSWebView(webView);
    }

    public boolean onHideKeyboard(java.lang.String str, android.view.inputmethod.InputConnection inputConnection) {
        return false;
    }

    public void onKeyboardHeightChanged(boolean z17, int i17, boolean z18) {
        if (this.xwebType == 1) {
            this.psWebview.onExtendTextAreaKeyboardHeightChanged(z17, i17, z18);
        }
    }

    public boolean onShowKeyboard(java.lang.String str, android.view.inputmethod.InputConnection inputConnection, android.os.ResultReceiver resultReceiver) {
        return false;
    }

    public boolean onShowKeyboardConfig(int i17, int i18, java.lang.String str, int i19, int i27, android.view.inputmethod.EditorInfo editorInfo) {
        return false;
    }

    public boolean performEditorAction(int i17) {
        return true;
    }
}
