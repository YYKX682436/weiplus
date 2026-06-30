package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CommandLineJni implements org.chromium.base.CommandLine.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.CommandLineJni.1
        public void setInstanceForTesting(org.chromium.base.CommandLine.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.CommandLineJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.CommandLine.Natives testInstance;

    public static org.chromium.base.CommandLine.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.CommandLine.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of CommandLine.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.CommandLineJni();
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitch(java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_appendSwitch(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchWithValue(java.lang.String str, java.lang.String str2) {
        org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_appendSwitchWithValue(str, str2);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void appendSwitchesAndArguments(java.lang.String[] strArr) {
        org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_appendSwitchesAndArguments(strArr);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public java.lang.String getSwitchValue(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_getSwitchValue(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public java.lang.String[] getSwitchesFlattened() {
        return org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_getSwitchesFlattened();
    }

    @Override // org.chromium.base.CommandLine.Natives
    public boolean hasSwitch(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_hasSwitch(str);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void init(java.lang.String[] strArr) {
        org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_init(strArr);
    }

    @Override // org.chromium.base.CommandLine.Natives
    public void removeSwitch(java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_base_CommandLine_removeSwitch(str);
    }
}
