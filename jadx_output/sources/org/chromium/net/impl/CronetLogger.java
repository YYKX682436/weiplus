package org.chromium.net.impl;

/* loaded from: classes16.dex */
public abstract class CronetLogger {

    /* loaded from: classes16.dex */
    public static class CronetEngineBuilderInfo {
        private final boolean mBrotiEnabled;
        private final java.lang.String mExperimentalOptions;
        private final boolean mHttp2Enabled;
        private final int mHttpCacheMode;
        private final boolean mNetworkQualityEstimatorEnabled;
        private final boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
        private final boolean mQuicEnabled;
        private final java.lang.String mStoragePath;
        private final int mThreadPriority;
        private final java.lang.String mUserAgent;

        public CronetEngineBuilderInfo(org.chromium.net.impl.CronetEngineBuilderImpl cronetEngineBuilderImpl) {
            this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled();
            this.mUserAgent = cronetEngineBuilderImpl.getUserAgent();
            this.mStoragePath = cronetEngineBuilderImpl.storagePath();
            this.mQuicEnabled = cronetEngineBuilderImpl.quicEnabled();
            this.mHttp2Enabled = cronetEngineBuilderImpl.http2Enabled();
            this.mBrotiEnabled = cronetEngineBuilderImpl.brotliEnabled();
            this.mHttpCacheMode = cronetEngineBuilderImpl.publicBuilderHttpCacheMode();
            this.mExperimentalOptions = cronetEngineBuilderImpl.experimentalOptions();
            this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
            this.mThreadPriority = cronetEngineBuilderImpl.threadPriority(10);
        }

        public java.lang.String getExperimentalOptions() {
            return this.mExperimentalOptions;
        }

        public int getHttpCacheMode() {
            return this.mHttpCacheMode;
        }

        public java.lang.String getStoragePath() {
            return this.mStoragePath;
        }

        public int getThreadPriority() {
            return this.mThreadPriority;
        }

        public java.lang.String getUserAgent() {
            return this.mUserAgent;
        }

        public boolean isBrotliEnabled() {
            return this.mBrotiEnabled;
        }

        public boolean isHttp2Enabled() {
            return this.mHttp2Enabled;
        }

        public boolean isNetworkQualityEstimatorEnabled() {
            return this.mNetworkQualityEstimatorEnabled;
        }

        public boolean isPublicKeyPinningBypassForLocalTrustAnchorsEnabled() {
            return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
        }

        public boolean isQuicEnabled() {
            return this.mQuicEnabled;
        }
    }

    /* loaded from: classes13.dex */
    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK,
        CRONET_SOURCE_PLATFORM
    }

    /* loaded from: classes16.dex */
    public static class CronetTrafficInfo {
        private final boolean mDidConnectionMigrationSucceed;
        private final java.time.Duration mHeadersLatency;
        private final java.lang.String mNegotiatedProtocol;
        private final long mRequestBodySizeInBytes;
        private final long mRequestHeaderSizeInBytes;
        private final long mResponseBodySizeInBytes;
        private final long mResponseHeaderSizeInBytes;
        private final int mResponseStatusCode;
        private final java.time.Duration mTotalLatency;
        private final boolean mWasConnectionMigrationAttempted;

        public CronetTrafficInfo(long j17, long j18, long j19, long j27, int i17, java.time.Duration duration, java.time.Duration duration2, java.lang.String str, boolean z17, boolean z18) {
            this.mRequestHeaderSizeInBytes = j17;
            this.mRequestBodySizeInBytes = j18;
            this.mResponseHeaderSizeInBytes = j19;
            this.mResponseBodySizeInBytes = j27;
            this.mResponseStatusCode = i17;
            this.mHeadersLatency = duration;
            this.mTotalLatency = duration2;
            this.mNegotiatedProtocol = str;
            this.mWasConnectionMigrationAttempted = z17;
            this.mDidConnectionMigrationSucceed = z18;
        }

        public boolean didConnectionMigrationSucceed() {
            return this.mDidConnectionMigrationSucceed;
        }

        public java.time.Duration getHeadersLatency() {
            return this.mHeadersLatency;
        }

        public java.lang.String getNegotiatedProtocol() {
            return this.mNegotiatedProtocol;
        }

        public long getRequestBodySizeInBytes() {
            return this.mRequestBodySizeInBytes;
        }

        public long getRequestHeaderSizeInBytes() {
            return this.mRequestHeaderSizeInBytes;
        }

        public long getResponseBodySizeInBytes() {
            return this.mResponseBodySizeInBytes;
        }

        public long getResponseHeaderSizeInBytes() {
            return this.mResponseHeaderSizeInBytes;
        }

        public int getResponseStatusCode() {
            return this.mResponseStatusCode;
        }

        public java.time.Duration getTotalLatency() {
            return this.mTotalLatency;
        }

        public boolean wasConnectionMigrationAttempted() {
            return this.mWasConnectionMigrationAttempted;
        }
    }

    /* loaded from: classes4.dex */
    public static class CronetVersion {
        private final int mBuildVersion;
        private final int mMajorVersion;
        private final int mMinorVersion;
        private final int mPatchVersion;

        public CronetVersion(java.lang.String str) {
            java.lang.String[] split = str.split("\\.");
            this.mMajorVersion = java.lang.Integer.parseInt(split[0]);
            this.mMinorVersion = java.lang.Integer.parseInt(split[1]);
            this.mBuildVersion = java.lang.Integer.parseInt(split[2]);
            this.mPatchVersion = java.lang.Integer.parseInt(split[3]);
        }

        public int getBuildVersion() {
            return this.mBuildVersion;
        }

        public int getMajorVersion() {
            return this.mMajorVersion;
        }

        public int getMinorVersion() {
            return this.mMinorVersion;
        }

        public int getPatchVersion() {
            return this.mPatchVersion;
        }

        public java.lang.String toString() {
            return this.mMajorVersion + "." + this.mMinorVersion + "." + this.mBuildVersion + "." + this.mPatchVersion;
        }
    }

    public abstract void logCronetEngineCreation(int i17, org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo cronetEngineBuilderInfo, org.chromium.net.impl.CronetLogger.CronetVersion cronetVersion, org.chromium.net.impl.CronetLogger.CronetSource cronetSource);

    public abstract void logCronetTrafficInfo(int i17, org.chromium.net.impl.CronetLogger.CronetTrafficInfo cronetTrafficInfo);
}
