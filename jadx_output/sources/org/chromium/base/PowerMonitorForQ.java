package org.chromium.base;

/* loaded from: classes12.dex */
public final class PowerMonitorForQ {
    private PowerMonitorForQ() {
    }

    public static void addThermalStatusListener(android.os.PowerManager powerManager) {
        powerManager.addThermalStatusListener(new android.os.PowerManager.OnThermalStatusChangedListener() { // from class: org.chromium.base.PowerMonitorForQ.1
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public void onThermalStatusChanged(int i17) {
                org.chromium.base.PowerMonitorJni.get().onThermalStatusChanged(i17);
            }
        });
    }
}
