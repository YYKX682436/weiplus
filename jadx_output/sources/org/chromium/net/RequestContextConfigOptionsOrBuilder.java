package org.chromium.net;

/* loaded from: classes16.dex */
public interface RequestContextConfigOptionsOrBuilder extends com.google.protobuf.p8 {
    boolean getBrotliEnabled();

    boolean getBypassPublicKeyPinningForLocalTrustAnchors();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    boolean getDisableCache();

    boolean getEnableNetworkQualityEstimator();

    java.lang.String getExperimentalOptions();

    com.google.protobuf.y getExperimentalOptionsBytes();

    boolean getHttp2Enabled();

    long getHttpCacheMaxSize();

    int getHttpCacheMode();

    long getMockCertVerifier();

    int getNetworkThreadPriority();

    java.lang.String getQuicDefaultUserAgentId();

    com.google.protobuf.y getQuicDefaultUserAgentIdBytes();

    boolean getQuicEnabled();

    java.lang.String getStoragePath();

    com.google.protobuf.y getStoragePathBytes();

    java.lang.String getUserAgent();

    com.google.protobuf.y getUserAgentBytes();

    boolean hasBrotliEnabled();

    boolean hasBypassPublicKeyPinningForLocalTrustAnchors();

    boolean hasDisableCache();

    boolean hasEnableNetworkQualityEstimator();

    boolean hasExperimentalOptions();

    boolean hasHttp2Enabled();

    boolean hasHttpCacheMaxSize();

    boolean hasHttpCacheMode();

    boolean hasMockCertVerifier();

    boolean hasNetworkThreadPriority();

    boolean hasQuicDefaultUserAgentId();

    boolean hasQuicEnabled();

    boolean hasStoragePath();

    boolean hasUserAgent();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
