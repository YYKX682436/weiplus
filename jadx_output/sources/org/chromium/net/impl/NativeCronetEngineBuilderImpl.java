package org.chromium.net.impl;

/* loaded from: classes16.dex */
public class NativeCronetEngineBuilderImpl extends org.chromium.net.impl.CronetEngineBuilderImpl {
    public NativeCronetEngineBuilderImpl(android.content.Context context) {
        super(context);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set set, boolean z17, java.util.Date date) {
        return super.addPublicKeyPins(str, (java.util.Set<byte[]>) set, z17, date);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i17, int i18) {
        return super.addQuicHint(str, i17, i18);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ExperimentalCronetEngine build() {
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext = new org.chromium.net.impl.CronetUrlRequestContext(this);
        this.mMockCertVerifier = 0L;
        return cronetUrlRequestContext;
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z17) {
        return super.enableBrotli(z17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z17) {
        return super.enableHttp2(z17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableHttpCache(int i17, long j17) {
        return super.enableHttpCache(i17, j17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z17) {
        return super.enableNetworkQualityEstimator(z17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z17) {
        return super.enablePublicKeyPinningBypassForLocalTrustAnchors(z17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableQuic(boolean z17) {
        return super.enableQuic(z17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder enableSdch(boolean z17) {
        return super.enableSdch(z17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str) {
        return super.setExperimentalOptions(str);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
        return super.setLibraryLoader(libraryLoader);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str) {
        return super.setStoragePath(str);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setThreadPriority(int i17) {
        return super.setThreadPriority(i17);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str) {
        return super.setUserAgent(str);
    }
}
