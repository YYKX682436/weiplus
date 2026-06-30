package org.chromium.net;

/* loaded from: classes16.dex */
public abstract class ICronetEngineBuilder {
    public static final int CONNECTION_MIGRATION_OPTIONS = 1;
    public static final int DNS_OPTIONS = 2;
    public static final int QUIC_OPTIONS = 3;

    public abstract org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date);

    public abstract org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i17, int i18);

    public abstract org.chromium.net.ExperimentalCronetEngine build();

    public org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z17) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z17);

    public abstract org.chromium.net.ICronetEngineBuilder enableHttpCache(int i17, long j17);

    public org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z17) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z17);

    public abstract org.chromium.net.ICronetEngineBuilder enableQuic(boolean z17);

    public abstract org.chromium.net.ICronetEngineBuilder enableSdch(boolean z17);

    public abstract java.lang.String getDefaultUserAgent();

    public java.util.Set<java.lang.Integer> getSupportedConfigOptions() {
        return java.util.Collections.emptySet();
    }

    public org.chromium.net.ICronetEngineBuilder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
        return this;
    }

    public org.chromium.net.ICronetEngineBuilder setDnsOptions(org.chromium.net.DnsOptions dnsOptions) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str);

    public abstract org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader);

    public org.chromium.net.ICronetEngineBuilder setQuicOptions(org.chromium.net.QuicOptions quicOptions) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str);

    public org.chromium.net.ICronetEngineBuilder setThreadPriority(int i17) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str);
}
