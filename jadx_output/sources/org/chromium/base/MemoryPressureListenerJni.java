package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class MemoryPressureListenerJni implements org.chromium.base.MemoryPressureListener.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.MemoryPressureListenerJni.1
        public void setInstanceForTesting(org.chromium.base.MemoryPressureListener.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.MemoryPressureListenerJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.MemoryPressureListener.Natives testInstance;

    public static org.chromium.base.MemoryPressureListener.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.MemoryPressureListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of MemoryPressureListener.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.MemoryPressureListenerJni();
    }

    @Override // org.chromium.base.MemoryPressureListener.Natives
    public void onMemoryPressure(int i17) {
        org.jni_zero.GEN_JNI.org_chromium_base_MemoryPressureListener_onMemoryPressure(i17);
    }
}
