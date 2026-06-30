package org.chromium.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class PowerMonitorJni implements org.chromium.base.PowerMonitor.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.base.PowerMonitorJni.1
        public void setInstanceForTesting(org.chromium.base.PowerMonitor.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.base.PowerMonitorJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.base.PowerMonitor.Natives testInstance;

    public static org.chromium.base.PowerMonitor.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.base.PowerMonitor.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of PowerMonitor.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.base.PowerMonitorJni();
    }

    @Override // org.chromium.base.PowerMonitor.Natives
    public void onBatteryChargingChanged() {
        org.jni_zero.GEN_JNI.org_chromium_base_PowerMonitor_onBatteryChargingChanged();
    }

    @Override // org.chromium.base.PowerMonitor.Natives
    public void onThermalStatusChanged(int i17) {
        org.jni_zero.GEN_JNI.org_chromium_base_PowerMonitor_onThermalStatusChanged(i17);
    }
}
