package org.chromium.net.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CronetUrlRequestJni implements org.chromium.net.impl.CronetUrlRequest.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.impl.CronetUrlRequestJni.1
        public void setInstanceForTesting(org.chromium.net.impl.CronetUrlRequest.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.impl.CronetUrlRequestJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.impl.CronetUrlRequest.Natives testInstance;

    public static org.chromium.net.impl.CronetUrlRequest.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.impl.CronetUrlRequest.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetUrlRequest.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.impl.CronetUrlRequestJni();
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean addRequestHeader(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, java.lang.String str, java.lang.String str2) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_addRequestHeader(j17, cronetUrlRequest, str, str2);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public long createRequestAdapter(org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, long j17, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, int i18, boolean z27, int i19, int i27, long j18) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_createRequestAdapter(cronetUrlRequest, j17, str, i17, z17, z18, z19, i18, z27, i19, i27, j18);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void destroy(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_destroy(j17, cronetUrlRequest, z17);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void followDeferredRedirect(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_followDeferredRedirect(j17, cronetUrlRequest);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void getStatus(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_getStatus(j17, cronetUrlRequest, urlRequestStatusListener);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean readData(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_readData(j17, cronetUrlRequest, byteBuffer, i17, i18);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public boolean setHttpMethod(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_setHttpMethod(j17, cronetUrlRequest, str);
    }

    @Override // org.chromium.net.impl.CronetUrlRequest.Natives
    public void start(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUrlRequest_start(j17, cronetUrlRequest);
    }
}
