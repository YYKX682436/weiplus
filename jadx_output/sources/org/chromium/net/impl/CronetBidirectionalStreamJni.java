package org.chromium.net.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CronetBidirectionalStreamJni implements org.chromium.net.impl.CronetBidirectionalStream.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.impl.CronetBidirectionalStreamJni.1
        public void setInstanceForTesting(org.chromium.net.impl.CronetBidirectionalStream.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.impl.CronetBidirectionalStreamJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.impl.CronetBidirectionalStream.Natives testInstance;

    public static org.chromium.net.impl.CronetBidirectionalStream.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.impl.CronetBidirectionalStream.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CronetBidirectionalStream.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.impl.CronetBidirectionalStreamJni();
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public long createBidirectionalStream(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, long j17, boolean z17, boolean z18, int i17, boolean z19, int i18, long j18) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_createBidirectionalStream(cronetBidirectionalStream, j17, z17, z18, i17, z19, i18, j18);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void destroy(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_destroy(j17, cronetBidirectionalStream, z17);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean readData(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_readData(j17, cronetBidirectionalStream, byteBuffer, i17, i18);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public void sendRequestHeaders(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream) {
        org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_sendRequestHeaders(j17, cronetBidirectionalStream);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public int start(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_start(j17, cronetBidirectionalStream, str, i17, str2, strArr, z17);
    }

    @Override // org.chromium.net.impl.CronetBidirectionalStream.Natives
    public boolean writevData(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z17) {
        return org.jni_zero.GEN_JNI.org_chromium_net_impl_CronetBidirectionalStream_writevData(j17, cronetBidirectionalStream, byteBufferArr, iArr, iArr2, z17);
    }
}
