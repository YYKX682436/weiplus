package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class PathServiceJni implements org.chromium.base.PathService.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.PathServiceJni.1
        public void setInstanceForTesting(org.chromium.base.PathService.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.PathServiceJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.PathService.Natives testInstance;

    public static org.chromium.base.PathService.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.PathService.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of PathService.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.PathServiceJni();
    }

    @Override // org.chromium.base.PathService.Natives
    public void override(int i17, java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_base_PathService_override(i17, str);
    }
}
