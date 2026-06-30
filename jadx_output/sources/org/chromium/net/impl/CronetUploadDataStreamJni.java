package org.chromium.net.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CronetUploadDataStreamJni implements org.chromium.net.impl.CronetUploadDataStream.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.impl.CronetUploadDataStreamJni.1
        public void setInstanceForTesting(org.chromium.net.impl.CronetUploadDataStream.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.impl.CronetUploadDataStreamJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.impl.CronetUploadDataStream.Natives testInstance;

    public static org.chromium.net.impl.CronetUploadDataStream.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.impl.CronetUploadDataStream.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetUploadDataStream.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.impl.CronetUploadDataStreamJni();
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long attachUploadDataToRequest(org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream, long j17, long j18) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_attachUploadDataToRequest(cronetUploadDataStream, j17, j18);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createAdapterForTesting(org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createAdapterForTesting(cronetUploadDataStream);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public long createUploadDataStreamForTesting(org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream, long j17, long j18) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_createUploadDataStreamForTesting(cronetUploadDataStream, j17, j18);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void destroy(long j17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_destroy(j17);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onReadSucceeded(long j17, org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream, int i17, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onReadSucceeded(j17, cronetUploadDataStream, i17, z17);
    }

    @Override // org.chromium.net.impl.CronetUploadDataStream.Natives
    public void onRewindSucceeded(long j17, org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetUploadDataStream_onRewindSucceeded(j17, cronetUploadDataStream);
    }
}
