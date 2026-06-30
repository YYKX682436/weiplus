package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes6.dex */
public class EventLog {
    public static void writeEvent(int i17, int i18) {
        android.util.EventLog.writeEvent(i17, i18);
    }
}
