package org.chromium.net;

/* loaded from: classes16.dex */
public final class DnsOptions {
    private final java.lang.Boolean mEnableStaleDns;
    private final java.lang.Boolean mPersistHostCache;
    private final java.lang.Long mPersistHostCachePeriodMillis;
    private final java.lang.Boolean mPreestablishConnectionsToStaleDnsResults;
    private final org.chromium.net.DnsOptions.StaleDnsOptions mStaleDnsOptions;
    private final java.lang.Boolean mUseBuiltInDnsResolver;

    /* loaded from: classes16.dex */
    public static final class Builder {
        private java.lang.Boolean mEnableStaleDns;
        private java.lang.Boolean mPersistHostCache;
        private java.lang.Long mPersistHostCachePeriodMillis;
        private java.lang.Boolean mPreestablishConnectionsToStaleDnsResults;
        private org.chromium.net.DnsOptions.StaleDnsOptions mStaleDnsOptions;
        private java.lang.Boolean mUseBuiltInDnsResolver;

        public org.chromium.net.DnsOptions build() {
            return new org.chromium.net.DnsOptions(this);
        }

        public org.chromium.net.DnsOptions.Builder enableStaleDns(boolean z17) {
            this.mEnableStaleDns = java.lang.Boolean.valueOf(z17);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder persistHostCache(boolean z17) {
            this.mPersistHostCache = java.lang.Boolean.valueOf(z17);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder preestablishConnectionsToStaleDnsResults(boolean z17) {
            this.mPreestablishConnectionsToStaleDnsResults = java.lang.Boolean.valueOf(z17);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setPersistDelay(java.time.Duration duration) {
            return setPersistHostCachePeriodMillis(duration.toMillis());
        }

        public org.chromium.net.DnsOptions.Builder setPersistHostCachePeriodMillis(long j17) {
            this.mPersistHostCachePeriodMillis = java.lang.Long.valueOf(j17);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setStaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions staleDnsOptions) {
            this.mStaleDnsOptions = staleDnsOptions;
            return this;
        }

        public org.chromium.net.DnsOptions.Builder useBuiltInDnsResolver(boolean z17) {
            this.mUseBuiltInDnsResolver = java.lang.Boolean.valueOf(z17);
            return this;
        }

        public org.chromium.net.DnsOptions.Builder setStaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder) {
            return setStaleDnsOptions(builder.build());
        }
    }

    /* loaded from: classes16.dex */
    public @interface Experimental {
    }

    /* loaded from: classes16.dex */
    public static class StaleDnsOptions {
        private final java.lang.Boolean mAllowCrossNetworkUsage;
        private final java.lang.Long mFreshLookupTimeoutMillis;
        private final java.lang.Long mMaxExpiredDelayMillis;
        private final java.lang.Boolean mUseStaleOnNameNotResolved;

        /* loaded from: classes16.dex */
        public static final class Builder {
            private java.lang.Boolean mAllowCrossNetworkUsage;
            private java.lang.Long mFreshLookupTimeoutMillis;
            private java.lang.Long mMaxExpiredDelayMillis;
            private java.lang.Boolean mUseStaleOnNameNotResolved;

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage(boolean z17) {
                this.mAllowCrossNetworkUsage = java.lang.Boolean.valueOf(z17);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions build() {
                return new org.chromium.net.DnsOptions.StaleDnsOptions(this);
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeout(java.time.Duration duration) {
                return setFreshLookupTimeoutMillis(duration.toMillis());
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeoutMillis(long j17) {
                this.mFreshLookupTimeoutMillis = java.lang.Long.valueOf(j17);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelayMillis(long j17) {
                this.mMaxExpiredDelayMillis = java.lang.Long.valueOf(j17);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder useStaleOnNameNotResolved(boolean z17) {
                this.mUseStaleOnNameNotResolved = java.lang.Boolean.valueOf(z17);
                return this;
            }

            public org.chromium.net.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelayMillis(java.time.Duration duration) {
                return setMaxExpiredDelayMillis(duration.toMillis());
            }
        }

        public StaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder) {
            this.mFreshLookupTimeoutMillis = builder.mFreshLookupTimeoutMillis;
            this.mMaxExpiredDelayMillis = builder.mMaxExpiredDelayMillis;
            this.mAllowCrossNetworkUsage = builder.mAllowCrossNetworkUsage;
            this.mUseStaleOnNameNotResolved = builder.mUseStaleOnNameNotResolved;
        }

        public static org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder() {
            return new org.chromium.net.DnsOptions.StaleDnsOptions.Builder();
        }

        public java.lang.Boolean getAllowCrossNetworkUsage() {
            return this.mAllowCrossNetworkUsage;
        }

        public java.lang.Long getFreshLookupTimeoutMillis() {
            return this.mFreshLookupTimeoutMillis;
        }

        public java.lang.Long getMaxExpiredDelayMillis() {
            return this.mMaxExpiredDelayMillis;
        }

        public java.lang.Boolean getUseStaleOnNameNotResolved() {
            return this.mUseStaleOnNameNotResolved;
        }
    }

    public DnsOptions(org.chromium.net.DnsOptions.Builder builder) {
        this.mEnableStaleDns = builder.mEnableStaleDns;
        this.mStaleDnsOptions = builder.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = builder.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = builder.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = builder.mUseBuiltInDnsResolver;
        this.mPersistHostCache = builder.mPersistHostCache;
    }

    public static org.chromium.net.DnsOptions.Builder builder() {
        return new org.chromium.net.DnsOptions.Builder();
    }

    public java.lang.Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    public java.lang.Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    public java.lang.Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    public java.lang.Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    public org.chromium.net.DnsOptions.StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    public java.lang.Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }
}
