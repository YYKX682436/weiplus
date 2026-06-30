package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes16.dex */
public abstract class CpuFeatures {

    /* loaded from: classes16.dex */
    public interface Natives {
        int getCoreCount();

        long getCpuFeatures();
    }

    public static int getCount() {
        return org.chromium.base.CpuFeaturesJni.get().getCoreCount();
    }

    public static long getMask() {
        return org.chromium.base.CpuFeaturesJni.get().getCpuFeatures();
    }
}
