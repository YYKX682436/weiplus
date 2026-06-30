package org.chromium.base;

/* loaded from: classes16.dex */
public class FileUtilsJni implements org.chromium.base.FileUtils.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.FileUtilsJni.1
        public void setInstanceForTesting(org.chromium.base.FileUtils.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.FileUtilsJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.FileUtils.Natives testInstance;

    public static org.chromium.base.FileUtils.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.FileUtils.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of FileUtils.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.FileUtilsJni();
    }

    @Override // org.chromium.base.FileUtils.Natives
    public java.lang.String getAbsoluteFilePath(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_base_FileUtils_getAbsoluteFilePath(str);
    }
}
