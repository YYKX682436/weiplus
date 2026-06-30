package org.chromium.net.impl;

/* loaded from: classes16.dex */
public abstract class CronetEngineBuilderImpl extends org.chromium.net.ICronetEngineBuilder {
    private static final java.util.regex.Pattern INVALID_PKP_HOST_NAME = java.util.regex.Pattern.compile("^[0-9\\.]*$");
    private static final int INVALID_THREAD_PRIORITY = 20;
    private final android.content.Context mApplicationContext;
    private boolean mBrotiEnabled;
    private boolean mDisableCache;
    private java.lang.String mExperimentalOptions;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode mHttpCacheMode;
    protected long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private java.lang.String mStoragePath;
    private java.lang.String mUserAgent;
    private final java.util.List<org.chromium.net.impl.CronetEngineBuilderImpl.QuicHint> mQuicHints = new java.util.LinkedList();
    private final java.util.List<org.chromium.net.impl.CronetEngineBuilderImpl.Pkp> mPkps = new java.util.LinkedList();
    private int mThreadPriority = 20;

    /* renamed from: org.chromium.net.impl.CronetEngineBuilderImpl$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode;

        static {
            int[] iArr = new int[org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode.values().length];
            $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode = iArr;
            try {
                iArr[org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode.DISABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode.DISK_NO_HTTP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode.DISK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode.MEMORY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);

        private final boolean mContentCacheEnabled;
        private final int mType;

        HttpCacheMode(int i17, boolean z17) {
            this.mContentCacheEnabled = z17;
            this.mType = i17;
        }

        public static org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode fromPublicBuilderCacheMode(int i17) {
            if (i17 == 0) {
                return DISABLED;
            }
            if (i17 == 1) {
                return MEMORY;
            }
            if (i17 == 2) {
                return DISK_NO_HTTP;
            }
            if (i17 == 3) {
                return DISK;
            }
            throw new java.lang.IllegalArgumentException("Unknown public builder cache mode");
        }

        public int getType() {
            return this.mType;
        }

        public boolean isContentCacheEnabled() {
            return this.mContentCacheEnabled;
        }

        public int toPublicBuilderCacheMode() {
            int i17 = org.chromium.net.impl.CronetEngineBuilderImpl.AnonymousClass1.$SwitchMap$org$chromium$net$impl$CronetEngineBuilderImpl$HttpCacheMode[ordinal()];
            if (i17 == 1) {
                return 0;
            }
            int i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    if (i17 == 4) {
                        return 1;
                    }
                    throw new java.lang.IllegalArgumentException("Unknown internal builder cache mode");
                }
            }
            return i18;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface HttpCacheSetting {
    }

    /* loaded from: classes16.dex */
    public static class Pkp {
        final java.util.Date mExpirationDate;
        final byte[][] mHashes;
        final java.lang.String mHost;
        final boolean mIncludeSubdomains;

        public Pkp(java.lang.String str, byte[][] bArr, boolean z17, java.util.Date date) {
            this.mHost = str;
            this.mHashes = bArr;
            this.mIncludeSubdomains = z17;
            this.mExpirationDate = date;
        }
    }

    /* loaded from: classes16.dex */
    public static class QuicHint {
        final int mAlternatePort;
        final java.lang.String mHost;
        final int mPort;

        public QuicHint(java.lang.String str, int i17, int i18) {
            this.mHost = str;
            this.mPort = i17;
            this.mAlternatePort = i18;
        }
    }

    public CronetEngineBuilderImpl(android.content.Context context) {
        this.mApplicationContext = context.getApplicationContext();
        enableQuic(true);
        enableHttp2(true);
        enableBrotli(false);
        enableHttpCache(0, 0L);
        enableNetworkQualityEstimator(false);
        enablePublicKeyPinningBypassForLocalTrustAnchors(true);
    }

    private static java.lang.String validateHostNameForPinningAndConvert(java.lang.String str) {
        if (INVALID_PKP_HOST_NAME.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        }
        if (str.length() > 255) {
            throw new java.lang.IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
        try {
            return java.net.IDN.toASCII(str, 2);
        } catch (java.lang.IllegalArgumentException unused) {
            throw new java.lang.IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z17, java.util.Date date) {
        return addPublicKeyPins(str, (java.util.Set<byte[]>) set, z17, date);
    }

    public boolean brotliEnabled() {
        return this.mBrotiEnabled;
    }

    public boolean cacheDisabled() {
        return !this.mHttpCacheMode.isContentCacheEnabled();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enableSdch(boolean z17) {
        return this;
    }

    public java.lang.String experimentalOptions() {
        return this.mExperimentalOptions;
    }

    public android.content.Context getContext() {
        return this.mApplicationContext;
    }

    public java.lang.String getDefaultQuicUserAgentId() {
        return this.mQuicEnabled ? org.chromium.net.impl.UserAgent.getQuicUserAgentIdFrom(this.mApplicationContext) : "";
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public java.lang.String getDefaultUserAgent() {
        return org.chromium.net.impl.UserAgent.from(this.mApplicationContext);
    }

    public java.lang.String getUserAgent() {
        return this.mUserAgent;
    }

    public boolean http2Enabled() {
        return this.mHttp2Enabled;
    }

    public long httpCacheMaxSize() {
        return this.mHttpCacheMaxSize;
    }

    public int httpCacheMode() {
        return this.mHttpCacheMode.getType();
    }

    public org.chromium.net.impl.VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return null;
    }

    public long mockCertVerifier() {
        return this.mMockCertVerifier;
    }

    public boolean networkQualityEstimatorEnabled() {
        return this.mNetworkQualityEstimatorEnabled;
    }

    public int publicBuilderHttpCacheMode() {
        return this.mHttpCacheMode.toPublicBuilderCacheMode();
    }

    public boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled() {
        return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    }

    public java.util.List<org.chromium.net.impl.CronetEngineBuilderImpl.Pkp> publicKeyPins() {
        return this.mPkps;
    }

    public boolean quicEnabled() {
        return this.mQuicEnabled;
    }

    public java.util.List<org.chromium.net.impl.CronetEngineBuilderImpl.QuicHint> quicHints() {
        return this.mQuicHints;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    public org.chromium.net.impl.CronetEngineBuilderImpl setMockCertVerifierForTesting(long j17) {
        this.mMockCertVerifier = j17;
        return this;
    }

    public java.lang.String storagePath() {
        return this.mStoragePath;
    }

    public int threadPriority(int i17) {
        int i18 = this.mThreadPriority;
        return i18 == 20 ? i17 : i18;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
        if (str == null) {
            throw new java.lang.NullPointerException("The hostname cannot be null");
        }
        if (set == null) {
            throw new java.lang.NullPointerException("The set of SHA256 pins cannot be null");
        }
        if (date != null) {
            java.lang.String validateHostNameForPinningAndConvert = validateHostNameForPinningAndConvert(str);
            java.util.HashMap hashMap = new java.util.HashMap();
            for (byte[] bArr : set) {
                if (bArr != null && bArr.length == 32) {
                    hashMap.put(android.util.Base64.encodeToString(bArr, 0), bArr);
                } else {
                    throw new java.lang.IllegalArgumentException("Public key pin is invalid");
                }
            }
            this.mPkps.add(new org.chromium.net.impl.CronetEngineBuilderImpl.Pkp(validateHostNameForPinningAndConvert, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()]), z17, date));
            return this;
        }
        throw new java.lang.NullPointerException("The pin expiration date cannot be null");
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl addQuicHint(java.lang.String str, int i17, int i18) {
        if (!str.contains("/")) {
            this.mQuicHints.add(new org.chromium.net.impl.CronetEngineBuilderImpl.QuicHint(str, i17, i18));
            return this;
        }
        throw new java.lang.IllegalArgumentException("Illegal QUIC Hint Host: ".concat(str));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enableBrotli(boolean z17) {
        this.mBrotiEnabled = z17;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enableHttp2(boolean z17) {
        this.mHttp2Enabled = z17;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enableHttpCache(int i17, long j17) {
        org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode fromPublicBuilderCacheMode = org.chromium.net.impl.CronetEngineBuilderImpl.HttpCacheMode.fromPublicBuilderCacheMode(i17);
        if (fromPublicBuilderCacheMode.getType() == 1 && storagePath() == null) {
            throw new java.lang.IllegalArgumentException("Storage path must be set");
        }
        this.mHttpCacheMode = fromPublicBuilderCacheMode;
        this.mHttpCacheMaxSize = j17;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enableNetworkQualityEstimator(boolean z17) {
        this.mNetworkQualityEstimatorEnabled = z17;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z17) {
        this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = z17;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl enableQuic(boolean z17) {
        this.mQuicEnabled = z17;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl setExperimentalOptions(java.lang.String str) {
        this.mExperimentalOptions = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl setStoragePath(java.lang.String str) {
        if (new java.io.File(str).isDirectory()) {
            this.mStoragePath = str;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Storage path must be set to existing directory");
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl setThreadPriority(int i17) {
        if (i17 <= 19 && i17 >= -20) {
            this.mThreadPriority = i17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Thread priority invalid");
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl setUserAgent(java.lang.String str) {
        this.mUserAgent = str;
        return this;
    }
}
