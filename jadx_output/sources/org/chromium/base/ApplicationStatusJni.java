package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class ApplicationStatusJni implements org.chromium.base.ApplicationStatus.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.ApplicationStatusJni.1
        public void setInstanceForTesting(org.chromium.base.ApplicationStatus.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.ApplicationStatusJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.ApplicationStatus.Natives testInstance;

    public static org.chromium.base.ApplicationStatus.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.ApplicationStatus.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of ApplicationStatus.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.ApplicationStatusJni();
    }

    @Override // org.chromium.base.ApplicationStatus.Natives
    public void onApplicationStateChange(int i17) {
        org.jni_zero.GEN_JNI.org_chromium_base_ApplicationStatus_onApplicationStateChange(i17);
    }
}
