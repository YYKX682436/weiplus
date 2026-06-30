package com.tencent.wechat.aff.websearch;

/* loaded from: classes16.dex */
class ZIDL_flS4gctrB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback {
    private com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase stub;

    private native void ZIDL_DX(long j17, long j18, byte[] bArr);

    private native void ZIDL_EX(long j17, long j18, int i17);

    private native void ZIDL_HI(long j17, byte[] bArr, byte[] bArr2);

    public void ZIDL_B(double d17, boolean z17) {
        this.stub.createPlatformView(d17, z17);
    }

    public void ZIDL_C(boolean z17) {
        this.stub.notifyFocusChanged(z17);
    }

    public void ZIDL_DV(long j17) {
        this.stub.getWebViewPixelsAsync(j17);
    }

    public void ZIDL_EV(long j17, boolean z17) {
        this.stub.notifyFilterShowOrHideAsync(j17, z17);
    }

    public void ZIDL_F(int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.stub.notifyH5BoxResult(i17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr4, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr5, java.nio.charset.StandardCharsets.UTF_8));
    }

    public void ZIDL_G(int i17) {
        this.stub.dispose(i17);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase webSearchPlatformManagerBase = (com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase) obj;
        this.stub = webSearchPlatformManagerBase;
        webSearchPlatformManagerBase.setCallback(this);
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback
    public void onGetWebViewPixelsComplete(long j17, byte[] bArr) {
        ZIDL_DX(this.nativeHandler, j17, bArr);
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback
    public void onNativeEventsEvent(java.lang.String str, java.lang.String str2) {
        ZIDL_HI(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback
    public void onNotifyFilterShowOrHideComplete(long j17, int i17) {
        ZIDL_EX(this.nativeHandler, j17, i17);
    }
}
