package com.tencent.xweb;

/* loaded from: classes7.dex */
public class XWebExtendPluginClient extends com.tencent.xweb.compatible.a {
    public static final java.lang.String NATIVE_VIEW_TYPE = "native_view";
    private static final java.lang.String TAG = "XWebExtendPluginClient";
    private final java.util.HashMap<java.lang.Integer, com.tencent.xweb.j2> mNativeViewClientMap = new java.util.HashMap<>();
    public com.tencent.xweb.WebView obj;

    public XWebExtendPluginClient(com.tencent.xweb.i2 i2Var) {
        super.init(i2Var);
    }

    @Override // com.tencent.xweb.compatible.a
    public void initPSWebView(com.tencent.xweb.pinus.sdk.WebView webView) {
        super.initPSWebView(webView);
    }

    public com.tencent.xweb.k2 onNativeViewReady(int i17) {
        return null;
    }

    public void onPluginDestroy(java.lang.String str, int i17) {
        if (NATIVE_VIEW_TYPE.equals(str) && this.mNativeViewClientMap.containsKey(java.lang.Integer.valueOf(i17))) {
            this.mNativeViewClientMap.get(java.lang.Integer.valueOf(i17)).getClass();
            this.mNativeViewClientMap.remove(java.lang.Integer.valueOf(i17));
        }
    }

    public void onPluginManagerDestroy() {
        by5.c4.f(TAG, "[onPluginManagerDestroy]");
        java.util.Iterator<com.tencent.xweb.j2> it = this.mNativeViewClientMap.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        this.mNativeViewClientMap.clear();
    }

    public void onPluginReady(java.lang.String str, int i17, android.graphics.SurfaceTexture surfaceTexture) {
    }

    public void onPluginReadyForGPUProcess(java.lang.String str, int i17, android.view.Surface surface) {
    }

    public void onPluginScreenshotTaken(java.lang.String str, int i17, android.graphics.Bitmap bitmap) {
    }

    public void onPluginSizeChanged(java.lang.String str, int i17, int i18, int i19, android.graphics.SurfaceTexture surfaceTexture) {
        if (NATIVE_VIEW_TYPE.equals(str)) {
            if (!this.mNativeViewClientMap.containsKey(java.lang.Integer.valueOf(i17))) {
                onNativeViewReady(i17);
                by5.c4.c(TAG, "onPluginSizeChanged, onNativeViewReady return null");
                return;
            }
            this.mNativeViewClientMap.get(java.lang.Integer.valueOf(i17)).a(i18, i19);
        }
        by5.c4.f(TAG, "onPluginSizeChanged type:" + str + ", embedId:" + i17 + ", width:" + i18 + ", height:" + i19);
        if (surfaceTexture == null || i18 <= 0 || i19 <= 0) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(i18, i19);
    }

    public void onPluginSizeChangedForGPUProcess(java.lang.String str, int i17, int i18, int i19, android.view.Surface surface) {
        if (NATIVE_VIEW_TYPE.equals(str)) {
            if (this.mNativeViewClientMap.containsKey(java.lang.Integer.valueOf(i17))) {
                this.mNativeViewClientMap.get(java.lang.Integer.valueOf(i17)).a(i18, i19);
            } else {
                onNativeViewReady(i17);
                by5.c4.c(TAG, "onPluginSizeChanged onNativeViewReady return null");
            }
        }
    }

    public void onPluginTouch(java.lang.String str, int i17, java.lang.String str2) {
    }

    public void setPluginTextureScale(java.lang.String str, int i17, float f17, float f18) {
        if (this.xwebType == 1) {
            this.psWebview.setPluginTextureScale(str, i17, f17, f18);
        }
    }

    public void takePluginScreenshot(java.lang.String str, int i17) {
        if (this.xwebType == 1) {
            this.psWebview.takePluginScreenshot(str, i17);
        }
    }

    public void onPluginTouch(java.lang.String str, int i17, android.view.MotionEvent motionEvent) {
        if (NATIVE_VIEW_TYPE.equals(str) && this.mNativeViewClientMap.containsKey(java.lang.Integer.valueOf(i17))) {
            this.mNativeViewClientMap.get(java.lang.Integer.valueOf(i17)).f220321a.dispatchTouchEvent(motionEvent);
        }
    }
}
