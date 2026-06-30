package org.chromium.net;

/* loaded from: classes16.dex */
public final class RequestContextConfigOptions extends com.google.protobuf.n5 implements org.chromium.net.RequestContextConfigOptionsOrBuilder {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    private static final org.chromium.net.RequestContextConfigOptions DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile com.google.protobuf.e9 PARSER = null;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean brotliEnabled_;
    private boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    private boolean disableCache_;
    private boolean enableNetworkQualityEstimator_;
    private boolean http2Enabled_;
    private long httpCacheMaxSize_;
    private int httpCacheMode_;
    private long mockCertVerifier_;
    private int networkThreadPriority_;
    private boolean quicEnabled_;
    private java.lang.String userAgent_ = "";
    private java.lang.String storagePath_ = "";
    private java.lang.String quicDefaultUserAgentId_ = "";
    private java.lang.String experimentalOptions_ = "";

    /* renamed from: org.chromium.net.RequestContextConfigOptions$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.l5.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends com.google.protobuf.h5 implements org.chromium.net.RequestContextConfigOptionsOrBuilder {
        public org.chromium.net.RequestContextConfigOptions.Builder clearBrotliEnabled() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearBrotliEnabled();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearBypassPublicKeyPinningForLocalTrustAnchors() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearBypassPublicKeyPinningForLocalTrustAnchors();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearDisableCache() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearDisableCache();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearEnableNetworkQualityEstimator() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearEnableNetworkQualityEstimator();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearExperimentalOptions() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearExperimentalOptions();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearHttp2Enabled() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearHttp2Enabled();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearHttpCacheMaxSize() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearHttpCacheMaxSize();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearHttpCacheMode() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearHttpCacheMode();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearMockCertVerifier() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearMockCertVerifier();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearNetworkThreadPriority() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearNetworkThreadPriority();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearQuicDefaultUserAgentId() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearQuicDefaultUserAgentId();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearQuicEnabled() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearQuicEnabled();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearStoragePath() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearStoragePath();
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder clearUserAgent() {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).clearUserAgent();
            return this;
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getBrotliEnabled() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getBrotliEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getBypassPublicKeyPinningForLocalTrustAnchors();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getDisableCache() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getDisableCache();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getEnableNetworkQualityEstimator() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getEnableNetworkQualityEstimator();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public java.lang.String getExperimentalOptions() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getExperimentalOptions();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.y getExperimentalOptionsBytes() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getExperimentalOptionsBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getHttp2Enabled() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getHttp2Enabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public long getHttpCacheMaxSize() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getHttpCacheMaxSize();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public int getHttpCacheMode() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getHttpCacheMode();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public long getMockCertVerifier() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getMockCertVerifier();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public int getNetworkThreadPriority() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getNetworkThreadPriority();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public java.lang.String getQuicDefaultUserAgentId() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.y getQuicDefaultUserAgentIdBytes() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getQuicDefaultUserAgentIdBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean getQuicEnabled() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getQuicEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public java.lang.String getStoragePath() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getStoragePath();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.y getStoragePathBytes() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getStoragePathBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public java.lang.String getUserAgent() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getUserAgent();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public com.google.protobuf.y getUserAgentBytes() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).getUserAgentBytes();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasBrotliEnabled() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasBrotliEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasBypassPublicKeyPinningForLocalTrustAnchors();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasDisableCache() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasDisableCache();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasEnableNetworkQualityEstimator() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasEnableNetworkQualityEstimator();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasExperimentalOptions() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasExperimentalOptions();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttp2Enabled() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasHttp2Enabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMaxSize() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasHttpCacheMaxSize();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasHttpCacheMode() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasHttpCacheMode();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasMockCertVerifier() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasMockCertVerifier();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasNetworkThreadPriority() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasNetworkThreadPriority();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicDefaultUserAgentId() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasQuicDefaultUserAgentId();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasQuicEnabled() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasQuicEnabled();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasStoragePath() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasStoragePath();
        }

        @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
        public boolean hasUserAgent() {
            return ((org.chromium.net.RequestContextConfigOptions) this.instance).hasUserAgent();
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setBrotliEnabled(boolean z17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setBrotliEnabled(z17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setBypassPublicKeyPinningForLocalTrustAnchors(boolean z17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setBypassPublicKeyPinningForLocalTrustAnchors(z17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setDisableCache(boolean z17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setDisableCache(z17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setEnableNetworkQualityEstimator(boolean z17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setEnableNetworkQualityEstimator(z17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setExperimentalOptions(java.lang.String str) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setExperimentalOptions(str);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setExperimentalOptionsBytes(com.google.protobuf.y yVar) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setExperimentalOptionsBytes(yVar);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setHttp2Enabled(boolean z17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setHttp2Enabled(z17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setHttpCacheMaxSize(long j17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setHttpCacheMaxSize(j17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setHttpCacheMode(int i17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setHttpCacheMode(i17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setMockCertVerifier(long j17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setMockCertVerifier(j17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setNetworkThreadPriority(int i17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setNetworkThreadPriority(i17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setQuicDefaultUserAgentId(java.lang.String str) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentId(str);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setQuicDefaultUserAgentIdBytes(com.google.protobuf.y yVar) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setQuicDefaultUserAgentIdBytes(yVar);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setQuicEnabled(boolean z17) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setQuicEnabled(z17);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setStoragePath(java.lang.String str) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setStoragePath(str);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setStoragePathBytes(com.google.protobuf.y yVar) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setStoragePathBytes(yVar);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setUserAgent(java.lang.String str) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setUserAgent(str);
            return this;
        }

        public org.chromium.net.RequestContextConfigOptions.Builder setUserAgentBytes(com.google.protobuf.y yVar) {
            copyOnWrite();
            ((org.chromium.net.RequestContextConfigOptions) this.instance).setUserAgentBytes(yVar);
            return this;
        }

        private Builder() {
            super(org.chromium.net.RequestContextConfigOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        org.chromium.net.RequestContextConfigOptions requestContextConfigOptions = new org.chromium.net.RequestContextConfigOptions();
        DEFAULT_INSTANCE = requestContextConfigOptions;
        com.google.protobuf.n5.registerDefaultInstance(org.chromium.net.RequestContextConfigOptions.class, requestContextConfigOptions);
    }

    private RequestContextConfigOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrotliEnabled() {
        this.bitField0_ &= -33;
        this.brotliEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBypassPublicKeyPinningForLocalTrustAnchors() {
        this.bitField0_ &= -4097;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableCache() {
        this.bitField0_ &= -65;
        this.disableCache_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableNetworkQualityEstimator() {
        this.bitField0_ &= -2049;
        this.enableNetworkQualityEstimator_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalOptions() {
        this.bitField0_ &= -513;
        this.experimentalOptions_ = getDefaultInstance().getExperimentalOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp2Enabled() {
        this.bitField0_ &= -17;
        this.http2Enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMaxSize() {
        this.bitField0_ &= -257;
        this.httpCacheMaxSize_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpCacheMode() {
        this.bitField0_ &= -129;
        this.httpCacheMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockCertVerifier() {
        this.bitField0_ &= -1025;
        this.mockCertVerifier_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkThreadPriority() {
        this.bitField0_ &= -8193;
        this.networkThreadPriority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicDefaultUserAgentId() {
        this.bitField0_ &= -9;
        this.quicDefaultUserAgentId_ = getDefaultInstance().getQuicDefaultUserAgentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuicEnabled() {
        this.bitField0_ &= -5;
        this.quicEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStoragePath() {
        this.bitField0_ &= -3;
        this.storagePath_ = getDefaultInstance().getStoragePath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAgent() {
        this.bitField0_ &= -2;
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    public static org.chromium.net.RequestContextConfigOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static org.chromium.net.RequestContextConfigOptions.Builder newBuilder() {
        return (org.chromium.net.RequestContextConfigOptions.Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static org.chromium.net.RequestContextConfigOptions parseDelimitedFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrotliEnabled(boolean z17) {
        this.bitField0_ |= 32;
        this.brotliEnabled_ = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBypassPublicKeyPinningForLocalTrustAnchors(boolean z17) {
        this.bitField0_ |= 4096;
        this.bypassPublicKeyPinningForLocalTrustAnchors_ = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCache(boolean z17) {
        this.bitField0_ |= 64;
        this.disableCache_ = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableNetworkQualityEstimator(boolean z17) {
        this.bitField0_ |= 2048;
        this.enableNetworkQualityEstimator_ = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptions(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.experimentalOptions_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalOptionsBytes(com.google.protobuf.y yVar) {
        this.experimentalOptions_ = yVar.r();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp2Enabled(boolean z17) {
        this.bitField0_ |= 16;
        this.http2Enabled_ = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMaxSize(long j17) {
        this.bitField0_ |= 256;
        this.httpCacheMaxSize_ = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpCacheMode(int i17) {
        this.bitField0_ |= 128;
        this.httpCacheMode_ = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockCertVerifier(long j17) {
        this.bitField0_ |= 1024;
        this.mockCertVerifier_ = j17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkThreadPriority(int i17) {
        this.bitField0_ |= 8192;
        this.networkThreadPriority_ = i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.quicDefaultUserAgentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicDefaultUserAgentIdBytes(com.google.protobuf.y yVar) {
        this.quicDefaultUserAgentId_ = yVar.r();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuicEnabled(boolean z17) {
        this.bitField0_ |= 4;
        this.quicEnabled_ = z17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePath(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.storagePath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoragePathBytes(com.google.protobuf.y yVar) {
        this.storagePath_ = yVar.r();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgent(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.userAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAgentBytes(com.google.protobuf.y yVar) {
        this.userAgent_ = yVar.r();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.n5
    public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (l5Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r", new java.lang.Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_"});
            case NEW_MUTABLE_INSTANCE:
                return new org.chromium.net.RequestContextConfigOptions();
            case NEW_BUILDER:
                return new org.chromium.net.RequestContextConfigOptions.Builder();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                com.google.protobuf.e9 e9Var = PARSER;
                if (e9Var == null) {
                    synchronized (org.chromium.net.RequestContextConfigOptions.class) {
                        e9Var = PARSER;
                        if (e9Var == null) {
                            e9Var = new com.google.protobuf.i5(DEFAULT_INSTANCE);
                            PARSER = e9Var;
                        }
                    }
                }
                return e9Var;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getBrotliEnabled() {
        return this.brotliEnabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getBypassPublicKeyPinningForLocalTrustAnchors() {
        return this.bypassPublicKeyPinningForLocalTrustAnchors_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getDisableCache() {
        return this.disableCache_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getEnableNetworkQualityEstimator() {
        return this.enableNetworkQualityEstimator_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public java.lang.String getExperimentalOptions() {
        return this.experimentalOptions_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.y getExperimentalOptionsBytes() {
        return com.google.protobuf.y.h(this.experimentalOptions_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getHttp2Enabled() {
        return this.http2Enabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public long getHttpCacheMaxSize() {
        return this.httpCacheMaxSize_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public int getHttpCacheMode() {
        return this.httpCacheMode_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public long getMockCertVerifier() {
        return this.mockCertVerifier_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public int getNetworkThreadPriority() {
        return this.networkThreadPriority_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public java.lang.String getQuicDefaultUserAgentId() {
        return this.quicDefaultUserAgentId_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.y getQuicDefaultUserAgentIdBytes() {
        return com.google.protobuf.y.h(this.quicDefaultUserAgentId_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean getQuicEnabled() {
        return this.quicEnabled_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public java.lang.String getStoragePath() {
        return this.storagePath_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.y getStoragePathBytes() {
        return com.google.protobuf.y.h(this.storagePath_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public java.lang.String getUserAgent() {
        return this.userAgent_;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public com.google.protobuf.y getUserAgentBytes() {
        return com.google.protobuf.y.h(this.userAgent_);
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasBrotliEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasBypassPublicKeyPinningForLocalTrustAnchors() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasDisableCache() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasEnableNetworkQualityEstimator() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasExperimentalOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttp2Enabled() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMaxSize() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasHttpCacheMode() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasMockCertVerifier() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasNetworkThreadPriority() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicDefaultUserAgentId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasQuicEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasStoragePath() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // org.chromium.net.RequestContextConfigOptionsOrBuilder
    public boolean hasUserAgent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static org.chromium.net.RequestContextConfigOptions.Builder newBuilder(org.chromium.net.RequestContextConfigOptions requestContextConfigOptions) {
        return (org.chromium.net.RequestContextConfigOptions.Builder) DEFAULT_INSTANCE.createBuilder(requestContextConfigOptions);
    }

    public static org.chromium.net.RequestContextConfigOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(com.google.protobuf.y yVar) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(byte[] bArr) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(com.google.protobuf.d0 d0Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
    }

    public static org.chromium.net.RequestContextConfigOptions parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.RequestContextConfigOptions) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
    }
}
