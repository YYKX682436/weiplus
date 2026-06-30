package com.tencent.thumbplayer.event;

/* loaded from: classes16.dex */
public class TPPlayerEventInfo {

    /* loaded from: classes16.dex */
    public static class BaseEventInfo {
        private long mEventTimeSinceBootMs = android.os.SystemClock.elapsedRealtime();
        private long mEventTimeSince1970Ms = java.lang.System.currentTimeMillis();
        private int mEventId = -1;

        public int getEventId() {
            return this.mEventId;
        }

        public long getEventTimeSince1970Ms() {
            return this.mEventTimeSince1970Ms;
        }

        public long getEventTimeSinceBootMs() {
            return this.mEventTimeSinceBootMs;
        }

        public void setEventId(int i17) {
            this.mEventId = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class BufferingEndEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public BufferingEndEventInfo() {
            setEventId(112);
        }
    }

    /* loaded from: classes16.dex */
    public static class BufferingStartEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public BufferingStartEventInfo() {
            setEventId(111);
        }
    }

    /* loaded from: classes16.dex */
    public static class DTCdnUrlUpdataEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private java.lang.String mCdnIp;
        private java.lang.String mUserIp;

        public DTCdnUrlUpdataEventInfo() {
            setEventId(202);
        }

        public java.lang.String getCdnIp() {
            return this.mCdnIp;
        }

        public java.lang.String getUserIp() {
            return this.mUserIp;
        }

        public void setCdnIp(java.lang.String str) {
            this.mCdnIp = str;
        }

        public void setUserIp(java.lang.String str) {
            this.mUserIp = str;
        }
    }

    /* loaded from: classes16.dex */
    public static class DTDownloadProgressUpdataEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private int mDownloadSpeedKbps;

        public DTDownloadProgressUpdataEventInfo() {
            setEventId(201);
        }

        public int getDownloadSpeedKbps() {
            return this.mDownloadSpeedKbps;
        }

        public void setDownloadSpeedKbps(int i17) {
            this.mDownloadSpeedKbps = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class DTProtocalUpdateEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private java.lang.String mProtocol;
        private java.lang.String mProtocolVer;

        public DTProtocalUpdateEventInfo() {
            setEventId(203);
        }

        public java.lang.String getProtocol() {
            return this.mProtocol;
        }

        public java.lang.String getProtocolVer() {
            return this.mProtocolVer;
        }

        public void setProtocol(java.lang.String str) {
            this.mProtocol = str;
        }

        public void setProtocolVer(java.lang.String str) {
            this.mProtocolVer = str;
        }
    }

    /* loaded from: classes16.dex */
    public static class DTReturnConvertedUrlEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public DTReturnConvertedUrlEventInfo() {
            setEventId(204);
        }
    }

    /* loaded from: classes16.dex */
    public static class DrmEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private com.tencent.thumbplayer.api.TPDrmInfo mDrmInfo;

        public DrmEventInfo() {
            setEventId(116);
        }

        public com.tencent.thumbplayer.api.TPDrmInfo getDrmInfo() {
            return this.mDrmInfo;
        }

        public void setDrmInfo(com.tencent.thumbplayer.api.TPDrmInfo tPDrmInfo) {
            this.mDrmInfo = tPDrmInfo;
        }
    }

    /* loaded from: classes16.dex */
    public static class PlayErrorEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private com.tencent.thumbplayer.core.player.TPDynamicStatisticParams mDynamicStatisticParams;
        private int mErrorCode;
        private int mErrorType;
        private com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams mGeneralPlayFlowParams;

        public PlayErrorEventInfo() {
            setEventId(106);
        }

        public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams() {
            return this.mDynamicStatisticParams;
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public int getErrorType() {
            return this.mErrorType;
        }

        public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
            return this.mGeneralPlayFlowParams;
        }

        public void setDynamicStatisticParams(com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.mDynamicStatisticParams = tPDynamicStatisticParams;
        }

        public void setErrorCode(int i17) {
            this.mErrorCode = i17;
        }

        public void setErrorType(int i17) {
            this.mErrorType = i17;
        }

        public void setGeneralPlayFlowParams(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.mGeneralPlayFlowParams = tPGeneralPlayFlowParams;
        }
    }

    /* loaded from: classes16.dex */
    public static class PlayPauseEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public PlayPauseEventInfo() {
            setEventId(104);
        }
    }

    /* loaded from: classes16.dex */
    public static class PlayReleaseEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public PlayReleaseEventInfo() {
            setEventId(108);
        }
    }

    /* loaded from: classes16.dex */
    public static class PlayResetEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private com.tencent.thumbplayer.core.player.TPDynamicStatisticParams mDynamicStatisticParams;
        private com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams mGeneralPlayFlowParams;

        public PlayResetEventInfo() {
            setEventId(107);
        }

        public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams() {
            return this.mDynamicStatisticParams;
        }

        public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
            return this.mGeneralPlayFlowParams;
        }

        public void setDynamicStatisticParams(com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.mDynamicStatisticParams = tPDynamicStatisticParams;
        }

        public void setGeneralPlayFlowParams(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.mGeneralPlayFlowParams = tPGeneralPlayFlowParams;
        }
    }

    /* loaded from: classes16.dex */
    public static class PlayStartEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public PlayStartEventInfo() {
            setEventId(103);
        }
    }

    /* loaded from: classes16.dex */
    public static class PlayStopEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private com.tencent.thumbplayer.core.player.TPDynamicStatisticParams mDynamicStatisticParams;
        private com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams mGeneralPlayFlowParams;

        public PlayStopEventInfo() {
            setEventId(105);
        }

        public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams() {
            return this.mDynamicStatisticParams;
        }

        public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
            return this.mGeneralPlayFlowParams;
        }

        public void setDynamicStatisticParams(com.tencent.thumbplayer.core.player.TPDynamicStatisticParams tPDynamicStatisticParams) {
            this.mDynamicStatisticParams = tPDynamicStatisticParams;
        }

        public void setGeneralPlayFlowParams(com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
            this.mGeneralPlayFlowParams = tPGeneralPlayFlowParams;
        }
    }

    /* loaded from: classes16.dex */
    public static class PrepareEndEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private long mDurationMs;
        private int mPlayerType;

        public PrepareEndEventInfo() {
            setEventId(102);
        }

        public long getDurationMs() {
            return this.mDurationMs;
        }

        public int getPlayerType() {
            return this.mPlayerType;
        }

        public void setDurationMs(long j17) {
            this.mDurationMs = j17;
        }

        public void setPlayerType(int i17) {
            this.mPlayerType = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class PrepareStartEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private java.lang.String mFlowId = "";

        public PrepareStartEventInfo() {
            setEventId(101);
        }

        public java.lang.String getFlowId() {
            return this.mFlowId;
        }

        public void setFlowId(java.lang.String str) {
            this.mFlowId = str;
        }
    }

    /* loaded from: classes16.dex */
    public static class SeekEndEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public SeekEndEventInfo() {
            setEventId(110);
        }
    }

    /* loaded from: classes16.dex */
    public static class SeekStartEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        public SeekStartEventInfo() {
            setEventId(109);
        }
    }

    /* loaded from: classes16.dex */
    public static class SelectTrackEndEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private int mErrorCode;
        private long mOpaque;

        public SelectTrackEndEventInfo() {
            setEventId(115);
        }

        public int getErrorCode() {
            return this.mErrorCode;
        }

        public long getOpaque() {
            return this.mOpaque;
        }

        public void setErrorCode(int i17) {
            this.mErrorCode = i17;
        }

        public void setOpaque(long j17) {
            this.mOpaque = j17;
        }
    }

    /* loaded from: classes16.dex */
    public static class SelectTrackStartEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private long mOpaque;
        private int mTrackIndex;
        private com.tencent.thumbplayer.api.TPTrackInfo mTrackInfo;

        public SelectTrackStartEventInfo() {
            setEventId(114);
        }

        public long getOpaque() {
            return this.mOpaque;
        }

        public int getTrackIndex() {
            return this.mTrackIndex;
        }

        public com.tencent.thumbplayer.api.TPTrackInfo getTrackInfo() {
            return this.mTrackInfo;
        }

        public void setOpaque(long j17) {
            this.mOpaque = j17;
        }

        public void setTrackIndex(int i17) {
            this.mTrackIndex = i17;
        }

        public void setTrackInfo(com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo) {
            this.mTrackInfo = tPTrackInfo;
        }
    }

    /* loaded from: classes16.dex */
    public static class SetDataSourceEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private boolean mIsUseProxy;
        private java.lang.String mUrl;
        private int mUrlProtocol;

        public SetDataSourceEventInfo() {
            setEventId(117);
        }

        public java.lang.String getUrl() {
            return this.mUrl;
        }

        public int getUrlProtocol() {
            return this.mUrlProtocol;
        }

        public boolean isIsUseProxy() {
            return this.mIsUseProxy;
        }

        public void setIsUseProxy(boolean z17) {
            this.mIsUseProxy = z17;
        }

        public void setUrl(java.lang.String str) {
            this.mUrl = str;
        }

        public void setUrlProtocol(int i17) {
            this.mUrlProtocol = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class SetPlaySpeedEventInfo extends com.tencent.thumbplayer.event.TPPlayerEventInfo.BaseEventInfo {
        private float mPlaySpeedRatio;

        public SetPlaySpeedEventInfo() {
            setEventId(113);
        }

        public float getPlaySpeedRatio() {
            return this.mPlaySpeedRatio;
        }

        public void setPlaySpeedRatio(float f17) {
            this.mPlaySpeedRatio = f17;
        }
    }

    private TPPlayerEventInfo() {
    }
}
