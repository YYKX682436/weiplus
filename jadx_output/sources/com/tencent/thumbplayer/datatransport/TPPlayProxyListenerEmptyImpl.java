package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPPlayProxyListenerEmptyImpl implements com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener, com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener {
    private java.lang.String tag;

    public TPPlayProxyListenerEmptyImpl(java.lang.String str) {
        this.tag = str;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getAdvRemainTime() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getAdvRemainTime");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int getCurrentPlayClipNo() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getCurrentPlayClipNo");
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getCurrentPlayOffset() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getCurrentPlayOffset");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getCurrentPosition() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getCurrentPosition");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public java.lang.Object getPlayInfo(long j17) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getPlayInfo with type : " + j17);
        return null;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public long getPlayerBufferLength() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getPlayerBufferLength");
        return 0L;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlExpired(java.util.Map<java.lang.String, java.lang.String> map) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlInfoUpdate(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadCdnUrlUpdate(java.lang.String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadError(int i17, int i18, java.lang.String str) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadFinish() {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadProgressUpdate(int i17, int i18, long j17, long j18, java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , onPlayProgress, current : " + j17 + ", total : " + j18);
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadProtocolUpdate(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public void onDownloadStatusUpdate(int i17) {
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public java.lang.Object onPlayCallback(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , onPlayCallback, messageType : " + i17 + ",ext1:" + obj + ",ext2:" + obj2 + ",ext3" + obj3 + ",ext4" + obj4);
        return null;
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareDownloadProgressUpdate(int i17, int i18, long j17, long j18) {
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareError() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , onPrepareError : ");
    }

    @Override // com.tencent.thumbplayer.api.proxy.ITPPreloadProxy.IPreloadListener
    public void onPrepareSuccess() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , onPrepareSuccess : ");
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener
    public java.lang.Object getPlayInfo(java.lang.String str) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(this.tag, " empty proxy player listener , notify , getPlayInfo with key : " + str);
        return null;
    }
}
