package qe;

/* loaded from: classes7.dex */
public final class j1 implements com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener f361969a;

    public j1(com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener, com.tencent.mm.plugin.appbrand.jsruntime.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f361969a = iWcWssWebSocketListener;
        lifecycleOwner.r(new qe.h1(this));
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener
    public com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i17, java.lang.String str) {
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f361969a;
        if (iWcWssWebSocketListener != null) {
            return iWcWssWebSocketListener.bindSocketToCellularAndDnsByCellular(i17, str);
        }
        return null;
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener
    public int doCertificateVerify(java.lang.String str, long j17, java.lang.String str2, byte[][] bArr) {
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f361969a;
        if (iWcWssWebSocketListener != null) {
            return iWcWssWebSocketListener.doCertificateVerify(str, j17, str2, bArr);
        }
        return 0;
    }

    @Override // com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener
    public void onStateChange(java.lang.String str, long j17, int i17) {
        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener = this.f361969a;
        if (iWcWssWebSocketListener != null) {
            iWcWssWebSocketListener.onStateChange(str, j17, i17);
        }
    }
}
