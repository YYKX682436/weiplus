package com.tencent.trtc;

/* loaded from: classes3.dex */
public class TRTCStatistics {
    public int appCpu;
    public int downLoss;
    public int gatewayRtt;
    public java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics> localArray;
    public long receiveBytes;
    public java.util.ArrayList<com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics> remoteArray;
    public int rtt;
    public long sendBytes;
    public int systemCpu;
    public int upLoss;

    /* loaded from: classes3.dex */
    public static class TRTCLocalStatistics {
        public int audioBitrate;
        public int audioCaptureState;
        public int audioSampleRate;
        public int frameRate;
        public int height;
        public int streamType;
        public int videoBitrate;
        public int width;
    }

    /* loaded from: classes3.dex */
    public static class TRTCRemoteStatistics {
        public int audioBitrate;
        public int audioBlockRate;
        public int audioPacketLoss;
        public int audioSampleRate;
        public int audioTotalBlockTime;
        public int finalLoss;
        public int frameRate;
        public int height;
        public int jitterBufferDelay;
        public int point2PointDelay;
        public int remoteNetworkRTT;
        public int remoteNetworkUplinkLoss;
        public int streamType;
        public java.lang.String userId;
        public int videoBitrate;
        public int videoBlockRate;
        public int videoPacketLoss;
        public int videoTotalBlockTime;
        public int width;
    }
}
