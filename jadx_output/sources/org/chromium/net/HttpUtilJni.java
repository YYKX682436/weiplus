package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class HttpUtilJni implements org.chromium.net.HttpUtil.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.HttpUtilJni.1
        public void setInstanceForTesting(org.chromium.net.HttpUtil.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.HttpUtilJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.HttpUtil.Natives testInstance;

    public static org.chromium.net.HttpUtil.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.HttpUtil.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of HttpUtil.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.HttpUtilJni();
    }

    @Override // org.chromium.net.HttpUtil.Natives
    public boolean isAllowedHeader(java.lang.String str, java.lang.String str2) {
        return org.jni_zero.GEN_JNI.org_chromium_net_HttpUtil_isAllowedHeader(str, str2);
    }
}
