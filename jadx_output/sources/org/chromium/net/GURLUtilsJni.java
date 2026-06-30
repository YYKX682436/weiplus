package org.chromium.net;

/* loaded from: classes16.dex */
public class GURLUtilsJni implements org.chromium.net.GURLUtils.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.GURLUtilsJni.1
        public void setInstanceForTesting(org.chromium.net.GURLUtils.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.GURLUtilsJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.GURLUtils.Natives testInstance;

    public static org.chromium.net.GURLUtils.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.GURLUtils.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of GURLUtils.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.GURLUtilsJni();
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public java.lang.String getOrigin(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_net_GURLUtils_getOrigin(str);
    }
}
