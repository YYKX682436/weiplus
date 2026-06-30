package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class JavaExceptionReporterJni implements org.chromium.base.JavaExceptionReporter.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.JavaExceptionReporterJni.1
        public void setInstanceForTesting(org.chromium.base.JavaExceptionReporter.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.JavaExceptionReporterJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.JavaExceptionReporter.Natives testInstance;

    public static org.chromium.base.JavaExceptionReporter.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.JavaExceptionReporter.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of JavaExceptionReporter.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.JavaExceptionReporterJni();
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaException(boolean z17, java.lang.Throwable th6) {
        org.jni_zero.GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaException(z17, th6);
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaStackTrace(java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(str);
    }
}
