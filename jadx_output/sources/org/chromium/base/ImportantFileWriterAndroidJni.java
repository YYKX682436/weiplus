package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class ImportantFileWriterAndroidJni implements org.chromium.base.ImportantFileWriterAndroid.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.ImportantFileWriterAndroidJni.1
        public void setInstanceForTesting(org.chromium.base.ImportantFileWriterAndroid.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.ImportantFileWriterAndroidJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.ImportantFileWriterAndroid.Natives testInstance;

    public static org.chromium.base.ImportantFileWriterAndroid.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.ImportantFileWriterAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of ImportantFileWriterAndroid.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.ImportantFileWriterAndroidJni();
    }

    @Override // org.chromium.base.ImportantFileWriterAndroid.Natives
    public boolean writeFileAtomically(java.lang.String str, byte[] bArr) {
        return org.jni_zero.GEN_JNI.org_chromium_base_ImportantFileWriterAndroid_writeFileAtomically(str, bArr);
    }
}
