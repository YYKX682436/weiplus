package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class TraceEventJni implements org.chromium.base.TraceEvent.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.TraceEventJni.1
        public void setInstanceForTesting(org.chromium.base.TraceEvent.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.TraceEventJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.TraceEvent.Natives testInstance;

    public static org.chromium.base.TraceEvent.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.TraceEvent.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of TraceEvent.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.TraceEventJni();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void addViewDump(int i17, int i18, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_addViewDump(i17, i18, z17, z18, str, str2, j17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void begin(java.lang.String str, java.lang.String str2) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_begin(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginToplevel(java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_beginToplevel(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void beginWithIntArg(java.lang.String str, int i17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_beginWithIntArg(str, i17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void end(java.lang.String str, java.lang.String str2, long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_end(str, str2, j17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void endToplevel(java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_endToplevel(str);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void finishAsync(java.lang.String str, long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_finishAsync(str, j17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void initViewHierarchyDump(long j17, java.lang.Object obj) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_initViewHierarchyDump(j17, obj);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instant(java.lang.String str, java.lang.String str2) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_instant(str, str2);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidIPC(java.lang.String str, long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_instantAndroidIPC(str, j17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void instantAndroidToolbar(int i17, int i18, int i19) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_instantAndroidToolbar(i17, i18, i19);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void registerEnabledObserver() {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_registerEnabledObserver();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public long startActivityDump(java.lang.String str, long j17) {
        return org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_startActivityDump(str, j17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void startAsync(java.lang.String str, long j17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_startAsync(str, j17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public boolean viewHierarchyDumpEnabled() {
        return org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_viewHierarchyDumpEnabled();
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupStage1(long j17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_webViewStartupStage1(j17, j18);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupStage2(long j17, long j18, boolean z17) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_webViewStartupStage2(j17, j18, z17);
    }

    @Override // org.chromium.base.TraceEvent.Natives
    public void webViewStartupTotalFactoryInit(long j17, long j18) {
        org.jni_zero.GEN_JNI.org_chromium_base_TraceEvent_webViewStartupTotalFactoryInit(j17, j18);
    }
}
