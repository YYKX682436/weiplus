package org.chromium.net;

@java.lang.Deprecated
/* loaded from: classes16.dex */
public abstract class ExperimentalCronetEngine extends org.chromium.net.CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    public static final long UNBIND_NETWORK_HANDLE = -1;

    /* loaded from: classes16.dex */
    public static class Builder extends org.chromium.net.CronetEngine.Builder {
        public Builder(android.content.Context context) {
            super(context);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z17, java.util.Date date) {
            return addPublicKeyPins(str, (java.util.Set<byte[]>) set, z17, date);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableSdch(boolean z17) {
            return this;
        }

        public org.chromium.net.ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public org.chromium.net.ExperimentalCronetEngine.Builder setExperimentalOptions(java.lang.String str) {
            this.mBuilderDelegate.setExperimentalOptions(str);
            return this;
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
            super.addPublicKeyPins(str, set, z17, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder addQuicHint(java.lang.String str, int i17, int i18) {
            super.addQuicHint(str, i17, i18);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttp2(boolean z17) {
            super.enableHttp2(z17);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableHttpCache(int i17, long j17) {
            super.enableHttpCache(i17, j17);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableNetworkQualityEstimator(boolean z17) {
            super.enableNetworkQualityEstimator(z17);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z17) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z17);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder enableQuic(boolean z17) {
            super.enableQuic(z17);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
            super.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setDnsOptions(org.chromium.net.DnsOptions dnsOptions) {
            super.setDnsOptions(dnsOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setQuicOptions(org.chromium.net.QuicOptions quicOptions) {
            super.setQuicOptions(quicOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setStoragePath(java.lang.String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setThreadPriority(int i17) {
            super.setThreadPriority(i17);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public org.chromium.net.ExperimentalCronetEngine.Builder setUserAgent(java.lang.String str) {
            super.setUserAgent(str);
            return this;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public abstract org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        return url.openConnection(proxy);
    }
}
