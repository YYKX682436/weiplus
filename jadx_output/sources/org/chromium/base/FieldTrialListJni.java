package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class FieldTrialListJni implements org.chromium.base.FieldTrialList.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.FieldTrialListJni.1
        public void setInstanceForTesting(org.chromium.base.FieldTrialList.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.FieldTrialListJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.FieldTrialList.Natives testInstance;

    public static org.chromium.base.FieldTrialList.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.FieldTrialList.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of FieldTrialList.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.FieldTrialListJni();
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public boolean createFieldTrial(java.lang.String str, java.lang.String str2) {
        return org.jni_zero.GEN_JNI.org_chromium_base_FieldTrialList_createFieldTrial(str, str2);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public java.lang.String findFullName(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_base_FieldTrialList_findFullName(str);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public java.lang.String getVariationParameter(java.lang.String str, java.lang.String str2) {
        return org.jni_zero.GEN_JNI.org_chromium_base_FieldTrialList_getVariationParameter(str, str2);
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public void logActiveTrials() {
        org.jni_zero.GEN_JNI.org_chromium_base_FieldTrialList_logActiveTrials();
    }

    @Override // org.chromium.base.FieldTrialList.Natives
    public boolean trialExists(java.lang.String str) {
        return org.jni_zero.GEN_JNI.org_chromium_base_FieldTrialList_trialExists(str);
    }
}
