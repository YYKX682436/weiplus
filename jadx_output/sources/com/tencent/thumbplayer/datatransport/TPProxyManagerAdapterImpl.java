package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPProxyManagerAdapterImpl implements com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter {
    private com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy mDownloadProxy;

    public TPProxyManagerAdapterImpl(com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy iTPDownloadProxy) {
        this.mDownloadProxy = iTPDownloadProxy;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter
    public com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy getDownloadProxy() {
        return this.mDownloadProxy;
    }

    @Override // com.tencent.thumbplayer.datatransport.ITPProxyManagerAdapter
    public void pushEvent(int i17) {
        this.mDownloadProxy.pushEvent(i17);
    }
}
