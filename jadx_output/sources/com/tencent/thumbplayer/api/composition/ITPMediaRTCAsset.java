package com.tencent.thumbplayer.api.composition;

/* loaded from: classes16.dex */
public interface ITPMediaRTCAsset extends com.tencent.thumbplayer.api.composition.ITPMediaAsset {
    public static final int MINI_SDP_EXCHANGE = 1;
    public static final int NORMAL_SDP_EXCHANGE = 0;
    public static final int USER_SDP_EXCHANGE = 2;

    int getRtcSdpExchangeType();

    java.lang.String getRtcServerUrl();

    java.lang.String getRtcStreamUrl();
}
