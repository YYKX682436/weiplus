package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CpuFeaturesJni implements org.chromium.base.CpuFeatures.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.CpuFeaturesJni.1
        public void setInstanceForTesting(org.chromium.base.CpuFeatures.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.CpuFeaturesJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.CpuFeatures.Natives testInstance;

    public static org.chromium.base.CpuFeatures.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.CpuFeatures.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CpuFeatures.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.CpuFeaturesJni();
    }

    @Override // org.chromium.base.CpuFeatures.Natives
    public int getCoreCount() {
        return org.jni_zero.GEN_JNI.org_chromium_base_CpuFeatures_getCoreCount();
    }

    @Override // org.chromium.base.CpuFeatures.Natives
    public long getCpuFeatures() {
        return org.jni_zero.GEN_JNI.org_chromium_base_CpuFeatures_getCpuFeatures();
    }
}
