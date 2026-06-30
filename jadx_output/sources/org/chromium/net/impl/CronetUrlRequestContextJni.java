package org.chromium.net.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CronetUrlRequestContextJni implements org.chromium.net.impl.CronetUrlRequestContext.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.impl.CronetUrlRequestContextJni.1
        public void setInstanceForTesting(org.chromium.net.impl.CronetUrlRequestContext.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.impl.CronetUrlRequestContextJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.impl.CronetUrlRequestContext.Natives testInstance;

    public static org.chromium.net.impl.CronetUrlRequestContext.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.impl.CronetUrlRequestContext.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetUrlRequestContext.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.impl.CronetUrlRequestContextJni();
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addPkp(long j17, java.lang.String str, byte[][] bArr, boolean z17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addPkp(j17, str, bArr, z17, j18);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void addQuicHint(long j17, java.lang.String str, int i17, int i18) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_addQuicHint(j17, str, i17, i18);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void configureNetworkQualityEstimatorForTesting(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, boolean z17, boolean z18, boolean z19) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_configureNetworkQualityEstimatorForTesting(j17, cronetUrlRequestContext, z17, z18, z19);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextAdapter(long j17) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextAdapter(j17);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public long createRequestContextConfig(byte[] bArr) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_createRequestContextConfig(bArr);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void destroy(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_destroy(j17, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean getEnableTelemetry(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_getEnableTelemetry(j17, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public byte[] getHistogramDeltas() {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_getHistogramDeltas();
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void initRequestContextOnInitThread(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_initRequestContextOnInitThread(j17, cronetUrlRequestContext);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideRTTObservations(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideRTTObservations(j17, cronetUrlRequestContext, z17);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void provideThroughputObservations(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_provideThroughputObservations(j17, cronetUrlRequestContext, z17);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void startNetLogToDisk(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, java.lang.String str, boolean z17, int i17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToDisk(j17, cronetUrlRequestContext, str, z17, i17);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public boolean startNetLogToFile(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, java.lang.String str, boolean z17) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_startNetLogToFile(j17, cronetUrlRequestContext, str, z17);
    }

    @Override // org.chromium.net.impl.CronetUrlRequestContext.Natives
    public void stopNetLog(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequestContext_stopNetLog(j17, cronetUrlRequestContext);
    }
}
